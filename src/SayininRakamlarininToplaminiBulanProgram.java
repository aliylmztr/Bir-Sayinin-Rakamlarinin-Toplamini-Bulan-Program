import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        int number = input.nextInt();

        int numberOfDigits = 0;
        int tempNumber = number;
        int valueOfDigits;
        int total = 0;

        while (tempNumber != 0) {
            tempNumber /= 10;
            numberOfDigits++;
        }
        tempNumber = number;
        while (tempNumber != 0) {
            valueOfDigits = tempNumber % 10;
            total += valueOfDigits;
            tempNumber /= 10;
        }
        System.out.println("Girilen sayının rakamlarının toplamı = " + total);
    }
}
