package Pages.PLN;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PLNPostpaidPages extends PageObject {
    @FindBy(id="pulsa-denomTab-tab-2")
    WebElement klikPasca;
    public void klikPasca(){
        Assert.assertTrue(klikPasca.isDisplayed());
        klikPasca.click();
    }

    @FindBy(name="plnpostpaid_meter")
    WebElement nomorID;
    public void nomorID(String nomor){
        Assert.assertTrue(nomorID.isDisplayed());
        nomorID.sendKeys(nomor);
    }

    @FindBy(name="plnpostpaid_telp")
    WebElement nomorHP;
    public void nomorHP(String No_HP){
        Assert.assertTrue(nomorHP.isDisplayed());
        nomorHP.sendKeys(No_HP);
    }

    @FindBy(xpath="//*[@id=\"pascabayar-action\"]/div[2]/a")
    WebElement klikLanjut;
    public void klikLanjut(){
        Assert.assertTrue(klikLanjut.isDisplayed());
        klikLanjut.click();
    }

    public void validasiNomorID(){
        try{
            Assert.assertFalse(klikLanjut.isDisplayed());
        }
        catch (Exception e){}
    }



    @FindBy(name="pembayaran_email")
    WebElement fieldEmail;
    public void emailPembayaran(String email){
        Assert.assertTrue(fieldEmail.isDisplayed());
        fieldEmail.sendKeys(email);
    }

    @FindBy(xpath="//*[@id=\"pulsa-denomTab-pane-2\"]/div/div/div[2]/span[3]")
    WebElement validasiError;
    public void validasiError(String errors){
        Assert.assertTrue(validasiError.isDisplayed());
        element(validasiError).shouldContainText(errors);
    }
}
