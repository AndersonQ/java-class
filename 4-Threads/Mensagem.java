/*
 * =====================================================================================
 *
 *       Filename:  Mensagem.java
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  29-06-2010 16:25:56
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Anderson de França Queiroz (A.F.Q.), anderson.f.queiroz(.AT,)gmail dot com
 *        Company:  Universidade Federal do ABC - UFABC
 *
 * =====================================================================================
 */

import static java.lang.Math.*;

public class Mensagem
{
	private static int IDcont = 0;
	private int ID;
	private int Orig_Cel;
	private int Dest_Cel;
	private String msg;

	public Mensagem(int Orig_Cel, int Dest_Cel, String msg)
	{
		this.ID = IDcont;
		this.Orig_Cel = Orig_Cel;
		this.Dest_Cel = Dest_Cel;
		this.msg = msg;
		IDcont++;
	}

	public Mensagem()
	{
		this.ID = IDcont;
		this.Orig_Cel = (int) (random() *100000000);
		this.Dest_Cel = (int) (random() *100000000);
		this.msg = "Mensagem aleatória " + ID;
		IDcont++;
	}

	public String get_msg()
	{
		return msg;
	}
}
