package ileri_java;

public class AccessModifiersTest {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();

        System.out.println("Genel değişken: " + obj.genelDegisken);
        System.out.println("Özel değişken: " + obj.ozelDegisken); // Bu bir hata verecek çünkü değişken private erişemiyoruz.
        System.out.println("Korunan değişken: " + obj.korunanDegisken);
        System.out.println("Varsayılan değişken: " + obj.varsayilanDegisken);

        obj.genelMetot();
        obj.ozelMetot(); // Bu bir hata verecek çünkü metot private buna da erişemiyoruz.
        obj.korunanMetot();
        obj.varsayilanMetot();
    }
}

	
	


