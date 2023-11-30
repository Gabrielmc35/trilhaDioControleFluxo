import java.util.Scanner;

public class Controle {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("digite 2 valores");
        int param1 = scan.nextInt();
        int param2 = scan.nextInt();

        try {

            contar(param1, param2);

        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void contar(int param1, int param2) throws ParametrosInvalidosException {
        int total = param2 - param1;

        if (param2 > param1) {
            for (int i = 0; i <= total; i++) {
                System.out.println("Imprimindo numero " + i);
            }
        } else {
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro parametro");
        }
    }
}
