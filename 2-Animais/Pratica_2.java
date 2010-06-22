/*
 * =====================================================================================
 *
 *       Filename:  Pratica_2.java
 *
 *    Description:  
 *
 *
 *        Version:  1.0
 *        Created:  17-06-2010 00:08:15
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Anderson de França Queiroz (A.F.Q.), anderson.f.queiroz(.AT,)gmail dot com
 *        Company:  Universidade Federal do ABC - UFABC
 *
 * =====================================================================================
 */

import java.util.*;

public class Pratica_2
{
	public static void main(String[] args)
	{
		System.out.println("\n\n");

		Mamifero m = new Mamifero("Willy", "Orcinus orca");
		System.out.printf("%s, um %s acaba de nascer!\n", m.get_nome(), m.get_especie());
		Mamifero mm = new Mamifero("Fliper");
		System.out.printf("%s, um %s acaba de nascer!\n", mm.get_nome(), mm.get_especie());
		System.out.println("\n");

		Ave a = new Ave("Cocó", "Gallus gallus");
		System.out.printf("%s, um %s acaba de nascer!\n", a.get_nome(), a.get_especie());
		Ave aa = new Ave ("Cocota");
		System.out.printf("%s, um %s acaba de nascer!\n", aa.get_nome(), aa.get_especie());
		System.out.println("\n");

		Reptil r = new Reptil("Lag", "Basiliscus basiliscus");
		System.out.printf("%s, um %s acaba de nascer!\n", r.get_nome(), r.get_especie());
		Reptil rr = new Reptil("Rex");
		System.out.printf("%s, um %s acaba de nascer!\n", rr.get_nome(), rr.get_especie());
		System.out.println("\n");

		m.add_amigo(mm);
		m.add_amigo(a);
		m.add_amigo(aa);
		m.add_amigo(r);
		m.add_amigo(rr);
		System.out.println("\n");

		a.add_amigo(aa);
		a.add_amigo(m);
		a.add_amigo(mm);
		a.add_amigo(r);
		a.add_amigo(rr);
		System.out.println("\n");

		r.add_amigo(rr);
		r.add_amigo(m);
		r.add_amigo(mm);
		r.add_amigo(a);
		r.add_amigo(aa);
		System.out.println("\n");


		for (int i = 0; i < 3; i++)
		{
			Mamifero mmm = new Mamifero();
			System.out.printf("%s, um %s acaba de nascer!\n", mmm.get_nome(), mmm.get_especie());
			m.add_amigo(mmm);
		}
		System.out.printf("\n%s diz:", m.get_nome());
		m.lista_amigos();
		System.out.printf("\n%s diz:", mm.get_nome());
		mm.lista_amigos();
		
		for (int i = 0; i < 3; i++)
		{
			Ave aaa = new Ave();
			System.out.printf("%s, um %s acaba de nascer!\n", aaa.get_nome(), aaa.get_especie());
			a.add_amigo(aaa);
		}
		System.out.printf("\n%s diz:", a.get_nome());
		a.lista_amigos();
		System.out.printf("\n%s diz:", aa.get_nome());
		aa.lista_amigos();

		for (int i = 0; i < 3; i++)
		{
			Reptil rrr = new Reptil();
			System.out.printf("%s, um %s acaba de nascer!\n", rrr.get_nome(), rrr.get_especie());
			r.add_amigo(rrr);
		}
		System.out.printf("\n%s diz:", r.get_nome());
		r.lista_amigos();
		System.out.printf("\n%s diz:", rr.get_nome());
		rr.lista_amigos();

		System.out.printf("\nNo mundo existem:\n");
		System.out.printf("%d Mamiferos\n", m.get_n());
		System.out.printf("%d Aves\n", a.get_n());
		System.out.printf("%d Répteis\n\n", r.get_n());
	}
}
