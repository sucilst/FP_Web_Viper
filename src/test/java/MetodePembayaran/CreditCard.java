package MetodePembayaran;

import Steps.IsiPulsa.IsiPulsaSteps;
import Steps.MetodePembayaran.CreditCardSteps;
import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;

public class CreditCard extends SerenityStory {
    @Steps
    CreditCardSteps creditCardSteps;
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

    @When("Klik metode Pembayaran Credit Card")
    public void whenKlikMetodePembayaranCreditCard() {
        creditCardSteps.klikCC();
    }

    @When("Mengisi field nomor kartu $nomor_kartu yang benar")
    public void whenMengisiFieldNomorKartunomor_kartuYangBenar(String nomor_kartu) {
        creditCardSteps.ccNumber(nomor_kartu);
    }

    @When("Mengisi Tanggal Kadaluarsa $bulan $tahun yang benar")
    public void whenMengisiTanggalKadaluarsabulantahunYangBenar(String bulan, String tahun) {
        creditCardSteps.ccDate(bulan,tahun);
    }

    @When("Mengisi CVV cvv yang benar")
    public void whenMengisiCVVcvvYangBenar() {
        creditCardSteps.ccCVV("123");
    }

    @When("Klik Bayar pada metode pembayaran CC")
    public void whenKlikBayarPadaMetodePembayaranCC() {
        creditCardSteps.klikBayar();
    }

    @When("Masukkan Password")
    public void whenMasukkanPassword() {
        creditCardSteps.ccPassword();
    }

    @When("Klik kolom Simpan informasi kartu kredit")
    public void whenKlikKolomSimpanInformasiKartuKredit() {
        creditCardSteps.ccSave();
    }


    @When("Pilih Credit Card yang sudah tersimpan")
    public void whenPilihCreditCardYangSudahTersimpan() {

    }

    @When("Mengisi field nomor kartu $nomor_kartu salah")
    public void whenMengisiFieldNomorKartunomor_kartuSalah(String nomor_kartu) {
        creditCardSteps.ccNumber(nomor_kartu);
    }

    @When("Mengisi Tanggal Kadaluarsa $bulan $tahun yang salah")
    public void whenMengisiTanggalKadaluarsabulantahunYangSalah(String bulan, String tahun) {
        creditCardSteps.ccDate(bulan,tahun);
    }

    @When("Mengisi CVV cvv yang salah")
    public void whenMengisiCVVcvvYangSalah() {
        creditCardSteps.ccCVV("");
    }

    @Then("Transaksi Berhasil dilakukan dan terbayar")
    public void thenTransaksiBerhasilDilakukanDanTerbayar() {
        isiPulsaSteps.validasiPembayaranSepulsa("Opi39");
    }

    @Then("Pesan Error Tertampil $error")
    public void thenPesanErrorTertampilerror(String error) {
        switch(error) {
            case "Failed or No Authentication":
                creditCardSteps.validasiError(error);
                break;
            case "Pastikan semua field sudah lengkap":
                creditCardSteps.validasiError(error);
                break;
        }
    }
}
