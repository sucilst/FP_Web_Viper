package Steps.MetodePembayaran;

import Pages.MetodePembayaran.SepulsaKreditPages;
import net.thucydides.core.steps.ScenarioSteps;

public class SepulsaKreditSteps extends ScenarioSteps {
    SepulsaKreditPages sepulsaKreditPages;

    public void klikSepulsaKredit(){
        sepulsaKreditPages.klikSepulsaKredit();
    }

    public void validasiPembayaranSepulsa(String nama_lengkap){
        sepulsaKreditPages.validasiPembayaranSepulsa(nama_lengkap);
    }
}
