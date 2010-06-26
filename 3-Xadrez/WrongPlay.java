/*
 * =====================================================================================
 *
 *       Filename:  WrongPlay.java
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  25-06-2010 23:44:53
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Anderson de França Queiroz (A.F.Q.), anderson.f.queiroz(.AT,)gmail dot com
 *        Company:  Universidade Federal do ABC - UFABC
 *
 * =====================================================================================
 */

import java.io.IOException;

public class WrongPlay extends IOException
{
	public WrongPlay(String msg)
	{
		super(msg);
	}
}
