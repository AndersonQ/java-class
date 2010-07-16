/*
 * =====================================================================================
 *
 *       Filename:  chatServer.java
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  13-07-2010 17:58:37
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Anderson de França Queiroz (A.F.Q.), anderson.f.queiroz(.AT,)gmail dot com
 *        Company:  Universidade Federal do ABC - UFABC
 *
 * =====================================================================================
 */

import javax.swing.JOptionPane;

public class chatServer
{
	public static void main(String[] args)
	{
		JOptionPane j = new JOptionPane();

		int porta = Integer.parseInt( j.showInputDialog("Porta deseja usar?"));

		Servidor s = new Servidor(porta);
		s.run();
	}
}

