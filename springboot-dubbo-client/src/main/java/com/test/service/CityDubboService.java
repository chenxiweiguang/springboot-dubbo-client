package com.test.service;

import com.test.pojo.City;

public interface CityDubboService {
    public City findCityByName(String cityName);
}