import java.util.Scanner;

public class Ejm2 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        switch (num){
            case 1 ->
                System.out.println("numero 1");
            case 2->
                System.out.println("numero 2");
            case 3 ->
                System.out.println("numero 3");
            default -> System.out.println("numero no valido");

        }

    }


}
