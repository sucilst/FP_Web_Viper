package Pages.SignIn;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPages extends PageObject {
    @FindBy(id="header-signin")
    WebElement klikSignIn;
    public void klikSignIn(){
        Assert.assertTrue(klikSignIn.isDisplayed());
        klikSignIn.click();
    }

    @FindBy(xpath="/html/body/div[3]/div/div[2]/div/div/div[2]/form/div[3]/button")
    WebElement klikMasuk;
    public void klikMasuk(){
        Assert.assertTrue(klikMasuk.isDisplayed());
        klikMasuk.click();
    }

    @FindBy(xpath="/html/body/div[4]/div/div[2]/div/div/div[2]/form/div[3]/button")
    WebElement klikMasuk2;
    public void klikMasuk2(){
        Assert.assertTrue(klikMasuk2.isDisplayed());
        klikMasuk2.click();
    }

    @FindBy(id="usermenu")
    WebElement klikAkun;
    public void klikAkun(){
        Assert.assertTrue(klikAkun.isDisplayed());
        klikAkun.click();
    }

    @FindBy(xpath="//*[@id=\"app\"]/div/div/header/div[2]/nav/div/div[2]/ul/li[3]/ul/li[8]")
    WebElement klikSignout;
    public void klikSignout(){
        Assert.assertTrue(klikSignout.isDisplayed());
        klikSignout.click();
    }
}
