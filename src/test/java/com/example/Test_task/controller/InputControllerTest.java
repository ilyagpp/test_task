package com.example.Test_task.controller;

import com.example.Test_task.controller.Data.TestData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc(printOnlyOnFailure = false)
class InputControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    @DisplayName("Valid result for input = " + TestData.INPUT_STRING_DATA + " v1.0")
    void getValidResultMap() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/test/v1.0?input=" + TestData.INPUT_STRING_DATA);
        this.mockMvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json("""
                        {"a":5,"c":4,"b":1}
                        """));
    }


    @Test
    @DisplayName("Valid result for input = " + TestData.INPUT_STRING_DATA + " v1.1")
    void getValidResultArray() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/test/v1.1?input=" + TestData.INPUT_STRING_DATA);
        this.mockMvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json("""
                        [{"a":5},{"c":4},{"b":1}]
                        """));
    }

    @Test
    @DisplayName("NullInputException for api v1.0")
    void getInvalidResultInputIsNullExceptionV1_0() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/test/v1.0");
        this.mockMvc.perform(requestBuilder)
                .andExpect(status().isBadRequest())
                .andExpect(result -> assertEquals(TestData.NullInputException_MESSAGE, Objects.requireNonNull(result.getResolvedException()).getMessage()));

    }

    @Test
    @DisplayName("NullInputException for api v1.1")
    void getInvalidResultInputIsNullExceptionV1_1() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/test/v1.1");
        this.mockMvc.perform(requestBuilder)
                .andExpect(status().isBadRequest())
                .andExpect(result -> assertEquals(TestData.NullInputException_MESSAGE, Objects.requireNonNull(result.getResolvedException()).getMessage()));

    }

    @Test
    @DisplayName("InputOverSizeException for api v1.0")
    void getInvalidResultInputIsOverSizeOf20481_0() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/test/v1.0?input="+ TestData.INPUTOVERSIZESTRING);
        this.mockMvc.perform(requestBuilder)
                .andExpect(status().isRequestHeaderFieldsTooLarge())
                .andExpect(result -> assertEquals(TestData.InputOverSizeException_MESSAGE, Objects.requireNonNull(result.getResolvedException()).getMessage()));
    }

    @Test
    @DisplayName("InputOverSizeException for api v1.1")
    void getInvalidResultInputIsOverSizeOf2048V1_1() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/test/v1.1?input="+ TestData.INPUTOVERSIZESTRING);
        this.mockMvc.perform(requestBuilder)
                .andExpect(status().isRequestHeaderFieldsTooLarge())
                .andExpect(result -> assertEquals(TestData.InputOverSizeException_MESSAGE, Objects.requireNonNull(result.getResolvedException()).getMessage()));
    }

}