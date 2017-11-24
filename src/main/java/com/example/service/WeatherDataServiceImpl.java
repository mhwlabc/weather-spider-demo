package com.example.service;

import com.example.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URLEncoder;

@Service
public class WeatherDataServiceImpl implements WeatherDataService {

    //注入模板
    @Autowired
    private RestTemplate restTemplate;

    //私有常量
    private final String WEATHER_API = "http://wthrcdn.etouch.cn/weather_mini";

    @Override
    public WeatherResponse getDataByCityId(String cityId) {
        //拼接链接
        String uri = WEATHER_API + "?citykey=" + cityId;
        //调用doGetWeatherData方法，传入uri
        return this.doGetWeatherData(uri);
    }

    @Override
    public WeatherResponse getDataByCityName(String cityName) {
        String uri = WEATHER_API + "?city=" + cityName;
        return this.doGetWeatherData(uri);
    }

    private WeatherResponse doGetWeatherData(String uri) {
        //Restful API,发送请求
        ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);
        String strBody = null;
        //判断是否请求成功
        if (response.getStatusCodeValue() == 200) {
            //获取响应内容
            strBody = response.getBody();
            System.out.println("123");

            System.out.println();

            System.out.println("456");
            //System.out.println(response.getHeaders());
        }

        //需要手动导入包，Jackson
        ObjectMapper mapper = new ObjectMapper();
        WeatherResponse weather = null;

        try {
            //将响应的天气信息，反序列化为WeatherResponse对象
            weather = mapper.readValue(strBody, WeatherResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return  weather;
    }
}
