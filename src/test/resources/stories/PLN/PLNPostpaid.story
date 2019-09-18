Meta:

Narrative:
As seorang pengguna
I want membayar PLN pascabayar
So that tagihan saya terbayarkan atau lunas

Scenario: Pembelian PLN Pascabayar Berhasil (Sign In)
Given pengguna berada di halaman utama
When pengguna melakukan Sign In <email> <password>
And klik menu Listrik PLN
And klik Pascabayar
And Masukkan nomor ID pelanggan <nomor> yang benar
And Masukkan No. HP <No_HP> yang benar
And klik lanjut ke pembayaran
And Pengguna melakukan pembayaran melalui <Bank>
Then pengguna berhasil melakukan transaksi <Bank> <validasi>
Examples:
|email|password|nomor|No_HP|Bank|validasi|
|opi@sepulsa.com|123456qwerty|512345600003|081242504777|Credit Card|Opi39|
|retnowijiastutik@gmail.com|retno123|512345610000|081242504777|BCA|Payment Success|

Scenario: Pembelian PLN Pascabayar Berhasil (Sepulsa Kredit, Sign In di Awal)
Given pengguna berada di halaman utama
When pengguna melakukan Sign In <email> <password>
And klik menu Listrik PLN
And klik Pascabayar
And Masukkan nomor ID pelanggan <nomor> yang benar
And Masukkan No. HP <No_HP> yang benar
And klik lanjut ke pembayaran
And Pengguna melakukan pembayaran melalui <Bank>
Then pengguna berhasil melakukan transaksi <Bank> <validasi>
Examples:
|email|password|nomor|No_HP|Bank|validasi|
|retnowijiastutik@gmail.com|retno123|512345610000|081242504777|Sepulsa Kredit|Retno Wiji Astutik|

Scenario: Pembelian PLN Pascabayar Berhasil (Sepulsa Kredit, Sign In di halaman pembayaran)
Given pengguna berada di halaman utama
When klik menu Listrik PLN
And klik Pascabayar
And Masukkan nomor ID pelanggan <nomor> yang benar
And Masukkan No. HP <No_HP> yang benar
And klik lanjut ke pembayaran
And Sign In <email> <password>
And Pengguna melakukan pembayaran melalui <Bank>
Then pengguna berhasil melakukan transaksi <Bank> <validasi>
Examples:
|email|password|nomor|No_HP|Bank|validasi|
|retnowijiastutik@gmail.com|retno123|512345600003|081242504777|Sepulsa Kredit|Retno Wiji Astutik|

Scenario: Pembelian PLN Pascabayar Berhasil (Sign In di halaman pembayaran)
Given pengguna berada di halaman utama
When klik menu Listrik PLN
And klik Pascabayar
And Masukkan nomor ID pelanggan <nomor> yang benar
And Masukkan No. HP <No_HP> yang benar
And klik lanjut ke pembayaran
And Sign In <email> <password>
And Pengguna melakukan pembayaran melalui <Bank>
Then pengguna berhasil melakukan transaksi <Bank> <validasi>
Examples:
|email|password|nomor|No_HP|Bank|validasi|
|retnowijiastutik@gmail.com|retno123|512345610000|081242504777|Mandiri|Success Transaction|

Scenario: Pembelian PLN Pascabayar Berhasil (Anonim)
Given pengguna berada di halaman utama
When klik menu Listrik PLN
And klik Pascabayar
And Masukkan nomor ID pelanggan <nomor> yang benar
And Masukkan No. HP <No_HP> yang benar
And klik lanjut ke pembayaran
And memasukkan alamat <email> yang benar
And Klik Lanjutkan
And Pengguna melakukan pembayaran melalui <Bank>
Then pengguna berhasil melakukan transaksi <Bank> <validasi>
Examples:
|nomor|No_HP|Bank|email|validasi|
|512345610000|081242504777|Permata|retnowijiastutik@gmail.com|Transaksi Sukses|

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

Scenario: Pembelian PLN Pascabayar Gagal (Email Kosong dan Salah)
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
|512345610000|081242504777||Email harus diisi dalam format yang benar|

Scenario: Pembelian PLN Pascabayar Gagal (tidak dibayarkan dalam waktu yang ditentukan)
Given pengguna berada di halaman utama
When klik menu Listrik PLN
And klik Pascabayar
And Masukkan nomor ID pelanggan <nomor> yang benar
And Masukkan No. HP <No_HP> yang benar
And klik lanjut ke pembayaran
And memasukkan alamat <email> yang benar
And Klik Lanjutkan
And Pengguna melakukan pembayaran melalui <Bank>
Then Pesan tidak dibayar dalam waktu yang ditentukan
And Transaksi dibatalkan
Examples:
|nomor|No_HP|Bank|email|validasi|
|512345610000|081242504777|Permata Failed|retnowijiastutik@gmail.com|
