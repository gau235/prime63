package myTest;

import lgpl3.eqDiv.Fr64;
import lgpl3.o.O;

/**
 * G.C.D.<br/>
 * G.C.D.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=R22_Gcd" >R22_Gcd.java</a>
 *
 */
class R22_Gcd {

	static long gcd(int n1, int n2) { // n1 must be gte n2

		int r = n1 % n2;
		if (r == 0)
			return n2;

		return gcd(n2, r);

	}

	static int gcdIter(int n1, int n2) {

		int r = n1 % n2;
		// O.l("r=" + r);

		while (r > 0) { // 准备 2 个变数, 如同费氏数列 fn, fn_1, fn_2 这样的迭代关系

			n1 = n2;
			n2 = r;
			r = n1 % n2; // must do

		}

		// O.l("n2=" + n2);
		return n2;

	}

	public static void main(String[] sAry) {

		int n1 = 9; // O.THR_LOCAL_RANDOM.nextInt(100);
		int n2 = 2; // O.THR_LOCAL_RANDOM.nextInt(100);

		O.l("n1=" + n1);
		O.l("n2=" + n2);

		O.l("gcd=" + gcd(n1, n2));
		O.l("gcdIter=" + gcdIter(n1, n2));
		O.l("gcd=" + Fr64.gcd(n1, n2));

	}
}