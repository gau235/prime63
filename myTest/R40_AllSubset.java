package myTest;

import lgpl3.comb.selfCallva.SelfCallva;
import lgpl3.o.B;
import lgpl3.o.O;

/**
 * To reverse.<br/>
 * To reverse.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=R40_AllSubset" >R40_AllSubset.java</a>
 *
 */
class R40_AllSubset {

	public static void main(String[] args) {

		args = new String[] { "A", "B", "C", "X" };

		SelfCallva.allSubset(args, "", 1);

		O.l("O.y32=" + B.n32);
		B.n32 = 0;

	}
}