
public class Laptop {
String Merk;
String Warna;
String JenisProcessor;
String UkuranLayar;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Laptop laptopku = new Laptop();
laptopku.Merk="Asus";
laptopku.Warna="Hitam";
laptopku.JenisProcessor="Core i3";
laptopku.UkuranLayar="12 inchi";

System.out.println("Merk         : "+laptopku.Merk);
System.out.println("Warna        : "+laptopku.Warna);
System.out.println("Processor    : "+laptopku.JenisProcessor);
System.out.println("Ukuran Layar : "+laptopku.UkuranLayar);
    }
    
}
