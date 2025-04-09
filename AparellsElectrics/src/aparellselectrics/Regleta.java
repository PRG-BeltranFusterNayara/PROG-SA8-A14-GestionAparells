package aparellselectrics;

import java.util.HashSet;

public class Regleta {

    public static int NUM_MAX_APARELLS = 10;
    private HashSet<Endollable> aparatos = new HashSet<Endollable>();

    public boolean endollar(Endollable aparato) {
        if (aparatos.contains(aparato)) {
            System.out.println("[" + aparato.getClass().getSimpleName() + "] ja està endollat.");
            return false;
        } else if (aparatos.size() == NUM_MAX_APARELLS) {
            System.out.println("[" + aparato.getClass().getSimpleName() + "] no puc endollarse ja ni han 10 aparells endollat " + "s.");
            return false;
        } else {
            aparato.donarEnergia();
            System.out.println("[" + aparato.getClass().getSimpleName() + "] Aparell endollat");
            aparatos.add((Endollable) aparato);
            return true;
        }

    }

    public boolean desendollar(Endollable aparato) {
        if (aparatos.contains(aparato)) {
            aparato.llevarEnergia();
            aparatos.remove(aparato);
            System.out.println("[" + aparato.getClass().getSimpleName() + "] Aparell desendollat");
            return true;

        } else {
            
            System.out.println("[" + aparato.getClass().getSimpleName() + "] L'aparell no esta endollat a la regleta");
            return false;
        }

    }

    public int obtenirNumeroEnchufesLibres() {
        int cantidadHuecosDisponibles= this.aparatos.size();
        int enchufesLibres= NUM_MAX_APARELLS- cantidadHuecosDisponibles;
        
        return enchufesLibres;
    }

    public void llistarConnectats() {
        for (Endollable aparato : aparatos) {
        System.out.println(aparato);
        }
    }

}
