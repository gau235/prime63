package myTest;

import lgpl3.o.O;

/**
 * To find the second.<br/>
 * To find the second.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=T810_FindMaxNSec" >T810_FindMaxNSec.java</a>
 *
 */
class T810_FindMaxNSec {

	static int[] top2Asc(int[] ary) {

		// 准备 2 个变数, 如同费氏数列 fn, fn_1, fn_2 这样的迭代关系
		// 處長升官退休, 副處長變處長, 經理變副處長
		int max1 = -99, max2 = -99, tmp;

		for (int i = 0; i != ary.length; i++) {

			tmp = ary[i];

			if (tmp > max1) {

				max2 = max1; // 升級

				max1 = tmp;

			} else if (tmp > max2)
				max2 = tmp;

		}

		return new int[] { max1, max2 };

	}

	static int[] top2Desc(int[] ary) {

		// 准备 2 个变数, 如同费氏数列 fn, fn_1, fn_2 这样的迭代关系
		// 處長升官退休, 副處長變處長, 經理變副處長
		int min1 = 99, min2 = 99, tmp;

		for (int i = 0; i != ary.length; i++) {

			tmp = ary[i];

			if (tmp < min1) {

				min2 = min1; // 升級

				min1 = tmp;

			} else if (tmp < min2)
				min2 = tmp;

		}

		return new int[] { min1, min2 };

	}

	public static void main(String[] sAry) {

		int[] ary = { -20, -30, 0, 10, 0, 50 };

		int[] maxAry = top2Asc(ary);
		int[] minAry = top2Desc(ary);

		O.l("maxAry=");
		O.l(maxAry);
		O.l("minAry=");
		O.l(minAry);

		// 找出任何 ary 中兩數相乘最大者
		int ansAsc = maxAry[0] * maxAry[1];
		int ansDesc = minAry[0] * minAry[1];

		if (ansAsc > ansDesc)
			O.l("ans=" + ansAsc);

		else
			O.l("ans=" + ansDesc);

	}
}