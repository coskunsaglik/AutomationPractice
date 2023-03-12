package com.cydeo.step_definition_cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup(){
        System.out.println("before scenario");
    }
    @After
    public void tearDown(){
        System.out.println("after scenario");
    }
}
