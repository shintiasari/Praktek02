package praktek02;
public class Jajargenjang {
    double alas;
    double tinggi;
    
    void cetakinfo(){
        System.out.println("======================");
        System.out.println("Alas    : "+alas);
        System.out.println("Tinggi  : "+tinggi);
        System.out.println("======================");
    }
    
    
    double hitungLuas(){
        double luas; 
        luas=alas*tinggi;
        return luas;
    }
    
    void cetakluas(){
        System.out.println("Luasnya adalah: "+hitungLuas());
    }
}
