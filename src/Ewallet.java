public class Ewallet implements MetodeBayar {
    @Override
    public String nama() {
        return "E-Wallet (diskon 2%)";
    }

    @Override
    public int totalBayar(int totalBelanja) {
        return totalBelanja * 98 / 100;
    }
}