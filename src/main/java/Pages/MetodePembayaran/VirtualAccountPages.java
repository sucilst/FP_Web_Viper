package Pages.MetodePembayaran;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
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

    @FindBy(xpath="//*[@id=\"app\"]/div/div/section[2]/div/div/div[2]/div/div/div[3]/div/div[1]/div[2]/div/div[2]/button")
    WebElement klikBayarBCA;
    public void klikBayarBCA(){
        Assert.assertTrue(klikBayarBCA.isDisplayed());
        klikBayarBCA.click();
    }

    @FindBy(xpath="//*[@id=\"app\"]/div/div/section[2]/div/div/div[2]/div/div/div[3]/div/div[3]/div[2]/div/div[2]/button")
    WebElement klikBayarMandiri;
    public void klikBayarMandiri(){
        Assert.assertTrue(klikBayarMandiri.isDisplayed());
        klikBayarMandiri.click();
    }

    @FindBy(xpath="//*[@id=\"app\"]/div/div/section[2]/div/div/div[2]/div/div/div[3]/div/div[4]/div[2]/div/div[2]/button")
    WebElement klikBayarPermata;
    public void klikBayarPermata(){
        Assert.assertTrue(klikBayarPermata.isDisplayed());
        klikBayarPermata.click();
    }

    @FindBy(xpath="//*[@id=\"app\"]/div/div/section[2]/div/div/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/div[2]")
    WebElement copyNomorVABCA;
    public void copyNomorVABCA(){
        Assert.assertTrue(copyNomorVABCA.isDisplayed());
        nomorVA = copyNomorVABCA.getText();
    }

    @FindBy(xpath="//*[@id=\"app\"]/div/div/section[2]/div/div/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/div[2]")
    WebElement copyNomorVAMandiri;
    public void copyNomorVAMandiri(){
        Assert.assertTrue(copyNomorVAMandiri.isDisplayed());
        nomorVA = copyNomorVAMandiri.getText();
    }

    @FindBy(xpath="//*[@id=\"app\"]/div/div/section[2]/div/div/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/div[2]")
    WebElement copyNomorVAPermata;
    public void copyNomorVAPermata(){
        Assert.assertTrue(copyNomorVAPermata.isDisplayed());
        nomorVA = copyNomorVAPermata.getText();
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
}
