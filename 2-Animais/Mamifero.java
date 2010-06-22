/*
 * =====================================================================================
 *
 *       Filename:  Mamifero.java
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  17-06-2010 00:07:47
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Anderson de França Queiroz (A.F.Q.), anderson.f.queiroz(.AT,)gmail dot com
 *        Company:  Universidade Federal do ABC - UFABC
 *
 * =====================================================================================
 */

import java.util.ArrayList;

public class Mamifero extends Animal
{
	//==============================Atributos
	static int mamifero = 0;

	//==============================Construtores
	public Mamifero(String name, String esp)
	{
		amigos = new ArrayList<Animal>();
		classe = "Mamifero";
		nome = name;
		especie = esp;
		mamifero++;
	}
	public Mamifero(String name)
	{
		amigos = new ArrayList<Animal>();
		classe = "Mamifero";
		nome = name;
		especie = "Desconhecido";
		mamifero++;
	}
	public Mamifero()
	{
		amigos = new ArrayList<Animal>();
		classe = "Mamifero";
		nome = "Mamifero_genérico_" + mamifero++;
		especie = "Desconhecido";
	}

	//==============================add_amigo
	public void add_amigo(Animal a)
	{
		if ( a.get_classe() != "Réptil" )
		{
			super.add_amigo(a);
		}
		else
		{
			System.out.printf("Eu %s, um %s não gosto de %s, %s não será meu amigo!\n", nome, especie, a.get_classe(), a.get_nome());
		}
					
	}

	//==============================get_n
	public int get_n()
	{
		return mamifero;
	}

}


