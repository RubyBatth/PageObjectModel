package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Selenium_Workspace\\FreeCrmFramework\\src\\main\\java\\Features"},//the path of the feature files
		glue={"stepDefination"},//the path of the step definition files
		format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},//to generate diff.types of reporting
		monochrome=true,//display the console output in a proper readable format 
		strict=true,//it "ll check if any step is not defined in step definition file 
		dryRun=false
		//tags={"~@End2End" ,"~@RegressionTest", "~@SmokeTest"}//i[@class='save icon']// to check the mapping is proper between feature file and step definition file 
		
)
public class Testrunner {

}


//ORed: tags={"@End2End ,@RegressionTest "}execute all tests tagged as @End2End OR @RegressionTest
//ANDed:tags={"@End2End" ,"@RegressionTest "}execute all tests tagged as @End2End AND @RegressionTest
//Ignore:~