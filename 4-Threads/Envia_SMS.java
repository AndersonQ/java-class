/*
 * =====================================================================================
 *
 *       Filename:  Envia_SMS.java
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  29-06-2010 18:05:48
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Anderson de França Queiroz (A.F.Q.), anderson.f.queiroz(.AT,)gmail dot com
 *        Company:  Universidade Federal do ABC - UFABC
 *
 * =====================================================================================
 */

public class Envia_SMS
{
	public static void main(String[] args)
	{
		CentralSMS c = new CentralSMS();
		c.start();
	}
}
