package com.cydeo.runnerCucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
              //  "pretty", //print out more properties
                "html:target/cucumber-report.html", //create the report
                "rerun:target/rerun.txt",
        "me.jvt.cucumber.report.PrettyReports:target/cucumber"

        } ,
       features = "src/test/resources/features", //copy the content root from resources
        glue = "com/cydeo/step_definition_cucumber", //copy the source root from step_definition
        dryRun = false,
        tags = "" //run only @ddt_testing
        //publish = true // create a public link for the report of our code


)

public class CukesRunner {

}
