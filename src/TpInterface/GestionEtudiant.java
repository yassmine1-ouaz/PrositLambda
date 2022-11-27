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
import java.awt.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;


  public interface GestionEtudiant {

    public void afficherEtudiants(List<Etudiant> etudiants,Consumer<Etudiant> consumer);

    public void afficherEtudiantSelonFiltre(List<Etudiant> etudiants,Predicate<Etudiant> predicate, Consumer<Etudiant> cons);

    public String afficherNomEtudiant(List<Etudiant> etudiants,Function<Etudiant, String>f);

    public Etudiant creeEtudiant(Supplier<tudiant> supp);

    public Stream convertListStream(List<Etudiant> l);
    }
