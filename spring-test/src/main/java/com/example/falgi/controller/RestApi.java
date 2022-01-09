package com.example.falgi.controller;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;

@RestController
@RequestMapping("sum_of")
public class RestApi {

    @GetMapping({"",""})
    public int sum(@RequestParam HashMap<String, String> params){
        int point = Integer.valueOf(params.get("n"));
        int result = 0;
        for(int i=1; i<=point; i++){
            result += i;
        }
        return result;
    }
}
