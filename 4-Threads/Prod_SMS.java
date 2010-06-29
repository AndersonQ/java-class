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
	Fila<Mensagem> f;

	public Prod_SMS(Fila f)
	{
		this.f = f;
	}

	@overrride
	public void run()
	{
		double tempo = 0.6 + ramdon() * 0.8;
		try
		{
			Tread.sleep(tempo);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}

		f.insere(new Mensagem());
	}

}


