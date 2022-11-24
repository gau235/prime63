package myTest;

import static java.lang.System.out;

import java.util.Scanner;

import lgpl3.o.B;

/**
 * To reverse.<br/>
 * 輸入 3 表每 3 的字母為 1 組做反轉, 對回文 (ABA) 會重複輸出 1 次.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T666_RevStrGroup3" >T666_RevStrGroup3.java</a>
 *
 */
class T666_RevStrGroup3 {

	public static void main(String[] sAry) {

		Scanner sc = new Scanner(System.in);

		int n; // input a num
		String s; // input a String

		while (B.I) {

			out.println("pleas input a num:");

			n = sc.nextInt(); // input a num

			if (n <= 0)
				return;

			out.println("pleas input a string:");

			s = sc.next(); // input a String

			String tmp = "";
			String tmp2 = "";
			String ans = "";

			int i = 0;
			for (; i < s.length(); i++) {

				tmp = s.charAt(i) + tmp;
				tmp2 = tmp2 + s.charAt(i);

				if (i % n == (n - 1)) {

					if (tmp.equals(tmp2))
						ans = ans + tmp + tmp;

					else
						ans += tmp;

					tmp = "";
					tmp2 = "";

				}
			}

			out.println(ans);

		}

		// sc.close();

	}
}