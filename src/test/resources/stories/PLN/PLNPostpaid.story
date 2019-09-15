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
And Pengguna melakukan pembayaran melalui <Bank>
Then pengguna berhasil melakukan transaksi
Examples:
|nomor|No_HP|Bank|
|512345610000|081242504777|BCA|
|512345600003|081242504777|Permata|

Scenario: Pembelian PLN Pascabayar Gagal (Nomor ID Pelanggan sudah dibayar, Kosong dan Salah)
Given pengguna berada di halaman utama
When klik menu Listrik PLN
And klik Pascabayar
And Masukkan nomor ID pelanggan <nomor> yang salah
And Masukkan No. HP <No_HP> yang benar
Then pesan error tertampil <errors>
Examples:
|nomor|No_HP|errors|
|512345600000|081242504777|General Error.|
|5123456100|081242504777||
||081242504777||

Scenario: Pembelian PLN Pascabayar Gagal (No. HP Kosong dan Salah)
Given pengguna berada di halaman utama
When klik menu Listrik PLN
And klik Pascabayar
And Masukkan nomor ID pelanggan <nomor> yang benar
And Masukkan No. HP <No_HP> yang salah
And klik lanjut ke pembayaran
Then pesan error tertampil <errors>
Examples:
|nomor|No_HP|errors|
|512345610000|08227652089209789786876767896|No Telepon tidak valid.|
|512345600003|08227|nomor hp harus dalam format yang benar|
|512345600003||nomor hp harus dalam format yang benar|

Scenario: Pembelian PLN Pascabayar Berhasil (Sign In)
Given pengguna berada di halaman utama
When pengguna melakukan Sign In <email> <password>
And klik menu Listrik PLN
And klik Pascabayar
And Masukkan nomor ID pelanggan <nomor> yang benar
And Masukkan No. HP <No_HP> yang benar
And Pengguna melakukan pembayaran melalui <Bank>
Then pengguna berhasil melakukan transaksi
Examples:
|email|password|nomor|No_HP|nama_lengkap|
|retnowijiastutik@gmail.com|retno123|512345610000|081242504777|Retno Wiji Astutik|
|opi@sepulsa.com|123456qwerty|512345600003|081242504777|Opi39|

Scenario: Pembelian PLN Pascabayar Berhasil
Given pengguna berada di halaman utama
When klik menu Listrik PLN
And klik Pascabayar
And Masukkan nomor ID pelanggan <nomor> yang benar
And Masukkan No. HP <No_HP> yang benar
And klik lanjut ke pembayaran
And memasukkan alamat <email> yang salah
And Klik Lanjutkan
Then pesan error tertampil <errors>
Examples:
|nomor|No_HP|email|errors|
|512345610000|081242504777|retnowijiastutik@gmailcom|Email harus diisi dalam format yang benar|
|512345600003|081242504777|o'pi@sepulsa.com|Email harus diisi dalam format yang benar|
