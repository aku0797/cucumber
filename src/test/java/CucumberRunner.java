import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\Generatecalories.feature ",
        glue = "step_definitions",
        tags = "@search"


)
public class CucumberRunner {
}

