package com.example.demo.controllers;

import com.example.demo.services.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/sums")
public class SumsController {
    @Autowired
    private SumService sumService;
    
    @PostMapping("/calculate")
    @ResponseStatus(HttpStatus.CREATED)
    public int createNewSum(@RequestParam int firstNumber, @RequestParam int secondNumber){
        return sumService.saveSum(firstNumber, secondNumber);
    }
    
}
