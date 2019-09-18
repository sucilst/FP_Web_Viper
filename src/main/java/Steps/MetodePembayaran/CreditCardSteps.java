package Steps.MetodePembayaran;

import Pages.MetodePembayaran.CreditCardPages;
import Pages.MetodePembayaran.VirtualAccountPages;
import net.thucydides.core.steps.ScenarioSteps;

public class CreditCardSteps extends ScenarioSteps {
    CreditCardPages creditCardPages;
    VirtualAccountPages virtualAccountPages;

    public void klikCC(){
        creditCardPages.klikCreditCard();
    }

    public void ccNumber(String nomor){
        creditCardPages.ccNumber(nomor);
    }

    public void ccDate(String bulan, String tahun){
        creditCardPages.ccDate(bulan,tahun);
    }

    public void ccCVV(String cvv){
        creditCardPages.ccCVV(cvv);
    }

    public void ccSave(){
        creditCardPages.ccSave();
    }

    public void klikBayar(){
        virtualAccountPages.klikBayar();
    }

    public void validasiError(String error){
        creditCardPages.validasiError(error);
    }

    public void ccPassword(){
        creditCardPages.ccPassword();
    }
}
