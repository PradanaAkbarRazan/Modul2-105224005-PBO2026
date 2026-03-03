import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Celcius: ");
        double celsius = input.nextDouble();

        System.out.printf("Fahrenheit: %.2f\n", (celsius*9/5)+32);
        System.out.printf("Kelvin: %.2f\n", celsius+273.15);
        System.out.printf("Reamur: %.2f\n", celsius*4/5);
    }
}