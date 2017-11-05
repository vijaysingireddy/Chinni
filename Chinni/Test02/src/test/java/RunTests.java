import org.junit.runner.RunWith;
import cucumber.api.junit.*;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=false,
		plugin={"html:target/cucumber-html-report","json:target/cucumber-json-report.json"}
		) 
public class RunTests{
	
}
