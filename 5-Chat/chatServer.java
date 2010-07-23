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

public class chatServer
{
	public static void main(String[] args)
	{
		Servidor s = new Servidor(2010);
		s.run();
	}
}

