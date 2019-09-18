package Pages.BPJS;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BPJSPages extends PageObject {
    @FindBy(id="product-tabs-tab-7")
    WebElement klikLainnya;
    public void klikLainnya(){
        Assert.assertTrue(klikLainnya.isDisplayed());
        klikLainnya.click();
    }

    @FindBy(xpath="//*[@id=\"product-tabs-pane-7\"]/div/div/div/ul/li[2]/a/div")
    WebElement klikBPJS;
    public void klikBPJS(){
        Assert.assertTrue(klikBPJS.isDisplayed());
        klikBPJS.click();
    }

    @FindBy(name="bpjs_meter")
    WebElement fieldMeter;
    public void fieldMeterBPJS(String nomor){
        Assert.assertTrue(fieldMeter.isDisplayed());
        fieldMeter.sendKeys(nomor);
    }

    @FindBy(name="bpjs_telp")
    WebElement fieldNoHP;
    public void fieldNoHP(String No_HP){
        Assert.assertTrue(fieldNoHP.isDisplayed());
        fieldNoHP.sendKeys(No_HP);
    }

    @FindBy(xpath="//*[@id=\"pascabayar-action\"]/div/a")
    WebElement klikLanjutPembayaran;
    public void klikLanjutPembayaran(){
        Assert.assertTrue(klikLanjutPembayaran.isDisplayed());
        klikLanjutPembayaran.click();
    }

    @FindBy(xpath="//*[@id=\"product-tabs-pane-4\"]/div/div[1]/span[3]")
    WebElement validasiError;
    public void validasiError(String error){
        Assert.assertTrue(klikLanjutPembayaran.isDisplayed());
        element(validasiError).shouldContainText(error);
    }
}
