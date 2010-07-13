/*
 * =====================================================================================
 *
 *       Filename:  Consumidora.java
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  13-07-2010 17:20:13
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Anderson de França Queiroz (A.F.Q.), anderson.f.queiroz(.AT,)gmail dot com
 *        Company:  Universidade Federal do ABC - UFABC
 *
 * =====================================================================================
 */

import java.util.*;

public class Consumidora implements Runnable
{
	Fila<Mensagem> fm;

	Consumidora(Fila fm)
	{
		this.fm = fm;
	}

	public void run()
	{
		while(true)
		{
			try
			{
				Mensagem m = fm.retira();
				Date d = m.get_data();
				System.out.printf("[%d:%d:%d] %s diz:\n%s\n", d.getHours(), d.getMinutes(), d.getSeconds(), m.get_nick(), m.get_msg() );
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	private send_msg()
	{

}
