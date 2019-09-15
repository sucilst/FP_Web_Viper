Meta:

Narrative:
As seorang pengguna
I want membayar PLN prepaid
So that saya mendapatkan token listrik

Scenario: Pembelian PLN Prabayar Berhasil (Anonim)
Given pengguna berada di halaman awal web
When klik Listrik PLN
And Nomor meter PLN <nomor> yang benar
And No. Handphone <No_HP> yang benar
And memilih nominal <nominal>
And <email> dimasukkan pada kolom email
And klik lanjutkan
And pengguna melakukan pembayaran melalui <Bank>
Then transaksi telah dibayar
Examples:
|nomor|No_HP|nominal|email|Bank|
|01428800700|081242504777|100000|retnowijiastutik@gmail.com|BCA|
|01428800701|081242504777|50000|opi@sepulsa.com|Mandiri|
|01428800700|081242504777|100000|retno-wijiastutik@gmail.com|Permata|

Scenario: Pembelian PLN Prabayar Berhasil (Sign In)
Given pengguna berada di halaman awal web
When Pengguna melakukan Sign In <email> <password>
And klik Listrik PLN
And Nomor meter PLN <nomor> yang benar
And No. Handphone <No_HP> yang benar
And memilih nominal <nominal>
And pengguna melakukan pembayaran melalui <Bank>
Then transaksi telah dibayar
Examples:
|email|password|nomor|No_HP|nominal|Bank|
|retnowijiastutik@gmail.com|retno123|01428800700|081242504777|100000|Permata|
|opi@sepulsa.com|123456qwerty|01428800701|081242504777|50000|BCA|

Scenario: Pembelian PLN Prabayar Gagal (Nomor PLN Salah)
Given pengguna berada di halaman awal web
When klik Listrik PLN
And Nomor meter PLN <nomor> yang salah
And No. Handphone <No_HP> yang benar
And memilih nominal <nominal>
Then pesan error muncul <error>
Examples:
|nomor|No_HP|nominal|error|
|01428800100|081242504777|100000|No Pelanggan/ No Meter tidak valid.|
|0142880070|081242504777|50000|Server PLN Cut-off.|

Scenario: Pembelian PLN Prabayar Gagal (No. HP Kurang dari 8 karakter dan Lebih dari 16 karakter)
Given pengguna berada di halaman awal web
When klik Listrik PLN
And Nomor meter PLN <nomor> yang benar
And No. Handphone <No_HP> yang salah
And memilih nominal <nominal>
Then pesan error muncul <error>
Examples:
|nomor|No_HP|nominal|error|
|01428800700|0812|100000|Panjang nomor hp kurang dari 8 digit|
|01428800701|081298868767656545|50000|No Telepon tidak valid.|

Scenario: Pembelian PLN Prabayar Gagal (Nomor PLN Kosong)
Given pengguna berada di halaman awal web
When klik Listrik PLN
And Nomor meter PLN <nomor> yang salah
And No. Handphone <No_HP> yang benar
Then nominal tidak tertampil
Examples:
|nomor|No_HP|
||081242504777|

Scenario: Pembelian PLN Prabayar Gagal (Email Salah dan Kosong)
Given pengguna berada di halaman awal web
When klik Listrik PLN
And Nomor meter PLN <nomor> yang benar
And No. Handphone <No_HP> yang benar
And memilih nominal <nominal>
And <email> yang dimasukkan pada kolom email salah
And klik lanjutkan
Then pesan error muncul <error>
Examples:
|nomor|No_HP|nominal|email|error|
|01428800700|081242504777|100000|retnowijiastutikgmail.com|Email harus diisi dalam format yang benar|
|01428800701|081242504777|50000|o,pi@sepulsa.com|Email harus diisi dalam format yang benar|
|01428800701|081242504777|50000||Email harus diisi dalam format yang benar|


