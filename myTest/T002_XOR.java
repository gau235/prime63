package myTest;

import lgpl3.o.O;

/**
 * XOR.<br/>
 * XOR.
 *
 * @version 2021/01/13_15:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T002_XOR" >T002_XOR.java</a>
 *
 */
class T002_XOR {

	public static void main(String[] sAry) {

		int n1 = 5;
		int n2 = 20;

		n1 = n1 ^ n2;
		n2 = n1 ^ n2;
		n1 = n1 ^ n2;

		O.l("n1=" + n1 + " n2=" + n2);

	}
}