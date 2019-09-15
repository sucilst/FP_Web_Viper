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

    @Then("user berada di halaman pengguna $email")
    public void thenUserBeradaDiHalamanPenggunaemail(String email) {
        bpjsSteps.validasiAnon(email);
    }

    @Then("Pesan error muncul $error")
    public void thenPesanErrorMunculError(String errors) {
        switch(errors) {
            case "Email harus diisi dalam format yang benar":
                bpjsSteps.validasiEmailPembayaran(errors);
                break;
        }
    }
}
