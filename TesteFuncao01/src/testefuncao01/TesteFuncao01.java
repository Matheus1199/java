/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao01;

/**
 *
 * @author Nuvem Shop
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    
    static void soma(int a, int b) {
        int s = a + b;
        System.out.println("A soma é " + s);
    }
    
    static int Soma (int a, int b) {
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        soma(5,2);
        int sm = Soma(7,2);
        System.out.println("a soma é " + sm);
    }
    
}
