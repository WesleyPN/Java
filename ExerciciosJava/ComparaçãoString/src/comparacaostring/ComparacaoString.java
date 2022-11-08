package comparacaostring;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author oblaze
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Wesley";
        String nome2 = "Wesley";
        String nome3 = new String("Wesley");
        String res;
        res = (nome1.equalsIgnoreCase(nome3))?"igual":"diferente";
        System.out.println(res);
        
    }
    
}
