package com.dianshang.utils;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description:
 */
public class PropertyConfig extends PropertyPlaceholderConfigurer {
    @Override
    protected String convertProperty(String propertyName, String propertyValue) {
        if (propertyName.equals("jdbc.username") || propertyName.equals("jdbc.password")) {
            return JiaMi.decodeStr(propertyValue);
        }
        return propertyValue;
    }
}

