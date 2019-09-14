package Pages.SignUp;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPages extends PageObject {
    @FindBy(id="header-register")
    WebElement klikSignUp;
    public void klikSignUp(){
        Assert.assertTrue(klikSignUp.isDisplayed());
        klikSignUp.click();
    }

    @FindBy(name="nama_lengkap")
    WebElement fieldNamaLengkap;
    public void namaLengkap(String nama_lengkap){
        Assert.assertTrue(fieldNamaLengkap.isDisplayed());
        fieldNamaLengkap.sendKeys(nama_lengkap);
    }

    @FindBy(name="email")
    WebElement fieldEmail;
    public void email(String email){
        Assert.assertTrue(fieldEmail.isDisplayed());
        fieldEmail.sendKeys(email);
    }

    @FindBy(name="no_hp")
    WebElement fieldNoHP;
    public void noHP(String No_HP){
        Assert.assertTrue(fieldNoHP.isDisplayed());
        fieldNoHP.sendKeys(No_HP);
    }

    @FindBy(name="password")
    WebElement fieldPassword;
    public void password(String password){
        Assert.assertTrue(fieldPassword.isDisplayed());
        fieldPassword.sendKeys(password);
    }

    @FindBy(className = "btn-group")
    WebElement fieldCheckbox;
    public void checkbox(String pilihan){
        Assert.assertTrue(fieldCheckbox.isDisplayed());
        if (pilihan.equals("ya")){
            fieldCheckbox.click();
        }
    }

    @FindBy(xpath="//*[@id=\"form_register\"]/div[6]/button")
    WebElement klikDaftar;
    public void klikDaftar(){
        Assert.assertTrue(klikDaftar.isDisplayed());
        klikDaftar.click();
    }

    @FindBy(name="otp_code")
    WebElement otpCode;
    public void otpCode(){
        try{
            Assert.assertTrue(klikDaftar.isDisplayed());
            Thread.sleep(40000);
        }
        catch (Exception e ) {
        }
    }

    @FindBy(xpath="/html/body/div[4]/div/div[2]/div/div/form/div[2]/button")
    WebElement klikKonfirmasi;
    public void klikKonfirmasi(){
        Assert.assertTrue(klikKonfirmasi.isDisplayed());
        klikKonfirmasi.click();
    }

    @FindBy(className = "account-name")
    WebElement validasiSignUp;
    public void validasiSignUp(String nama_lengkap){
        Assert.assertTrue(validasiSignUp.isDisplayed());
        element(validasiSignUp).shouldContainText(nama_lengkap);
    }

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div[2]/div")
    WebElement validasiError;
    public void validasiError(String error){
        Assert.assertTrue(validasiError.isDisplayed());
        element(validasiError).shouldContainText(error);
    }
}
