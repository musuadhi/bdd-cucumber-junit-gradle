package nl.example.mobileapp;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

// Usage:./gradlew test --rerun-tasks --info
// This runs Cucumber features using Cucumber's JUnit Platform Engine.
//The Suite annotation tells JUnit to kick off Cucumber.
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("nl/example/mobileapp")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "nl.example.mobileapp")
public class RunCucumberMobileTest {
}
