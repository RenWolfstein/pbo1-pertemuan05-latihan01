package pertemuan04.latihan01;
public class Latihan01 {
    public static void main(String[] args) {
        String nama;
        double pembayaran = 150000;
        double uangPembeli = 200000;
        double kembalian;
           Pelanggan bayu = new Pelanggan();
           
           bayu.nama = "Bayu";
           bayu.pembayaran = 150000;
           bayu.uangPembeli = 200000;
           bayu.kembalian = uangPembeli - pembayaran;
           
           bayu.struckBelanja();
    }
}
