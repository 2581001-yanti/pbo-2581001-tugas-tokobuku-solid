public class BukuCetak extends Buku {
    private int beratGram;

    public BukuCetak(String judul, String penulis, int harga, int beratGram) {
        super(judul, penulis, harga);
        this.beratGram = beratGram;
    }

    public int hitungOngkir() {
        return (beratGram > 500) ? 10000 : 5000;
    }

    @Override
    public String getKeterangan() {
        return beratGram + " gram, ongkir " + formatRupiah(hitungOngkir());
    }

    @Override
    public int hitungHargaAkhir() {
        return getHarga() + hitungOngkir();
    }
}