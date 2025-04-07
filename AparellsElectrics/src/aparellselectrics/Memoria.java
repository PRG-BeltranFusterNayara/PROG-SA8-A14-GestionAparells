/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package aparellselectrics;

/**
 *
 * @author batoi
 */
public enum Memoria {
        M64 {

        public String toString() {
            return "64";
        }

    }, M128{

        public String toString() {
            return "128";
        }

    }, M256 {

        public String toString() {
            return "256";
        }

    }, M512{
        public String toString(){
            return "512";
        }
    
    }, M1{
        public String toString(){
            return "1Gb";
        }
        
    }, M2{
        public String toString(){
            return "2Gb";
        }
    }
}
