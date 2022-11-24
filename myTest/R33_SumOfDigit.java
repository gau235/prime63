package myTest;

import static java.lang.System.out;

/**
 * To sum of the digits of a number.<br/>
 * 計算 digits 總和.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=R33_SumOfDigit" >R33_SumOfDigit.java</a>
 *
 */
class R33_SumOfDigit {

	static int sumDigit(int n, int sum) {

		if (n / 10 == 0) {

			sum = sum + n % 10;

			return sum;

		}

		sum = sum + n % 10;

		return sumDigit(n / 10, sum);

	}

	static int sumDigitLoop(int n, int sum) {

		int myAns = 0;

		while (n > 0) {

			int tail = n % 10;

			myAns = myAns + tail;

			n = n / 10;

		}

		return myAns;

	}

	public static void main(String[] sAry) {

		int n = 384;

		out.println(sumDigit(n, 0));
		out.println(sumDigitLoop(n, 0));

	}
}