package myTest;

import lgpl3.o.O;

/**
 * grade 成績.<br/>
 * grade 高考普考.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=T892_GradeScorePointMark" >
 *          T892_GradeScorePointMark.java</a>
 *
 */
class T892_GradeScorePointMark {

	static int g(int a, int b) {

		if (a <= 0 || b < 0)
			return 1;

		O.l("a + b + g(" + a + "," + b + ")");

		return a + b + g(b - 2, a - 3);

	}

	public static void main(String[] sAry) {

		O.l("ans=" + g(20, 10));

	}
}