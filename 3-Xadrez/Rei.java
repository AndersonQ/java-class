/*
 * =====================================================================================
 *
 *       Filename:  Rei.java
 *
 *    Description:  
 *
 *
 *        Version:  1.0
 *        Created:  22-06-2010 23:24:09
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

public class Rei extends Pecas{

	public Rei(String name, String color, String category, int x, int y)
	{
		nome = name;
		cor = color;
		categoria = category;
		capturada = null;
		l = x;
		c = y;
	}

	public boolean move(int x, int y) throws WrongPlay
	{
		if ( hypot( (x - l), (y - c) ) < 2) //hypot( (x - l), (y - c) ) == 1 || hypot( (x - l), (y - c) ) < 2)
		{
			l = x;
			c = y;
			return true;
		}
		else
			throw new WrongPlay("Jogada inválida para " + categoria + " " + cor.substring(0, cor.length() - 2) + "o");
	}

	private double hypot2(int x, int y)
	{
		return (pow( (x - l) , 2) + pow( (y - c), 2)); 
	}
}
