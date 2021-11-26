package myTest;

import static java.lang.System.out;

/**
 * To power.<br/>
 * To power.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=T004_PowBySum" >T004_PowBySum.java</a>
 *
 */
class T004_PowBySum {

	public static void main(String[] sAry) {

		int exp = 6;

		int ans = 1;
		for (int i = 1; i <= exp; i++)
			ans = ans + ans + ans;

		out.printf("ans=%d", ans);

	}
}