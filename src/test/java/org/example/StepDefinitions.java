package org.example;

import PageObjects.YoutubePlayer;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {

    private final WebDriver driver = new ChromeDriver();
    private YoutubePlayer youtubePlayer;

    public StepDefinitions(){
        driver.manage().window().maximize();
        youtubePlayer = new YoutubePlayer();
    }

    @Given("I am on the player")
    public void i_am_on_the_player() {
        driver.get("https://www.youtube.com/watch?v=SztA0gUsvOw");
    }
    @When("I press the pause button")
    public void i_press_the_pause_button() {
        youtubePlayer.clickOnRejectButton();
        youtubePlayer.clickOnPauseButton();
    }
    @Then("The video should be paused")
    public void the_video_should_be_paused() {
    }

    @When("I press the fullscreen button")
    public void i_press_the_fullscreen_button() {
        youtubePlayer.clickOnFullscreenButton();
    }
    @Then("The video should get on fullscreen")
    public void the_video_should_get_on_fullscreen() {
    }

    @When("I press the volume button")
    public void i_press_the_volume_button() {
        youtubePlayer.clickOnVolumeButton();
    }
    @Then("The video should get muted")
    public void the_video_should_get_muted() {
    }


    @After
    public void closeBrowser(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "name");
        }
        driver.quit();
    }

}
