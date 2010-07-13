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
		boolean ok = true;
		Socket Conexao = null;
		DataOutputStream stream_out = null;
		DataInStream stream_in = null;
		
		try
		{
			Conexao = new Socket("127.0.0.1", 2010);
			stream_out = new DataOutputStream(Conexao.getOutputStream());
			stream_in = new DataInStream(Conexao.getInStream());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		JOptionPane j = new JOptionPane();

		while(ok != false)
		{
			try
			{
				stream_out.writeUTF(j.showInputDialog("Digite a mensagem que desejas enviar"));
			}
			catch(Exception e)
			{
				System.out.println(e);
				ok = false;
			}
			try
			{
				j.showMessageDialog(null, stream_in.readUTF());
			}
			catch(Exception e){}
		}

	}
}
