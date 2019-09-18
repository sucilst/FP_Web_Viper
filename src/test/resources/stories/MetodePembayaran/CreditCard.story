Meta:

Narrative:
As a pengguna
I want membayar tagihan pembelian produk
So that saya bisa mendapatkan produk tersebut

Scenario: Metode Pemabayaran dengan Credit Card (Credit Card tidak ingin disimpan)
Given user berada di halaman beranda
When user sudah sign in ke akun yang dimiliki <email> <password>
And user memasukan <No_HP> ke field No. Handphone
And memilih denom <pulsa> yang diinginkan
And Klik metode Pembayaran Credit Card
And Mengisi field nomor kartu <nomor_kartu> yang benar
And Mengisi Tanggal Kadaluarsa <bulan> <tahun> yang benar
And Mengisi CVV cvv yang benar
And Klik Bayar pada metode pembayaran CC
And Masukkan Password
Then Transaksi Berhasil dilakukan dan terbayar
Examples:
|nomor_kartu|bulan|tahun|email|password|No_HP|pulsa|
|4811111111111114|01|2020|opi@sepulsa.com|123456qwerty|081234000001|50000|

Scenario: Metode Pemabayaran dengan Credit Card (Credit Card ingin disimpan)
Given user berada di halaman beranda
When user sudah sign in ke akun yang dimiliki <email> <password>
And user memasukan <No_HP> ke field No. Handphone
And memilih denom <pulsa> yang diinginkan
And Klik metode Pembayaran Credit Card
And Mengisi field nomor kartu <nomor_kartu> yang benar
And Mengisi Tanggal Kadaluarsa <bulan> <tahun> yang benar
And Mengisi CVV cvv yang benar
And Klik kolom Simpan informasi kartu kredit
And Klik Bayar pada metode pembayaran CC
And Masukkan Password
Then Transaksi Berhasil dilakukan dan terbayar
Examples:
|nomor_kartu|bulan|tahun|email|password|No_HP|pulsa|
|4811111111111114|01|2020|opi@sepulsa.com|123456qwerty|081234000001|50000|

Scenario: Metode Pemabayaran dengan Credit Card (Nomor Kartu Kosong dan Salah)
Given user berada di halaman beranda
When user sudah sign in ke akun yang dimiliki <email> <password>
And user memasukan <No_HP> ke field No. Handphone
And memilih denom <pulsa> yang diinginkan
When Klik metode Pembayaran Credit Card
And Mengisi field nomor kartu <nomor_kartu> salah
And Mengisi Tanggal Kadaluarsa <bulan> <tahun> yang benar
And Mengisi CVV cvv yang benar
And Klik kolom Simpan informasi kartu kredit
And Klik Bayar pada metode pembayaran CC
Then Pesan Error Tertampil <error>
Examples:
|error|nomor_kartu|bulan|tahun|email|password|No_HP|pulsa|
|Failed or No Authentication|481111111111111|01|2020|opi@sepulsa.com|123456qwerty|081234000001|50000|
|Pastikan semua field sudah lengkap||01|2020|opi@sepulsa.com|123456qwerty|081234000001|100000|

Scenario: Metode Pemabayaran dengan Credit Card (Bulan Kosong)
Given user berada di halaman beranda
When user sudah sign in ke akun yang dimiliki <email> <password>
And user memasukan <No_HP> ke field No. Handphone
And memilih denom <pulsa> yang diinginkan
When Klik metode Pembayaran Credit Card
And Mengisi field nomor kartu <nomor_kartu> yang benar
And Mengisi Tanggal Kadaluarsa <bulan> <tahun> yang salah
And Mengisi CVV cvv yang benar
And Klik kolom Simpan informasi kartu kredit
And Klik Bayar pada metode pembayaran CC
Then Pesan Error Tertampil <error>
Examples:
|error|nomor_kartu|bulan|tahun|email|password|No_HP|pulsa|
|Pastikan semua field sudah lengkap|4811111111111114||2020|opi@sepulsa.com|123456qwerty|081234000001|50000|

Scenario: Metode Pemabayaran dengan Credit Card (Tahun Kosong)
Given user berada di halaman beranda
When user sudah sign in ke akun yang dimiliki <email> <password>
And user memasukan <No_HP> ke field No. Handphone
And memilih denom <pulsa> yang diinginkan
When Klik metode Pembayaran Credit Card
And Mengisi field nomor kartu <nomor_kartu> yang benar
And Mengisi Tanggal Kadaluarsa <bulan> <tahun> yang salah
And Mengisi CVV cvv yang benar
And Klik kolom Simpan informasi kartu kredit
And Klik Bayar pada metode pembayaran CC
Then Pesan Error Tertampil <error>
Examples:
|error|nomor_kartu|bulan|tahun|email|password|No_HP|pulsa|
|Pastikan semua field sudah lengkap|4811111111111114|01|Tahun|opi@sepulsa.com|123456qwerty|081234000001|100000|

Scenario: Metode Pemabayaran dengan Credit Card (CVV Kosong)
Given user berada di halaman beranda
When user sudah sign in ke akun yang dimiliki <email> <password>
And user memasukan <No_HP> ke field No. Handphone
And memilih denom <pulsa> yang diinginkan
When Klik metode Pembayaran Credit Card
And Mengisi field nomor kartu <nomor_kartu> yang benar
And Mengisi Tanggal Kadaluarsa <bulan> <tahun> yang benar
And Mengisi CVV cvv yang salah
And Klik kolom Simpan informasi kartu kredit
And Klik Bayar pada metode pembayaran CC
Then Pesan Error Tertampil <error>
Examples:
|error|nomor_kartu|bulan|tahun|email|password|No_HP|pulsa|
|Pastikan semua field sudah lengkap|4811111111111114|01|2020|opi@sepulsa.com|123456qwerty|081234000001|100000|

!-- Scenario: Metode Pemabayaran dengan Credit Card (Credit Card telah Tersimpan)
!-- Given Pengguna berada di halaman pembayaran
!-- When Klik metode Pembayaran Credit Card
!-- And Pilih Credit Card yang sudah tersimpan
!-- And Klik Bayar pada metode pembayaran CC
!-- Then Transaksi Berhasil dilakukan dan terbayar

