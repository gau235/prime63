package myTest;

import static lgpl3.o.B.T;

import lgpl3.o.O;

/**
 * 2022 地特三 程式設計 高考普考.<br/>
 * To div.
 *
 * @version 2022/12/15_11:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T800_ToDivAry" >src</a>
 *
 */
class T800_ToDivAry {

	static boolean fun2(int[] ary, int x, int y) {

		if (x > y)

			return !T;
		else {

			int mid = (x + y) / 2;

			O.l("x=" + x + ", mid=" + mid + ", y=" + y);

			if (ary[mid] == mid)

				return T;

			else if (ary[mid] > mid)

				return fun2(ary, x, mid - 1);
			else
				return fun2(ary, mid + 1, y);

		}
	}

	public static void main(String[] sAry) throws Throwable {

		int[] ary = { 35, 60, 45, 7, 10, 22, 2, 50, 14, 3, 66 };

		boolean ans = fun2(ary, 1, 10);

		O.l("ans=" + ans);

	}
}