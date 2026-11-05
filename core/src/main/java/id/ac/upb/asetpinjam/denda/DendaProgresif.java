package id.ac.upb.asetpinjam.denda;

import id.ac.upb.asetpinjam.kontrak.AturanDenda;
import id.ac.upb.asetpinjam.model.Aset;

/**
 * Minggu 5: denda yang makin berat bila makin lama terlambat.
 *
 * <p>Rumus progresifnya KEPUTUSAN ANDA (catat di docs/asumsi.md). Syarat minimal yang diuji:
 * 0 hari = 0; tidak pernah lebih murah dari DendaFlat; tidak pernah turun saat hari bertambah.
 */
public class DendaProgresif implements AturanDenda {
private static final int BATAS_HARI = 7;
    @Override
    public long hitung(Aset aset, int hariTerlambat) {
        long flat = aset.hitungDenda(hariTerlambat);
        int hariKelebihan = Math.max(0, hariTerlambat - BATAS_HARI);
        return flat + hariKelebihan * aset.hitungDenda(1);
    }
}
