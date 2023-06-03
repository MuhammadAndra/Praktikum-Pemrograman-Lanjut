
public class Domba extends Hewan {
    private int jumlahBulu;
    private double hargaBulu;
    private double perawatanDomba;

    public Domba(String jenis, int kuantitas, double harga, int jumlahBulu,
            double hargaBulu, double perawatanDomba) {
        super(jenis, kuantitas, harga);
        this.jumlahBulu = jumlahBulu;
        this.hargaBulu = hargaBulu;
        this.perawatanDomba = perawatanDomba;
    }

    public int getTotalBulu() {
        return this.jumlahBulu * super.getKuantitas();
    }

    public double perawatan() {
        return super.getKuantitas() * this.getPerawatanDomba() * 30;

    }

    public double pendapatan() {
        return this.getHargaBulu() * getTotalBulu() * 30;
    }

    public int getJumlahBulu() {
        return jumlahBulu;
    }

    public void setJumlahBulu(int jumlahBulu) {
        this.jumlahBulu = jumlahBulu;
    }

    public double getHargaBulu() {
        return hargaBulu;
    }

    public void setHargaBulu(double hargaBulu) {
        this.hargaBulu = hargaBulu;
    }

    public double getPerawatanDomba() {
        return perawatanDomba;
    }

    public void setPerawatanDomba(double perawatanDomba) {
        this.perawatanDomba = perawatanDomba;
    }

}
