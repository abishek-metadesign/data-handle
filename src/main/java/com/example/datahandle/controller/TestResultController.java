package com.example.datahandle;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("testResult")
public class TestResultController {


    @PostMapping
    public void  save(@RequestBody String data){


    }


}
