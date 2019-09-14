package Pages.DeleteAkun;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPages extends PageObject {
    @FindBy(xpath="/html/body/header/div/div[2]/div[2]")
    WebElement klikLogin;
    public void klikLogin(){
        Assert.assertTrue(klikLogin.isDisplayed());
        klikLogin.click();
    }

    @FindBy(id="edit-name--3")
    WebElement fieldEmail;
    public void email(){
        Assert.assertTrue(fieldEmail.isDisplayed());
        fieldEmail.sendKeys("pardosisuci@gmail.com");
    }

    @FindBy(id="edit-pass--2")
    WebElement fieldPassword;
    public void password(){
        Assert.assertTrue(fieldPassword.isDisplayed());
        fieldPassword.sendKeys("Suci230997");
    }

    @FindBy(id="edit-submit--9")
    WebElement klikMasuk;
    public void klikMasuk(){
        Assert.assertTrue(klikMasuk.isDisplayed());
        klikMasuk.click();
    }

    @FindBy(xpath="/html/body/header/div/div[2]/div[1]/a")
    WebElement validasiLogin;
    public void validasiLogin(){
        Assert.assertTrue(validasiLogin.isDisplayed());
        element(validasiLogin).shouldContainText("Akunku");
    }
}
