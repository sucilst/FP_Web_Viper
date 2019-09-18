Meta:

Narrative:
As seorang pengguna
I want memiliki akun Sepulsa
So that saya dapat menggunakan semua fitur yang terdapat pada website Sepulsa

Scenario: Sign Up Berhasil
Given pengguna berada di halaman beranda
When klik Sign Up
And masukkan <nama_lengkap> yang benar
And email <email> yang benar
And No HP <No_HP> yang benar
And Password <password> yang benar
And <pilihan> klik kolom syarat, ketentuan, dan kebijakan privasi
And klik tombol daftar
And memasukkan OTP
And klik konfirmasi No HP
Then berada di halaman dashboard <nama_lengkap>
Examples:
|nama_lengkap|email|No_HP|password|pilihan|
|Difa Rakaditya|rakaditya@alterra.id|081242504777|alterra1997|ya|
|Difa Rakaditya97|raka-ditya@alterra.id|081578021932|alterra1997|ya|
|,,,,|slestari@alterra.id|085691091821|alterra1997|ya|
!-- |Difa Rakaditya|rakaditya@alterra.id|081242504777|19971997|ya|
|Difa Rakaditya|rakaditya@alterra.id|082276520892|,,,,,,|ya|
!-- |Difa Rakaditya|rakaditya@alterra.id|081578021932|alterra|ya|

Scenario: Sign Up Gagal (Nama Kurang dari 3 karakter)
Given pengguna berada di halaman beranda
When klik Sign Up
And masukkan <nama_lengkap> yang salah
And email <email> yang benar
And No HP <No_HP> yang benar
And Password <password> yang benar
And <pilihan> klik kolom syarat, ketentuan, dan kebijakan privasi
And klik tombol daftar
Then pesan error tertampil <error>
Examples:
|nama_lengkap|email|No_HP|password|pilihan|error|
|Di|rakaditya@alterra.id|081242504777|alterra1997|ya|Nama minimal 3 karakter|
||rakaditya@alterra.id|081242504777|alterra1997|ya|Nama minimal 3 karakter|

Scenario: Sign Up Gagal (No. HP Kurang dari 8 Karakter)
Given pengguna berada di halaman beranda
When klik Sign Up
And masukkan <nama_lengkap> yang benar
And email <email> yang benar
And No HP <No_HP> yang salah
And Password <password> yang benar
And <pilihan> klik kolom syarat, ketentuan, dan kebijakan privasi
And klik tombol daftar
Then pesan error tertampil <error>
Examples:
|nama_lengkap|email|No_HP|password|pilihan|error|
|Difa Rakaditya|rakaditya@alterra.id|0812|alterra1997|ya|No handphone harus angka minimal 8 karakter|
|Suci Lestari|rakaditya@alterra.id||alterra1997|ya|No handphone harus angka minimal 8 karakter|

Scenario: Sign Up Gagal (No. HP lebih dari 16 angka, berupa huruf, memasukkan spesial karakter)
Given pengguna berada di halaman beranda
When klik Sign Up
And masukkan <nama_lengkap> yang benar
And email <email> yang benar
And No HP <No_HP> yang salah
And Password <password> yang benar
And <pilihan> klik kolom syarat, ketentuan, dan kebijakan privasi
And klik tombol daftar
Then pesan error tertampil <error>
Examples:
|nama_lengkap|email|No_HP|password|pilihan|error|
|Difa Rakaditya|rakaditya@alterra.id|0812099999999999999999999|alterra1997|ya|Nomor HP tidak valid.|
|Difa Rakaditya|rakaditya@alterra.id|jjjjjjjjjjj|alterra1997|ya|No handphone harus angka minimal 8 karakter|
|Difa Rakaditya|rakaditya@alterra.id|0812-4250-4777|alterra1997|ya|No handphone harus angka minimal 8 karakter|

Scenario: Sign Up Gagal (Email Kosong, tidak sesuai format, dan memiliki spesial karakter)
Given pengguna berada di halaman beranda
When klik Sign Up
And masukkan <nama_lengkap> yang benar
And email <email> yang salah
And No HP <No_HP> yang benar
And Password <password> yang benar
And <pilihan> klik kolom syarat, ketentuan, dan kebijakan privasi
And klik tombol daftar
Then pesan error tertampil <error>
Examples:
|nama_lengkap|email|No_HP|password|pilihan|error|
|Difa Rakaditya|rakaditya@alterraid|081242504777|alterra1997|ya|Alamat email harus valid|
|Difa Rakaditya||081242504777|alterra1997|ya|Alamat email harus valid|
|Difa Rakaditya|raka,ditya@alterra.id|081242504777|alterra1997|ya|

Scenario: Sign Up Gagal (Password Kosong dan Kurang dari 6 karakter)
Given pengguna berada di halaman beranda
When klik Sign Up
And masukkan <nama_lengkap> yang benar
And email <email> yang benar
And No HP <No_HP> yang benar
And Password <password> yang salah
And <pilihan> klik kolom syarat, ketentuan, dan kebijakan privasi
And klik tombol daftar
Then pesan error tertampil <error>
Examples:
|nama_lengkap|email|No_HP|password|pilihan|error|
|Difa Rakaditya|rakaditya@alterra.id|081242504777|alt|ya|Password minimal 6 karakter|
|Difa Rakaditya|rakaditya@alterra.id|081242504777||ya|Password minimal 6 karakter|

Scenario: Sign Up Gagal (Kolom syarat, ketentuan, dan kebijakan privasi tidak dicentang)
Given pengguna berada di halaman beranda
When klik Sign Up
And masukkan <nama_lengkap> yang benar
And email <email> yang benar
And No HP <No_HP> yang benar
And Password <password> yang benar
And <pilihan> klik kolom syarat, ketentuan, dan kebijakan privasi
And klik tombol daftar
Then pesan error tertampil <error>
Examples:
|nama_lengkap|email|No_HP|password|pilihan|error|
|Difa Rakaditya|rakaditya@alterra.id|081242504777|alterra1997|tidak|Harap menyetujui syarat dan ketentuan|

Scenario: Sign Up Gagal (Email sudah terdaftar)
Given pengguna berada di halaman beranda
When klik Sign Up
And masukkan <nama_lengkap> yang benar
And email <email> yang benar
And No HP <No_HP> yang benar
And Password <password> yang benar
And <pilihan> klik kolom syarat, ketentuan, dan kebijakan privasi
And klik tombol daftar
Then pesan error tertampil <error>
Examples:
|nama_lengkap|email|No_HP|password|pilihan|error|
|Suci Lestari|slestari@alterra.id|082276520892|Suci230997|ya|Email sudah terdaftar. Silahkan login.|
|Suci Lestari|pardosilestari@gmail.com|082113013109|Suci230997|ya|Nomor handphone sudah terdaftar. Silahkan masukkan nomor handphone lain.|
|Suci Lestari|raka-ditya@alterra.id|082113013109|Suci230997|ya|This email is already registered, please use another email.|
