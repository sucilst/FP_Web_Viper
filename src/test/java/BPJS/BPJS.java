package BPJS;

import Steps.BPJS.BPJSSteps;
import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;

public class BPJS extends SerenityStory {
    @Steps
    BPJSSteps bpjsSteps;

    @Given("user sudah ada pada halaman beranda sepulsa")
    public void givenUserSudahAdaPadaHalamanBerandaSepulsa() {
        bpjsSteps.openHalamanSepulsa();
    }

    @When("user menekan kebab button")
    public void whenUserMenekanKebabButton() {
        bpjsSteps.klikLainnya();
    }

    @When("menekan opsi \"Bayar BPJS\"")
    public void whenMenekanOpsiBayarBPJS() {
        bpjsSteps.klikBPJS();
    }

    @When("memasukan Nomor BPJS $nomor valid")
    public void whenMemasukanNomorBPJSnomorValid(String nomor) {
        bpjsSteps.nomorBPJS(nomor);
    }

    @When("memasukan Nomor BPJS $nomor invalid")
    public void whenMemasukanNomorBPJSnomorInvalid(String nomor) {
        bpjsSteps.nomorBPJS(nomor);
    }

    @When("memasukan No HP $No_HP valid")
    public void whenMemasukanNoHPNo_HPValid(String No_HP) {
        bpjsSteps.nomorHP(No_HP);
    }

    @When("menekan tombol \"Lanjut ke Pembayaran\"")
    public void whenMenekanTombolLanjutKePembayaran() {
        bpjsSteps.klikLanjutPembayaran();
    }

    @When("mengisi email $email valid")
    public void whenMengisiEmailemailValid(String email) {
        bpjsSteps.pembayaranEmail(email);
    }

    @When("mengisi email $email invalid")
    public void whenMengisiEmailemailInvalid(String email) {
        bpjsSteps.pembayaranEmail(email);
    }

    @When("menekan tombol \"Lanjutkan\"")
    public void whenMenekanTombolLanjutkan() {
        bpjsSteps.klikLanjutkan();
    }

    @When("user melakukan Sign In $email $password")
    public void whenPenggunaMelakukanSignInEmailPassword(String email, String password) {
        bpjsSteps.klikSignIn();
        bpjsSteps.email(email);
        bpjsSteps.password(password);
        bpjsSteps.klikMasuk();
    }

    @When("user melakukan sign in $email $password")
    public void whenUserMelakukanSignIn(String email, String password) {
        bpjsSteps.klikSignin();
        bpjsSteps.email(email);
        bpjsSteps.password(password);
        bpjsSteps.klikMasuk2();
    }

    @When("user melakukan pembayaran melalui $Bank")
    public void whenPenggunaMelakukanPembayaranMelaluiBank(String Bank) {
        switch(Bank) {
            case "BCA":
                bpjsSteps.klikBCA();
                bpjsSteps.klikBayar();
                bpjsSteps.copyNomorVA();
                bpjsSteps.openSandBoxBCA();
                bpjsSteps.fieldNomorVABCA();
                bpjsSteps.klikInquireBCA();
                bpjsSteps.klikPayBCA();
                break;
            case "Mandiri":
                bpjsSteps.klikMandiri();
                bpjsSteps.klikBayar();
                bpjsSteps.copyNomorVA();
                bpjsSteps.openSandBoxMandiri();
                bpjsSteps.fieldBillerCode();
                bpjsSteps.fieldBillKey();
                bpjsSteps.klikInquireMandiri();
                bpjsSteps.klikPayMandiri();
                break;
            case "Permata":
                bpjsSteps.klikPermata();
                bpjsSteps.klikBayar();
                bpjsSteps.copyNomorVA();
                bpjsSteps.openSandBoxPermata();
                bpjsSteps.fieldNomorVABCA();
                bpjsSteps.klikInquirePermata();
                bpjsSteps.klikPayPermata();
                break;
            case "Sepulsa Kredit":
                bpjsSteps.klikBayar();
                break;
            case "Credit Card":
                bpjsSteps.klikCC();
                bpjsSteps.ccCVV("123");
                bpjsSteps.klikBayar();
                break;
            case "BCA Failed":
                bpjsSteps.klikBCA();
                bpjsSteps.klikBayar();
                break;
            case "Mandiri Failed":
                bpjsSteps.klikMandiri();
                bpjsSteps.klikBayar();
                break;
            case "Permata Failed":
                bpjsSteps.klikPermata();
                bpjsSteps.klikBayar();
                break;
        }

    }

    @Then("user berada di halaman pengguna $email")
    public void thenUserBeradaDiHalamanPenggunaemail(String email) {
        bpjsSteps.validasiAnon(email);
    }

    @Then("transaksi berhasil dibayar $Bank $validasi")
    public void thenTransaksiBerhasilDibayar(String Bank, String validasi) {
        switch (Bank){
            case "BCA":
                bpjsSteps.validasiPembayaranBCAPermata(validasi);
                break;
            case "Permata":
                bpjsSteps.validasiPembayaranBCAPermata(validasi);
                break;
            case "Mandiri":
                bpjsSteps.validasiPembayaranMandiri(validasi);
                break;
            case "Credit Card":
                bpjsSteps.validasiPembayaranSepulsa(validasi);
                break;
        }
    }

    @Then("Pesan error muncul $error")
    public void thenPesanErrorMunculError(String error) {
        switch(error) {
            case "Email harus diisi dalam format yang benar":
                bpjsSteps.validasiEmailPembayaran(error);
                break;
            case "Nomor tidak terdaftar dalam database billing.":
                bpjsSteps.validasiError(error);
                break;
            case "Tagihan sudah terbayar/ belum tersedia untuk bulan ini.":
                bpjsSteps.validasiError(error);
                break;
        }
    }

    @Then("Pesan tidak dibayar dalam waktu yang ditentukan")
    public void thenPesanTidakDibayarDalamWaktuYangDitentukan(){

    }

    @Then("Transaksi dibatalkan")
    public void thenTransaksiDibatalkan(){

    }
}
