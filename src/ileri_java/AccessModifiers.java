package ileri_java;

public class AccessModifiers {
    public int genelDegisken;
    private int ozelDegisken;
    protected int korunanDegisken;
    int varsayilanDegisken;

    public AccessModifiers() {
        genelDegisken = 10;
        ozelDegisken = 20;
        korunanDegisken = 30;
        varsayilanDegisken = 40;
    }

    // Public erişim belirteçli metot
    public void genelMetot() {
        System.out.println("Bu bir genel metottur.");
    }

    // Private erişim belirteçli metot
    private void ozelMetot() {
        System.out.println("Bu bir özel metottur.");
    }

    // Protected erişim belirteçli metot
    protected void korunanMetot() {
        System.out.println("Bu bir korunan metottur.");
    }

    // Varsayılan (paket-özel) erişim belirteçli metot
    void varsayilanMetot() {
        System.out.println("Bu bir varsayılan metottur.");
    }
}

