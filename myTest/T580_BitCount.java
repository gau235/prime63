package myTest;

import static java.lang.System.out;
import static lgpl3.o.B.T;

import java.util.Scanner;

/**
 * bitCount A~B.<br/>
 * bitCount A~B.
 *
 * @version 2021/04/13_21:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T580_BitCount" >T580_BitCount.java</a>
 *
 */
class T580_BitCount {

	static int bitCount(int n) {

		int bitCount = 0;
		while (n > 0) {

			if (n % 2 == 1)
				bitCount++;

			n /= 2;

		}

		return bitCount;

	}

	public static void main(String[] sAry) {

		out.println("pleas input:");

		Scanner sc = new Scanner(System.in);

		int from, to;
		int sum = 0;
		while (T) {

			from = sc.nextInt();
			to = sc.nextInt();

			for (int i = from; i <= to; i++) {

				out.printf("bitCount(%d)=%d\n", i, bitCount(i));

				sum += bitCount(i);

			}

			out.println("bitCount " + from + "~" + to + "=" + sum);
			sum = 0;

		}

		// sc.close();

	}
}