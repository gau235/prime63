package myTest;

import lgpl3.o.O;

/**
 * grade 成績.<br/>
 * grade 高考普考.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T891_GradeScorePointMark" >
 *          T891_GradeScorePointMark.java</a>
 *
 */
class T891_GradeScorePointMark {

	static int new1(int p) {

		O.l("new1 " + p);

		if (p > 90)
			return (new1(new1(p - 11)));

		return (p - 10);

	}

	static int new2(int p) {

		O.l("new2 " + p);

		if (p < 91)
			return (new2(p + 11));

		return p;

	}

	static int new0(int p) {

		return (new1(new2(p)));
	}

	public static void main(String[] sAry) {

		int q;

		q = 65;
		// new1(98)
		// new1 new1(87)
		// new1(77)
		// 67

		// O.l("q=" + q + " aft=" + new1(98)); // 單獨 call new1 98
		O.l("q=" + q + " to " + new0(q));

		q = 95;

		O.l("q=" + q + " to " + new0(q));

		q = 100;

		O.l("q=" + q + " to " + new0(q));

		q = 104;

		O.l("q=" + q + " to " + new0(q));

		q = 110;

		O.l("q=" + q + " to " + new0(q));

	}
}