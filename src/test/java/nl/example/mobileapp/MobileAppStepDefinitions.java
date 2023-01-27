package nl.example.mobileapp;
import nl.example.mobileapp.pages.settings.SettingsScreen;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MobileAppStepDefinitions {
    @Given("everything is installed")
    public void everything_is_installed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Everything is installed!");
    }
    @When("user runs the sample test")
    public void user_runs_the_sample_test() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User ran the sample test");
    }
    @Then("the sample test is executed")
    public void the_sample_test_is_executed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step definition for sample test executed!");
    }


    SettingsScreen settingsScreen = new SettingsScreen();
    @Given("user is on mobile home")
    public void userMobileHome() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside Given user is on mobile home");
    }
    @When("taps on the battery settings")
    public void openSettingsAndTapOnBattery() {
        System.out.println("Tapping on battery");
        settingsScreen.clickSettingsBattery();
    }

    @Then("battery information is seen")
    public void assertBatteryScreen() {
        System.out.println("Verify the battery screen");
    }
}
