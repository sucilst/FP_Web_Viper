package Pages.DeleteAkun;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteAkunPages extends PageObject {
    @FindBy(xpath="//*[@id=\"admin-menu-menu\"]/li[6]")
    WebElement klikPeople;
    public void klikPeople(){
        Assert.assertTrue(klikPeople.isDisplayed());
        klikPeople.click();
    }

    @FindBy(xpath="//*[@id=\"navigation\"]/ul/li[2]")
    WebElement klikAdvanced;
    public void klikAdvanced(){
        Assert.assertTrue(klikAdvanced.isDisplayed());
        klikAdvanced.click();
    }


}
