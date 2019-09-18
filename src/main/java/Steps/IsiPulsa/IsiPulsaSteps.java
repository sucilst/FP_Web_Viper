package Steps.IsiPulsa;

import Pages.IsiPulsa.IsiPulsaPages;
import Pages.MetodePembayaran.CreditCardPages;
import Pages.MetodePembayaran.SepulsaKreditPages;
import Pages.MetodePembayaran.VirtualAccountPages;
import Pages.PLN.PLNPrepaidPages;
import Pages.SignIn.SignInPages;
import Pages.SignUp.SignUpPages;
import net.thucydides.core.steps.ScenarioSteps;

public class IsiPulsaSteps extends ScenarioSteps {
    SignInPages signInPages;
    SignUpPages signUpPages;
    IsiPulsaPages isiPulsaPages;
    VirtualAccountPages virtualAccountPages;
    PLNPrepaidPages plnPrepaidPages;
    SepulsaKreditPages sepulsaKreditPages;
    CreditCardPages creditCardPages;

    public void openBerandaSepulsa(){
        isiPulsaPages.open();
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

    public void klikMasuk2(){
        signInPages.klikMasuk2();
    }

    public void fieldNomorHP(String No_HP){
        isiPulsaPages.fieldNomorHP(No_HP);
    }

    public void denom(String pulsa){
        isiPulsaPages.denomPulsa(pulsa);
    }

    public void pembayaranEmail(String email){
        plnPrepaidPages.emailPembayaran(email);
    }

    public void klikSignin(){
        plnPrepaidPages.klikSignin();
    }

    public void klikLanjutkan(){
        plnPrepaidPages.klikLanjutkan();
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

    public void validasiError(String error){
        isiPulsaPages.validasiError(error);
    }

    public void klikSepulsaKredit(){
        sepulsaKreditPages.klikSepulsaKredit();
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
