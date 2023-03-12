package com.cydeo.runnerCucumber;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = "com/cydeo/step_definition_cucumber", //copy the source root from step_definition
        features = "@target/rerun.txt" //copy the content root from resources
)


public class FailedTestRunner {

}






