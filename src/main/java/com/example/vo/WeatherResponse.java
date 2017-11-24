package com.example.vo;

import java.io.Serializable;

public class WeatherResponse implements Serializable {

    private final long servisonUID = 1L;

    //消息数据
    private Weather data;
    //消息状态
    private String status;
    //消息描述
    private String desc;

    //构造方法
    public WeatherResponse() {

    }

    public Weather getData() {
        return data;
    }

    public void setData(Weather data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
