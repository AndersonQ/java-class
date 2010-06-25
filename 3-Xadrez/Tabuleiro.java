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

		//make_board();
	}
}


	
