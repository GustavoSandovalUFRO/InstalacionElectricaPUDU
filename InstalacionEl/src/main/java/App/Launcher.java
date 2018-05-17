/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import modelo.Aparato;
import modelo.InstalacionElectrica;

/**
 *
 * @author Viktor
 */
public class Launcher {
    
    public static void main(String[] args) {
       
        Aparato ap = new Aparato(1000.0,1.0,"Plancha","LG");
        Aparato ap2 =new Aparato(675.0,1.0,"Aspiradora","Samsung");
        Aparato ap3 =new Aparato(760.0,1.0,"Televisor","Sony");
        
        InstalacionElectrica inst = new InstalacionElectrica();
        inst.conectarAparato(ap);
        inst.conectarAparato(ap2);
        inst.conectarAparato(ap3);
        inst.calcularConsumoTotal();
      //  inst.obtenerConsumoTotal();
        System.out.println(inst);
   
    }
}
