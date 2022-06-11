package provadois.atividadequatro;

import java.util.Scanner;

/*
4. (2.0) Faça um programa que leia e armazene o salário de uma amostra de 15 trabalhadores. 
Calcule a média salarial e indique a estatística de: quantas pessoas estão abaixo dessa média,
quantas estão acima e quantas estão na média. 
 */

public class Questao4v2 {
    public static void main(String args[]) {
        int i;
        double salario[];
        salario = new double[15];
        double mediaSalarial = 0, totalSalarios = 0, salarioMaior = 0, salarioMenor = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite os salários: (Ex: 1234,56)\n");
        for (i = 0; i < salario.length; i++) {
            System.out.println((i + 1) + "º funcionário R$: ");
            salario[i] = scan.nextDouble();
            totalSalarios += salario[i];
        }

        mediaSalarial = totalSalarios / salario.length;

        System.out.printf("\nA média salarial dos 15 funcionários é de R$: %.2f", mediaSalarial);

        for (i = 0; i < salario.length; i++) {
            if (salario[i] < mediaSalarial)
                salarioMenor++;
            else if (salario[i] > mediaSalarial)
                salarioMaior++;
        }

        System.out.printf("\nAbaixo da média salarial temos: %.0f",salarioMenor);
        System.out.printf("\nAcima da média salarial temos: %.0f", salarioMaior);
        System.out.printf("\nNa média salarial temos: %.0f", salario.length - (salarioMaior + salarioMenor));
    }
}
