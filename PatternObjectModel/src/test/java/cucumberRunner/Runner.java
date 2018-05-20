package cucumberRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/java/features/EditLead.feature"}
, glue= {"steps","pages"}
, tags= {"@smoke or @regression or @sanity"} 
, monochrome=true)
public class Runner {
}
