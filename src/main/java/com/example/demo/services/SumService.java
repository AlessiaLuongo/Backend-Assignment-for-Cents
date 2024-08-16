package com.example.demo.services;

import com.example.demo.repositories.SumDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SumService {
    @Autowired
    private SumDAO sumDAO;
}
