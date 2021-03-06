/*
 * =====================================================================================
 *
 *       Filename:  Prod_SMS.java
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  29-06-2010 17:17:03
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Anderson de França Queiroz (A.F.Q.), anderson.f.queiroz(.AT,)gmail dot com
 *        Company:  Universidade Federal do ABC - UFABC
 *
 * =====================================================================================
 */

import static java.lang.Math.*;

public class Prod_SMS implements Runnable
{
	FilaPC<Mensagem> f;
	int i = - Integer.MAX_VALUE;

	public Prod_SMS(FilaPC<Mensagem> f)
	{
		this.f = f;
	}

	public void run()
	{
		while(i < Integer.MAX_VALUE)
		{

			int tempo = 600 + (int) (random() * 800);
			try
			{
				Thread.sleep(tempo);
				f.insere(new Mensagem());
				i++;
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}

		}
	}

}


