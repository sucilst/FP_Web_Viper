package Pages.IsiPulsa;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IsiPulsaPages extends PageObject {
    @FindBy(name="mobileprepaid_telp")
    WebElement nomorHP;
    public void fieldNomorHP(String No_HP){
        Assert.assertTrue(nomorHP.isDisplayed());
        nomorHP.sendKeys(No_HP);
    }

    @FindBy(xpath="//*[@id=\"product-tabs-pane-1\"]/div/div/div[3]/div/div/form/button[1]")
    WebElement denom50;
    @FindBy(xpath="//*[@id=\"product-tabs-pane-1\"]/div/div/div[3]/div/div/form/button[3]")
    WebElement denom75;
    @FindBy(xpath="//*[@id=\"product-tabs-pane-1\"]/div/div/div[3]/div/div/form/button[2]")
    WebElement denom100;
    @FindBy(xpath="//*[@id=\"product-tabs-pane-1\"]/div/div/div[3]/div/div/form/button[4]")
    WebElement denom200;
    @FindBy(xpath="//*[@id=\"product-tabs-pane-1\"]/div/div/div[3]/div/div/form/button[5]")
    WebElement denom300;
    @FindBy(xpath="//*[@id=\"product-tabs-pane-1\"]/div/div/div[3]/div/div/form/button[6]")
    WebElement denom500;
    @FindBy(xpath="//*[@id=\"product-tabs-pane-1\"]/div/div/div[3]/div/div/form/button[7]")
    WebElement denom1000;
    public void denomPulsa(String pulsa){
        switch (pulsa){
            case "50000":
                denom50.click();
                break;
            case "75000":
                denom75.click();
                break;
            case "100000":
                denom100.click();
                break;
            case "200000":
                denom200.click();
                break;
            case "300000":
                denom300.click();
                break;
            case "500000":
                denom500.click();
                break;
            case "1000000":
                denom1000.click();
                break;
        }
    }

    @FindBy(xpath="//*[@id=\"product-tabs-pane-1\"]/div/div/div[1]/span[3]")
    WebElement validasiError;
    public void validasiError(String error){
        Assert.assertTrue(nomorHP.isDisplayed());
        element(validasiError).shouldContainText(error);
    }
}
