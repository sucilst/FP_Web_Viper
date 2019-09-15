package Pages.PLN;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PLNPrepaidPages extends PageObject {
    @FindBy(id="isi-product-pln")
    WebElement klikListrik;
    public void klikListrik(){
        Assert.assertTrue(klikListrik.isDisplayed());
        klikListrik.click();
    }

    @FindBy(name="plnprepaid_meter")
    WebElement fieldNomorMeter;
    public void nomorMeter(String nomor){
        Assert.assertTrue(fieldNomorMeter.isDisplayed());
        fieldNomorMeter.sendKeys(nomor);
    }

    @FindBy(name="plnprepaid_telp")
    WebElement fieldNoHP;
    public void noHP(String No_HP){
        Assert.assertTrue(fieldNoHP.isDisplayed());
        fieldNoHP.sendKeys(No_HP);
    }

    @FindBy(xpath="//*[@id=\"pln-prabayar-denom\"]/div/form/button[1]")
    WebElement nominal100;
    @FindBy(xpath="//*[@id=\"pln-prabayar-denom\"]/div/form/button[2]")
    WebElement nominal50;
    public void nominal(String nominal){
        Assert.assertTrue(nominal100.isDisplayed());
        Assert.assertTrue(nominal50.isDisplayed());
        if(nominal.equals("100000")){
            nominal100.click();
        }
        else {
            nominal50.click();
        }
    }

    @FindBy(name="pembayaran_email")
    WebElement fieldEmail;
    public void emailPembayaran(String email){
        Assert.assertTrue(fieldEmail.isDisplayed());
        fieldEmail.sendKeys(email);
    }

    @FindBy(xpath="//*[@id=\"pembayaran-email-from\"]/div[2]/div[1]/span[3]")
    WebElement validasiEmailPembayaran;
    public void validasiEmailPembayaran(String error){
        Assert.assertTrue(validasiEmailPembayaran.isDisplayed());
        element(validasiEmailPembayaran).shouldContainText(error);
    }

    @FindBy(xpath="//*[@id=\"pembayaran-email-from\"]/div[2]/div[3]/div/div/a")
    WebElement klikLanjutkan;
    public void klikLanjutkan(){
        Assert.assertTrue(klikLanjutkan.isDisplayed());
        klikLanjutkan.click();
    }

    @FindBy(xpath="//*[@id=\"app\"]/div/div/section[2]/div/div/div[2]/div/div/div[1]/p/strong")
    WebElement validasiAnon;
    public void validasiAnon(String email){
        Assert.assertTrue(validasiAnon.isDisplayed());
        element(validasiAnon).shouldContainText("Hi "+email);
    }

    @FindBy(xpath="//*[@id=\"app\"]/div/div/section[2]/div/div/div[2]/div/div/div[1]/p/strong")
    WebElement validasiLogin;
    public void validasiLogin(String nama_lengkap){
        Assert.assertTrue(validasiLogin.isDisplayed());
        element(validasiLogin).shouldContainText("Hi "+nama_lengkap);
    }

    @FindBy(xpath="//*[@id=\"pulsa-denomTab-pane-1\"]/div/div[1]/div[2]/span[3]")
    WebElement validasiError;
    public void validasiError(String error){
        Assert.assertTrue(validasiError.isDisplayed());
        element(validasiError).shouldContainText(error);
    }

    @FindBy(id="pln-prabayar-denom")
    WebElement pilihanNominal;
    public void pilihanNominal(){
        try {
            Assert.assertFalse(pilihanNominal.isDisplayed());
        }
        catch (Exception e){}
    }
}
