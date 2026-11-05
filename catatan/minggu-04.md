# Catatan Minggu 04: Polymorphism

## Yang saya kerjakan
Saya mengisi hitungDenda(int) di Aset (menolak hari negatif, lalu hari dikali tarif dari Varian.aktif().dendaPerHari) dan meng-override-nya di Ruang (1x), Laptop (2x), dan AlatLab (4x) dengan memanggil super.hitungDenda lalu mengalikan multiplier jenisnya. Di KatalogAset saya mengisi dua overload cari(): cari(kata) dan cari(kata, jenis). Tes Minggu04PolimorfismeTest lulus (8 tes, 0 gagal).

## Keputusan desain
Panduan minggu ini tidak meminta keputusan desain. Satu pilihan kecil dari saya: validasi hari negatif dan perkalian tarif cukup ditulis sekali di Aset, lalu subclass memanggilnya lewat super, supaya aturan tidak ditulis tiga kali. Begitu juga cari(kata, jenis) memakai ulang cari(kata) lalu menyaring hasilnya berdasarkan jenis.

## Kendala
Tes sempat gagal: denda AlatLab menghasilkan 12000, padahal seharusnya 48000. Penyebabnya file AlatLab.java belum tersimpan saat tes dijalankan, sehingga Maven masih memakai versi lama. Setelah disimpan dan tes diulang, semua tes lulus.

## Penggunaan AI
- Alat yang dipakai: Claude
- Bagian yang dibantu AI: Aset.hitungDenda, override di Ruang, Laptop, AlatLab, dan KatalogAset.cari
- Prompt utama: "lanjut minggu 4"
- Yang saya ubah atau tolak dari saran AI, dan alasannya: tidak ada yang saya ubah, ketika ada kesalahan langsung saya perbaiki
- Satu hal yang saya pahami lebih baik sekarang: overriding, yaitu subclass menggantikan method induk dengan nama dan parameter yang sama. Pada hitungDenda, Ruang, Laptop, dan AlatLab punya perilaku berbeda, dan Java memilih versi yang dipakai berdasarkan jenis objek sebenarnya saat program berjalan (dynamic binding), bukan jenis variabelnya.