package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features = "C:\\Users\\Siraj Jafri\\git\\CuccumberProject_Gustav\\src\\main\\java\\Features\\RegistrationUser.feature", //the path of the feature files
		features = "C:/Users/Siraj Jafri/git/CuccumberProject_Gustav/src/main/java/Features/RegistrationUser.feature",
		glue={"StepDefinitions"}, //the path of the step definition files
		plugin= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false
		//to check the mapping is proper between feature file and step def file
		
		)
public class MyRunner {

}
