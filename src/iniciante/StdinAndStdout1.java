package iniciante;

import java.util.Scanner;

public class StdinAndStdout1 {

    /**
     * Esse exercício solicita que seja feita a entrada de 3 numeros inteiro
     * e que cada numero seja impresso em uma linha*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        int value3 = scanner.nextInt();
        scanner.close();

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);


    }
}
