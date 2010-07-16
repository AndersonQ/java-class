/*
 * =====================================================================================
 *
 *       Filename:  Cliente.java
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  13-07-2010 18:01:49
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Anderson de França Queiroz (A.F.Q.), anderson.f.queiroz(.AT,)gmail dot com
 *        Company:  Universidade Federal do ABC - UFABC
 *
 * =====================================================================================
 */

import javax.swing.JOptionPane;
import java.net.*;
import java.io.*;

public class Cliente
{
	public static void main(String[] args)
	{
		Socket Conexao = null;
		DataOutputStream stream_out = null;
		DataInputStream stream_in = null;
		JOptionPane j = new JOptionPane();
		int porta;
		String msg, nick, ip;

		nick = j.showInputDialog("Qual o seu nick?");
		ip = j.showInputDialog("Qual o ip do servidor?");
		porta = Integer.parseInt( j.showInputDialog("Porta deseja usar?"));

		try
		{
			Conexao = new Socket(ip, porta);
			stream_out = new DataOutputStream(Conexao.getOutputStream());
			stream_in = new DataInputStream(Conexao.getInputStream());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		while(true)
		{
			try
			{
				msg = j.showInputDialog("Digite a mensagem que desejas enviar");
				if (msg == null) break;
				msg = String.format(" %s diz:\n%s", nick, msg);
				stream_out.writeUTF(msg);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			try
			{
				j.showMessageDialog(null, stream_in.readUTF());
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}
}
