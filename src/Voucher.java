public class Voucher implements MetodeBayar {
    private int nilai;

    public Voucher(int nilai) {
        this.nilai = nilai;
    }

    @Override
    public String nama() {
        return "Voucher " + Buku.formatRupiah(nilai);
    }

    @Override
    public int totalBayar(int totalBelanja) {
        // Baris voucher keranjang kedua sebelum perbaikan:
        // Voucher Rp100.000    : Rp-36.000
        return Math.max(0, totalBelanja - nilai);
    }
}