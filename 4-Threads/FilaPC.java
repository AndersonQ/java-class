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
	public FilaPC()
	{
		super();
	}

	public synchronized void insere(Tipo el) throws InterruptedException
	{
		if (cheia() == true)
			this.wait();
		
		super.insere(el);
		
		this.notfy();
	}

	public Tipo retira() throws InterruptedException
	{
		Tipo el;

		if (vazia() == true)
			this.wait();

		el = super.retita();

		this.notify();

		return el;
	}

