package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
					features= {".//features/loginn.feature"},
					glue= "stepdefinitions",
					plugin= {"pretty","html:reports/reports.html"
							}
					)
public class TestRun {

}
