package Pages.MetodePembayaran;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SepulsaKreditPages extends PageObject {
    @FindBy(id="payment-panel-commerce_payment_payment_commerce_2")
    WebElement klikSepulsaKredit;
    public void klikSepulsaKredit(){
        Assert.assertTrue(klikSepulsaKredit.isDisplayed());
        klikSepulsaKredit.click();
    }

    @FindBy(xpath="//*[@id=\"app\"]/div/div/section[2]/div/div/div/div[2]/div[1]/div/div/div[2]/h1")
    WebElement validasiPembayaranSepulsa;
    public void validasiPembayaranSepulsa(String nama_lengkap){
        Assert.assertTrue(validasiPembayaranSepulsa.isDisplayed());
        element(validasiPembayaranSepulsa).shouldContainText("Hi "+nama_lengkap+", Terima kasih sudah bertransaksi di Sepulsa");
    }
}
