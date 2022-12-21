package com.example.bic3_ic21b029_exam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class examController {

    @GetMapping("/api/mark")

    public int gradeInPercentage (int percentage) {
        percentage = 0;

        int gradeOne = 1; int gradeTwo = 2; int gradeThree = 3; int gradeFour = 4; int gradeFive = 5;

        if (percentage < 50) {
            return gradeFive;
        } else if (percentage >= 50 && percentage < 63) {
            return gradeFour;
        } else if (percentage >= 63 && percentage < 75) {
            return gradeThree;
        } else if (percentage >= 75 && percentage < 88) {
            return gradeTwo;
        } else if (percentage >= 88) {
            return gradeOne;
        }
        else return 0;
    }
}
