package com.example.Test_task.util;

import com.example.Test_task.controller.Data.TestData;
import com.example.Test_task.exception.InputOverSizeException;
import com.example.Test_task.exception.NullInputException;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void ValidGetResult() {
        Map<String, Integer> resultMap = Utils.getKeyValueCounterAsMap(TestData.INPUT_STRING_DATA);
        System.out.print(resultMap);
        assertNotNull(resultMap);
        assertEquals(resultMap, TestData.testMap);
    }

    @Test
    void InvalidGetResultIfInputIsNull(){
        Exception thrown = assertThrows(NullInputException.class, () -> Utils.getKeyValueCounterAsMap(null));
        assertEquals(thrown.getMessage(), TestData.NullInputException_MESSAGE);
    }

    @Test
    void InvalidGetResultIfInputIsOverSize(){
        Exception thrown = assertThrows(InputOverSizeException.class, () -> Utils.getKeyValueCounterAsMap(TestData.INPUTOVERSIZESTRING));
        assertEquals(thrown.getMessage(), TestData.InputOverSizeException_MESSAGE);
    }


}