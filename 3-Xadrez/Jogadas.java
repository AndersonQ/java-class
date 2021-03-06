/*
 * =====================================================================================
 *
 *       Filename:  Jogadas.java
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  25-06-2010 19:00:26
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Anderson de França Queiroz (A.F.Q.), anderson.f.queiroz(.AT,)gmail dot com
 *        Company:  Universidade Federal do ABC - UFABC
 *
 * =====================================================================================
 */

import java.util.Date;

public class Jogadas
{
	private Pecas p;
	private int j;
	private String tempo;
	private int li, ci, lf, cf;

	public Jogadas(Pecas p, int j, int li, int ci, int lf, int cf)
	{
		Date d = new Date();
		this.p = p;
		this.j = j;
		this.tempo = this.tempo.format("%d/%d/%d %d:%d:%d", d.getDate(), d.getMonth(), d.getYear() + 1900, d.getHours(), d.getMinutes(), d.getSeconds());
		this.li = li;
		this.ci = ci;
		this.lf = lf;
		this.cf = cf;
	}

	public String print_play()
	{
		String s = new String();
		s = s.format("%d°: %s de (%d,%d) para (%d,%d) em %s", j, p.get_nome(), li, ci, lf, cf, tempo);
		return s;
	}
}


