package myTest;

import lgpl3.o.O;

/**
 * log2.<br/>
 * log2.
 *
 * @version 2021/01/13_15:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T107_Log2" >T107_Log2.java</a>
 *
 */
class T107_Log2 {

	static int log2(int n) {

		int exp = 0;

		for (; n > 1; n >>>= 1)
			exp++;

		return exp;

	}

	public static void main(String[] sAry) {

		O.l("log2=" + log2(10));
	}
}