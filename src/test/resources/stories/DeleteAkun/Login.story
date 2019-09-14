Meta:

Narrative:
As seorang pengguna
I want menghapus akun sepulsa
So that saya bisa melakukan sign up dengan akun yang sama

Scenario: Sign In Berhasil
Given pengguna membuka website backend sepulsa
When klik SignIn
And masukkan email
And masukkan password
And klik masuk
Then pengguna diarahkan ke halaman dashboard