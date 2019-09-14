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

    @When("klik lanjutkan")
    public void whenKlikLanjutkan() {
        plnPrepaidSteps.klikLanjutkan();
    }

    @When("klik Sign In")
    public void whenKlikSignIn() {
        plnPrepaidSteps.klikSignIn();
    }

    @When("Email $email yang benar")
    public void whenEmailemailYangBenar(String email) {
        plnPrepaidSteps.email(email);
    }

    @When("Password $password yang benar")
    public void whenPasswordpasswordYangBenar(String password) {
        plnPrepaidSteps.password(password);
    }

    @When("klik tombol masuk")
    public void whenKlikTombolMasuk() {
        plnPrepaidSteps.klikMasuk();
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
