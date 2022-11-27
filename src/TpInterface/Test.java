/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TpInterface;

/**
 *
 * @author octanet
 */

import java.util.ArrayList;
import java.util.List;

public class Test {
   
    public static void main (String args []){
        
        
        Etudiant e1 = new Etudiant(1, 25, "Yassmine");
        Etudiant e2 = new Etudiant(2, 20, "Mohammed");
        Etudiant e3 = new Etudiant(3, 35, "Ahmed");
       
        List<Etudiant> e = new ArrayList<Etudiant>();

        e.add(e1);
        e.add(e2);
        e.add(e3);
        
         
        
        
    }
}
