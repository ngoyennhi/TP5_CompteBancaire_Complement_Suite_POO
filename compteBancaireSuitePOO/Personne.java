package compteBancaireSuitePOO;



import java.util.Calendar;

import java.util.GregorianCalendar;

public class Personne {
// champs privés représentant le nom et prénom
	private String nom;
	private String prenom;
	// final : Une fois définie, on ne pourra plus modifier le numéro
	
	private final int numero;
	//champ statique privé représentant le compteur de Personnes
	
	private static int nbInstances;
	//date de nassance
	
	private GregorianCalendar dateDateNaissance;
	 GregorianCalendar dateDefault = new GregorianCalendar();
	
	public String getNom() {
		return nom;
	}
	/**
	 * Stoke le nom en majuscule dans l'objet
	 * @param n
	 */
	public void setNom(String n) {
		nom = n.toUpperCase();
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * Stoke le prénom on minuscule
	 * @param p
	 */
	 public void setPrenom(String p) {
		 prenom = p.toLowerCase();
	 }
	 
	 /**
	  * Méthode d'instance permettant d'obtenir le numéro d'une Personne
	  * @return
	  */
	 public int getNumero() {
		 return numero;
	 }
	 
	 /**
	  * Methode statique permettant d'obtenir le nombre d'instances créees
	  * @return
	  */
	 public static int getNbIntances() {
		 return nbInstances;
	 }
	 
	 /**
	  * Constructeur
	  * création d'une nouvelle Personne donc incrémentation du compteur affectation à la nouvelle Personne de son numéro
	  */
	 
	 public Personne() { 
		 //nbInstances est static
		 nbInstances++;
		 // numero est non-static
		 numero = nbInstances; 
	 }
	 
	 /**
	 * Nouveau constructeur
	 **/
	 //polymorphisme
	 public Personne(String nom, String prenom) {
	 this.setNom(nom);
	 this.setPrenom(prenom);
	 nbInstances++;
	 numero = nbInstances;
	 }
	 
	
	  @Override
		 public String toString() {
			 return "Personne numéro " +this.numero + "; \n Nombre total de personne: " + nbInstances;
		 }
	 
	  /**
	   * Méthode défini dans Personne
	   */

public void saisieDateDeNaissance(int anneNaissance,int moiNaissance, int jourNaissance) {
		
		//le  mois de GregorianCalendar de 0 à 11 ==  jan à dec, donc , input il faut moins 1 pour selectioner bon mois
		dateDateNaissance = new GregorianCalendar(anneNaissance, moiNaissance, jourNaissance);

}
	  //calcul l'age
	  public long calculAge() {
		return ( dateDefault.get(Calendar.YEAR) - dateDateNaissance.get(Calendar.YEAR));
			  }  
	  //afficher
	  public void affichage() {
		  System.out.println("nom " + nom);
		  System.out.println("prénom: " + prenom);
		 System.out.println("âge : " + calculAge());  
		  
	  }
}
