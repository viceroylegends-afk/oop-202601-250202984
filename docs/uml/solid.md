# Prinsip SOLID di Aset-Pinjam

## 1. Open/Closed Principle (OCP)

Kelas: Aset (abstract), Ruang, Laptop, AlatLab.

Aset mendeklarasikan hitungDenda(int) sebagai method abstrak, dan tiap subclass menghitung dendanya sendiri (Ruang 1x, Laptop 2x, AlatLab 4x). Jenis aset baru cukup dibuat sebagai subclass baru plus satu nilai di enum JenisAset, tanpa mengubah kode subclass yang sudah ada.

## 2. Dependency Inversion Principle (DIP)

Kelas: AturanDenda (interface), DendaFlat, DendaProgresif.

DendaFlat dan DendaProgresif mengimplementasikan AturanDenda dan menerima parameter bertipe Aset yang abstrak, bukan kelas konkret. Cara menghitung denda jadi mudah diganti dan mudah diuji.