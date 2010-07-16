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
	DataOutputStream stream_out;

	ConexaoCliente(Socket novaConexcao, Fila fm)
	{
		this.novaConexao = novaConexcao;
		this.fm = fm;
	}

	public void run()
	{
		DataInputStream stream_in = null;

		boolean ok = true;
		
		try
		{
			stream_in = new DataInputStream(novaConexao.getInputStream());
			stream_out = new DataOutputStream(novaConexao.getOutputStream());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			ok = false;
		}

		while(ok != false)
		{
			try
			{
				fm.insere( new Mensagem(stream_in.readUTF() ) );
			}
			catch(Exception e)
			{
				ok = false;
			}

		}
	}

	protected void send_msg(String msg)
	{
		try
		{
			stream_out.writeUTF( msg );
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
