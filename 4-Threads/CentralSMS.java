/*
 * =====================================================================================
 *
 *       Filename:  CentralSMS.java
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  29-06-2010 17:52:54
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Anderson de França Queiroz (A.F.Q.), anderson.f.queiroz(.AT,)gmail dot com
 *        Company:  Universidade Federal do ABC - UFABC
 *
 * =====================================================================================
 */

public class CentralSMS
{
	FilaPC<Mensagem> f;

	public CentralSMS()
	{
		f = new FilaPC<Mensagem>(100);
	}

	public void start()
	{
		Cons_SMS c = new Cons_SMS(f);
		Cons_SMS c1 = new Cons_SMS(f);

		Prod_SMS p1 = new Prod_SMS(f);
		Prod_SMS p2 = new Prod_SMS(f);
		Prod_SMS p3 = new Prod_SMS(f);

		Thread C = new Thread(c);
		Thread C1 = new Thread(c1);

		Thread P1 = new Thread(p1);
		Thread P2 = new Thread(p2);
		Thread P3 = new Thread(p3);

		P1.start();
		P2.start();
		P3.start();

		C.start();
		C1.start();
	}
}
