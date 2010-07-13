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
import java.util.*;
import java.io.*;


public class ConexaoCliente implements Runnable
{
	ServerSocket server;
	Fila fm;
	String nick;

	ConexaoCliente(int porta, Fila fm, String nick)
	{
		try
		{
			server = new ServerSocket(porta);
		}
		catch(Exception e)
		{
			System.out.println(e);
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
			System.out.println(e);
		}

		this.fm = fm;
		this.nick = "Nick Genérico";

	}

	public void run()
	{
		Socket novaConexao = null;
		DataInputStream stream_in;

		try
		{
			novaConexao = server.accept();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}



		while(true)
		{
			try
			{
				stream_in = new DataInputStream(novaConexao.getInputStream());
				fm.insere( new Mensagem(nick, (String) stream_in.readUTF() ) );
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

		}
	}

}
