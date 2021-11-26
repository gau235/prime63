package myTest;

import static java.lang.System.out;

import java.util.Scanner;

import lgpl3.o.B;

/**
 * To reverse.<br/>
 * 高考普考.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=R27_SumDigitNGenerator" >
 *          R27_SumDigitNGenerator.java</a>
 *
 */
class R27_SumDigitNGenerator {

	static int sumDigit(int n, int sum) {

		if (n / 10 == 0) {

			sum = sum + n % 10;

			return sum;

		}

		sum = sum + n % 10;

		return sumDigit(n / 10, sum);

	}

	static void generator(int n) {

		for (int myN = 1; myN <= n; myN++) {

			if ((myN + sumDigit(myN, 0)) == n)
				out.println("generator=" + myN);

		}
	}

	public static void main(String[] sAry) {

		out.println("pleas input:");

		Scanner sc = new Scanner(System.in);

		int n;

		while (B.I) {

			n = sc.nextInt();

			if (n <= 0) {

				out.println("請輸入正整數, 資料不正確將結束程式");
				return;

			}

			generator(n);

		}
	}
}