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
	Fila fm;
	String nick;
	Socket novaConexao;
	int ID = 0;

	ConexaoCliente(Socket novaConexcao, int porta, Fila fm, String nick)
	{
		this.novaConexao = novaConexcao;
		this.fm = fm;
		ID++;

	}

	ConexaoCliente(Socket novaConexcao, int porta, Fila fm)
	{
		this.novaConexao = novaConexcao;
		this.fm = fm;
		this.nick = ("Alguém" + ID);
		ID++;

	}

	public void run()
	{
		DataInputStream stream_in;

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
