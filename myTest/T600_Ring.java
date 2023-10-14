package myTest;

import static java.lang.System.out;
import static lgpl3.o.B.T;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * To reverse.<br/>
 * To reverse.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T600_Ring" >T600_Ring.java</a>
 *
 */
class T600_Ring {

	public static void main(String[] sAry) {

		Scanner sc;
		String s;

		while (T) {

			out.println("pleas input:");

			sc = new Scanner(System.in);
			s = sc.next();

			String tmp = "";
			ArrayList<String> list = new ArrayList<String>();

			int i = 0;
			for (; i < s.length(); i++) {

				tmp = s.substring(i, s.length()) + s.substring(0, i);
				out.println(tmp);
				list.add(tmp);

			}

			Collections.sort(list);
			out.println("ans=" + list.get(0));

		}
	}
}