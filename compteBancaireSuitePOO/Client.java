package compteBancaireSuitePOO;

public class Client extends Personne {
	
private char type;

/**
 * Détermination du type de client
 * P=> particulier
 * E=>entreprise
 * A=>administration
 * @return
 */
public char getType() {
	return type;
}

public void setType(char t) {
	this.type = t;
}


/**
* Appel au constructeur par défault de Personne
**/
public Client() {
super(); // reference au contruction de la mere Personne
}


/**
* Surchage du constructeur par défault
**/
public Client(String nom, String prenom, char type) {
// Constructeur de Personne
super(nom,prenom);  // reference au contruction de la mere Personne avec les paramettres nom et prenom
// initialisation du type de client
this.type=type; // this c'est-à-dire citer/indiquer que l'affectation doit se faire au champ de la classe uniquement
//il va prendre la variable "type" de la classe Client au lieu de chercher la variable "type" dans la classe de Parents
}


/**
 * Méthode définie dans Client
 */
@Override  //la notation @Override qui signifie que vous réécrivez la méthode affichage() du
//parent Personne. Cette méthode ne s'applique que uniquement pour la class Client. 
public void affichage() {
	
	
//	System.out.println("nom: " + getNom());
//	System.out.println("prenom: " +getPrenom());
 //au lieu de repéter print out pour nom&prenom, on appelle la méthode de la Classe Personne-Classe "parents"
	//le mot clé "super" pour appeler vraiment la méthode de la classe parents
	super.affichage();
	switch (type) {
	case 'P':
		System.out.println("type de client: Particulier");
		break;
	case 'E':
		System.out.println("type de client: Entreprise");
		break;
	case 'A':
		System.out.println("type de client: Administration");
		break;
    default:
	System.out.println("type de client: Inconnu");
	break;
		
	}
}
}
