public class Lingkaran extends BangunDatar {
    int r;
    public Lingkaran(int r) {
        this.r = r;
    }
    @Override
    public float getLuas() {
        return (float) (Math.PI * r * r);
    }
    @Override
    public void gambar() {
        System.out.println("Gambar Lingkaran");
    }
}
