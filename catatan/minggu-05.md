# Catatan Minggu 05: Abstraction

## Yang saya kerjakan
Saya mengisi bisaDipinjam() di Aset (true hanya jika status TERSEDIA dan kondisi bukan RUSAK_BERAT), lalu menjadikan Aset class abstract dengan hitungDenda sebagai method abstrak. Perhitungan dasar denda saya pindah ke method protected dendaDasar() supaya Ruang, Laptop, dan AlatLab memanggilnya lalu mengalikan multiplier jenisnya. Saya juga mengimplementasikan interface AturanDenda lewat DendaFlat dan DendaProgresif. Tes Minggu05AbstraksiTest lulus (5 tes, 0 gagal).

## Keputusan desain
- Rumus DendaProgresif: denda flat ditambah (hari - 7) x denda satu hari untuk hari ke-8 dan seterusnya, jadi tarif berlipat dua setelah 7 hari. Rumus ini memenuhi aturan: 0 hari = 0, tidak pernah lebih murah dari flat, tidak turun saat hari bertambah, dan di hari ke-30 lebih mahal dari flat. Rumusnya sudah dicatat di docs/asumsi.md.
- Aset dibuat abstract karena di sistem ini tidak ada aset yang hanya "aset", selalu ada jenisnya (ruang, laptop, atau alat lab).
- Aturan denda dibuat interface (AturanDenda), bukan abstract class, karena hanya berupa kontrak satu method tanpa data, dan bisa ada banyak cara menghitung yang bebas dipertukarkan.

## Kendala
Setelah hitungDenda di Aset menjadi abstrak, super.hitungDenda(...) di tiga subclass tidak bisa dipakai lagi dan kode gagal dikompilasi. Saya mengatasinya dengan memindahkan perhitungan dasar ke method protected dendaDasar() di Aset, lalu mengganti panggilan di Ruang, Laptop, dan AlatLab.

## Penggunaan AI
- Alat yang dipakai: Claude
- Bagian yang dibantu AI: Aset.java, Ruang.java, Laptop.java, AlatLab.java, DendaFlat.java, DendaProgresif.java
- Prompt utama: "saya ingin kerjakan minggu 5 dari awal satu persatu berikan kodenya"
- Yang saya ubah atau tolak dari saran AI, dan alasannya: tidak ada, saya telah menelitinya sebelum mengerjakannya
- Satu hal yang saya pahami lebih baik sekarang: method abstrak seperti hitungDenda di Aset tidak punya isi dan hanya mendefinisikan tanda tangannya, sehingga setiap subclass wajib menulis perhitungannya sendiri. Class yang punya method abstrak juga tidak bisa dibuat objeknya langsung, jadi yang dibuat adalah Ruang, Laptop, atau AlatLab.