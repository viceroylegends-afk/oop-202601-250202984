# Catatan Minggu 06: UML dan SOLID

## Yang saya kerjakan
Saya membuat Class Diagram (docs/uml/class-diagram.mmd dan .png) dari kode yang sudah ada: kelas di paket model, kontrak, denda, dan katalog, lengkap dengan atribut, method, tipe, visibility, relasi, dan multiplicity. Saya juga membuat Sequence Diagram pengajuan peminjaman (docs/uml/sequence-pengajuan.mmd dan .png) dengan fragmen alt untuk skenario bentrok dan skenario sukses, serta docs/uml/solid.md yang menjelaskan prinsip OCP dan DIP. Tes Minggu06DokumenTest lulus (3 tes, 0 gagal).

## Keputusan desain
- Prinsip SOLID yang saya tunjukkan: OCP di kelas Aset dan subclass-nya (jenis aset baru cukup subclass baru dan satu nilai enum), dan DIP di AturanDenda, DendaFlat, DendaProgresif (bergantung pada interface dan Aset yang abstrak).
- Di Class Diagram, KatalogAset saya gambar sebagai aggregation terhadap Aset, karena aset dibuat di luar katalog dan hanya dititipkan lewat tambah(). Peminjaman berasosiasi ke satu Peminjam dan satu Aset, dan satu Aset bisa muncul di banyak Peminjaman.
- Kelas yang masih berisi TODO (JadwalPeminjaman, dao, factory, exception) belum saya gambar lengkap, supaya diagram tetap konsisten dengan kode yang ada. Sequence Diagram mengikuti komentar method ajukan() dan akan saya periksa lagi setelah minggu 7 dan 9 selesai.

## Kendala
Nama file hasil unduhan dari mermaid.live sempat menjadi class-diagram.png.png, dan sumber sequence diagram sempat berekstensi .mmdcode karena perintah code ikut terbawa ke nama file. Saya mengatasinya dengan Rename-Item.

## Penggunaan AI
- Alat yang dipakai: Claude
- Bagian yang dibantu AI: kode Mermaid untuk class diagram dan sequence diagram, serta draf solid.md
- Prompt utama: "jelaskan langkah week 6"
- Yang saya ubah atau tolak dari saran AI, dan alasannya: AI sempat menyarankan PlantUML untuk Class Diagram, tetapi saya memilih tetap memakai Mermaid dan menghapus file .puml supaya hanya ada satu sumber diagram.
- Satu hal yang saya pahami lebih baik sekarang: perbedaan aggregation dan composition. KatalogAset saya gambar sebagai aggregation terhadap Aset karena aset dibuat di luar katalog dan hanya dititipkan lewat tambah(), sehingga kalau katalog hilang asetnya tetap ada. Pada composition, bagian ikut hilang bersama induknya.