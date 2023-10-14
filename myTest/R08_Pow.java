package myTest;

import static java.lang.System.out;

import lgpl3.o.O;

/**
 * To power.<br/>
 * To power.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=R08_Pow" >R08_Pow.java</a>
 *
 */
class R08_Pow {

	static int pow(int base, int exp) {

		if (exp == 0)

			return 1;

		return base * pow(base, exp - 1);

	}

	static int powForward(int base, int prod, int curExp, int exp) { // input start from 2

		// 准备 2 个变数, 如同费氏数列 fn, fn_1, fn_2 这样的迭代关系

		int newProd = prod * base;
		int newCurExp = curExp + 1;

		if (newCurExp == exp)

			return newProd;

		return powForward(base, newProd, newCurExp, exp);

	}

	static int powLoop(int base, int exp) {

		int ans = 1;
		for (int i = 1; i <= exp; i++)

			ans *= base;

		return ans;

	}

	public static void main(String[] sAry) {

		int base = 7;
		int exp = 3;

		out.printf("pow=%s\n", pow(base, exp));
		out.printf("powForward=%d\n", powForward(base, base, 1, exp));

		out.printf("powLoop=%d\n", powLoop(base, exp));
		out.printf("O.pow=%d", O.pow(base, exp));

	}
}