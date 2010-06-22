/*
 * =====================================================================================
 *
 *       Filename:  Animal.java
 *
 *    Description:  
 *
 *
 *        Version:  1.0
 *        Created:  17-06-2010 00:06:03
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Anderson de França Queiroz (A.F.Q.), anderson.f.queiroz(.AT,)gmail dot com
 *        Company:  Universidade Federal do ABC - UFABC
 *
 * =====================================================================================
 */

import java.util.ArrayList;

public abstract class Animal
{
	protected String classe;
	protected String especie;
	protected String nome;
	protected ArrayList<Animal> amigos;

	//==============================Métodos Abstratos
	public abstract int get_n();

	//==============================add_amigo
	public void add_amigo(Animal a)
	{
		amigos.add(a);
		System.out.printf("Eu, %s aceito %s como novo amigo!\n", nome, a.get_nome());
	}

	//==============================lista_amigos
	public void lista_amigos()
	{
		if (amigos.size() == 0)
		{
			System.out.printf("Eu não tenho Amigos!\n");
			return;
		}
		System.out.printf("\nOs meus amigos são:\n");
		for (Animal  a:amigos)
		{
			System.out.printf("%s\n", a.get_nome());
		}
	}

	//==============================get_classe
	public String get_classe()
	{
		return classe;
	}
	
	//==============================get_nome
	public String get_nome()
	{
		return nome;
	}

	//==============================get_especie
	public String get_especie()
	{
		return especie;
	}
}
