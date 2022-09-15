package com.project7.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //a junit annotation, tells it to run the class as Cucumber BDD tests
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt", //store failed scenario names into rerun.txt file
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",//OR "json:target/cucumber.json" //generate json execution report to be used for html report
        },
        features = "src/test/resources/features",
        glue = "com/project7/step_definitions",
        dryRun = false, //false=> run the test. true => check for missing steps
        tags = "@amazonLogin",
        publish = false

)

public class CukesRunner {
}
