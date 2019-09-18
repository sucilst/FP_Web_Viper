Meta:

Narrative:
As a pengguna
I want membayar tagihan pembelian produk
So that saya bisa mendapatkan produk tersebut

Scenario: Metode Pembayaran Sepulsa Kredit (Saldo Cukup)
Given Pengguna berada di halaman pembayaran
When Klik metode Pembayaran Sepulsa Kredit
And Klik Bayar pada metode pembayaran Sepulsa Kredit
Then Transaksi Berhasil dilakukan dan terbayar

Scenario: Metode Pembayaran Sepulsa Kredit (Saldo Tidak Cukup/Split Pembayaran)
Given Pengguna berada di halaman pembayaran
When Klik metode Pembayaran Lainnya
And Klik Bayar pada metode pembayaran Lainnya
Then Transaksi Berhasil dilakukan dan terbayar
