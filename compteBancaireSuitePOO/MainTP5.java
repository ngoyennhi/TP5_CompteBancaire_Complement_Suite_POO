package compteBancaireSuitePOO;

public class MainTP5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Client c = new Client("CHATON","Marina",'P');
c.saisieDateDeNaissance(1988, 12, 9); //saisir date de naissance de Client
//c.setNom("CHATON");
//c.setPrenom("Marina");
//c.setType('P');// Type char, la lettre est entre ' '
//afficher par la methode affichage de classe Personne
//System.out.println(c);
//afficher par la methode affichage de classe Client
c.affichage();
	}
}

