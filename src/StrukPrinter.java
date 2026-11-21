public class StrukPrinter {
    public void cetakKeranjang(String judul, Keranjang keranjang) {
        System.out.println(judul);
        for (Buku b : keranjang.getIsi()) {
            System.out.println(b.getJudul() + " (" + b.getPenulis() + ")");
            System.out.println("Harga       : " + Buku.formatRupiah(b.getHarga()));
            System.out.println("Keterangan  : " + b.getKeterangan());
            System.out.println("Harga akhir : " + Buku.formatRupiah(b.hitungHargaAkhir()));
        }
        System.out.println("-----------------------------------------");
        System.out.println("Total belanja : " + Buku.formatRupiah(keranjang.hitungTotal()));
    }

    public void cetakPembayaran(int totalBelanja, MetodeBayar[] pilihan) {
        System.out.println("-------------- PEMBAYARAN ---------------");
        for (MetodeBayar metode : pilihan) {
            System.out.printf("%-20s : %s%n", metode.nama(), Buku.formatRupiah(metode.totalBayar(totalBelanja)));
        }
    }
}