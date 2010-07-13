/*
 * =====================================================================================
 *
 *       Filename:  ConexaoCliente.java
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  13-07-2010 16:23:48
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Anderson de França Queiroz (A.F.Q.), anderson.f.queiroz(.AT,)gmail dot com
 *        Company:  Universidade Federal do ABC - UFABC
 *
 * =====================================================================================
 */

import java.net.*;


public class ConexaoCliente implements Thread
{
	ServerSocket server;
	Fila fm;
	String nick

	ConexaoCliente(int porta, Fila fm, String nick)
	{
		try
		{
			server = new ServerSocket(porta);
		}
		catch(Exception e)
		{
			Sytem.out.println(e);
		}

		this.fm = fm;

	}

	ConexaoCliente(int porta, Fila fm)
	{
		try
		{
			server = new ServerSocket(porta);
		}
		catch(Exception e)
		{
			Sytem.out.println(e);
		}

		this.fm = fm;
		this.nick = "Nick Genérico";

	}

	public run()
	{
		Socket novaConexao = server.accept();
		DataInputStrean strean_in;

		while(true)
		{
			strean_in = new DataInputStream(novaConexao.getImputStream());
			fm.insere( new Menssagem(nick, stream_in.readUTF(), nick );

		}
	}

}


