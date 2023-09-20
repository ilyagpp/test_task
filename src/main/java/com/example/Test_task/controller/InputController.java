package com.example.Test_task.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Size;
import java.util.Map;

import static com.example.Test_task.util.Utils.getKeyValueCounterAsMap;

@RestController
@RequestMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
public class InputController {


    @Operation(summary = "Get sorted result by greatest matchers",
    responses = {
            @ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json")),
            @ApiResponse(responseCode = "400", description = "Unable to process because input is null"),
            @ApiResponse(responseCode = "431", description = "Input length is over than 2048 characters")
    })
    @GetMapping(value = "/v1.0")
    public ResponseEntity<Object> getResultMap(@RequestParam(required = false) @Size(min = 1, max = 2048, message = "Input data length must be from 1 to 2048 characters.") String input) {
        Map<String, Integer> inputMap = getKeyValueCounterAsMap(input);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(inputMap);
    }
    @Operation(summary = "Get sorted result by greatest matchers",
            responses = {
                    @ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json")),
                    @ApiResponse(responseCode = "400", description = "Unable to process because input is null"),
                    @ApiResponse(responseCode = "431", description = "Input length is over than 2048 characters")
            })
    @GetMapping(value = "/v1.1")
    public ResponseEntity<Object> getResultArray(@RequestParam(required = false) @Size(min = 1, max = 2048, message = "Input data length must be from 1 to 2048 characters.") String input) {
        Map<String, Integer> inputMap = getKeyValueCounterAsMap(input);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(inputMap.entrySet().toArray());
    }

}
