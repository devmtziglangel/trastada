import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = screenSize.width;
        int alto = screenSize.height;

        //Realiza aquí el bucle para abrir las ventanas que quieras (recomiendo for)

        int ventanaAncho = 200;
        int ventanaAlto = 150;

        for (int x = 0; x<ancho; x+=ventanaAncho){ // eje x
            for(int y = 0; y<alto; y+=ventanaAlto){ // eje y
                trastada(x,y,0);
            }
        }

        //Aquí deberás hacer otro bucle para que el usuario acierte el número (recomiendo do-while)
        Scanner sc = new Scanner(System.in);
        int intento;
        int numeroScreto = (int)(Math.random()*10)+1;
        System.out.println("Adivina el numero del 1 al 10 para cerrar las ventas");
        do {

            intento = sc.nextInt();
            if (intento>numeroScreto){
                System.out.println("El numero screto es menor");
            }else if (intento<numeroScreto){
                System.out.println("el nmero secreto es mayor ");
            }else {
                System.out.println("NICE!!");
                System.exit(0);
                System.out.println("Te ha llevo " + intento +" intentos");
            }
        } while (numeroScreto!=intento);


        //Para cerrar todas las ventanas y finalizar el programa descomenta la siguiente linea
        System.exit(0);
    }

    public static void trastada(int ancho, int alto, int i){
        JFrame frame = new JFrame("¡Ups!");
        frame.setSize(200, 100);

        // Colocar en posición aleatoria dentro de los límites
        int x = (int) (Math.random() * (ancho - frame.getWidth()));
        int y = (int) (Math.random() * (alto - frame.getHeight()));
        frame.setLocation(x, y);

        if(i%2 == 0){
            frame.add(new JLabel("Tu PC tiene sueño... 😴", SwingConstants.CENTER));
        }else {
            frame.add(new JLabel("Tu PC está pensando... 🤔", SwingConstants.CENTER));
        }

        frame.setVisible(true);
    }
}