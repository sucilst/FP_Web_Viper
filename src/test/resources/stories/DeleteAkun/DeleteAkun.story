Meta:

Narrative:
As seorang pengguna
I want menghapus akun sepulsa
So that saya bisa melakukan sign up dengan akun yang sama

Scenario: Delete Akun Berhasil
Given pengguna membuka website backend sepulsa
When klik SignIn
And masukkan email
And masukkan password
And klik masuk
And klik people
And klik advanced
And pilih akun
And klik cancel account
And klik cancel akun
Then akun sudah dihapus