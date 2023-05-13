package pertemuan04.latihan01;
public class Pelanggan {
    String nama;
    double pembayaran;
    double uangPembeli;
    double kembalian;
    
    void struckBelanja(){
        System.out.println("Nama Pelanggan : "+ nama);
        System.out.println("Total Pembayaran : Rp."+ pembayaran);
        System.out.println("Uang Pelanggan : Rp."+ uangPembeli);
        System.out.println("Kembalian : Rp."+ kembalian);
    }
}
