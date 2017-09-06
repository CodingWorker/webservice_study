package com.test.webclient;

import com.test.webservice.WeatherServiceImpl;
import com.test.webservice.WeatherServiceImplService;

/**
 * Created by DaiYan on 2017/9/6.
 */
public class WeatherClient {
    public static void main(String[] args){
        //获取服务视图
        WeatherServiceImplService weatherServiceImplService=new WeatherServiceImplService();

        //获取服务
        WeatherServiceImpl weatherService=weatherServiceImplService.getPort(WeatherServiceImpl.class);

        //调用方法
        String weather=weatherService.queryWeather("北京");
        System.out.println(weather);
    }
}
