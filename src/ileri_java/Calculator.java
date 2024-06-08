package ileri_java;

public class Calculator {

    // Toplama metodu
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Çıkarma metodu
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Çarpma metodu
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Bölme metodu
    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Bölen 0 olamaz!");
            return 0;
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("Birinci sayıyı girin: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("İkinci sayıyı girin: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("İşlem türünü seçin (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        
        double result = 0;
        
        switch (operation) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Geçersiz işlem!");
                return;
        }
        
        System.out.println("Sonuç: " + result);
    }
}
