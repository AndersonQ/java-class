/*
 * =====================================================================================
 *
 *       Filename:  Xadrez.java
 *
 *    Description:  
 *
 *
 *        Version:  1.0
 *        Created:  25-06-2010 19:11:09
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Anderson de França Queiroz (A.F.Q.), anderson.f.queiroz(.AT,)gmail dot com
 *        Company:  Universidade Federal do ABC - UFABC
 *
 * =====================================================================================
 */

import java.util.*;
import java.io.*;

public class Xadrez
{
	public static void main(String [] as) throws WrongPlay
	{
		Tabuleiro t = new Tabuleiro();
		boolean exit = false;
		Scanner sc = new Scanner(System.in);
		String c;

		System.out.println("\n");
		t.print_board();
		System.out.println("\n");
		try
		{
			t.play(7,1,5,2);
			t.print_board();
			System.out.println("\n");
			t.play(0,4,1,4);
			t.print_board();
			System.out.println("\n");
			t.play(7,4,7,5);
			t.print_board();
			System.out.println("\n");
			t.play(1,4,2,3);
			t.print_board();
			System.out.println("\n");
			t.play(7,5,6,6);
			t.print_board();
			System.out.println("\n");
			t.play(2,3,3,3);
			t.print_board();
			System.out.println("\n");
			t.play(5,2,3,3);
			t.print_board();

		}
		catch (WrongPlay e)
		{
			System.out.println(e);
		}
		try
		{

			t.play(7,4,7,5);
			t.print_board();
		}
		catch (WrongPlay e)
		{
			System.out.println(e);
		}

		System.out.printf("\nLista das jogadas realizadas:\n");
		t.list_moves();
		t.list_capturadas();
		System.out.printf("\n");

		System.out.println("Continuar a jogar? [S/N]");
		c = sc.next();
		if (c.charAt(0) == 'N' || c.charAt(0) == 'n')
			exit = true;

		while (exit != true )
		{

			int li, ci, lf, cf;

			System.out.printf("%ss jogam\n", t.who_play());
			System.out.printf("Que peça deseja mover?\n");

			System.out.printf("Linha: ");
			li = sc.nextInt();
			System.out.printf("\nColuna : ");
			ci = sc.nextInt();

			System.out.printf("Para onde?\n");
			System.out.printf("Linha: ");
			lf = sc.nextInt();
			System.out.printf("\nColuna : ");
			cf = sc.nextInt();

			try
			{
				t.play(li,ci,lf,cf);
				t.list_capturadas();
			}
			catch(WrongPlay e )
			{
				System.out.println(e);
			}
			t.print_board();

			System.out.println("Continuar a jogar? [S/N]");
			c = sc.next();
			if (c.charAt(0) == 'N' || c.charAt(0) == 'n')
				exit = true;

		}

	}
}

