package com.thoughtworks.cleanarch;

import java.util.List;

public class Schema {
    private String flag;
    private String valueType;
    private Object defaultValue;

    public Schema(String flag, String valueType, Object defaultValue) {
        this.flag = flag;
        this.valueType = valueType;
        this.defaultValue = defaultValue;
    }

    public String getValueType() {
        return valueType;
    }

    public Object getDefaultValue() {
        return defaultValue;
    }
}
