/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author silva
 */
public class Exercicio4 {

    public static int digitos(int i, int x) {
        if (x == 0) {
            return 1;
        } else {
            while (x != 0) {
                i++;
                x /= 10;
            }
            return i;
        }
    }

    public static void main(String[] args) {
        int i = 0, x, a;
        String s = JOptionPane.showInputDialog("Digite um numero:");
        x = Integer.parseInt(s);
        if (x <= -1) {
            JOptionPane.showMessageDialog(null, "inválido");
        } else {
            a = digitos(i,x);
            JOptionPane.showMessageDialog(null, "A quantidade de digitos e:" + a);
        }
    
    }

}
