package stepDefinitions;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", dryRun = true, tags={},  plugin = "com.cucumber.listener.ExtentCucumberFormatter:target/tsr.html")
public class Run {
    public static void generateReport(){
        Reporter.loadXMLConfig("C:\\Users\\julie\\IdeaProjects\\NextFrameWorkCu\\src\\main\\resources\\extent.config.xml");
    }

}
