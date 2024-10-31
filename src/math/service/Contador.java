package math.service;

import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Valor 1:");
        int parametroUm = scanner.nextInt();
        System.out.println("Valor 2:");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm,parametroDois);
        }catch (ParametrosInvalidosException e){
            System.out.println("O Segundo valor deve ser menor que o primeiro.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        if(parametroUm>parametroDois) throw new ParametrosInvalidosException();
        int contagem = parametroDois-parametroUm;
        for (int i = 1; i <= contagem ; i++) {
            System.out.println("Imprimindo o número " +i);
        }

    }
}