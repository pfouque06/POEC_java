package exo034_TP2_Scoring;

import java.io.ObjectInputStream.GetField;

public class Exo034_TP2_Scoring {

	static int getWinGames(int[] pScore1, int[] pScore2) {
		int win = 0;
		
		for (int index = 0; index < pScore1.length; index++) {
			if ( pScore1[index] >  pScore2[index] )
				win++;
		}
		return win;
	}
	
	static boolean isWinner(int[] pScore1, int[] pScore2) {
		boolean success = false;
		int win = getWinGames(pScore1, pScore2);

		if ( win > (pScore1.length / 2) )
				success = true;
		
		return success;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// tableau score joueur
		int[] score1 = {6,8,2,3,3,6,9,8,5,6,8,5,6,9,5,2,5,6,3,6,5,4,2,5,3,3,6,4,5,6};
		// tableau score Adversaire
		int[] score2 = {5,6,8,1,2,5,1,2,3,6,5,4,5,8,6,3,2,6,5,5,6,6,8,2,2,3,3,5,6,8};
		
		// nbre de partie gagnée
		// boucle en index sur le score avec win ++  lorsque score joueur > socre adversaire
		int win = getWinGames(score1, score2);
		System.out.println("Joueur 1 a gagné " + win + " fois.");
		if (isWinner(score1, score2))
			System.out.println("Joueur 1 est gagnant : " + win + "/"+score1.length);
		else
			System.out.println("Joueur 1 est perdant : " + win + "/"+score1.length);
		// Gagnant ?
	}

}
