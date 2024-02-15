import java.util.Scanner;

public class Numar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int numar = scanner.nextInt();
        
        if (numar > 0) {
            System.out.println("pozitiv"+ " " + numar);
        } else if (numar < 0) {
            System.out.println("negativ"+" "+ numar);
        } else {
            System.out.println("zero" + " " + numar);
        }
        
        scanner.close();
    }
}
