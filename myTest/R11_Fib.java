package myTest;

import static java.lang.System.out;

import lgpl3.comb.selfCallva.ForwardSelfCallva;

/**
 * Fibonacci number.<br/>
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=R11_Fib" >R11_Fib.java</a>
 *
 */
class R11_Fib {

	static int fib(int n) {

		if (n == 0)
			return 0;

		if (n == 1)
			return 1;

		return fib(n - 2) + fib(n - 1);

	}

	static int fibIter(int n) {

		int f0 = 0;
		int f1 = 1;

		int newF1 = 0;
		for (int i = 2; i <= n; i++) { // i starts from 2

			newF1 = f1 + f0;

			f0 = f1;
			f1 = newF1;

		}

		return newF1;

	}

	static int fibIterNew(int n) {

		int f0 = 0;
		int f1 = 1;

		for (int i = 2; i <= n; i++) { // i starts from 2

			f1 += f0;
			f0 = f1 - f0;

		}

		return f1;

	}

	// very good
	static int fibForward(int f1, int f2, final int n, int lv) { // the lv starts from 3

		// 准备 2 个变数, 如同费氏数列 fn, fn_1, fn_2 这样的迭代关系
		int newF1 = f2;
		int newF2 = f1 + f2;

		int newLv = lv + 1; // 重要, 每走一步, 上了一個台階

		if (lv == n)
			return newF2;

		return fibForward(newF1, newF2, n, newLv); // n 不變

	}

	public static void main(String[] sAry) {

		int n = 6;

		out.println("fib=" + fib(n));

		out.println("fibIter=" + fibIter(n));

		out.println("fibIterNew=" + fibIterNew(n));

		out.println("fibForward=" + fibForward(1, 1, n, 3));

		out.println("fibForward=" + ForwardSelfCallva.fib(1, 1, n, 3));

	}
}