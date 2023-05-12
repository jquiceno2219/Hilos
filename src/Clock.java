import java.util.logging.Level;
import java.util.logging.Logger;
public class Clock implements Runnable {

    private int horas, minutos, segundos;

    public Clock(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;

    }

    public void setTiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }


    public String getTiempo() {
        String tiempo = "";

        if (horas < 10) {
            tiempo += "0" + horas;
        } else {
            tiempo += horas;
        }

        tiempo += ":";

        if (minutos < 10) {
            tiempo += "0" + minutos;
        } else {
            tiempo += minutos;
        }

        tiempo += ":";

        if (segundos < 10) {
            tiempo += "0" + segundos;
        } else {
            tiempo += segundos;
        }

        return tiempo;
    }

    @Override
    public void run() {

        String tiempo;
        try {
            while (true) {

                tiempo = "";

                if (horas < 10) {
                    tiempo += "0" + horas;
                } else {
                    tiempo += horas;
                }

                tiempo += ":";

                if (minutos < 10) {
                    tiempo += "0" + minutos;
                } else {
                    tiempo += minutos;
                }

                tiempo += ":";

                if (segundos < 10) {
                    tiempo += "0" + segundos;
                } else {
                    tiempo += segundos;
                }

                Thread.sleep(1000);

                segundos++;

                if (segundos == 60) {
                    minutos++;
                    segundos = 0;
                    if (minutos == 60) {
                        minutos = 0;
                        horas++;
                        if (horas == 24) {
                            horas = 0;
                        }
                    }
                }

            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Clock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
