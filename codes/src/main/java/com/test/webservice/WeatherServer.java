package com.test.webservice;

import javax.xml.ws.Endpoint;

/**
 * Created by DaiYan on 2017/9/6.
 */
public class WeatherServer {
    public static void main(String[] args){
        Endpoint.publish("http://127.0.0.1:12345/weather",new WeatherServiceImplService());
    }
}
