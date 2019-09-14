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
Then berada di halaman pembayaran <email>
Examples:
|nomor|No_HP|nominal|email|
|01428800700|081242504777|100000|retnowijiastutik@gmail.com|
|01428800701|081242504777|50000|opi@sepulsa.com|

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

Scenario: Pembelian PLN Prabayar Berhasil (Sign In)
Given pengguna berada di halaman awal web
When klik Sign In
And Email <email> yang benar
And Password <password> yang benar
And klik tombol masuk
And klik Listrik PLN
And Nomor meter PLN <nomor> yang benar
And No. Handphone <No_HP> yang benar
And memilih nominal <nominal>
Then Berada di halaman pembayaran <nama_lengkap>
Examples:
|email|password|nomor|No_HP|nominal|nama_lengkap|
|retnowijiastutik@gmail.com|retno123|01428800700|081242504777|100000|Retno Wiji Astutik|
|opi@sepulsa.com|123456qwerty|01428800701|081242504777|50000|Opi39|

