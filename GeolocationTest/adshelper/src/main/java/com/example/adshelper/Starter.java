package com.example.adshelper;

import com.example.adshelper.addid.AddIdGetter;
import com.example.adshelper.geolocation.GeoloactionGetter;

public class Starter {

    private String userAddID;
    private String UserCity;
    private String appToken;


    private static String addHelperURL = "";


    private static AddIdGetter addIdGetter = new AddIdGetter();
    private static GeoloactionGetter geoloactionGetter = new GeoloactionGetter();

    public Starter(String appToken) {
        this.appToken = appToken;

        getUserData();
    }

    private void getUserData() {

    }
}
