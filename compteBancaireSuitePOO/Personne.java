package compteBancaireSuitePOO;



import java.util.Calendar;

import java.util.GregorianCalendar;

public class Personne {
// champs priv�s repr�sentant le nom et pr�nom
	private String nom;
	private String prenom;
	// final : Une fois d�finie, on ne pourra plus modifier le num�ro
	
	private final int numero;
	//champ statique priv� repr�sentant le compteur de Personnes
	
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
	 * Stoke le pr�nom on minuscule
	 * @param p
	 */
	 public void setPrenom(String p) {
		 prenom = p.toLowerCase();
	 }
	 
	 /**
	  * M�thode d'instance permettant d'obtenir le num�ro d'une Personne
	  * @return
	  */
	 public int getNumero() {
		 return numero;
	 }
	 
	 /**
	  * Methode statique permettant d'obtenir le nombre d'instances cr�ees
	  * @return
	  */
	 public static int getNbIntances() {
		 return nbInstances;
	 }
	 
	 /**
	  * Constructeur
	  * cr�ation d'une nouvelle Personne donc incr�mentation du compteur affectation � la nouvelle Personne de son num�ro
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
			 return "Personne num�ro " +this.numero + "; \n Nombre total de personne: " + nbInstances;
		 }
	 
	  /**
	   * M�thode d�fini dans Personne
	   */

public void saisieDateDeNaissance(int anneNaissance,int moiNaissance, int jourNaissance) {
		
		//le  mois de GregorianCalendar de 0 � 11 ==  jan � dec, donc , input il faut moins 1 pour selectioner bon mois
		dateDateNaissance = new GregorianCalendar(anneNaissance, moiNaissance, jourNaissance);

}
	  //calcul l'age
	  public long calculAge() {
		return ( dateDefault.get(Calendar.YEAR) - dateDateNaissance.get(Calendar.YEAR));
			  }  
	  //afficher
	  public void affichage() {
		  System.out.println("nom " + nom);
		  System.out.println("pr�nom: " + prenom);
		 System.out.println("�ge : " + calculAge());  
		  
	  }
}
