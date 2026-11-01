# Catatan Minggu 03: Inheritance

## Yang saya kerjakan
Saya membuat tiga subclass dari Aset: Ruang (kapasitas), Laptop (spesifikasi dan nomor inventaris), dan AlatLab (laboratorium dan tingkat risiko). Tiap konstruktor memanggil super(kode, nama) lalu memvalidasi field miliknya sendiri, dan tiap kelas meng-override getJenis(). Tes Minggu03HierarkiTest lulus (8 tes, 0 gagal).

## Keputusan desain
- Field yang dipakai semua jenis aset (kode, nama, status, kondisi) tetap di Aset karena sama untuk ruang, laptop, dan alat lab. Field yang khas satu jenis (kapasitas, spesifikasi, nomorInventaris, laboratorium, tingkatRisiko) ada di subclass masing-masing.
- Validasi kode dan nama tidak saya tulis ulang di subclass, karena sudah dijalankan lewat super(...).
- Satu keterbatasan inheritance: subclass terikat erat dengan induknya. Kalau Aset berubah (misalnya konstruktornya), semua subclass ikut terpengaruh.
- Contoh di sistem ini di mana inheritance kurang tepat dibanding komposisi: kalau aturan peminjaman berbeda untuk tiap jenis aset dan bisa berubah, menaruhnya di subclass membuat kita harus mengubah banyak kelas. Lebih luwes kalau aturan itu objek terpisah yang dimiliki aset, jadi bisa diganti tanpa mengubah hierarki.

## Kendala
Perintah mvn sempat terhenti lama karena jaringan lambat. Saya batalkan kemudian menjalankannya lagi, dan berhasil
## Penggunaan AI
- Alat yang dipakai: Claude
- Bagian yang dibantu AI: Ruang.java, Laptop.java, AlatLab.java
- Prompt utama: "oke saya ingin melanjutkan ke week 3"
- Yang saya ubah atau tolak dari saran AI, dan alasannya: tidak ada, namun saat ada yang kurang saya tambahkan    sendiri
- Satu hal yang saya pahami lebih baik sekarang: super(kode, nama) memanggil konstruktor induk, sehingga validasi kode dan nama otomatis berlaku di subclass tanpa ditulis ulang.