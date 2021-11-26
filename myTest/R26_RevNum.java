package myTest;

import static java.lang.System.out;

/**
 * To reverse.<br/>
 * To reverse.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=R26_RevNum" >R26_RevNum.java</a>
 *
 */
class R26_RevNum {

	static int rev_num = 0;

	static int pos = 1; // useless

	static int rev(int n) {

		// out.println("rev_num=" + rev_num);

		if (n < 10) {

			int tail = n % 10;

			rev_num = rev_num * 10 + tail;

		} else {

			int tail = n % 10;

			rev_num = rev_num * 10 + tail;

			rev(n / 10);

		}

		return rev_num;

	}

	public static void main(String[] sAry) {

		out.println("ans=" + rev(1234));
	}
}