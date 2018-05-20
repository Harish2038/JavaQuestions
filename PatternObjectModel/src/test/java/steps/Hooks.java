package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class Hooks extends SeMethods {
	@Before
	public void info(Scenario sc) {
		startResult();
		startTestModule(sc.getName(), sc.getId());	
		test = startTestCase(sc.getId());
		test.assignCategory("smoke");
		test.assignAuthor("Harish");
		startApp("chrome");
	}

	@After
	public void close(Scenario sc) {
		closeAllBrowsers();
		endResult();
	}

}
