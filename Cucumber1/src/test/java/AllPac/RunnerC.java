package AllPac;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/All", glue = {"AllPac"}, monochrome = true, 
plugin = {"pretty","html:target/Htmlreports/H.html",
"json:target/JSONreports/report.json",
"junit:target/Junitreports/report.xml"}

)
public class RunnerC {

}
