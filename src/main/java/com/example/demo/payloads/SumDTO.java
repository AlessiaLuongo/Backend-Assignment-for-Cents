package com.example.demo.payloads;


import jakarta.validation.constraints.NotNull;

public record SumDTO(
        @NotNull(message = "Please insert a number")
        int sum
) {
}
