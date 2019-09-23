package Steps.PLN;

import Pages.MetodePembayaran.CreditCardPages;
import Pages.MetodePembayaran.SepulsaKreditPages;
import Pages.MetodePembayaran.VirtualAccountPages;
import Pages.PLN.PLNPostpaidPages;
import Pages.PLN.PLNPrepaidPages;
import Pages.SignIn.SignInPages;
import Pages.SignUp.SignUpPages;
import net.thucydides.core.steps.ScenarioSteps;

public class PLNPostpaidSteps extends ScenarioSteps {
    PLNPostpaidPages plnPostpaidPages;
    PLNPrepaidPages plnPrepaidPages;
    SignInPages signInPages;
    SignUpPages signUpPages;
    VirtualAccountPages virtualAccountPages;
    SepulsaKreditPages sepulsaKreditPages;
    CreditCardPages creditCardPages;

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

    public void klikLanjutPembayaran(){
        plnPostpaidPages.klikLanjutPembayaran();
    }

    public void pembayaranEmail(String email){
        plnPrepaidPages.emailPembayaran(email);
    }

    public void validasiEmailPembayaran(String error){
        plnPrepaidPages.validasiEmailPembayaran(error);
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

    public void klikSignIn(){
        signInPages.klikSignIn();
    }

    public void klikSignin(){
        plnPrepaidPages.klikSignin();
    }

    public void klikMasuk2(){
        signInPages.klikMasuk2();
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

    public void klikBCA(){
        virtualAccountPages.klikBCAVA();
    }

    public void klikPermata(){
        virtualAccountPages.klikPermataVA();
    }

    public void klikBayar(){
        virtualAccountPages.klikBayar();
    }

    public void copyNomorVA(){
        virtualAccountPages.copyNomorVA();
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

    public void validasiPembayaranBCAPermata(String success){
        virtualAccountPages.validasiPembayaranBCA(success);
    }

    public void validasiPembayaranMandiri(String success){
        virtualAccountPages.validasiPembayaranMandiri(success);
    }

    public void validasiPembayaranSepulsa(String nama_lengkap){
        sepulsaKreditPages.validasiPembayaranSepulsa(nama_lengkap);
    }

    public void klikCC(){
        creditCardPages.klikCreditCard();
    }

    public void ccCVV(String cvv){
        creditCardPages.ccCVV(cvv);
    }

    public void validasiCC(){
        creditCardPages.validasiCC();
    }
}
