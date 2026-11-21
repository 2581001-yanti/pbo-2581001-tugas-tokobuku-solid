public class BukuAudio extends Buku implements BisaDiunduh {
    private int durasiMenit;

    public BukuAudio(String judul, String penulis, int harga, int durasiMenit) {
        super(judul, penulis, harga);
        this.durasiMenit = durasiMenit;
    }

    @Override
    public String getInfoUnduhan() {
        return durasiMenit + " menit";
    }

    @Override
    public String getKeterangan() {
        return getInfoUnduhan() + ", diskon 10%";
    }

    @Override
    public int hitungHargaAkhir() {
        return getHarga() * 90 / 100;
    }
}