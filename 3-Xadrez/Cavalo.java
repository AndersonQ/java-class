/*
 * =====================================================================================
 *
 *       Filename:  Cavalo.java
 *
 *    Description:  
 *
 *
 *        Version:  1.0
 *        Created:  22-06-2010 22:49:09
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Anderson de França Queiroz (A.F.Q.), anderson.f.queiroz(.AT,)gmail dot com
 *        Company:  Universidade Federal do ABC - UFABC
 *
 * =====================================================================================
 */

import static java.lang.Math.*;

public class Cavalo extends Pecas{

	public boolean move(int x, int y)
	{
		if ( hypot((x - l),(y - c)) == 5 )
			return true;
		else
			return false;
	}

}
