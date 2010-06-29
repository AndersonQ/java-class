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
	protected ArrayList<Jogadas> jogadas;//Lista das jogadas realizadas
	protected Pecas [][] board;//Tabuleiro
	protected ArrayList<Pecas> capturadas;//Lista das peças capturadas
	private String NextPlay;//Cor que deve jogar
	private int j;//Conta as jogadas

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
	
		//Verifica se existe peça na posição indicada	
		if( p == null )
			throw new WrongPlay("Não existe peça nessa posição!");

		//Verifica se é a vez da cor jogar
		if ( p.get_cor() != NextPlay )
			throw new WrongPlay("Não é a vez das " + p.get_cor() + "s jogar");
		//Tenta Jogar
		//try
		//{
			ok = p.move(lf,cf);
		//}
		//catch(WrongPlay e)
		//{
			//System.out.println(e);
			//ok = false;
		//}
		
		//Se a jogada é possível
		if (ok == true)
		{
			Jogadas jo = new Jogadas(p, j, li, ci, lf, cf);
			//Verifica se ocorre captura
			if ( board[lf][cf] != null)
			{
				if ((board[lf][cf]).get_cor() != NextPlay ) //board[lf][cf] != null && (board[lf][cf]).get_cor() != NextPlay )
				{
					capturadas.add(board[lf][cf]);
					(board[lf][cf]).set_capturada(jo);
				}
				else
					throw new WrongPlay("Jogada Inválida! " + p.get_cor() + "s" + "não pode capturar peças " + (board[lf][cf]).get_cor() + "s!");
			}

			//Move as peças no tabuleiro
			board[li][ci] = null;
			board[lf][cf] = p;
			//Adiciona a jogada na lista de jogadas
			jogadas.add(jo);
			//Incrementa o contador de jogadas
			j++;

			//Decide quem é a próxima cor a jogar
			NextPlay = (NextPlay == "branca") ? "preta" : "branca";
			//Informa a jogada realizada
			System.out.println( "Jogada: " + ( jogadas.get( jogadas.size() -1 ) ).print_play() );
		}
		else
		{
			//Lança exceção caso a jogada não seja possóvel
			throw new WrongPlay("Jogada inválida para " + p.get_categoria() + " " + (p.get_cor()).substring(0, (p.get_cor()).length() - 2) + "o");
		}
		//Retorna true pata jogada efetuada e false para não efetuada
		return ok;
	}

	//============================================print_board()
	public void print_board()
	{
		for (int k = 0; k < 8; k++)
			System.out.printf("\t  %d", k);

		System.out.printf("\n");

		for (int i = 0; i < 8; i++)
		{
			System.out.print(i);
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

	public void list_capturadas()
	{
		System.out.println("Capturadas:");
		for(Pecas c : capturadas)
		{
			System.out.print(c.get_nome());
			System.out.println(" em " + c.get_capturada());
		}
	}

	public String who_play()
	{
		return NextPlay;
	}
}
