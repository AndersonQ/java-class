/*
 * =====================================================================================
 *
 *       Filename:  Ave.java
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  17-06-2010 18:01:31
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Anderson de França Queiroz (A.F.Q.), anderson.f.queiroz(.AT,)gmail dot com
 *        Company:  Universidade Federal do ABC - UFABC
 *
 * =====================================================================================
 */

import java.util.ArrayList;

public class Ave extends Animal
{
	//==============================Atributos
	static int ave = 0;

	//==============================Construtores
	public Ave(String name, String esp)
	{
		amigos = new ArrayList<Animal>();
		classe = "Ave";
		nome = name;
		especie = esp;
		ave++;
	}
	public Ave(String name)
	{
		amigos = new ArrayList<Animal>();
		classe = "Ave";
		nome = name;
		especie = "Desconhecido";
		ave++;
	}
	public Ave()
	{
		amigos = new ArrayList<Animal>();
		classe = "Ave";
		nome = "Ave_genérica_" + ave++;
		especie = "Desconhecido";
	}

	//==============================get_n
	public int get_n()
	{
		return ave;
	}

}

