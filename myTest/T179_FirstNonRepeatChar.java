package myTest;

import static java.lang.System.out;

/**
 * FirstNonRepeatChar.<br/>
 * FirstNonRepeatChar
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T179_FirstNonRepeatChar" >
 *          T179_FirstNonRepeatChar.java</a>
 *
 */
class T179_FirstNonRepeatChar {

	public static void main(String[] sAry) {

		String s = "nissian";
		int[] ary = new int[128];

		for (int i = 0; i < s.length(); i++) {

			int c = s.charAt(i);
			ary[c]++;

		}

		for (int i = 0; i < s.length(); i++) {

			int c = s.charAt(i);

			if (ary[c] == 1) {

				out.println(c);
			}
		}
	}
}