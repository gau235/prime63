package myTest;

import static java.lang.System.out;

/**
 * 10 to 2.<br/>
 * 10 to 2.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=R38_From10To2" >R38_From10To2.java</a>
 *
 */
class R38_From10To2 {

	static String ans = "";

	static String from10To2(int n) {

		if (n < 2) {

			ans = n % 2 + ans;

			return ans;

		}

		ans = n % 2 + ans;

		return from10To2(n / 2);

	}

	static String from10To2Loop(int n) {

		String myAns = "";

		do {

			myAns = n % 2 + myAns;
			n = n / 2;

		} while (n > 0);

		return myAns;

	}

	public static void main(String[] sAry) {

		int n = 13;

		out.println(from10To2(n));
		out.println(from10To2Loop(n));

	}
}