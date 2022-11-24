package myTest;

import lgpl3.o.O;
import lgpl3.o.ary.Ary32_2D;

/**
 * grade 成績.<br/>
 * grade 高考普考.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T894_GradeScorePointMark" >
 *          T894_GradeScorePointMark.java</a>
 *
 */
class T894_GradeScorePointMark {

	static int[][] memo = new int[10][10];

	static int num = 0;

	static int B(int n, int k) {

		if ((n >= 0) && (k >= 0) && (n >= k)) {

			if ((k == 0) || (k == n)) {

				memo[n][k] = 1;

				return 1;

			} else if (memo[n][k] > 0)

				return memo[n][k];
			else {

				O.l("B(" + n + "," + k + ")");

				memo[n][k] = B(n - 1, k) + B(n - 1, k - 1);

				num += 2;

				return memo[n][k];

			}

		} else
			return 0;

	}

	static void f(int a, int b) {

		int sum = 0;

		for (int i = 1; i <= a; i++) {

			if (i >= 10)
				break;

			if (i % 3 == 0)
				continue;

			sum += B(i, 2);

		}

		O.l("sum=" + sum);
		O.l("num=" + num);

	}

	public static void main(String[] sAry) {

		f(20, 10);

		O.l("memo=\n" + Ary32_2D.toStr(memo));

	}
}