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
		try
		{
			Conexao = new Socket("127.0.0.1", 2010);
			stream_out = new DataOutputStream(Conexao.getOutputStream());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		JOptionPane j = new JOptionPane();

		while(true)
		{
			try
			{
				stream_out.writeUTF(j.showInputDialog("Digite a mensagem que desejas enviar"));
			}
			catch(Exception e)
			{
				System.out.println(e);
				break;
			}
		}

	}
}
