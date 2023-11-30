package pooe01tv;

public class TesteTelevisor {

       public static void main(String[] args) {
        Televisor tv = new Televisor();

        tv.mostraStatus();

        tv.ligarTelevisor();
        tv.aumentarVolume();
        tv.subirCanal();
        tv.mostraStatus();

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.mostraStatus();

        tv.descerCanal();
        tv.reduzirVolume();
        tv.mostraStatus();

        tv.desligarTelevisor();
        tv.mostraStatus();
    }
}