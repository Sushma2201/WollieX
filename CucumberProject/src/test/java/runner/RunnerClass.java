package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "featurFiles/Wolliesx.feature",
glue="stepDefinitions",  
tags= {"@OrderProduct"},
monochrome=true,
dryRun=false,
plugin= {"html:TestReport/WolliesX"})
public class RunnerClass {
 
}