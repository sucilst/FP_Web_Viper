package SignUp;

import Steps.SignUp.SignUpSteps;
import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;

public class SignUp extends SerenityStory {
    @Steps
    SignUpSteps signUpSteps;

    @Given("pengguna berada di halaman beranda")
    public void givenPenggunaBeradaDiHalamanBeranda() {
        signUpSteps.openSepulsaPage();
    }

    @When("klik Sign Up")
    public void whenKlikSignUp() {
        signUpSteps.klikSignUp();
    }

    @When("masukkan $nama_lengkap yang benar")
    public void whenMasukkannamaLengkapYangBenar(String nama_lengkap) {
        signUpSteps.namaLengkap(nama_lengkap);
    }

    @When("masukkan $nama_lengkap yang salah")
    public void whenMasukkannamaLengkapYangSalah(String nama_lengkap) {
        signUpSteps.namaLengkap(nama_lengkap);
    }

    @When("email $email yang benar")
    public void whenMasukkanemailYangBenar(String email) {
        signUpSteps.email(email);
    }

    @When("email $email yang salah")
    public void whenMasukkanemailYangSalah(String email) {
       signUpSteps.email(email);
    }

    @When("No HP $No_HP yang benar")
    public void whenMasukkanNoHPYangBenar(String No_HP) {
        signUpSteps.noHP(No_HP);
    }

    @When("No HP $No_HP yang salah")
    public void whenMasukkanNoHPYangSalah(String No_HP) {
        signUpSteps.noHP(No_HP);
    }

    @When("Password $password yang benar")
    public void whenMasukkanpasswordYangBenar(String password) {
        signUpSteps.password(password);
    }

    @When("Password $password yang salah")
    public void whenMasukkanpasswordYangSalah(String password) {
        signUpSteps.password(password);
    }

    @When("$pilihan klik kolom syarat, ketentuan, dan kebijakan privasi")
    public void whenpilihanKlikKolomSyaratKetentuanDanKebijakanPrivasi(String pilihan) {
        signUpSteps.klikCheckbox(pilihan);
    }

    @When("klik tombol daftar")
    public void whenKlikTombolDaftar() {
        signUpSteps.klikDaftar();
    }

    @When("memasukkan OTP")
    public void whenMemasukkanOTP() {
        signUpSteps.otpCode();
    }

    @When("klik konfirmasi No HP")
    public void whenKlikKonfirmasiNoHP() {
        signUpSteps.klikKonfirmasi();
    }

    @Then("berada di halaman dashboard $nama_lengkap")
    public void thenBeradaDiHalamanDashboard(String nama_lengkap) {
        signUpSteps.validasiSignUp(nama_lengkap);
    }

    @Then("pesan error tertampil <error>")
    public void thenPesanErrorTertampilerror(String error) {
        switch(error) {
            case "Nama minimal 3 karakter":
                signUpSteps.validasiError(error);
                break;
            case "No handphone harus angka minimal 8 karakter":
                signUpSteps.validasiError(error);
                break;
            case "Nomor HP tidak valid.":
                signUpSteps.validasiError(error);
                break;
            case "Alamat email harus valid":
                signUpSteps.validasiError(error);
                break;
            case "Password minimal 6 karakter":
                signUpSteps.validasiError(error);
                break;
            case "Harap menyetujui syarat dan ketentuan":
                signUpSteps.validasiError(error);
                break;
            case "Email sudah terdaftar. Silahkan login.":
                signUpSteps.validasiError(error);
                break;
            case "Nomor handphone sudah terdaftar. Silahkan masukkan nomor handphone lain.":
                signUpSteps.validasiError(error);
                break;
            case "This email is already registered, please use another email.":
                signUpSteps.validasiError(error);
                break;
        }
    }
}
