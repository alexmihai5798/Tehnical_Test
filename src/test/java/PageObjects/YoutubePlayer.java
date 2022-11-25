package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class YoutubePlayer {
    @FindBy (xpath = "//*[@id=\"movie_player\"]/div[33]/div[2]/div[1]/button")
    private WebElement pauseButton;

    @FindBy (xpath = "//*[@id=\"content\"]/div[2]/div[6]/div[1]/ytd-button-renderer[1]/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]")
    private WebElement rejectButton;

    @FindBy (xpath = "//*[@id=\"movie_player\"]/div[31]/div[2]/div[2]/button[9]")
    private WebElement fullscreenButton;

    @FindBy (xpath = "//*[@id=\"movie_player\"]/div[33]/div[2]/div[1]/span/button")
    private WebElement volumeButton;

    @FindBy (xpath = "//*[@id=\"movie_player\"]/div[33]/div[2]")
    private WebElement scrollToCommandsBar;

    public void clickOnPauseButton() {this.pauseButton.click();}

    public void clickOnRejectButton() {this.rejectButton.click();}

    public void clickOnFullscreenButton() {this.fullscreenButton.click();}

    public void clickOnVolumeButton() {this.volumeButton.click();}

    public WebElement getScrollToCommandsBar() {return this.scrollToCommandsBar;}


}
