package myTest;

import static java.lang.System.out;

/**
 * To sum.<br/>
 * To sum.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=R03_Sum" >R03_Sum.java</a>
 *
 */
class R03_Sum {

	static int sum(int n) {

		if (n == 0)
			return 0;

		return n + sum(n - 1);

	}

	static int sumForward(final int n, int curSum, int curN, int lv) { // pretty

		if (curN == n)
			return curSum + curN;

		return sumForward(n, curSum + curN, curN + 1, lv + 1);

	}

	static int sumByLoop(int n) {

		int sum = 0;
		for (int i = 1; i <= n; i++)
			sum += i;

		return sum;

	}

	public static void main(String[] sAry) {

		int n = 4;
		out.printf("sum=%s\n", sum(n));
		out.printf("sumForward=%s\n", sumForward(n, 0, 0, 1));

		out.printf("sumByLoop=%d", sumByLoop(n));

	}
}