package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    Belly belly = new Belly();
    @Given("I have {int} cakes in my belly")
    public void I_have_cakes_in_my_belly(int cakes) {

        belly.eat(cakes);
    }

    @When("I wait {int} hour")
    public void iWaitHour(int time_in_belly) {
        System.out.printf("Waited for %d hour",time_in_belly);
        belly.wait(time_in_belly);
    }

    @Then("my belly should growl")
    public void myBellyShouldGrowl() {
        belly.growl();
    }
}
