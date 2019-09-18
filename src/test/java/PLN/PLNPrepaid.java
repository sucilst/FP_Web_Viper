package PLN;

import Pages.PLN.PLNPrepaidPages;
import Steps.PLN.PLNPrepaidSteps;
import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;

public class PLNPrepaid extends SerenityStory {
    @Steps
    PLNPrepaidSteps plnPrepaidSteps;

    @Given("pengguna berada di halaman awal web")
    public void givenPenggunaBeradaDiHalamanAwalWeb() {
        plnPrepaidSteps.openHalaman();
    }

    @When("klik Listrik PLN")
    public void whenKlikListrikPLN() {
        plnPrepaidSteps.klikListrik();
    }

    @When("Nomor meter PLN $nomor yang benar")
    public void whenNomorMeterPLNnomorYangBenar(String nomor) {
        plnPrepaidSteps.nomorPLN(nomor);
    }

    @When("Nomor meter PLN $nomor yang salah")
    public void whenNomorMeterPLNnomorYangSalah(String nomor) {
        plnPrepaidSteps.nomorPLN(nomor);
    }

    @When("No. Handphone $No_HP yang benar")
    public void whenNoHandphoneNo_HPYangBenar(String No_HP) {
        plnPrepaidSteps.noHP(No_HP);
    }

    @When("No. Handphone $No_HP yang salah")
    public void whenNoHandphoneNo_HPYangSalah(String No_HP) {
        plnPrepaidSteps.noHP(No_HP);
    }

    @When("memilih nominal $nominal")
    public void whenMemilihNominalnominal(String nominal) {
        plnPrepaidSteps.nominal(nominal);
    }

    @When("$email dimasukkan pada kolom email")
    public void whenEmailDimasukkanPadaKolomEmail(String email) {
        plnPrepaidSteps.pembayaranEmail(email);
    }

    @When("sign in pembayaran $email $password")
    public void whenSignInEmailPassword(String email, String password) {
        plnPrepaidSteps.klikSignin();
        plnPrepaidSteps.email(email);
        plnPrepaidSteps.password(password);
        plnPrepaidSteps.klikMasuk2();
    }

    @When("$email yang dimasukkan pada kolom email salah")
    public void whenEmailYangDimasukkanPadaKolomEmailSalah(String email) {
        plnPrepaidSteps.pembayaranEmail(email);
    }

    @When("klik lanjutkan")
    public void whenKlikLanjutkan() {
        plnPrepaidSteps.klikLanjutkan();
    }

    @When("Pengguna melakukan Sign In $email $password")
    public void whenPenggunaMelakukanSignInEmailPassword(String email, String password) {
        plnPrepaidSteps.klikSignIn();
        plnPrepaidSteps.email(email);
        plnPrepaidSteps.password(password);
        plnPrepaidSteps.klikMasuk();
    }

    @When("pengguna melakukan pembayaran melalui $Bank")
    public void whenPenggunaMelakukanPembayaranMelaluiBank(String Bank) {
        switch(Bank) {
            case "BCA":
                plnPrepaidSteps.klikBCA();
                plnPrepaidSteps.klikBayar();
                plnPrepaidSteps.copyNomorVA();
                plnPrepaidSteps.openSandBoxBCA();
                plnPrepaidSteps.fieldNomorVABCA();
                plnPrepaidSteps.klikInquireBCA();
                plnPrepaidSteps.klikPayBCA();
                break;
            case "Mandiri":
                plnPrepaidSteps.klikMandiri();
                plnPrepaidSteps.klikBayar();
                plnPrepaidSteps.copyNomorVA();
                plnPrepaidSteps.openSandBoxMandiri();
                plnPrepaidSteps.fieldBillerCode();
                plnPrepaidSteps.fieldBillKey();
                plnPrepaidSteps.klikInquireMandiri();
                plnPrepaidSteps.klikPayMandiri();
                break;
            case "Permata":
                plnPrepaidSteps.klikPermata();
                plnPrepaidSteps.klikBayar();
                plnPrepaidSteps.copyNomorVA();
                plnPrepaidSteps.openSandBoxPermata();
                plnPrepaidSteps.fieldNomorVABCA();
                plnPrepaidSteps.klikInquirePermata();
                plnPrepaidSteps.klikPayPermata();
                break;
            case "Sepulsa Kredit":
                plnPrepaidSteps.klikBayar();
                break;
            case "Credit Card":
                plnPrepaidSteps.klikCC();
                plnPrepaidSteps.ccCVV("123");
                plnPrepaidSteps.klikBayar();
                break;
            case "BCA Failed":
                plnPrepaidSteps.klikBCA();
                plnPrepaidSteps.klikBayar();
                break;
            case "Mandiri Failed":
                plnPrepaidSteps.klikMandiri();
                plnPrepaidSteps.klikBayar();
                break;
            case "Permata Failed":
                plnPrepaidSteps.klikPermata();
                plnPrepaidSteps.klikBayar();
                break;
        }

    }

    @Then("transaksi telah dibayar $Bank $validasi")
    public void thenTransaksiTelahDibayar(String Bank, String validasi) {
        switch (Bank){
            case "BCA":
                plnPrepaidSteps.validasiPembayaranBCAPermata(validasi);
                break;
            case "Permata":
                plnPrepaidSteps.validasiPembayaranBCAPermata(validasi);
                break;
            case "Mandiri":
                plnPrepaidSteps.validasiPembayaranMandiri(validasi);
                break;
            case "Credit Card":
                plnPrepaidSteps.validasiPembayaranSepulsa(validasi);
                break;
        }
    }

    @Then("berada di halaman pembayaran $email")
    public void thenBeradaDiHalamanPembayaran(String email) {
        plnPrepaidSteps.validasiAnon(email);
    }

    @Then("pesan error muncul $error")
    public void thenPesanErrorMunculerror(String error) {
        switch(error) {
            case "No Pelanggan/ No Meter tidak valid.":
                plnPrepaidSteps.validasiError(error);
                break;
            case "Server PLN Cut-off.":
                plnPrepaidSteps.validasiError(error);
                break;
            case "Email harus diisi dalam format yang benar":
                plnPrepaidSteps.validasiEmailPembayaran(error);
                break;
        }
    }

    @Then("nominal tidak tertampil")
    public void thenNominalTidakTertampil() {
        plnPrepaidSteps.validasiNominal();
    }

    @Then("Berada di halaman pembayaran $nama_lengkap")
    public void thenBeradaDiHalamanPembayaranNamaLengkap(String nama_lengkap) {
        plnPrepaidSteps.validasiLogin(nama_lengkap);
    }
}
