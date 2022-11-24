package myTest;

import static java.lang.System.out;

/**
 * To find the third value in an array.<br/>
 * To find the third value in an array.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T818_FindThirdMax" >T818_FindThirdMax.java</a>
 *
 */
class T818_FindThirdMax {

	public static void main(String[] sAry) {

		int[] ary = { 2, 4, 9, 10, 3, 50 };

		// 准备 2 个变数, 如同费氏数列 fn, fn_1, fn_2 这样的迭代关系
		// 處長升官退休, 副處長變處長, 經理變副處長
		int max1 = -1, max2 = -1, max3 = -1, tmp;

		for (int i = 0; i != ary.length; i++) {

			tmp = ary[i];

			if (tmp > max1) {

				max3 = max2; // 升級
				max2 = max1; // 升級

				max1 = tmp;

			} else if (tmp > max2) {

				max3 = max2; // 升級

				max2 = tmp;

			} else if (tmp > max3)
				max3 = tmp;

		}

		out.println("max1=" + max1);
		out.println("max2=" + max2);
		out.println("max3=" + max3);

	}
}