/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoreslogicos;

/**
 *
 * @author oblaze
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Operadores lógicos
         * x && y   --> AND
         * x || y   --> OR
         * !x       --> NOT
         * x ^ y    --> XOR
         * !(x && y)--> NAND
         * !(x || y)--> NOR
         * !(x ^ y) --> XNOR
        */
        int x,y,z;
        x=4;
        y=7;
        z=12;
        boolean r;
        r = !(x<y ^ y<z)?true:false;
        System.out.println(r);
    }
    
}
