package myTest;

import lgpl3.o.O;

/**
 * To find the max product.<br/>
 * To find the max product.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T814_FindMaxProd" >T814_FindMaxProd.java</a>
 *
 */
class T814_FindMaxProd {

	static int findMaxProdOld(int[] ary) {

		int max = -1;
		int i1, i2, v1, v2, tmpV;

		for (i1 = 0; i1 != ary.length; i1++) {

			v1 = ary[i1];

			for (i2 = i1 + 1; i2 != ary.length; i2++) {

				v2 = ary[i2];
				tmpV = v1 * v2;

				if (tmpV > max)

					max = tmpV;

			}
		}

		return max;

	}

	static int findMaxProd(int[] ary) { // 找出 ary 中兩數相乘最大者

		int[] maxAry = T810_FindMaxNSec.top2Asc(ary);
		int[] minAry = T810_FindMaxNSec.top2Desc(ary);

		int ansAsc = maxAry[0] * maxAry[1];
		int ansDesc = minAry[0] * minAry[1];

		if (ansAsc > ansDesc)

			return ansAsc;

		return ansDesc;

	}

	public static void main(String[] sAry) {

		int[] ary = { 30, -20, 0, 10, -40, 0, 50 };

		int findMaxProd = findMaxProd(ary);

		O.l("maxProd=" + O.eq(findMaxProd, findMaxProdOld(ary)));

	}
}