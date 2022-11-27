public class Utama {
    public static void main(String[] args) {
        BangunDatar Ling = new Lingkaran(14);
        BangunDatar Seg = new Segitiga(10,12);
        BangunDatar Pers = new Persegi(26,20);

        Ling.gambar();
        Seg.gambar();
        Pers.gambar();
        System.out.println("Luas Lingkaran: " + Ling.getLuas());
        System.out.println("Luas Segitiga: " + Seg.getLuas());
        System.out.println("Luas Persegi: " + Pers.getLuas());
    }
}
