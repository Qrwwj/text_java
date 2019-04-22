package com.swc.utils;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class PropertyEncode extends PropertyPlaceholderConfigurer {
    @Override
    protected String convertProperty(String propertyName, String propertyValue) {
        if(propertyName.equals("jdbc.username")||propertyName.equals("jdbc.password")){
            propertyValue=Encode.decodestr(propertyValue);
        }
        return propertyValue;
    }
}
