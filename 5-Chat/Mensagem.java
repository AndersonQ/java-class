/*
 * =====================================================================================
 *
 *       Filename:  Menssagem.java
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  13-07-2010 16:17:56
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Anderson de França Queiroz (A.F.Q.), anderson.f.queiroz(.AT,)gmail dot com
 *        Company:  Universidade Federal do ABC - UFABC
 *
 * =====================================================================================
 */

public class Mensagem
{
	private String nick;
	private Date data;
	private String msg;

	public Menssagem(String nick, String msg)
	{
		this.nick = nick;
		this.msg = msg;
		this.data = new Date()
	}

	public get_msg()
	{
		return msg;
	}

	public get_nick()
	{
		return nick;
	}

	public get_data()
	{
		return data;
	}

}

}
