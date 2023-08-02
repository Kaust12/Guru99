package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		    
		     features= {"AllFeatureFile/TC_001Registerfeature.feature"},
		     glue= {"StepDefination"},
		     dryRun=false,
		     tags="@EndToEndTesting"
		
		)
	

public class RunnerTest {

}
