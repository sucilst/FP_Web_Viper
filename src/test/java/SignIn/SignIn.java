package SignIn;

import Steps.SignIn.SignInSteps;
import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;

public class SignIn extends SerenityStory {
    @Steps
    SignInSteps signInSteps;

    @Given("pengguna berada di halaman beranda")
    public void givenPenggunaBeradaDiHalamanBeranda() {
        signInSteps.openSepulsaPage();
    }

    @When("klik Sign In")
    public void whenKlikSignIn() {
        signInSteps.klikSignIn();
    }

    @When("Email $email yang benar")
    public void whenMasukkanemailYangBenar(String email) {
        signInSteps.email(email);
    }

    @When("Email $email yang salah")
    public void whenMasukkanemailYangSalah(String email) {
        signInSteps.email(email);
    }

    @When("Email $email2 yang kosong")
    public void whenMasukkanemailYangKosong(String email2) {
        signInSteps.email(email2);
    }

    @When("No Handphone $No_HP yang benar")
    public void whenNoHandphoneNo_HPYangBenar(String No_HP) {
        signInSteps.email(No_HP);
    }

    @When("No Handphone $No_HP yang salah")
    public void whenNoHandphoneNo_HPYangSalah(String No_HP) {
        signInSteps.email(No_HP);
    }

    @When("Password $password yang benar")
    public void whenPasswordpasswordYangBenar(String password) {
        signInSteps.password(password);
    }

    @When("Password $password yang salah")
    public void whenPasswordpasswordYangSalah(String password) {
        signInSteps.password(password);
    }

    @When("Password $password2 yang kosong")
    public void whenPasswordpasswordYangKosong(String password2) {
        signInSteps.password(password2);
    }

    @When("klik tombol masuk")
    public void whenKlikTombolMasuk() {
        signInSteps.klikMasuk();
    }

    @When("klik kembali tombol masuk")
    public void whenKlikKembaliTombolMasuk() {
        signInSteps.klikMasuk2();
    }

    @When("klik akun")
    public void whenKlikAkun() {
        signInSteps.klikAkun();
    }

    @When("klik tombol sign out")
    public void whenKlikTombolSignOut() {
        signInSteps.klikSignOut();
    }

    @Then("diarahkan ke halaman dashboard $nama_lengkap")
    public void thenBeradaDiHalamanDashboardnamaLengkap(String nama_lengkap) {
        signInSteps.validasiSignIn(nama_lengkap);
    }

    @Then("pesan error ditampilkan $error")
    public void thenPesanErrorDitampilkanerror(String error) {
        switch(error) {
            case "Email atau password salah.":
                signInSteps.error(error);
                break;
            case "Alamat email harus valid":
                signInSteps.error(error);
                break;
        }
    }
}
