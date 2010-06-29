/*
 * =====================================================================================
 *
 *       Filename:  Cons_SMS.java
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  29-06-2010 17:35:52
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Anderson de França Queiroz (A.F.Q.), anderson.f.queiroz(.AT,)gmail dot com
 *        Company:  Universidade Federal do ABC - UFABC
 *
 * =====================================================================================
 */

import static java.lang.Math.*;

public class Cons_SMS implements Runnable
{
	FilaPC<Mensagem> f;

	public Cons_SMS(FilaPC<Mensagem> f)
	{
		this.f = f;
	}

	public void run()
	{
		Mensagem m = null;

		while(true)
		{
		int tempo = 200 + (int) (random() * 600);

		try
		{
			Thread.sleep(tempo);
			m = (Mensagem) f.retira();
			System.out.println(m + " Enviada para o celular " + m.get_Dest_cel());
		}
		catch (InterruptedException e)
		{
			System.out.println(e);
			return;
		}

		}
	}
}

