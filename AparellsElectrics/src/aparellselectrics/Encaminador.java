/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aparellselectrics;

import java.util.HashSet;

public class Encaminador extends AparatoElectrico {

    private static int NUM_MAX_CONEXIONES = 5;
    private HashSet<Conectable> listaAparatosConectables = new HashSet<>();

    public Encaminador(String numSerie, boolean tieneCorrienteElectrica) {
        super(numSerie, tieneCorrienteElectrica);
    }

    public boolean emparejar(Conectable aparato) {
        if (listaAparatosConectables.contains(aparato)) {
            System.out.println("[" + aparato.getClass().getSimpleName() + "] ja està emparejat.");
            return false;
        } else if (listaAparatosConectables.size() == NUM_MAX_CONEXIONES) {
            System.out.println("[" + aparato.getClass().getSimpleName() + "] No s'ha pogut emparejar (max conexions alcançat).");
            return false;
        } else {
            if (aparato.esPermetConnexio()) {
                aparato.establirConexio();
                System.out.println("[" + aparato.getClass().getSimpleName() + "] Aparell emparellat amb èxit.");
                listaAparatosConectables.add((Conectable) aparato);
                return true;
            }
            System.out.println("[" + aparato.getClass().getSimpleName() + "] No s'ha pogut establir la conexió (sense corrent, apagada o la interfície wifi no esta habilitada).");
            return false;
        }
    }

    public boolean desemparejar(Conectable aparato) {
        if (listaAparatosConectables.contains(aparato)) {
            aparato.llevarConexio();
            listaAparatosConectables.remove(aparato);
            System.out.println("[" + aparato.getClass().getSimpleName() + "] Aparell desemparellat amb exit.");
            return true;

        } else {

            System.out.println("[" + aparato.getClass().getSimpleName() + "] L'aparell no esta emparellat al encaminador");
            return false;
        }
    }

    public int obtindreNumeroDeDispositiusAparellatis() {
        int cantidadEmparejados = this.listaAparatosConectables.size();
        int huecosLibres = NUM_MAX_CONEXIONES - cantidadEmparejados;
        return huecosLibres;

    }

    public void llistarDispositiusAparellats() {
        for (Conectable aparato : listaAparatosConectables) {
            System.out.println(aparato);
        }

    }

    public void actualizarDispositivosEmparejados() {
        for (Conectable aparatosEmparejados : listaAparatosConectables) {
            if (aparatosEmparejados.esPermetConnexio() == false) {
                aparatosEmparejados.llevarConexio();
                listaAparatosConectables.remove(aparatosEmparejados);

            }
        }
    }

}
