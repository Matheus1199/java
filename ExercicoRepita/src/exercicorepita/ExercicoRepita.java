/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author Nuvem Shop
 */
public class ExercicoRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        do {
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: \n(valor 0 interrompe)"));
        s += n;
        } while (n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final <br><hr>" +
                "<br>Somatório vale: " + s + "</html>");
    }
    
}
