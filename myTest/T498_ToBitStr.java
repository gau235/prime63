package myTest;

import static java.lang.System.out;

import lgpl3.o.O;

/**
 * 10 to 2.<br/>
 * 10 to 2.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T498_ToBitStr" >T498_ToBitStr.java</a>
 *
 */
class T498_ToBitStr {

	static void bitPattern(int n) {

		String s = "";

		for (int i = 1; i <= 32; i++) {

			if (n % 2 == 0)
				s = "0" + s;

			else
				s = "1" + s;

			n /= 2;

		}

		O.l("n=" + s);

		/////////////////////////////////////
		// for (int i = 0; i < s.length(); i++)
		// out.println("substring=" + s.substring(i, i + 1));
		/////////////////////////////////////

		String retS = "";

		int iUnder = 1;
		for (int i = 0; i < s.length(); i++) {

			retS += s.substring(i, i + 1);

			if (iUnder++ % 8 == 0 && i < 31)
				retS += "_";

		}

		out.println("retS=" + retS);

	}

	public static void main(String[] sAry) {

		bitPattern(13);
	}
}