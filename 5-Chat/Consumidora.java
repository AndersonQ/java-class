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
	ArrayList<ConexaoCliente> fcc;

	Consumidora(Fila fm, ArrayList<ConexaoCliente> fcc)
	{
		this.fm = fm;
		this.fcc = fcc;
	}

	public void run()
	{
		while(true)
		{
			try
			{
				Mensagem m = fm.retira();
				Date d = m.get_data();
				String msg = String.format("[%d:%d:%d] %s", d.getHours(), d.getMinutes(), d.getSeconds(), m.get_msg() );

				System.out.printf("%s", msg );

				for (ConexaoCliente c : fcc)
				{
					c.send_msg(msg);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
