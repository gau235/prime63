package myTest;

import static java.lang.System.out;

import java.util.TreeSet;

/**
 * random<br/>
 * random
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=T288_GenRandomN" >T288_GenRandomN.java</a>
 *
 */
class T288_GenRandomN {

	public static void main(String[] sAry) {

		int k = 6;
		int range = 50;

		TreeSet<Integer> tSet = new TreeSet<Integer>();

		while (tSet.size() < k) {

			int rnd = (int) (Math.random() * range) + 1;
			tSet.add(rnd);

		}

		out.println("tSet=" + tSet);

	}
}