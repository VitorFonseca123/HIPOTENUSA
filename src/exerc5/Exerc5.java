/*
Escreva um programa que calcule e retorne o valor da hipotenusa através do 
método hipotenusa. O método deverá receber o valor da base e da altura de um triângulo.
 Fórmula: hipotenusa² = base² + altura²

 */
package exerc5;
import javax.swing.JOptionPane;
/**
 *
 * @author Vitor Fonseca
 */
public class Exerc5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base do triângulo reto"));
       // lê-se os catetos do triângulo, base e altura
       int h = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura do triângilo reto"));
        System.out.println("A hipotenusa desse triângulo é: "+hipotenusa(b, h)); //apresenta o valor de retorno do metodo hipotenusa
    }
   static double hipotenusa(int b, int h){//o metodo hipotenusa recebe os parametros b e h
       double hipotenusa = Math.sqrt((b*b)+(h*h)); // calcula o valor da hipotenusa 
       return hipotenusa; // retorna o valor da hipotenusa
   } 
}
