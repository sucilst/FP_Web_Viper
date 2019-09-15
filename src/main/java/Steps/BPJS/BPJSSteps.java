package Steps.BPJS;

import Pages.BPJS.BPJSPages;
import Pages.PLN.PLNPrepaidPages;
import Pages.SignIn.SignInPages;
import Pages.SignUp.SignUpPages;
import net.thucydides.core.steps.ScenarioSteps;

public class BPJSSteps extends ScenarioSteps {
    BPJSPages bpjsPages;
    PLNPrepaidPages plnPrepaidPages;
    SignInPages signInPages;
    SignUpPages signUpPages;

    public void openHalamanSepulsa(){
        bpjsPages.open();
    }

    public void klikLainnya(){
        bpjsPages.klikLainnya();
    }

    public void klikBPJS(){
        bpjsPages.klikBPJS();
    }

    public void nomorBPJS(String nomor){
        bpjsPages.fieldMeterBPJS(nomor);
    }

    public void nomorHP(String No_HP){
        bpjsPages.fieldNoHP(No_HP);
    }

    public void klikLanjutPembayaran(){
        bpjsPages.klikLanjutPembayaran();
    }

    public void pembayaranEmail(String email){
        plnPrepaidPages.emailPembayaran(email);
    }

    public void klikLanjutkan(){
        plnPrepaidPages.klikLanjutkan();
    }

    public void validasiAnon(String email){
        plnPrepaidPages.validasiAnon(email);
    }

    public void validasiEmailPembayaran(String error){
        plnPrepaidPages.validasiEmailPembayaran(error);
    }
}
