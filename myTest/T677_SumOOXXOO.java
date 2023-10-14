package myTest;

import static java.lang.System.out;
import static lgpl3.o.B.T;

import java.util.Scanner;

/**
 * 遇到 oo 連續出現會加權, 遇到 xx 歸零.<br/>
 * 遇到 oo 連續出現會加權, 遇到 xx 歸零.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T677_SumOOXXOO" >src</a>
 *
 */
class T677_SumOOXXOO {

	public static void main(String[] sAry) {

		while (T) { // ooxxooxxooo 1+2_1+2_1+2+3 => sum=12

			Scanner sc = new Scanner(System.in);

			out.println("pleas input a string:");
			String s = sc.next();

			int sum = 0;
			int step = 1;

			for (int i = 0; i < s.length(); i++) {

				if (s.charAt(i) == 'o') {

					out.println(step);

					sum = sum + step;
					step++; // 加權

				} else
					step = 1; // 歸零; 歸 1

			}

			out.printf("sum=%d\n", sum);

		}

		// sc.close();

	}
}