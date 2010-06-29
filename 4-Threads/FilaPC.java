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

public class FilaPC extends Fila
{
	public FilaPC(int i)
	{
		super(i);
	}

	public synchronized void insere(Mensagem el) throws InterruptedException
	{
		try
		{

			if (cheia() == true)
				this.wait();
		
			super.insere(el);
		
			this.notify();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

	public Mensagem retira() throws InterruptedException
	{
		Mensagem el;

		try
		{
			if (vazia() == true)
				this.wait();

			el = (Mensagem) super.retira();

			this.notify();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
			el = null;
		}

		return el;
	}
}
