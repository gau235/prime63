package myTest;

import lgpl3.o.O;

/**
 * 2022 地特三 程式設計 高考普考.<br/>
 * To mod.
 *
 * @version 2022/12/15_11:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T802_ModByMinus" >src</a>
 *
 */
class T802_ModByMinus {

	static int fun(int a, int b, int lv) { // 要了解出題老師心中所想

		O.lv(++lv, "a=" + a + ", b=" + b);

		if (b == 0)

			return a;

		else if (a % 2 == 1 && b % 2 == 1) // 奇奇

			return fun(((a + b) / 2), ((a - b) / 2), lv);

		else if (a % 2 == 1 && b == 0 && b % 2 == 0) // 奇偶 原式: a%2 && !b%2

			return fun(a, (b / 2), lv);

		else if (a == 0 && a % 2 == 0 && b % 2 == 1) // 偶奇 原式: !a%2 && b%2

			return fun((a / 2), b, lv);
		else
			return 2 * fun((a / 2), (b / 2), lv); // 偶偶

	}

	public static void main(String[] sAry) throws Throwable {

		int x = -9;
		int y = 4;
		O.l("mod=" + (x % y));

		int a = 19;
		int b = 2;

		O.l("ans=" + fun(a, b, 0));

	}
}