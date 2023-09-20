package com.example.Test_task.controller.Data;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestData {

    public static final String INPUT_STRING_DATA = "aaaaabcccc";

    public static final Map<String, Integer> testMap  = new LinkedHashMap<>() {{
        put ("a", 5);
        put ("c", 4);
        put("b", 1);
    }};

    public static final String NullInputException_MESSAGE = "Unable to process because input is null";
    public static final String InputOverSizeException_MESSAGE = "Input length is over than 2048 characters";

    public static final String INPUTOVERSIZESTRING = "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccvaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccvaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +"" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccvaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccvaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccvaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccvaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccvaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccvaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccvaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccvaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccvaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccvaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccvaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccvaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccvaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccvaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccvaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" +
            "aaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabccccaaaaabcccc" ;
}
