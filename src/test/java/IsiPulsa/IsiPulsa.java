package IsiPulsa;

import Steps.IsiPulsa.IsiPulsaSteps;
import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;

public class IsiPulsa extends SerenityStory {
    @Steps
    IsiPulsaSteps isiPulsaSteps;

    @Given("user berada di halaman beranda")
    public void givenUserBeradaDiHalamanBeranda(){
        isiPulsaSteps.openBerandaSepulsa();
    }

    @When("user sudah sign in ke akun yang dimiliki $email $password")
    public void whenUserSudahSignInKeAkunYangDimilikiemailpassword(String email, String password) {
        isiPulsaSteps.klikSignIn();
        isiPulsaSteps.email(email);
        isiPulsaSteps.password(password);
        isiPulsaSteps.klikMasuk();
    }

    @When("user memasukan $No_HP ke field No. Handphone")
    public void whenUserMemasukanNo_HPKeFieldNoHandphone(String No_HP) {
        isiPulsaSteps.fieldNomorHP(No_HP);
    }

    @When("memilih denom $pulsa yang diinginkan")
    public void whenMemilihDenompulsaYangDiinginkan(String pulsa) {
        isiPulsaSteps.denom(pulsa);
    }

    @When("Email $email yang diinginkan")
    public void whenEmailEmailYangDiinginkan(String email) {
        isiPulsaSteps.pembayaranEmail(email);
    }

    @When("Klik lanjutkan")
    public void whenKlikLanjutkan() {
        isiPulsaSteps.klikLanjutkan();
    }

    @When("melakukan sign in $email $password")
    public void whenMelakukanSignin(String email, String password) {
        isiPulsaSteps.klikSignin();
        isiPulsaSteps.email(email);
        isiPulsaSteps.password(password);
        isiPulsaSteps.klikMasuk2();
    }

    @When("memilih metode pembayaran $Bank")
    public void whenMemilihMetodePembayaranBank(String Bank) {
        switch(Bank) {
            case "BCA":
                isiPulsaSteps.klikBCA();
                isiPulsaSteps.klikBayar();
                isiPulsaSteps.copyNomorVA();
                isiPulsaSteps.openSandBoxBCA();
                isiPulsaSteps.fieldNomorVABCA();
                isiPulsaSteps.klikInquireBCA();
                isiPulsaSteps.klikPayBCA();
                break;
            case "Mandiri":
                isiPulsaSteps.klikMandiri();
                isiPulsaSteps.klikBayar();
                isiPulsaSteps.copyNomorVA();
                isiPulsaSteps.openSandBoxMandiri();
                isiPulsaSteps.fieldBillerCode();
                isiPulsaSteps.fieldBillKey();
                isiPulsaSteps.klikInquireMandiri();
                isiPulsaSteps.klikPayMandiri();
                break;
            case "Permata":
                isiPulsaSteps.klikPermata();
                isiPulsaSteps.klikBayar();
                isiPulsaSteps.copyNomorVA();
                isiPulsaSteps.openSandBoxPermata();
                isiPulsaSteps.fieldNomorVABCA();
                isiPulsaSteps.klikInquirePermata();
                isiPulsaSteps.klikPayPermata();
                break;
            case "Sepulsa Kredit":
                isiPulsaSteps.klikBayar();
                break;
            case "Credit Card":
                isiPulsaSteps.klikCC();
                isiPulsaSteps.ccCVV("123");
                isiPulsaSteps.klikBayar();
                break;
            case "BCA Failed":
                isiPulsaSteps.klikBCA();
                isiPulsaSteps.klikBayar();
                break;
            case "Mandiri Failed":
                isiPulsaSteps.klikMandiri();
                isiPulsaSteps.klikBayar();
                break;
            case "Permata Failed":
                isiPulsaSteps.klikPermata();
                isiPulsaSteps.klikBayar();
                break;
        }
    }

    @Then("transaksi berhasil $Bank $validasi")
    public void thenTransaksiBerhasilBankValidasi(String Bank, String validasi) {
        switch (Bank){
            case "BCA":
                isiPulsaSteps.validasiPembayaranBCAPermata(validasi);
                break;
            case "Permata":
                isiPulsaSteps.validasiPembayaranBCAPermata(validasi);
                break;
            case "Mandiri":
                isiPulsaSteps.validasiPembayaranMandiri(validasi);
                break;
            case "Sepulsa Kredit":
                isiPulsaSteps.validasiPembayaranSepulsa(validasi);
                break;
            case "Credit Card":
                isiPulsaSteps.validasiPembayaranSepulsa(validasi);
                break;
            case "BCA Failed":
                isiPulsaSteps.validasiPembayaranSepulsa(validasi);
                break;
            case "Permata Failed":
                isiPulsaSteps.validasiPembayaranSepulsa(validasi);
                break;
            case "Mandiri Failed":
                isiPulsaSteps.validasiPembayaranSepulsa(validasi);
                break;
        }
    }

    @Then("Pesan Error muncul $error")
    public void thenPesanErrorMunculError(String error) {
        switch (error){
            case "Panjang nomor hp kurang dari 8 digit":
                isiPulsaSteps.validasiError(error);
                break;
        }
    }
}
