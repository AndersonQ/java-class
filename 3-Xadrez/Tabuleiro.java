/*
 * =====================================================================================
 *
 *       Filename:  Tabuleiro.java
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  25-06-2010 18:54:18
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Anderson de França Queiroz (A.F.Q.), anderson.f.queiroz(.AT,)gmail dot com
 *        Company:  Universidade Federal do ABC - UFABC
 *
 * =====================================================================================
 */

import java.util.Date;
import java.util.ArrayList;

public class Tabuleiro
{
	protected ArrayList<Jogadas> jogadas;
	protected Pecas [][] board;
	protected ArrayList<Pecas> capturadas;
	private String NextPlay;
	private int j;

	public Tabuleiro()
	{
		jogadas = new ArrayList<Jogadas>();
		board = new Pecas[8][8];
		capturadas = new ArrayList<Pecas>();
		NextPlay = "branca";
		j = 0;

		make_board();
	}

	private void make_board()
	{
		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 0; j++)
				board[i][j] = null;

		board[0][1] = new Cavalo("Cavalo_Preto1", "preta", "cavalo", 0, 1);
		board[0][6] = new Cavalo("Cavalo_Preto2", "preta", "cavalo"    , 0, 6);
		board[0][4] = new Rei("Rei_Preto", "preta", "rei", 0, 4);

		board[7][1] = new Cavalo("Cavalo_Branco1", "branca", "cavalo"    , 7, 1);
		board[7][6] = new Cavalo("Cavalo_Branco2", "branca", "cavalo"    , 7, 6);
		board[0][4] = new Rei("Rei_Preto", "preta", "rei", 7, 4);
	}

	public boolean play(int li, int ci, int lf, int cf) throws WrongPlay
	{
		Pecas p;
		boolean ok;

		p = board[li][ci];
		
		if ( p.cor != NextPlay )
			throw new WrongPlay("Não é a vez das " + p.cor + "s jogar");
		try{
		ok = p.move(lf,cf);}
		catch(WrongPlay e){
		ok = false;}
		

		if (ok == true)
		{
			board[li][ci] = null;
			board[lf][cf] = p;
			jogadas.add(new Jogadas(p, j, li, ci, lf, cf));
			j++;
		}


		return ok;
	}
}
