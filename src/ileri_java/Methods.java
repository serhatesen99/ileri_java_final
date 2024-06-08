package ileri_java;

import java.util.ArrayList;
import java.util.List;

public class Methods {

    public void mesaj() {
        System.out.println("Bu metot geriye bir şey döndürmüyor..");
    }

    public int toplama(int a, int b) {
        return a + b;
    }

    public String selamlama(String isim) {
        return "Merhaba, " + isim;
    }

    public boolean isPositive(int number) {
        return number > 0;
    }

    public List<String> getList() {
        List<String> list = new ArrayList<>();
        list.add("Karpuz");
        list.add("Çilek");
        list.add("Kiraz");
        return list;
    }


    public static void main(String[] args) {
        Methods methods = new Methods();

        methods.mesaj();
        System.out.println(methods.toplama(5, 10));
        System.out.println(methods.selamlama("Serhat"));
        System.out.println(methods.isPositive(-5));
        System.out.println(methods.getList());
    }
}
