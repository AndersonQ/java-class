/*
 * =====================================================================================
 *
 *       Filename:  Consumidora.java
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  13-07-2010 17:20:13
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Anderson de França Queiroz (A.F.Q.), anderson.f.queiroz(.AT,)gmail dot com
 *        Company:  Universidade Federal do ABC - UFABC
 *
 * =====================================================================================
 */

import java.util.*;

public class Consumidora implements Runnable
{
	Fila fm;

	Consumidora(Fila fm)
	{
		this.fm = fm;
	}

	public void run()
	{
		while(true)
		{
			try
			{
				System.out.printf("%s\n", fm.retira());
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
