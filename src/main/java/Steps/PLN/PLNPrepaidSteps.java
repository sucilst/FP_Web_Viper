package Steps.PLN;

import Pages.MetodePembayaran.CreditCardPages;
import Pages.MetodePembayaran.SepulsaKreditPages;
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
    SepulsaKreditPages sepulsaKreditPages;
    CreditCardPages creditCardPages;

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

    public void validasiEmailPembayaran(String error){
        plnPrepaidPages.validasiEmailPembayaran(error);
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
}
