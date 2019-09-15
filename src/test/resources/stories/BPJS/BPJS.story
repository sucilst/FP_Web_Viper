Meta:

Narrative:
As seorang pengguna
I want to membayar BPJS
So that tagihan BPJS saya lunas

Scenario: Sukses membayar tagihan BPJS
Given user sudah ada pada halaman beranda sepulsa
When user menekan kebab button
And menekan opsi "Bayar BPJS"
And memasukan Nomor BPJS <nomor> valid
And memasukan No HP <No_HP> valid
And menekan tombol "Lanjut ke Pembayaran"
And mengisi email <email> valid
And menekan tombol "Lanjutkan"
Then user berada di halaman pengguna <email>
Examples:
|nomor|No_HP|email|
|0000001430071801|081242504777|retnowijiastutik@gmail.com|
|0000001430071802|081242504777|opi@sepulsa.com|

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

