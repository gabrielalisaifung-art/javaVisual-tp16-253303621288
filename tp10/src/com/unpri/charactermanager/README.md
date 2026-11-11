# TP8 — Implementasi GUI dan MVC

## 1. Implementasi MainWindow

Pada TP8, aplikasi Character Manager dikembangkan menggunakan Java Swing. Class MainWindow menggunakan JFrame sebagai jendela utama aplikasi. Data karakter ditampilkan secara dinamis menggunakan perulangan for, sehingga jumlah JLabel menyesuaikan jumlah karakter yang tersedia. Aplikasi juga menghitung dan menampilkan rata-rata level seluruh karakter secara otomatis.

## 2. Screenshot Sebelum Perubahan

Masukkan screenshot aplikasi yang menampilkan tiga karakter dan rata-rata level 20,0.

## 3. Screenshot Sesudah Perubahan

Masukkan screenshot aplikasi yang menampilkan lima karakter dan rata-rata level 30,0.

## 4. Aliran Data dan Konsep MVC

Main.java bertugas membuat data karakter dan memasukkannya ke CharacterManager. CharacterManager mengelola daftar karakter yang kemudian diberikan kepada MainWindow untuk ditampilkan. MainWindow berperan sebagai View karena menampilkan data dan statistik kepada pengguna. Pemisahan tanggung jawab tersebut mendukung prinsip MVC, yaitu memisahkan pengelolaan data dari tampilan antarmuka.

## 5. Karakter Baru

- Healer, level 40: dipilih sebagai karakter pendukung dengan level lebih tinggi daripada tiga karakter awal.
- Paladin, level 50: dipilih sebagai karakter petarung dengan level tertinggi dalam daftar.

## 6. Link Google Docs Bagian D

Masukkan link Google Docs tugas Bagian D di sini.