/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aparellselectrics;

/**
 *
 * @author batoi
 */
public class Dispositivo extends AparatoElectrico implements Activable, Conectable {

    private boolean conectadoAInternet;

    public Dispositivo(String numSerie, boolean tieneCorrienteElectrica) {
        super(numSerie, tieneCorrienteElectrica);
        this.conectadoAInternet = false;
    }

    public Dispositivo(boolean conectadoAInternet, String numSerie, boolean tieneCorrienteElectrica) {
        super(numSerie, tieneCorrienteElectrica);
        this.conectadoAInternet = conectadoAInternet;
    }

    public boolean isConectadoAInternet() {
        return conectadoAInternet;
    }

    public String internet() {
        if (this.conectadoAInternet) {
            return " Connectat a Internet, ";
        } else {
            return " No connectat a Internet, ";
        }

    }

    @Override

    public void activar() {
        setEstaEncendido(true);
        System.out.println("Aparell encès.");
    }

    @Override
    public void desactivar() {
        setEstaEncendido(false);
        System.out.println("Aparell desactivat");
    }
    
    
    
    
    
      @Override
    public boolean esPermetConnexio() {
        if(super.isEstaEncendido()){
        return true;
        }
        
        return false;
    }

    @Override
    public void establirConexio() {
      if(esPermetConnexio()){
          conectadoAInternet=true;
          System.out.println("Conexio estableïda");
      }  
    }

    @Override
    public void llevarConexio() {
        conectadoAInternet= false;
    }
}
