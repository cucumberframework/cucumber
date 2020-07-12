package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",
glue="stepDefinations",
dryRun=false,
tags="@CreateContact",
plugin= {"pretty", "html:target/cucumberReports"})


public class TestRunner {

}
