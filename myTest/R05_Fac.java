package myTest;

import static java.lang.System.out;

import lgpl3.o.O;
import lgpl3.o.ary.Arr;
import lgpl3.o.keyNV.K32V64;

/**
 * To sum.<br/>
 * To sum.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=R05_Fac" >R05_Fac.java</a>
 *
 */
class R05_Fac {

	static int fac(int n) {

		if (n == 1)
			return 1;

		return n * fac(n - 1);

	}

	static int facForward(int prod, int curN, int n) { // input start from 2

		int newCurN = curN + 1;
		int newProd = prod * newCurN;

		if (newCurN == n)
			return newProd;

		return facForward(newProd, newCurN, n);

	}

	static int facByIter(int n) {

		int ans = 1;
		for (int i = 1; i <= n; i++)
			ans *= i;

		return ans;

	}

	static int facByloop(int n) {

		int lv = 1;

		Arr<K32V64> stack = new Arr<K32V64>(K32V64.class);
		int ans = 1;

		K32V64 curObj = new K32V64(lv, n);
		stack.a(curObj); // to use the n as the level

		while (stack.tail() != null) {

			curObj = stack.cutTail(); // cutTail as Stack.pop
			out.println("curObj=" + curObj.toStr());

			int curN = (int) curObj.int64;
			ans *= curN;

			if (++lv == n)
				return ans;

			stack.a(new K32V64(lv, curN - 1)); // append as Stack.push

		}

		return ans;

	}

	public static void main(String[] sAry) {

		int n = 4;
		out.printf("fac=%s\n", fac(n));
		out.printf("facForward=%s\n", facForward(1, 1, n));

		out.printf("facByIter=%d\n", facByIter(n));

		O.l();

		out.printf("facByloop=%d", facByloop(n));

	}
}