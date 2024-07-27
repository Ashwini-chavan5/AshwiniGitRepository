package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {""},glue = {""},plugin = {"Test123"})
public class MyTestRunner extends AbstractTestNGCucumberTests {

}
