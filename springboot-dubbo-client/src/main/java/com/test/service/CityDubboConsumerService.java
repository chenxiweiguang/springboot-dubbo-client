package com.test.service;



import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;
import com.test.pojo.City;

@Component
public class CityDubboConsumerService {
    @DubboReference
    CityDubboService cityDubboService;
    public void printCity() {
        String cityName="温岭";
        System.out.println(cityName);
        City city = cityDubboService.findCityByName(cityName);
        System.out.println(city.toString());
    }
}
