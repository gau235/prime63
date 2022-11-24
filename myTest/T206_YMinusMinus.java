package myTest;

import lgpl3.o.O;

/**
 * n--.<br/>
 * n--.
 *
 * @version 2021/05/13_15:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T206_YMinusMinus" >T206_YMinusMinus.java</a>
 *
 */
class T206_YMinusMinus {

	public static void main(String[] sAry) {

		int x = 1;

		int y = 10;

		y /= ++x + y--;

		O.l("n=" + y); // n=0

		y = 20;
		y /= y--;

		O.l("n=" + y); // n=1

	}
}