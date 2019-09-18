Meta:

Narrative:
As a pengguna
I want membayar tagihan pembelian produk
So that saya bisa mendapatkan produk tersebut

Scenario: Metode Pembayaran BCA VA
Given pengguna berada di halaman pembayaran
And Klik metode pembayaran BCA
And Klik tombol bayar
And Klik simpan nomor VA
And membayar melalui bank BCA
Then tagihan produk terbayar

Scenario: Metode Pembayaran Mandiri VA
Given pengguna berada di halaman pembayaran
And Klik metode pembayaran Mandiri
And Klik tombol bayar
And Klik simpan nomor VA
And membayar melalui bank Mandiri
Then tagihan produk terbayar

Scenario: Metode Pembayaran Permata VA
Given pengguna berada di halaman pembayaran
And Klik metode pembayaran Mandiri
And Klik tombol bayar
And Klik simpan nomor VA
And membayar melalui bank Permata
Then tagihan produk terbayar

