package myTest;

import static java.lang.System.out;

/**
 * To reverse.<br/>
 * To reverse.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=R89_RecurPrintRev" >R89_RecurPrintRev.java</a>
 *
 */
class R89_RecurPrintRev {

	static void recurPrintRev(int[] ary, int endIdx) {

		if (endIdx == ary.length - 1) {

			out.print(ary[endIdx] + " ");

			return;

		}

		recurPrintRev(ary, endIdx + 1);

		out.print(ary[endIdx] + " ");

	}

	public static void main(String[] sAry) {

		int[] ary = { 10, 20, 30, 40, 50 };

		recurPrintRev(ary, 1);

	}
}