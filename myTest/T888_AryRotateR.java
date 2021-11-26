package myTest;

import lgpl3.o.O;
import lgpl3.o.ary.Seq32;

/**
 * To rotate right.<br/>
 * To rotate right.
 *
 * @version 2021/06/02_21:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=T888_AryRotateR" >T888_AryRotateR.java</a>
 *
 */
class T888_AryRotateR {

	static void fun(int[] ary, int realLen, int range) {

		int p = 0;
		int p1;

		for (p1 = p + realLen - 1; p1 > p - 1; p1--)
			ary[p1 + range] = ary[p1];

		O.l("fun1=");
		O.l(ary);

		int p2 = 0;
		for (p1 = p + realLen; p2 < p + range; p1++)
			ary[p2++] = ary[p1];

		O.l("fun2=");
		O.l(ary);

	}

	public static void main(String[] sAry) {

		int[] ary = { 103, 45, 99, 38, 76, 0, 0, 0 };
		int[] ary2 = O.delTailAll0(ary);

		O.l("bef=");
		O.l(ary);

		int realLen = 5;
		int range = 2;

		fun(ary, realLen, range);

		ary = O.delTailAll0(ary);

		O.l("aft=");
		O.l(ary);

		O.l("Seq32=");
		O.l(new Seq32(ary2).rotateR(5).toStr());

	}
}