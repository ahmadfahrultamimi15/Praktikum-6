public class Segitiga extends BangunDatar{
    int alas;
    int tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public float getLuas(){
        return this.alas * this.tinggi/2;
    }

    @Override
    public void gambar() {
        System.out.println("Gambar Segitiga");
    }
}
