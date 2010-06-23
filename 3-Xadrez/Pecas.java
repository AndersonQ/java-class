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

public abstract class Pecas{

	String nome;
	String cor;
	String categoria;
	short x, y;
	boolean capturada;

	public abstract boolean move(int x, int y);
}

