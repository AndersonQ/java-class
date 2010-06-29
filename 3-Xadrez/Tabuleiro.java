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
		j = 1;

		make_board();
	}

	private void make_board()
	{
		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 0; j++)
				board[i][j] = null;

		board[0][1] = new Cavalo("Cavalo_Preto", "preta", "cavalo", 0, 1);
		board[0][6] = new Cavalo("Cavalo_Preto", "preta", "cavalo"    , 0, 6);
		board[0][4] = new Rei("Rei_Preto", "preta", "rei", 0, 4);

		board[7][1] = new Cavalo("Cavalo_Branco", "branca", "cavalo"    , 7, 1);
		board[7][6] = new Cavalo("Cavalo_Branco", "branca", "cavalo"    , 7, 6);
		board[7][4] = new Rei("Rei_Branco", "branca", "rei", 7, 4);
	}

	public boolean play(int li, int ci, int lf, int cf) throws WrongPlay
	{
		Pecas p;
		boolean ok;

		p = board[li][ci];
		
		if( p == null )
			throw new WrongPlay("Não existe peça nessa posição!");

		if ( p.get_cor() != NextPlay )
			throw new WrongPlay("Não é a vez das " + p.get_cor() + "s jogar");
		try
		{
			ok = p.move(lf,cf);
		}
		catch(WrongPlay e)
		{
			System.out.println(e.PrintWrongPlay());
			ok = false;
		}
		

		if (ok == true)
		{
			board[li][ci] = null;
			board[lf][cf] = p;
			jogadas.add(new Jogadas(p, j, li, ci, lf, cf));
			j++;

			NextPlay = (NextPlay == "branca") ? "preta" : "branca";
			System.out.println( "Jogada: " + ( jogadas.get( jogadas.size() -1 ) ).print_play() );
		}

		return ok;
	}

	public void print_board()
	{
		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j <8; j++)
			{
				if (board[i][j] == null)
					System.out.printf("\t____");
				else if (board[i][j].get_categoria() == "cavalo")
					System.out.printf("\t_%s%s_", (board[i][j].get_nome()).substring(0,1), (board[i][j].get_nome()).substring(7,8));
				else if (board[i][j].get_categoria() == "rei")
					System.out.printf("\t_%s%s_", (board[i][j].get_nome()).substring(0,1), (board[i][j].get_nome()).substring(4,5));
			}
			System.out.printf("\n");
		}

	}

	public void list_moves()
	{
		for(Jogadas j : jogadas)
		{
			System.out.println(j.print_play());
		}
	}
}
