package Steps.PLN;

import Pages.PLN.PLNPostpaidPages;
import Pages.PLN.PLNPrepaidPages;
import net.thucydides.core.steps.ScenarioSteps;

public class PLNPostpaidSteps extends ScenarioSteps {
    PLNPostpaidPages plnPostpaidPages;
    PLNPrepaidPages plnPrepaidPages;

    public void klikListrik(){
        plnPrepaidPages.klikListrik();
    }

    public void openHalamanPasca(){
        plnPostpaidPages.open();
    }

    public void klikPasca(){
        plnPostpaidPages.klikPasca();
    }

    public void nomorID(String nomor){
        plnPostpaidPages.nomorID(nomor);
    }

    public void nomorHP(String No_HP){
        plnPostpaidPages.nomorHP(No_HP);
    }

    public void klikLanjut(){
        plnPostpaidPages.klikLanjut();
    }

    public void emailPembayaran(String email){
        plnPostpaidPages.emailPembayaran(email);
    }

    public void validasiAnon(String email){
        plnPrepaidPages.validasiAnon(email);
    }

    public void klikLanjutkan(){
        plnPrepaidPages.klikLanjutkan();
    }

    public void validasiNomorID(){
        plnPostpaidPages.validasiNomorID();
    }

    public void validasiError(String errors){
        plnPostpaidPages.validasiError(errors);
    }
}
