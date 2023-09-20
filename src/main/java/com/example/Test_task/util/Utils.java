package com.example.Test_task.util;

import com.example.Test_task.exception.InputOverSizeException;
import com.example.Test_task.exception.NullInputException;
import org.springframework.lang.Nullable;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;
public class Utils {
    private static final String INPUT_IS_NULL = "Unable to process because input is null";
    private static final String INPUT_LENGTH_RANGE_ERROR = "Input length is over than 2048 characters";
    public static Map<String, Integer> getKeyValueCounterAsMap(@Nullable String input) {
        checkInput(input);
        Map<String, Integer> map = new HashMap<>();
        for (char c : input.toCharArray()) {

            if (map.containsKey(String.valueOf(c))) {
                map.computeIfPresent(String.valueOf(c), (key, value) -> value + 1);
            } else {
                map.putIfAbsent(String.valueOf(c), 1);
            }
        }
        return sortByValueReversed(map);

    }
    private static void checkInput(String input) {
        if(input == null){
            throw new NullInputException(INPUT_IS_NULL);
        }
        else if (input.length() >= 2048){
            throw new InputOverSizeException(INPUT_LENGTH_RANGE_ERROR);
        }
    }
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValueReversed(Map<K, V> map){
        Map<K, V> result = new LinkedHashMap<>();
        Stream <Map.Entry<K,V>> stream = map.entrySet().stream();
        stream.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(kvEntry ->  result.put(kvEntry.getKey(), kvEntry.getValue()));

        return result;
    }
}
