package ileri_java;

public class MethodTypes {

    // Parametresiz Metot
    public void parametresizMetot() {
        System.out.println("Bu bir parametresiz metottur.");
    }

    // Parametre Alan Metot
    public void parametreAlanMetot(int sayi) {
        System.out.println("Parametreli metot, sayı: " + sayi);
    }

    // Değer Döndüren Metot
    public int degerDonenMetot() {
        return 42;
    }

    // Birden Fazla Değer Döndüren Metot
    public String[] birdenFazlaDegerDondurenMetot() {
        String[] degerler = {"Değer1", "Değer2", "Değer3"};
        return degerler;
    }

    // Static Metot
    public static void statikMetot() {
        System.out.println("Bu bir statik metottur.");
    }

    // Recursive Metot
    public void tekrarliMetot(int n) {
        if (n > 0) {
            System.out.println("Tekrarlı metot, n = " + n);
            tekrarliMetot(n - 1);
        }
    }

    // Overloaded Metot
    public void overloadedMetot() {
        System.out.println("Bu bir parametresiz overloaded metottur.");
    }

    public void overloadedMetot(int sayi) {
        System.out.println("Parametreli overloaded metot, sayı: " + sayi);
    }

    // Final Metot
    public final void finalMetot() {
        System.out.println("Bu bir final metottur.");
    }

    public static void main(String[] args) {
    	MethodTypes obje = new MethodTypes();

        // Parametresiz Metot çağrısı
        obje.parametresizMetot();

        // Parametre Alan Metot çağrısı
        obje.parametreAlanMetot(10);

        // Değer Döndüren Metot çağrısı
        int sonuc = obje.degerDonenMetot();
        System.out.println("Deger döndüren metottan dönen deger: " + sonuc);

        // Birden Fazla Değer Döndüren Metot çağrısı
        String[] degerler = obje.birdenFazlaDegerDondurenMetot();
        System.out.println("Birden fazla deger döndüren metottan dönen degerler:");
        for (String deger : degerler) {
            System.out.println(deger);
        }

        // Static Metot çağrısı
        statikMetot();

        // Recursive Metot çağrısı
        obje.tekrarliMetot(5);

        // Overloaded Metot çağrısı
        obje.overloadedMetot();
        obje.overloadedMetot(20);

        // Final Metot çağrısı
        obje.finalMetot();
    }
}



