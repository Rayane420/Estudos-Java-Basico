package src.main.java.iniciante;

import java.util.Scanner;

public class DecompondoNumeros {
    public static void main(String[] args) {

        /**
         * O código deverá ler um número e somar cada digito presente nele
         * exemplo: 145
         * a saída deverá ser: 10 (1+4+5)
         * */
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int num = ler.nextInt();
        int soma = 0; //variável para somar todos os dígitos

        while (num > 0){
            //1º obter módulo do número digitado:
            int modulo = num % 10;

            //2º Incrementar o módulo a variável soma:
            soma+=modulo;

            //3º dividir número por 10 e atribuir ele a variável 'num'
            num /= 10;

            System.out.println("::::" + soma);
        }
        System.out.println("A soma dos algarismos é:" + soma);


    }
}