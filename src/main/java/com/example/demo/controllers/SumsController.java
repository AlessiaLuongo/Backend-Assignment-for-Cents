package com.example.demo.controllers;

import com.example.demo.services.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sums")
public class SumsController {
    @Autowired
    private SumService sumService;
}
