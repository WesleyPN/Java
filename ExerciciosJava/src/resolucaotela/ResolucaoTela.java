package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("Sua tela tem resolução de "+Math.round(screenSize.getWidth())+" x "+Math.round(screenSize.getHeight()));
    }

}
