package Steps.PLN;

import Pages.MetodePembayaran.VirtualAccountPages;
import Pages.PLN.PLNPrepaidPages;
import Pages.SignIn.SignInPages;
import Pages.SignUp.SignUpPages;
import net.thucydides.core.steps.ScenarioSteps;

public class PLNPrepaidSteps extends ScenarioSteps {
    PLNPrepaidPages plnPrepaidPages;
    SignInPages signInPages;
    SignUpPages signUpPages;
    VirtualAccountPages virtualAccountPages;

    public void openHalaman(){
        plnPrepaidPages.open();
    }

    public void klikListrik(){
        plnPrepaidPages.klikListrik();
    }

    public void nomorPLN(String nomor){
        plnPrepaidPages.nomorMeter(nomor);
    }

    public void noHP(String No_HP){
        plnPrepaidPages.noHP(No_HP);
    }

    public void nominal(String nominal){
        plnPrepaidPages.nominal(nominal);
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

    public void validasiLogin(String nama_lengkap){
        plnPrepaidPages.validasiLogin(nama_lengkap);
    }

    public void validasiError(String error){
        plnPrepaidPages.validasiError(error);
    }

    public void validasiNominal(){
        plnPrepaidPages.pilihanNominal();
    }

    public void klikSignIn(){
        signInPages.klikSignIn();
    }

    public void email(String email){
        signUpPages.email(email);
    }

    public void password(String password){
        signUpPages.password(password);
    }

    public void klikMasuk(){
        signInPages.klikMasuk();
    }

    public void validasiEmailPembayaran(String error){
        plnPrepaidPages.validasiEmailPembayaran(error);
    }

    public void klikBCA(){
        virtualAccountPages.klikBCAVA();
    }

    public void klikPermata(){
        virtualAccountPages.klikPermataVA();
    }

    public void klikBayarBCA(){
        virtualAccountPages.klikBayarBCA();
    }

    public void klikBayarMandiri(){
        virtualAccountPages.klikBayarMandiri();
    }

    public void klikBayarPermata(){
        virtualAccountPages.klikBayarPermata();
    }

    public void copyNomorVABCA(){
        virtualAccountPages.copyNomorVABCA();
    }

    public void copyNomorVAMandiri(){
        virtualAccountPages.copyNomorVAMandiri();
    }

    public void copyNomorVAPermata(){
        virtualAccountPages.copyNomorVAPermata();
    }

    public void openSandBoxBCA(){
        virtualAccountPages.openUrl("https://simulator.sandbox.midtrans.com/bca/va/index");
    }

    public void openSandBoxMandiri(){
        virtualAccountPages.openUrl("https://simulator.sandbox.midtrans.com/mandiri/bill/index");
    }

    public void openSandBoxPermata(){
        virtualAccountPages.openUrl("https://simulator.sandbox.midtrans.com/permata/va/index");
    }

    public void fieldNomorVABCA(){
        virtualAccountPages.fieldNomorVABCA();
    }

    public void fieldBillerCode(){
        virtualAccountPages.fieldBillerCode();
    }

    public void  fieldBillKey(){
        virtualAccountPages.fieldBillKey();
    }

    public void klikInquireBCA(){
        virtualAccountPages.klikInquireBCA();
    }

    public void klikPayBCA(){
        virtualAccountPages.klikPayBCA();
    }

    public void klikInquireMandiri(){
        virtualAccountPages.klikInquireMandiri();
    }

    public void klikInquirePermata(){
        virtualAccountPages.klikInquirePermata();
    }

    public void klikPayMandiri(){
        virtualAccountPages.klikPayMandiri();
    }

    public void klikMandiri(){
        virtualAccountPages.klikMandiriVA();
    }

    public void klikPayPermata(){
        virtualAccountPages.klikPayPermata();
    }

}
