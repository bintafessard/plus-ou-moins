import java.util.Random;
import java.util.Scanner;

public class Principale {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int nb = 0, nbTentative = 0, reponse = 0, niveau = 0, nbMaxTentative =0, nombreAleatoire = 0;
		int nbJoueur = 0;
		int nbMystere = 0; 
		int nbMystereMax = 0;
		Random rand = new Random(); 
	    
		do{
			System.out.println("Saisir le nombre de joueur (1 ou 2) : ");
			nbJoueur = clavier.nextInt();			
			
			System.out.println("1 = entre 1 et 100 (nombre coups max : 6)"); 
			System.out.println("2 = entre 1 et 1000 (nombre coups max : 12)"); 
			System.out.println("3 = entre 1 et 10000 (nombre coups max : 18)"); 
			niveau = clavier.nextInt();
			if(niveau == 1){
				nbMaxTentative = 6;
				nbMystereMax = 100;
			} else if(niveau == 2){
				nbMaxTentative = 12;
				nbMystereMax = 1000;
			} else if(niveau == 3){
				nbMaxTentative =18;
				nbMystereMax = 10000;
			}
			
			if(nbJoueur == 1){
				nbMystere = nombreAleatoire = rand.nextInt(nbMystereMax) + 1;   
				System.out.println("nombre mystere = "+nbMystere);
			} else {
				System.out.print("Joueur 1 : Saisir le nombre mystere : ");
				nbMystere = clavier.nextInt();
			}
					
			nbTentative = 0;

			for (int i = 0; i < 80; i++) {
				System.out.println();
			}

			do{
				System.out.print("Joueur 2, devinez le nombre mystere : ");
				nb = clavier.nextInt();
				nbTentative++;
				if(nb<nbMystere){
					System.out.println("C'est plus");
				}
				else if(nb>nbMystere){
					System.out.println("C'est moins");
				}
			}while(nb != nbMystere && nbTentative < nbMaxTentative);

			if(nb == nbMystere){
				System.out.println("Joueur 2 - vous avez gagne");
			}
			else {
				System.out.println("Joueur 2 - vous avez perdu");
			}

			System.out.println("Pour rejouer tapez 1, sinon 0");
			reponse = clavier.nextInt();
		}while(reponse == 1);

	}

}
