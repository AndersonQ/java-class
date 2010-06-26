/*
 * =====================================================================================
 *
 *       Filename:  Cavalo.java
 *
 *    Description:  
 *
 *
 *        Version:  1.0
 *        Created:  22-06-2010 22:49:09
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Anderson de França Queiroz (A.F.Q.), anderson.f.queiroz(.AT,)gmail dot com
 *        Company:  Universidade Federal do ABC - UFABC
 *
 * =====================================================================================
 */

import static java.lang.Math.*;
import java.io.*;

public class Cavalo extends Pecas{

	public Cavalo(String name, String color, String category, int x, int y)
	{
		nome = name;
		cor = color;
		categoria = category;
		capturada = false;
		l = x;
		c = y;
	}

	public boolean move(int x, int y) throws WrongPlay
	{
		if ( hypot2(x,y) == 5)
			return true;
		else
		{
			throw new WrongPlay("Jogada inválida para " + categoria + " " + cor.substring(0, cor.length() - 2) + "o");
		}
	}

	private double hypot2(int x, int y)
	{
		return (pow( (x - l) , 2) + pow( (y - c), 2)); 
	}

}
