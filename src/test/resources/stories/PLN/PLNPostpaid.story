Meta:

Narrative:
As seorang pengguna
I want membayar PLN pascabayar
So that tagihan saya terbayarkan atau lunas

Scenario: Pembelian PLN Pascabayar Berhasil
Given pengguna berada di halaman utama
When klik menu Listrik PLN
And klik Pascabayar
And Masukkan nomor ID pelanggan <nomor> yang benar
And Masukkan No. HP <No_HP> yang benar
And klik lanjut ke pembayaran
And memasukkan alamat <email> yang benar
And Klik Lanjutkan
Then pengguna berada di halaman pembayaran <email>
Examples:
|nomor|No_HP|email|
|512345610000|081242504777|retnowijiastutik@gmail.com|
|512345600003|081242504777|opi@sepulsa.com|

Scenario: Pembelian PLN Pascabayar Gagal (Nomor ID Pelanggan Kosong dan Salah)
Given pengguna berada di halaman utama
When klik menu Listrik PLN
And klik Pascabayar
And Masukkan nomor ID pelanggan <nomor> yang benar
And Masukkan No. HP <No_HP> yang benar
Then pesan error tertampil <errors>
Examples:
|nomor|No_HP|errors|
|512345600000|081242504777|General Error.|
|5123456100|081242504777||
||081242504777||
