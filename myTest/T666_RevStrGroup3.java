package myTest;

import static java.lang.System.out;
import static lgpl3.o.B.T;

import java.util.Scanner;

/**
 * To reverse.<br/>
 * 輸入 3 表每 3 字母為 1 組做反轉, 對回文 (ABA) 會重複輸出 1 次.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T666_RevStrGroup3" >src</a>
 *
 */
class T666_RevStrGroup3 {

	public static void main(String[] sAry) {

		Scanner sc = new Scanner(System.in);

		int n; // input a num
		String s; // input a String

		while (T) {

			out.println("pleas input a num:");

			n = sc.nextInt(); // input a num

			if (n <= 0)

				return;

			out.println("pleas input a string:");

			s = sc.next(); // input a String

			String sFromTail = "";
			String sFromHead = "";

			String ret = "";

			for (int i = 0; i < s.length(); i++) {

				sFromHead = sFromHead + s.charAt(i);
				sFromTail = s.charAt(i) + sFromTail; // 從後面加上

				if (i % n == (n - 1)) { // 輸入 3 表每 3 字母為 1 組做反轉

					if (sFromTail.equals(sFromHead)) // 驗證回文

						ret += sFromTail + sFromTail;
					else
						ret += sFromTail;

					sFromTail = "";
					sFromHead = "";

				}
			}

			out.println(ret);

		}

		// sc.close();

	}
}