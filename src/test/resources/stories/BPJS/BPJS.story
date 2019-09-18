Meta:

Narrative:
As seorang pengguna
I want to membayar BPJS
So that tagihan BPJS saya lunas

Scenario: Sukses membayar tagihan BPJS (Sign In)
Given user sudah ada pada halaman beranda sepulsa
When user melakukan Sign In <email> <password>
And user menekan kebab button
And menekan opsi "Bayar BPJS"
And memasukan Nomor BPJS <nomor> valid
And memasukan No HP <No_HP> valid
And menekan tombol "Lanjut ke Pembayaran"
And user melakukan pembayaran melalui <Bank>
Then transaksi berhasil dibayar <Bank> <validasi>
Examples:
|nomor|No_HP|email|Bank|password|
|0000001430071802|081242504777|opi@sepulsa.com|Credit Card|123456qwerty|Opi39|
|0000001430071801|081242504777|retnowijiastutik@gmail.com|Permata|retno123|Transaksi Sukses|


Scenario: Sukses membayar tagihan BPJS (Sepulsa Kredit, Sign In)
Given user sudah ada pada halaman beranda sepulsa
When user melakukan Sign In <email> <password>
And user menekan kebab button
And menekan opsi "Bayar BPJS"
And memasukan Nomor BPJS <nomor> valid
And memasukan No HP <No_HP> valid
And menekan tombol "Lanjut ke Pembayaran"
And user melakukan pembayaran melalui <Bank>
Then transaksi berhasil dibayar <Bank> <validasi>
Examples:
|nomor|No_HP|email|Bank|password|
|0000001430071801|081242504777|retnowijiastutik@gmail.com|Sepulsa Kredit|retno123|Retno Wiji Astutik|

Scenario: Sukses membayar tagihan BPJS (Sepulsa Kredit, Sign In di Halaman Pembayaran)
Given user sudah ada pada halaman beranda sepulsa
When user menekan kebab button
And menekan opsi "Bayar BPJS"
And memasukan Nomor BPJS <nomor> valid
And memasukan No HP <No_HP> valid
And menekan tombol "Lanjut ke Pembayaran"
And user melakukan sign in <email> <password>
And user melakukan pembayaran melalui <Bank>
Then transaksi berhasil dibayar <Bank> <validasi>
Examples:
|nomor|No_HP|email|Bank|password|
|0000001430071802|081242504777|retnowijiastutik@gmail.com|Sepulsa Kredit|retno123|Retno Wiji Astutik|

Scenario: Sukses membayar tagihan BPJS (Anonim)
Given user sudah ada pada halaman beranda sepulsa
When user menekan kebab button
And menekan opsi "Bayar BPJS"
And memasukan Nomor BPJS <nomor> valid
And memasukan No HP <No_HP> valid
And menekan tombol "Lanjut ke Pembayaran"
And mengisi email <email> valid
And menekan tombol "Lanjutkan"
And user melakukan pembayaran melalui <Bank>
Then transaksi berhasil dibayar <Bank> <validasi>
Examples:
|nomor|No_HP|email|Bank|validasi|
|0000001430071801|081242504777|retnowijiastutik@gmail.com|Permata|Transaksi Sukses|
|0000001430071802|081242504777|opi@sepulsa.com|BCA|Payment Success|

Scenario: Sukses membayar tagihan BPJS (Sign In)
Given user sudah ada pada halaman beranda sepulsa
When user melakukan Sign In <email> <password>
And user menekan kebab button
And menekan opsi "Bayar BPJS"
And memasukan Nomor BPJS <nomor> valid
And memasukan No HP <No_HP> valid
And menekan tombol "Lanjut ke Pembayaran"
And user melakukan pembayaran melalui <Bank>
Then transaksi berhasil dibayar <Bank> <validasi>
Examples:
|nomor|No_HP|email|Bank|password|
|0000001430071801|081242504777|retnowijiastutik@gmail.com|Permata|retno123|Transaksi Sukses|
|0000001430071802|081242504777|opi@sepulsa.com|Mandiri|123456qwerty|Success Transaction|

Scenario: Sukses membayar tagihan BPJS (Sign In di Halaman Pembayaran)
Given user sudah ada pada halaman beranda sepulsa
When user menekan kebab button
And menekan opsi "Bayar BPJS"
And memasukan Nomor BPJS <nomor> valid
And memasukan No HP <No_HP> valid
And menekan tombol "Lanjut ke Pembayaran"
And user melakukan sign in <email> <password>
And user melakukan pembayaran melalui <Bank>
Then transaksi berhasil dibayar <Bank> <validasi>
Examples:
|nomor|No_HP|email|Bank|password|
|0000001430071801|081242504777|retnowijiastutik@gmail.com|Permata|retno123|Transaksi Sukses|
|0000001430071802|081242504777|opi@sepulsa.com|Mandiri|123456qwerty|Success Transaction|

Scenario: Gagal membayar tagihan BPJS (email invalid)
Given user sudah ada pada halaman beranda sepulsa
When user menekan kebab button
And menekan opsi "Bayar BPJS"
And memasukan Nomor BPJS <nomor> valid
And memasukan No HP <No_HP> valid
And menekan tombol "Lanjut ke Pembayaran"
And mengisi email <email> invalid
And menekan tombol "Lanjutkan"
Then Pesan error muncul <error>
Examples:
|nomor|No_HP|email|error|
|0000001430071804|081242504777|retnowijiastutik@gmail..com|Email harus diisi dalam format yang benar|
|0000001430071806|081242504777|o!pi@sepulsa.com|Email harus diisi dalam format yang benar|

Scenario: Gagal membayar tagihan BPJS (tagihan sudah dibayar/belum ada)
Given user sudah ada pada halaman beranda sepulsa
When user menekan kebab button
And menekan opsi "Bayar BPJS"
And memasukan Nomor BPJS <nomor> invalid
And memasukan No HP <No_HP> valid
And menekan tombol "Lanjut ke Pembayaran"
Then Pesan error muncul <error>
Examples:
|nomor|No_HP|error|
|0000001430071800||Nomor tidak terdaftar dalam database billing.|
|0000001430071||Nomor tidak terdaftar dalam database billing.|
|0000001430071801|082276520892|Tagihan sudah terbayar/ belum tersedia untuk bulan ini.|

Scenario: Gagal membayar tagihan BPJS (tidak membayar dalam waktu yang telah ditentukan)
Given user sudah ada pada halaman beranda sepulsa
When user menekan kebab button
And menekan opsi "Bayar BPJS"
And memasukan Nomor BPJS <nomor> valid
And memasukan No HP <No_HP> valid
And menekan tombol "Lanjut ke Pembayaran"
And mengisi email <email> valid
And menekan tombol "Lanjutkan"
And user melakukan pembayaran melalui <Bank>
Then Pesan tidak dibayar dalam waktu yang ditentukan
And Transaksi dibatalkan
Examples:
|nomor|No_HP|email|Bank|
|0000001430071801|081242504777|retnowijiastutik@gmail.com|Mandiri Failed|
|0000001430071802|081242504777|opi@sepulsa.com|BCA Failed|

