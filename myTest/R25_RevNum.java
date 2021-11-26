package myTest;

import static java.lang.System.out;

/**
 * To reverse the digits of a number.<br/>
 * To reverse the digits of a number.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=R25_RevNum" >R25_RevNum.java</a>
 *
 */
class R25_RevNum {

	static int rev(int curN, int prefix) {

		int tail = curN % 10;
		prefix = prefix * 10 + tail;

		if (curN < 10)
			return prefix;

		return rev(curN / 10, prefix);

	}

	static int revLoop(int n) {

		int ans = 0;

		while (n > 0) {

			ans = ans * 10 + n % 10;

			n /= 10;

		}

		return ans;

	}

	public static void main(String[] sAry) {

		int n = 529;

		out.println("ans=" + rev(n, 0));
		out.println("ans=" + revLoop(n));

	}
}