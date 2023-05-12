import java.util.logging.Logger;
import java.util.logging.Level;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock(23, 59, 59); //Creo una instancia de la clase clock
        Thread thread = new Thread(clock); //Creo un objeto de la clase Thread, con la clase clock como parámetro
        thread.start();

        while (true) {
            System.out.println(clock.getTiempo());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}