package iniciante;

import java.util.Scanner;

public class DecompondoNumerosMeli {
    public static void main(String[] args) {

        /**
         * Desenvolva um Código que devolva todos os possíveis números de 4 digitos
         * onde cada um seja menor ou igual a 'maxDigit' e a soma dos digitos de cada número gerado seja 21
         * exemplo: maxDigit=6 : 3666, 4566
         * */

        Scanner ler = new Scanner(System.in);

        int soma = 0; //variável para somar todos os dígitos


        //2º Devolver todos os possíveis números de 4 digitos(entre 1000 e 9999)
        for(int num = 0; num <= 10; num++) {
            //3º Decompor os números
            while (num > 0) {

                //1º obter módulo do número digitado:
                int modulo = num % 10;

                //2º Incrementar o módulo a variável soma:
                soma += modulo;

                //3º dividir número por 10 e atribuir ele a variável 'num'
                num /= 10;
            }
            System.out.println("o Resultado da Soma da decomposição dos números é:  "+soma);
        }


        //a soma dos digitos de cada número gerado deve ser 21
        /*if(soma == 21){
            System.out.println("A soma dos algarismos é: "+soma);
        }*/
    }
}