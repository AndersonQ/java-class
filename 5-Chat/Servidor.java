/*
 * =====================================================================================
 *
 *       Filename:  Servidor.java
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  13-07-2010 17:15:56
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Anderson de França Queiroz (A.F.Q.), anderson.f.queiroz(.AT,)gmail dot com
 *        Company:  Universidade Federal do ABC - UFABC
 *
 * =====================================================================================
 */

import java.net.*;

public class Servidor
{
	Fila<Mensagem> fm;
	ServerSocket server;

	public Servidor(int num)
	{
		try
		{
			server = new ServerSocket(num);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		fm = new Fila<Mensagem>(1000);
	}

	public void run()
	{
		Consumidora c1 = new Consumidora(fm);
		Thread t1 = new Thread(c1);

		t1.run();

		while(true)
		{
			ConexaoCliente cc = null;
			try
			{
				cc = new ConexaoCliente(server.accept(), fm);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

			Thread t2 = new Thread(cc);
			t2.run();
		}
	}
}
