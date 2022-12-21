package com.example.bic3_ic21b029_exam.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class examControllerTest {

    @Test
    void gradeFive(){
        //A - Arrange
        var controller = new examController();

        //A - Act
        var result = controller.gradeInPercentage(45);

        //A - Assert
        assertEquals(5, result);
    }
}