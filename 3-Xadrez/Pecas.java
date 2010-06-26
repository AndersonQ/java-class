/*
 * =====================================================================================
 *
 *       Filename:  Pecas.java
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  18-06-2010 17:08:08
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Anderson de França Queiroz (A.F.Q.), anderson.f.queiroz(.AT,)gmail dot com
 *        Company:  Universidade Federal do ABC - UFABC
 *
 * =====================================================================================
 */

import java.io.*;

public abstract class Pecas{

	protected String nome;
	protected String cor;
	protected String categoria;
	protected int l, c;
	protected boolean capturada;

	public abstract boolean move(int x, int y) throws WrongPlay;

	public String get_nome()
	{
		return nome;
	}
	
	public String get_cor()
	{
		return cor;
	}

	public String get_categoria()
	{
		return categoria;
	}
}

