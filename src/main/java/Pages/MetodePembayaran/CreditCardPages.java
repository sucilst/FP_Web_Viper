package Pages.MetodePembayaran;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreditCardPages extends PageObject {
    @FindBy(id="payment-panel-commerce_payment_commerce_veritrans")
    WebElement klikCreditCard;
    public void klikCreditCard(){
        Assert.assertTrue(klikCreditCard.isDisplayed());
        klikCreditCard.click();
    }

    @FindBy(xpath="//*[@id=\"app\"]/div/div/section[2]/div/div/div[2]/div/div/div[3]/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div/div/div/input")
    WebElement tambahCC;
    public void tambahCC(){
        Assert.assertTrue(tambahCC.isDisplayed());
        tambahCC.click();
    }

    @FindBy(name="pembayaran_cc_number")
    WebElement ccNumber;
    public void ccNumber(String nomor){
        Assert.assertTrue(ccNumber.isDisplayed());
        ccNumber.sendKeys(nomor);
    }

    @FindBy(name="pembayaran_cc_month")
    WebElement ccBulan;
    @FindBy(name="pembayaran_cc_year")
    WebElement ccTahun;
    public void ccDate(String bulan, String tahun){
        Assert.assertTrue(ccBulan.isDisplayed());
        element(ccBulan).selectByValue(bulan).click();
        Assert.assertTrue(ccTahun.isDisplayed());
        element(ccTahun).selectByVisibleText(tahun).click();
    }

    @FindBy(name="pembayaran_cc_cvv")
    WebElement ccCVV;
    public void ccCVV(String cvv){
        Assert.assertTrue(ccCVV.isDisplayed());
        ccCVV.sendKeys(cvv);
    }

    @FindBy(xpath="//*[@id=\"field-tambah-kartu\"]/div[4]/div/div/label[1]")
    WebElement ccSave;
    public void ccSave(){
        Assert.assertTrue(ccSave.isDisplayed());
        ccSave.click();
    }

    @FindBy(id="PaRes")
    WebElement ccPassword;
    @FindBy(name="ok")
    WebElement klikOK;
    public void ccPassword(){
        try {
            Thread.sleep(1000);
            Assert.assertTrue(ccSave.isDisplayed());
            Thread.sleep(1000);
            Assert.assertTrue(klikOK.isDisplayed());
        }catch (Exception e){
        }
    }

    @FindBy(xpath="//*[@id=\"app\"]/div/div/section[2]/div/div/div[2]/div/div/div[3]/div/div[2]/div[2]/div/div[1]/div[1]/span[3]")
    WebElement validasiError;
    public void validasiError(String error){
        Assert.assertTrue(validasiError.isDisplayed());
        element(validasiError).shouldContainText(error);
    }
}
