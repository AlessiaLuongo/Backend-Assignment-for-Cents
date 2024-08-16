package com.example.demo.services;

import com.example.demo.entities.Sum;
import com.example.demo.repositories.SumDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class SumService {
    @Autowired
    private SumDAO sumDAO;


    public int findTheBiggestNumber(int firstNumber, int secondNumber) {
        return Math.max(firstNumber, secondNumber);
    }


    public boolean isItAPrimeNumber(int givenNumber) {
        if (givenNumber < 2) {
                return false;
            }
        for (int i = 2; i <= Math.sqrt(givenNumber); i++) {
                if (givenNumber % i == 0) {
                    return false;
                }
            }
        return true;
    }

    public int firstPrimeNumberGreaterThenNumber(int givenNumber){
        int number = givenNumber + 1;
        while (true){
          if (isItAPrimeNumber(number)){
              return number;
        }
        number++;
    }}

    public int sumTheNumbers(int firstNumber, int secondNumber){
     int biggestNumber = findTheBiggestNumber(firstNumber, secondNumber);
     int biggestFirstPrimeNumber = firstPrimeNumberGreaterThenNumber(biggestNumber);
        return firstNumber + secondNumber + biggestFirstPrimeNumber;
    }


    public int saveSum(int firstNumber, int secondNumber){
        Sum newSum = new Sum();
        int sumValue = sumTheNumbers(firstNumber, secondNumber);
        newSum.setSum(sumValue);
        newSum.setDateOfInsertion(LocalDate.now());
        sumDAO.save(newSum);
        return sumValue;
    }


}
