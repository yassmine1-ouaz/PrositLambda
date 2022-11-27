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
import java.util.Objects;

public class Etudiant implements Comparable<Etudiant> {
    private int id, age ;
    private String nom;
   
    
    public Etudiant(){
        
    }
    
    public Etudiant(int id, String nom, int age){
        
        this.id=id;
        this.nom=nom;
        this.age=age;
    }
    
    
    public void setNom(String nom){
        this.nom=nom;
    }
     public void setid(int id){
        this.id=id;
    }
      public void setage(int age){
        this.age=age;
    }
      
    public int getId(){
      return id;
      }
    
    public String getNom(){
       return nom; 
    }
    
    public int getAge(){
        return age; 
    }

    
    @Override
    public String toString(){
        return ("un etudiant est caracterise par id:"+this.getId()+"et un nom :"+this.getNom()+"et un age:"+this.getAge());
        
}
   @Override
    public int compareTo(Etudiant e ) {
     return this.id-e.id;}
    }



 

