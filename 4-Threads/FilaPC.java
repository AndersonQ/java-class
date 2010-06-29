/*
 * =====================================================================================
 *
 *       Filename:  FilaPC.java
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  29-06-2010 16:37:44
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Anderson de França Queiroz (A.F.Q.), anderson.f.queiroz(.AT,)gmail dot com
 *        Company:  Universidade Federal do ABC - UFABC
 *
 * =====================================================================================
 */

public class FilaPC<Tipo> extends Fila<Tipo>
{
	public FilaPC(int i)
	{
		super(i);
	}

	public synchronized void insere(Tipo el) throws InterruptedException
	{
		try
		{
			if (cheia())
				this.wait();
		
			super.insere(el);
		
			this.notify();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

	public synchronized Tipo retira() throws InterruptedException
	{
		Tipo el;

		try
		{
			if (vazia())
				this.wait();

			el = super.retira();

			this.notifyAll();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
			el = null;
		}

		return el;
	}
}
