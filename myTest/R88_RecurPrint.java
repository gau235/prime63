package myTest;

import static java.lang.System.out;

import lgpl3.comb.selfCallva.ForwardSelfCallva;
import lgpl3.o.O;

/**
 * To print.<br/>
 * To print.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=R88_RecurPrint" >R88_RecurPrint.java</a>
 *
 */
class R88_RecurPrint {

	static void recurPrint(int[] ary, int from) {

		if (from == ary.length - 1) {

			out.print(ary[from]);

			return;

		}

		out.print(ary[from] + " ");

		recurPrint(ary, from + 1);

	}

	public static void main(String[] sAry) {

		int[] ary = { 10, 20, 30, 40, 50 };
		int from = 3;

		recurPrint(ary, from);

		O.l();
		O.l();

		ForwardSelfCallva.print(ary, from);

	}
}