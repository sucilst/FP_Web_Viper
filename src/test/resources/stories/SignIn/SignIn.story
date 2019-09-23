Meta:
@login

Narrative:
As seorang pengguna
I want masuk ke website Sepulsa
So that saya memiliki history transaksi

Scenario: Sign In Berhasil (Email)
Given pengguna berada di halaman beranda
When klik Sign In
And Email <email> yang benar
And Password <password> yang benar
And klik tombol masuk
Then diarahkan ke halaman dashboard <nama_lengkap>
Examples:
|email|password|nama_lengkap|
|retnowijiastutik@gmail.com|retno123|Retno Wiji Astutik|
|opi@sepulsa.com|123456qwerty|Opi39|

Scenario: Sign In Berhasil (No. HP)
Given pengguna berada di halaman beranda
When klik Sign In
And No Handphone <No_HP> yang benar
And Password <password> yang benar
And klik tombol masuk
Then diarahkan ke halaman dashboard <nama_lengkap>
Examples:
|No_HP|password|nama_lengkap|
|082113013109|retno123|Retno Wiji Astutik|
|08123345677|123456qwerty|Opi39|

Scenario: Sign In Gagal (Sign Out kemudian Sign In lagi dengan password kosong)
Given pengguna berada di halaman beranda
When klik Sign In
And Email <email> yang benar
And Password <password> yang benar
And klik tombol masuk
And klik akun
And klik tombol sign out
And klik Sign In
And Email <email> yang benar
And Password <password2> yang kosong
And klik kembali tombol masuk
Then pesan error ditampilkan <error>
Examples:
|email|password|nama_lengkap|password2|error|
|retnowijiastutik@gmail.com|retno123|Retno Wiji Astutik||Email atau password salah.|
|opi@sepulsa.com|123456qwerty|Opi39||Email atau password salah.|

Scenario: Sign In Gagal (Sign Out kemudian Sign In lagi dengan email kosong)
Given pengguna berada di halaman beranda
When klik Sign In
And Email <email> yang benar
And Password <password> yang benar
And klik tombol masuk
And klik akun
And klik tombol sign out
And klik Sign In
And Email <email2> yang kosong
And Password <password> yang benar
And klik kembali tombol masuk
Then pesan error ditampilkan <error>
Examples:
|email|password|nama_lengkap|email2|error|
|retnowijiastutik@gmail.com|retno123|Retno Wiji Astutik||Email atau password salah.|
|opi@sepulsa.com|123456qwerty|Opi39||Email atau password salah.|

Scenario: Sign In Gagal (Email Kosong dan Salah)
Given pengguna berada di halaman beranda
When klik Sign In
And Email <email> yang salah
And Password <password> yang benar
And klik tombol masuk
Then pesan error ditampilkan <error>
Examples:
|email|password|error|
|pds@gmail.com|greenday89|Email atau password salah.|
|farras@alterraid|greenday89|Alamat email harus valid|
||greenday89|Alamat email harus valid|
|far,ras@alterra.id|greenday89|Alamat email harus valid|

Scenario: Sign In Gagal (No. HP Kosong dan Salah)
Given pengguna berada di halaman beranda
When klik Sign In
And No Handphone <No_HP> yang salah
And Password <password> yang benar
And klik tombol masuk
Then pesan error ditampilkan <error>
Examples:
|No_HP|password|error|
|0812|alterra1997|Alamat email harus valid|
|081259104836876789|greenday89|Email atau password salah.|
||greenday89|Alamat email harus valid|
|0812,59104836|greenday89|Alamat email harus valid|

Scenario: Sign In Gagal (Password Kosong dan Salah)
Given pengguna berada di halaman beranda
When klik Sign In
And Email <email> yang benar
And Password <password> yang salah
And klik tombol masuk
Then pesan error ditampilkan <error>
Examples:
|email|password|error|
|rakaditya@alterra.id|alterra199|Email atau password salah.|
|farras@alterra.id||Password minimal 6 karakter|