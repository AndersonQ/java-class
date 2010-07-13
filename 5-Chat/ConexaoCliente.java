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
	Fila<Mensagem> fm;
	String nick;
	Socket novaConexao;
	static int ID = 0;

	ConexaoCliente(Socket novaConexcao, Fila fm, String nick)
	{
		this.novaConexao = novaConexcao;
		this.fm = fm;
		ID++;
	}

	ConexaoCliente(Socket novaConexcao, Fila fm)
	{
		this.novaConexao = novaConexcao;
		this.fm = fm;
		this.nick = ("Alguém " + ID);
		ID++;
	}

	public void run()
	{
		DataInputStream stream_in;

		boolean ok = true;
		while(ok != false)
		{
			try
			{
				stream_in = new DataInputStream(novaConexao.getInputStream());
				fm.insere( new Mensagem(nick, stream_in.readUTF() ) );
			}
			catch(Exception e)
			{
				//e.printStackTrace();
				ok = false;
			}

		}
	}

}
