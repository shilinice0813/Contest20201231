package com.thoughtworks.cleanarch;

import java.util.List;

public class Arg {
    private String flag;
    private Object value;
    private String type;

    public Arg(String flag, Object value, String type) {
        this.flag = flag;
        this.value = value;
        this.type = type;
    }

    public static Arg of(List<Object> argList) throws Exception {
        Schema schema = SchemaFactory.create((String) argList.get(0));

        return new Arg((String) argList.get(0),argList.get(1),schema.getValueType());
    }

    @Override
    public String toString() {
        return "Arg{" +
                "flag='" + flag + '\'' +
                ", value=" + value +
                ", type='" + type + '\'' +
                '}';
    }

    public String getFlag() {
        return flag;
    }

    public Object getValue() {
        return value;
    }
}
