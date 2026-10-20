# Catatan Minggu 02: Struktur OOP: Class, Object, Encapsulation

## Yang saya kerjakan
Saya melengkapi class Aset di model/Aset.java: field private, konstruktor dengan validasi, empat getter (kode, nama, status, kondisi), dan tiga setter dengan validasi (nama, status, kondisi). Nilai awal status adalah TERSEDIA dan kondisi BAIK. Tes Minggu02AsetTest lulus (6 tes, 0 gagal).

## Keputusan desain
- Field kode saya buat final dan tanpa setter, sesuai aturan bahwa kode tidak boleh diubah setelah objek dibuat.
- Konstruktor dan setNama menolak nama atau kode yang null atau kosong. Saya memakai isBlank(), jadi teks yang hanya berisi spasi juga dianggap kosong.
- setStatus dan setKondisi menolak null dengan IllegalArgumentException, supaya sama dengan konstruktor.
- Tiga fungsi minggu 3, 4, dan 5 (getJenis, hitungDenda, bisaDipinjam) sengaja tidak saya sentuh karena dikerjakan di minggu berikutnya.

## Kendala
Tes sempat gagal dengan pesan "TODO minggu 2: konstruktor Aset", padahal kode sudah saya tulis. Penyebabnya perubahan di Aset.java belum saya simpan, jadi Maven masih memakai versi awal. Setelah file disimpan (Ctrl+S) dan tes dijalankan ulang, semua tes lulus.

## Penggunaan AI
- Alat yang dipakai:  Claude
- Bagian yang dibantu AI: Aset.java (field, konstruktor, getter, setter)
- Prompt utama: "lanjutkan minggu 2";
- Yang saya ubah atau tolak dari saran AI, dan alasannya: tidak ada karena saya sudah mencobanya dan terus perbaiki jika terjadi kesalahan
- Satu hal yang saya pahami lebih baik sekarang: setiap melakukan perubahan jangan pernah lupa untuk di safe
