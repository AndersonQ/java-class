/*
 * =====================================================================================
 *
 *       Filename:  Mensagem.java
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

import java.util.*;

public class Mensagem
{
	private String nick;
	private Steing sender;
	private String origin;
	private Date data;
	private String msg;

	public Mensagem(String nick, String msg, Steing sender, String origin)
	{
		this.nick = nick;
		this.msg = msg;
		this.sender = sender;
		this.origin = origin;
		this.data = new Date();
	}

	public String get_msg()
	{
		return msg;
	}

	public String get_nick()
	{
		return nick;
	}

	public Date get_data()
	{
		return data;
	}

}
