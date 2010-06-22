/*
 * =====================================================================================
 *
 *       Filename:  Reptil.java
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  17-06-2010 18:38:23
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Anderson de França Queiroz (A.F.Q.), anderson.f.queiroz(.AT,)gmail dot com
 *        Company:  Universidade Federal do ABC - UFABC
 *
 * =====================================================================================
 */

import java.util.ArrayList;

public class Reptil extends Animal
{
	//==============================Atributos
	static int reptil = 0;

	//==============================Construtores
	public Reptil(String name, String esp)
	{
		amigos = new ArrayList<Animal>();
		classe = "Réptil";
		nome = name;
		especie = esp;
		reptil++;
	}
	public Reptil(String name)
	{
		amigos = new ArrayList<Animal>();
		classe = "Réptil";
		nome = name;
		especie = "Desconhecido";
		reptil++;
	}
	public Reptil()
	{
		amigos = new ArrayList<Animal>();
		classe = "Réptil";
		nome = "Reptil_genérico_" + reptil++;
		especie = "Desconhecido";
	}

	//==============================add_amigo
	public void add_amigo(Animal a)
	{
		if ( a.get_classe() != "Mamifero" )
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
		return reptil;
	}

}
