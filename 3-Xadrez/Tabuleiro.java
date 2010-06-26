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
	private Date d;
	private String NextPlay;
	private int j;

	public Tabuleiro()
	{
		jogadas = new ArrayList<Jogadas>();
		board = new Pecas[8][8];
		capturadas = new ArrayList<Pecas>();
		d = new Date();
		NextPlay = "branca";
		j = 0;

		make_board();
	}

	private void make_board()
	{
		board[0][1] = new Cavalo("Cavalo_Preto1", "preto", "cavalo", 0, 1);
		board[0][6] = new Cavalo("Cavalo_Preto2", "preto", "cavalo"    , 0, 6);
		board[0][4] = new Rei("Rei_Preto", "preto", "rei", 0, 4);

		board[7][1] = new Cavalo("Cavalo_Branco1", "branco", "cavalo"    , 7, 1);
		board[7][6] = new Cavalo("Cavalo_Branco2", "branco", "cavalo"    , 7, 6);
		board[0][4] = new Rei("Rei_Preto", "preto", "rei", 7, 4);
}


	
