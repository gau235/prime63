package myTest;

import static java.lang.System.out;

/**
 * MathRecur321.<br/>
 * MathRecur321
 *
 * @version 2021/05/12_19:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T136_MathRecur321" >T136_MathRecur321.java</a>
 *
 */
class T136_MathRecur321 {

	static int mathRecur321(final int n, final int level) {

		if (n <= 2)
			return 1;

		out.println("n=" + n + ", lv=" + level);

		return mathRecur321(n - 3, level + 1) + mathRecur321(n - 2, level + 1) + mathRecur321(n - 1, level + 1);

	}

	public static void main(String[] sAry) {

		int n = 8;
		out.print("mathRecur321(" + n + ")=" + mathRecur321(n, 1));

	}
}