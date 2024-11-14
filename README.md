Penjelasan :

Menambahkan method changePin() di file Account.java untuk membuat menu dimana pengguna dapat mengganti pin/sandi yang telah ada. Pengguna akan memasukkan pin baru terlebih dahulu, kemudian akan mengonfirmasi pin dengan memasukkan pin untuk kedua kalinya. Disini akan dilakukan 2 permisalan. Yang pertama adalah saat pin yang dimasukkan oleh pengguna sama dengan pin lama/pertama sebelum pin akan diubah. Jika memenuhi kondisi, akan diberikan output yang mengatakan bahwa pin sudah pernah dipakai dan tidak bisa diganti. Selanjutnya adalah permisalan jika pin baru yang pertama dimasukkan sama dengan pin baru yang kedua kali dimasukkan, jika memenuhi kondisi, variabel pin akan diganti dengan pin baru yang telah dimasukkan, jika tidak memenuhi kondisi, program akan mencetak output "Pin tidak sama". Selanjutnya method akan dipanggil di ATM.java pada case 5 yaitu pada menu ubah PIN.

Menambahkan saldo minimal pada akun jika pengguna ingin menarik uang. Saldo minimal penting agar pengguna bisa menyisakan nilai minimal yang menjadi ketentuan dari bank tersebut. Pertama-tama pada file Account.java, kita harus menambahkan = private static final double MINIMUM_BALANCE = 50000; agar nilai ini dapat berlaku untuk semua object/instansi yang memiliki nilai saldo minimum. Digunakan final agar variabel tidak dapat diubah setelah didefinisikan, hal ini akan membuat saldo minimum konstan dan tidak dapat berubah-ubah.
Dalam kelas Withdrawal, MINIMUM_BALANCE digunakan untuk memastikan bahwa setiap penarikan tidak mengurangi saldo akun di bawah saldo minimum yang telah ditetapkan. Pada execute method di kelas Withdrawal, program memeriksa apakah jumlah penarikan yang diminta (disimpan dalam amount) tidak membuat saldo akun lebih rendah dari MINIMUM_BALANCE. Kode ini memastikan bahwa jika saldo setelah penarikan kurang dari MINIMUM_BALANCE, penarikan ditolak dengan pesan peringatan bahwa saldo tidak mencukupi dan penarikan valid, jumlah penarikan dikurangi dari saldo, dan transaksi berhasil. Dengan adanya MINIMUM_BALANCE, program mencegah pengguna dari mengosongkan akun mereka di bawah batas minimum yang diizinkan.
