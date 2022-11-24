package myTest;

import lgpl3.o.O;

/**
 * Ackermann function.<br/>
 * Ack(3,1)=13<br/>
 * Ack(3,2)=29<br/>
 * Ack(3,3)=61
 *
 * @version 2021/11/15_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T114_Ack" >T114_Ack.java</a>
 *
 */
class T114_Ack {

	static int ack(int m, int n) {

		while (m != 0) {

			n = ((n == 0) ? 1 : ack(m, n - 1));

			m--;

		}

		return (n + 1);

	}

	public static void main(String[] sAry) {

		int a = 3;
		int b = 1;

		O.l("ans=" + ack(a, b));

	}
}