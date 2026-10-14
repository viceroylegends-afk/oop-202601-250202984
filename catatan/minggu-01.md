# Catatan Minggu 01: Paradigma Pemrograman dan Setup

Salin berkas ini menjadi `catatan/minggu-NN.md` (NN dua digit, misalnya `minggu-07.md`).

## Yang saya kerjakan
Saya memasang JDK 21, Maven, dan Git, lalu mem-fork dan meng-clone repo oop-202601 dan menambahkan repo dosen sebagai upstream. Saya mengisi NIM dan nama di mahasiswa.properties. Setelah itu saya melengkapi tiga kelas sapaan (HelloProsedural, HelloOOP, HelloFungsional) yang menghasilkan teks yang sama dengan tiga gaya berbeda. Tes Minggu01Test lulus (5 tes, 0 gagal).

## Keputusan desain
Saya memakai kalimat sapaan yang sama di ketiga gaya: "Hello Aset-Pinjam, saya <nama> (<nim>)", supaya perbedaan gayanya mudah dibandingkan.

## Kendala
- Java dan Maven tidak dikenali di PowerShell. JDK saya pasang lewat winget, Maven saya unduh manual, lalu saya atur PATH.
- Script uji.ps1 diblokir Windows. Saya atasi dengan Set-ExecutionPolicy -Scope CurrentUser RemoteSigned.
- Folder Documents tidak ada, jadi repo saya clone ke C:\oop.
- Isian nim dan nama di mahasiswa.properties sempat tertukar, lalu saya perbaiki.


## Penggunaan AI
- Alat yang dipakai: Claude
- Bagian yang dibantu AI: pemasangan alat dan langkah Git
- Prompt utama: "susunin tugas atau urutannya dan langkah langkah downlodnya dan fokus ke minggu satu"
- Yang saya ubah atau tolak dari saran AI, dan alasannya: tidak ada. karena, hasil dari saran ai sudah saya buktikan dan berhasil
- Satu hal yang saya pahami lebih baik sekarang: nama dan nim di dalam kode adalah variabel, bukan isi data, dan nilainya diambil dari mahasiswa.properties.
