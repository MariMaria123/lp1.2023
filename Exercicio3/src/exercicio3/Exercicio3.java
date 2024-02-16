/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author silva
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int h1, m1, s1;
        int h2, m2, s2;
        Scanner s = new Scanner(System.in);
        System.out.println("Informe hora, minuto e segundo:");
        int Hi = s.nextInt();
        int Mi = s.nextInt();
        int Si = s.nextInt();
        System.out.println("Informe hora, minuto e seguno:");
        int Hf = s.nextInt();
        int Mf = s.nextInt();
        int Sf = s.nextInt();
        h2 = Hf + Hi;
        m2 = Mf + Mi;
        s2 = Sf + Si;
        if (s2 >= 60) {
            s2 -= 60;
            m2 += 1;
        }
        h1 = Hf - Hi;
        m1 = Mf - Mi;
        s1 = Sf - Si;
        if (s1 <= -1) {
            s1 += 60;
            m1 -= 1;
        }
        if (m1 <= -1) {
            m1 += 60;
            h1 -= 1;
        }
        if (h1 <= -1) {
            h1 += 24;
        }
        System.out.println("A soma dos tempos e:" + h2 + "Hora " + m2 + "Minuto " + s2 + "Segundo ");
        System.out.println("O intervalo de tempo e:" + h1 + "Hora " + m1 + "Minuto " + s1 + "Segundo ");
    }

}
