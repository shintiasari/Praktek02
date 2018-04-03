package praktek02;
public class JajargenjangAksi {
    public static void main(String[] args) {
        
        Jajargenjang j1 = new Jajargenjang();
        j1.alas = 12;
        j1.tinggi = 4;
        
        j1.cetakinfo();
        System.out.println("Luas jajargenjang = "+j1.hitungLuas());
        j1.cetakluas();
        
        Jajargenjang j2 = new Jajargenjang();
        j2.cetakinfo();
        
        Jajargenjang j3 = new Jajargenjang(20,40);
        j3.cetakinfo();
    }
}
