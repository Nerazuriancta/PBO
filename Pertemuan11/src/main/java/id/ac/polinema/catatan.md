OCP Merupakan prinsip yang menyatakan bahwa sebuah class harus terbuka untuk pengembangan atau penambahan fitur, tetapi tertutup untuk perubahan kode yang sudah ada

Pada program Bank Mini, prinsip ini diterapkan menggunakan inheritance dan method overriding

- Account                       : kelas induk untuk rekening
- SavingAccount                 : Jenis rekening tabungan
- CheckingAccount               : Jenis rekening giru
- Bank                          : Mengelola rekening
- Customer                      : Menyimpan data nasabah
- Main                          : Menjalankan program
- InsufficientBalanceException  : Menangani kesalahan saldo
- InterestBearing               : Interface untuk fitur bunga

1. Account  : Account merupakan abstract class atau kelas induk yang menjadi dasar untuk jenis rekening lainnya. Di dalamnya terdapat fitur umum seperti deposit, withdraw, getBalance, dan canWithdraw.

2. SavingsAccount   : SavingsAccount merupakan subclass dari Account yang digunakan untuk rekening tabungan. Kelas ini memiliki aturan saldo minimum sebesar Rp50.000 dan juga memiliki fitur bunga.

3. CheckingAccount  : CheckingAccount merupakan subclass dari Account yang digunakan untuk rekening giro. Kelas ini memiliki fitur overdraft, yaitu fasilitas untuk menarik uang melebihi saldo yang tersedia sesuai batas yang ditentukan.

4. Bank     : Bank merupakan kelas yang bertugas mengelola rekening nasabah, seperti menambahkan rekening, mencari rekening, dan memproses biaya bulanan serta bunga.

5. Customer     : Customer merupakan kelas yang menyimpan informasi nasabah, yaitu nama dan nomor telepon.

6. Main     : Main merupakan kelas utama yang digunakan untuk menjalankan program. Di dalamnya terdapat pembuatan objek nasabah dan rekening serta pemanggilan fungsi-fungsi program.

7. InsufficientBalanceException     : Kelas ini digunakan untuk menangani kesalahan ketika nasabah melakukan penarikan uang yang tidak memenuhi aturan saldo.

8. InterestBearing      : InterestBearing merupakan interface yang menyediakan method applyInterest untuk memberikan bunga pada rekening yang mendukung fitur tersebut.