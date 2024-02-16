/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author silva
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int quant;
        float a = 0, b = 0;
        String c = JOptionPane.showInputDialog("Informe a quantidade de livros:");
        quant = Integer.parseInt(c);
        a = (float) ((0.25 * quant) + 7.5);
        b = (float)   (2.5 + (0.5 * quant));
        if (a >b){
            JOptionPane.showMessageDialog(null, "O criterio B e a melhor escolha");
        }else{
        JOptionPane.showInternalMessageDialog(null, "O criterio A e a melhor escolha");
        }
                
    }
    
}
