import java.util.Scanner;

// CTRL + Y (Delete Line)
// CTRL + D (Duplicate Line)
// CTRL + F8 = Create breakpoint
// SHIFT  + F9 = Debug
// CTRL + SHIFT + F10 = Run

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Double[] salariosInput = new Double[3];
        Double soma = 0.0;

        for(int i = 0; i < salariosInput.length; i++){
            System.out.print("Digite seu salário: ");
            salariosInput[i] = Double.parseDouble(sc.nextLine());
            soma += salariosInput[i];
        }

        System.out.println("Média = " + (soma / salariosInput.length));

        sc.close();
    }
}