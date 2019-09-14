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

    @When("Masukkan No. HP $No_HP yang benar")
    public void whenMasukkanNoHPNo_HPYangBenar(String No_HP) {
        plnPostpaidSteps.nomorHP(No_HP);
    }

    @When("klik lanjut ke pembayaran")
    public void whenKlikLanjutKePembayaran() {
        plnPostpaidSteps.klikLanjut();
    }

    @When("memasukkan alamat $email yang benar")
    public void whenMemasukkanAlamatEmailYangBenar(String email) {
        plnPostpaidSteps.emailPembayaran(email);
    }

    @When("Klik Lanjutkan")
    public void whenKlikLanjutkan() {
        plnPostpaidSteps.klikLanjutkan();
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
            case "":
                plnPostpaidSteps.validasiNomorID();
                break;
        }
    }

}
