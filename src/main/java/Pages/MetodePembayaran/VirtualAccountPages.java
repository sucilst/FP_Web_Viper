package Pages.MetodePembayaran;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VirtualAccountPages extends PageObject {
    String nomorVA ="";

    @FindBy(id="payment-panel-rules_bca_virtual_account")
    WebElement klikBCAVA;
    public void klikBCAVA(){
        Assert.assertTrue(klikBCAVA.isDisplayed());
        klikBCAVA.click();
    }

    @FindBy(id="payment-panel-commerce_payment_atm_mandiri")
    WebElement klikMandiriVA;
    public void klikMandiriVA(){
        Assert.assertTrue(klikMandiriVA.isDisplayed());
        klikMandiriVA.click();
    }

    @FindBy(id="payment-panel-rules_permata_virtual_account")
    WebElement klikPermataVA;
    public void klikPermataVA(){
        Assert.assertTrue(klikPermataVA.isDisplayed());
        klikPermataVA.click();
    }

    @FindBy(id="biller_code")
    WebElement fieldBillerCode;
    public void fieldBillerCode(){
        Assert.assertTrue(fieldBillerCode.isDisplayed());
        fieldBillerCode.sendKeys("70012");
    }

    @FindBy(id="payment_code")
    WebElement fieldBillKey;
    public void fieldBillKey(){
        Assert.assertTrue(fieldBillKey.isDisplayed());
        fieldBillKey.sendKeys(nomorVA);
    }

    @FindBy(css="#app > div > div > section.pembayaran.list-item-transaction > div > div > div.col-lg-7.col-xs-12.pull-right.pembayaran-action > div > div > div.pembayaran-opsi-metode > div > div.in.panel.panel-default > div.panel-collapse.collapse.in > div > div.field-action > button")
    WebElement klikBayar;
    public void klikBayar(){
        try{
            Thread.sleep(1000);
            Assert.assertTrue(klikBayar.isDisplayed());
            klikBayar.click();
        } catch (Exception e){}

    }

    @FindBy(xpath="//*[@id=\"app\"]/div/div/section[2]/div/div/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/div[2]")
    WebElement copyNomorVA;
    public void copyNomorVA(){
        Assert.assertTrue(copyNomorVA.isDisplayed());
        nomorVA = copyNomorVA.getText();
    }

    @FindBy(id="inputMerchantId")
    WebElement fieldNomorVABCA;
    public void fieldNomorVABCA(){
        Assert.assertTrue(fieldNomorVABCA.isDisplayed());
        fieldNomorVABCA.sendKeys(nomorVA);
    }

    @FindBy(xpath="//*[@id=\"wrap\"]/div[2]/form/div[2]/div/button")
    WebElement klikInquireBCA;
    public void klikInquireBCA(){
        Assert.assertTrue(klikInquireBCA.isDisplayed());
        klikInquireBCA.click();
    }

    @FindBy(xpath="//*[@id=\"wrap\"]/div[2]/form/div[3]/div/button")
    WebElement klikInquireMandiri;
    public void klikInquireMandiri(){
        Assert.assertTrue(klikInquireMandiri.isDisplayed());
        klikInquireMandiri.click();
    }

    @FindBy(xpath="//*[@id=\"wrap\"]/div[2]/form/div[4]/div/button")
    WebElement klikPayBCA;
    public void klikPayBCA(){
        Assert.assertTrue(klikPayBCA.isDisplayed());
        klikPayBCA.click();
    }

    @FindBy(xpath="/html/body/div[2]/form/div[2]/div/button")
    WebElement klikInquirePermata;
    public void klikInquirePermata(){
        Assert.assertTrue(klikInquirePermata.isDisplayed());
        klikInquirePermata.click();
    }

    @FindBy(xpath="//*[@id=\"wrap\"]/div[2]/form/div[5]/div/button")
    WebElement klikPayMandiri;
    public void klikPayMandiri() {
        Assert.assertTrue(klikPayMandiri.isDisplayed());
        klikPayMandiri.click();
    }

    @FindBy(xpath="/html/body/div[2]/form/div[3]/div/button")
    WebElement klikPayPermata;
    public void klikPayPermata(){
        Assert.assertTrue(klikPayPermata.isDisplayed());
        klikPayPermata.click();
    }

    @FindBy(xpath="/html/body/div[2]/div[2]")
    WebElement validasiPembayaranBCAPermata;
    public void validasiPembayaranBCA(String success){
        Assert.assertTrue(validasiPembayaranBCAPermata.isDisplayed());
        element(validasiPembayaranBCAPermata).shouldContainText(success);
    }

    @FindBy(xpath="//*[@id=\"wrap\"]/div[2]/div[2]")
            WebElement validasiPembayaranMandiri;
    public void validasiPembayaranMandiri(String success){
        Assert.assertTrue(validasiPembayaranMandiri.isDisplayed());
        element(validasiPembayaranMandiri).shouldContainText(success);
    }
}
