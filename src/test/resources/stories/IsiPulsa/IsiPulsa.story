Meta:

Narative:
As a user
I want membeli pulsa dengan sign in
So that saya memiliki pulsa

Scenario: Sukses membeli pulsa yang diinginkan (Sepulsa Kredit, Sign di halaman pembayaran)
Given user berada di halaman beranda
When user memasukan <No_HP> ke field No. Handphone
And memilih denom <pulsa> yang diinginkan
And melakukan sign in <email> <password>
And memilih metode pembayaran <Bank>
Then transaksi berhasil <Bank> <validasi>
Examples:
|email|password|No_HP|Bank|pulsa|validasi|
|retnowijiastutik@gmail.com|retno123|081234000001|Sepulsa Kredit|200000|Retno Wiji Astutik|

Scenario: Sukses membeli pulsa yang diinginkan (Sepulsa Kredit, Sign In di Awal)
Given user berada di halaman beranda
When user sudah sign in ke akun yang dimiliki <email> <password>
And user memasukan <No_HP> ke field No. Handphone
And memilih denom <pulsa> yang diinginkan
And memilih metode pembayaran <Bank>
Then transaksi berhasil <Bank> <validasi>
Examples:
|email|password|No_HP|Bank|pulsa|validasi|
|retnowijiastutik@gmail.com|retno123|081234000001|Sepulsa Kredit|200000|Retno Wiji Astutik|
|retnowijiastutik@gmail.com|retno123|081234000001|Sepulsa Kredit|100000|Retno Wiji Astutik|

Scenario: Sukses membeli pulsa yang diinginkan (Sign in awal)
Given user berada di halaman beranda
When user sudah sign in ke akun yang dimiliki <email> <password>
And user memasukan <No_HP> ke field No. Handphone
And memilih denom <pulsa> yang diinginkan
And memilih metode pembayaran <Bank>
Then transaksi berhasil <Bank> <validasi>
Examples:
|email|password|No_HP|Bank|pulsa|validasi|
|retnowijiastutik@gmail.com|retno123|081234000001|Credit Card|50000|Retno Wiji Astutik|
|retnowijiastutik@gmail.com|retno123|081234000001|Mandiri|500000|Success Transaction|
|retnowijiastutik@gmail.com|retno123|081234000001|Permata|1000000|Transaksi Sukses|

Scenario: Sukses membeli pulsa yang diinginkan (Anonim)
Given user berada di halaman beranda
When user memasukan <No_HP> ke field No. Handphone
And memilih denom <pulsa> yang diinginkan
And Email <email> yang diinginkan
And Klik lanjutkan
And memilih metode pembayaran <Bank>
Then transaksi berhasil <Bank> <validasi>
Examples:
|email|No_HP|Bank|pulsa|validasi|
|retnowijiastutik@gmail.com|081234000001|Mandiri|50000|Success Transaction|
|retnowijiastutik@gmail.com|081234000001|BCA|300000|Payment Success|

Scenario: Sukses membeli pulsa yang diinginkan (Sign di halaman pembayaran)
Given user berada di halaman beranda
When user memasukan <No_HP> ke field No. Handphone
And memilih denom <pulsa> yang diinginkan
And melakukan sign in <email> <password>
And memilih metode pembayaran <Bank>
Then transaksi berhasil <Bank> <validasi>
Examples:
|email|password|No_HP|Bank|pulsa|validasi|
|retnowijiastutik@gmail.com|retno123|081234000001|BCA|500000|Payment Success|
|retnowijiastutik@gmail.com|retno123|081234000001|Permata|1000000|Transaksi Sukses|

Scenario: Gagal membeli pulsa yang diinginkan (No. HP kurang dari 8 digit)
Given user berada di halaman beranda
When user memasukan <No_HP> ke field No. Handphone
And memilih denom <pulsa> yang diinginkan
Then Pesan Error muncul <error>
Examples:
|No_HP|pulsa|error|
|0812|50000|Panjang nomor hp kurang dari 8 digit|

Scenario: Gagal membeli pulsa yang diinginkan (tidak dibayarkan dalam waktu yang ditentukan)
Given user berada di halaman beranda
When user sudah sign in ke akun yang dimiliki <email> <password>
And user memasukan <No_HP> ke field No. Handphone
And memilih denom <pulsa> yang diinginkan
And memilih metode pembayaran <Bank>
Then Pesan tidak dibayar dalam waktu yang ditentukan
And Transaksi dibatalkan
Examples:
|email|password|No_HP|Bank|pulsa|
|retnowijiastutik@gmail.com|retno123|081234000001|BCA Failed|50000|
|retnowijiastutik@gmail.com|retno123|081234000001|Mandiri Failed|500000|
|retnowijiastutik@gmail.com|retno123|081234000001|Permata Failed|1000000|