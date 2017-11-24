package com.example.vo;

import java.io.Serializable;
import java.util.List;

public class Weather implements Serializable {
//    声明 静态，私有，不可改变值的长整型常量，并赋初值
    private static final long serialVersionUID = 1L;

    //声明私有字符串变量
    private String city;
    private String aqi;
    private String wendu;
    private String ganmao;
    //昨天日期
    private Yesterday yesterday;
    private List<Forecast> forecast;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    public String getWendu() {
        return wendu;
    }

    public void setWendu(String wendu) {
        this.wendu = wendu;
    }

    public String getGanmao() {
        return ganmao;
    }

    public void setGanmao(String ganmao) {
        this.ganmao = ganmao;
    }

    public Yesterday getYesterday() {
        return yesterday;
    }

    public void setYesterday(Yesterday yesterday) {
        this.yesterday = yesterday;
    }

    public List<Forecast> getForecast() {
        return forecast;
    }

    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }
}
