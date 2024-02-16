/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1;

import java.util.Scanner;

/**
 *
 * @author silva
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x = 0, soma = 0, media = 0;
        double recu = 0;
        double recufinal = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite suas 3 notas:");
        for (int i = 0; i < 3; i++) {
            x = s.nextDouble();
            soma += x;
        }
        media = (soma / 3);
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado, tera que fazer recuperacao");
            System.out.println("Informe sua nota de recuperacao:");
            recu = s.nextFloat();

            recufinal = (media + recu) / 2;
            if (recufinal >= 5) {
                System.out.println("Aluno aprovado pela recuperacao");
            } else {
                System.out.println("Aluno perdeu");
            }
        }
    }

}
