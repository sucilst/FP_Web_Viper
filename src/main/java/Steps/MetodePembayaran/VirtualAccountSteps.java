package Steps.MetodePembayaran;

import Pages.MetodePembayaran.VirtualAccountPages;
import net.thucydides.core.steps.ScenarioSteps;

public class VirtualAccountSteps extends ScenarioSteps {
    VirtualAccountPages virtualAccountPages;

    public void openHalamanPembayaran(){
        virtualAccountPages.openUrl("https://altaqefeproject.sepulsa.id/pembayaran");
    }

    public void klikBCA(){
        virtualAccountPages.klikBCAVA();
    }

    public void klikMandiri(){
        virtualAccountPages.klikMandiriVA();
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

    public void klikInquireMandiri(){
        virtualAccountPages.klikInquireMandiri();
    }

    public void klikInquirePermata(){
        virtualAccountPages.klikInquirePermata();
    }

    public void klikPayBCA(){
        virtualAccountPages.klikPayBCA();
    }

    public void klikPayMandiri(){
        virtualAccountPages.klikPayMandiri();
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
}
