package PLN;

import Steps.PLN.PLNPostpaidSteps;
import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;

public class PLNPostpaid extends SerenityStory {
    @Steps
    PLNPostpaidSteps plnPostpaidSteps;

    @Given("pengguna berada di halaman utama")
    public void givenPenggunaBeradaDiHalamanUtama() {
        plnPostpaidSteps.openHalamanPasca();
    }

    @When("klik menu Listrik PLN")
    public void whenKlikMenuListrikPLN() {
        plnPostpaidSteps.klikListrik();
    }

    @When("klik Pascabayar")
    public void whenKlikPascabayar() {
        plnPostpaidSteps.klikPasca();
    }

    @When("Masukkan nomor ID pelanggan $nomor yang benar")
    public void whenMasukkanNomorIDPelanggannomorYangBenar(String nomor) {
        plnPostpaidSteps.nomorID(nomor);
    }

    @When("Masukkan nomor ID pelanggan $nomor yang salah")
    public void whenMasukkanNomorIDPelanggannomorYangSalah(String nomor) {
        plnPostpaidSteps.nomorID(nomor);
    }

    @When("Masukkan No. HP $No_HP yang benar")
    public void whenMasukkanNoHPNo_HPYangBenar(String No_HP) {
        plnPostpaidSteps.nomorHP(No_HP);
    }

    @When("Masukkan No. HP $No_HP yang salah")
    public void whenMasukkanNoHPNo_HPYangSalah(String No_HP) {
        plnPostpaidSteps.nomorHP(No_HP);
    }

    @When("klik lanjut ke pembayaran")
    public void whenKlikLanjutKePembayaran() {
        plnPostpaidSteps.klikLanjutPembayaran();
    }

    @When("memasukkan alamat $email yang benar")
    public void whenMemasukkanAlamatEmailYangBenar(String email) {
        plnPostpaidSteps.pembayaranEmail(email);
    }

    @When("memasukkan alamat $email yang salah")
    public void whenMemasukkanAlamatEmailYangSalah(String email) {
        plnPostpaidSteps.pembayaranEmail(email);
    }

    @When("Klik Lanjutkan")
    public void whenKlikLanjutkan() {
        plnPostpaidSteps.klikLanjutkan();
    }

    @When("pengguna melakukan Sign In $email $password")
    public void whenPenggunaMelakukanSignInEmailPassword(String email, String password) {
        plnPostpaidSteps.klikSignIn();
        plnPostpaidSteps.email(email);
        plnPostpaidSteps.password(password);
        plnPostpaidSteps.klikMasuk();
    }

    @When("Pengguna melakukan pembayaran melalui $Bank")
    public void whenPenggunaMelakukanPembayaranMelaluiBank(String Bank) {
        switch(Bank) {
            case "BCA":
                plnPostpaidSteps.klikBCA();
                plnPostpaidSteps.klikBayarBCA();
                plnPostpaidSteps.copyNomorVABCA();
                plnPostpaidSteps.openSandBoxBCA();
                plnPostpaidSteps.fieldNomorVABCA();
                plnPostpaidSteps.klikInquireBCA();
                plnPostpaidSteps.klikPayBCA();
                break;
            case "Mandiri":
                plnPostpaidSteps.klikMandiri();
                plnPostpaidSteps.klikBayarMandiri();
                plnPostpaidSteps.copyNomorVAMandiri();
                plnPostpaidSteps.openSandBoxMandiri();
                plnPostpaidSteps.fieldBillerCode();
                plnPostpaidSteps.fieldBillKey();
                plnPostpaidSteps.klikInquireMandiri();
                plnPostpaidSteps.klikPayMandiri();
                break;
            case "Permata":
                plnPostpaidSteps.klikPermata();
                plnPostpaidSteps.klikBayarPermata();
                plnPostpaidSteps.copyNomorVAPermata();
                plnPostpaidSteps.openSandBoxPermata();
                plnPostpaidSteps.fieldNomorVABCA();
                plnPostpaidSteps.klikInquirePermata();
                plnPostpaidSteps.klikPayPermata();
                break;
        }

    }

    @Then("pengguna berada di halaman pembayaran $email")
    public void thenPenggunaBeradaDiHalamanPembayaranemail(String email) {
        plnPostpaidSteps.validasiAnon(email);
    }

    @Then("pesan error tertampil $errors")
    public void thenPesanErrorDitampilkanerror(String errors) {
        switch(errors) {
            case "General Error.":
                plnPostpaidSteps.validasiError(errors);
                break;
            case "No Telepon tidak valid.":
                plnPostpaidSteps.validasiError(errors);
                break;
            case "nomor hp harus dalam format yang benar":
                plnPostpaidSteps.validasiError(errors);
                break;
            case "Email harus diisi dalam format yang benar":
                plnPostpaidSteps.validasiEmailPembayaran(errors);
                break;
            case "":
                plnPostpaidSteps.validasiNomorID();
                break;
        }
    }

}
