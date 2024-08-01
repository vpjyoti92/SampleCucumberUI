package step_definitions;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/test/java/features",
			glue = "step_definitions",
			plugin = { "pretty", "html:target/Reports/cucumber"},
			tags = {"@Regression,@Test3"})
	public class RunCakeTest {
	}



