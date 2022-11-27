public class Persegi extends BangunDatar{
    private float panjang;
    private float lebar;
    public Persegi (float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public float getLuas(){
        return this.lebar* this.panjang;
    }

    @Override
    public void gambar() {
        System.out.println("Gambar Persegi");
    }
}
