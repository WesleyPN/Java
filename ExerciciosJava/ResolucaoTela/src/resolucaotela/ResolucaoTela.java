
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {


    public static void main(String[] args) {
        Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();
        int altura = Math.round(tamanhoTela.height);
        int largura = Math.round(tamanhoTela.width);
        System.out.println("Sua resolução é "+largura+" x "+altura);
    }
    
}
