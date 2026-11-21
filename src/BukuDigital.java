public class BukuDigital extends Buku implements BisaDiunduh {
    private double ukuranMB;

    public BukuDigital(String judul, String penulis, int harga, double ukuranMB) {
        super(judul, penulis, harga);
        this.ukuranMB = ukuranMB;
    }

    @Override
    public String getInfoUnduhan() {
        return ukuranMB + " MB";
    }

    @Override
    public String getKeterangan() {
        return getInfoUnduhan() + ", diskon 20%";
    }

    @Override
    public int hitungHargaAkhir() {
        return getHarga() * 80 / 100;
    }
}