package pooe01tv;
    
    public class Televisor {
    
    private int canal;
    private int volume;
    private boolean ligado;

 public Televisor() {
        canal = 1;
        volume = 0;
        ligado = false;
    }

    public void aumentarVolume() {
        if (ligado && volume < 10) {
            volume++;
        } else {
            System.out.println("Não é possível aumentar o volume.");
        }
    }

    public void reduzirVolume() {
        if (ligado && volume > 0) {
            volume--;
        } else {
            System.out.println("Não é possível reduzir o volume.");
        }
    }

    public void subirCanal() {
        if (ligado && canal < 16) {
            canal++;
        } else {
            System.out.println("Não é possível subir o canal.");
        }
    }

    public void descerCanal() {
        if (ligado && canal > 1) {
            canal--;
        } else {
            System.out.println("Não é possível descer o canal.");
        }
    }

    public void ligarTelevisor() {
        ligado = true;
    }

    public void desligarTelevisor() {
        ligado = false;
        canal = 1;
        volume = 0;
    }

    public void mostraStatus() {
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
        System.out.println("Ligado: " + (ligado ? "Sim" : "Não"));
    }
}