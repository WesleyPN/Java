/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author oblaze
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n1 = 3;
        int n2 = 5;
        float m = (n1+n2) /2;
        System.out.println("A média é igual a "+m);*/

        /*int numero = 10;
        int valor = 3 + --numero;
        System.out.println(valor);
        System.out.println(numero);*/
        
        /*int x = 4;
        x *= 2;
        System.out.println(x);*/
        
        double v = 1 + Math.random()*(60-1);
        System.out.format("Valor absoluto: %f%n",Math.abs(v));
        System.out.println("Arredonda para Baixo: "+Math.floor(v));
        System.out.println("Arredonda para Cima: "+Math.ceil(v));
        System.out.println("Arredonda Aritmeticamente: "+Math.round(v));
        
        
        
    }

}
