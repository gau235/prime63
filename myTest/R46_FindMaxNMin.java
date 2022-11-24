package myTest;

import lgpl3.o.O;

/**
 * To find the max.<br/>
 * To find the max.
 */
class R46_FindMaxNMin {

	static int[] findMaxNMin(int[] ary) {

		int max = ary[0];
		int min = ary[0];

		for (int i = 0, tmp; i < ary.length; i++) {

			tmp = ary[i]; // O.l("tmp=" + tmp);

			if (tmp > max)

				max = tmp;

			if (tmp < min)

				min = tmp;

		}

		return new int[] { max, min };

	}

	static int[] findMaxNMinRecur(int[] ary, int idx, int oldMax, int oldMin) {

		int tmp = ary[idx];

		if (tmp > oldMax)

			oldMax = tmp;

		if (tmp < oldMin)

			oldMin = tmp;

		if (idx == ary.length - 1)

			return new int[] { oldMax, oldMin };

		return findMaxNMinRecur(ary, idx + 1, oldMax, oldMin);

	}

	public static void main(String[] sAry) {

		int[] ary = { 40, 50, 10, 30 };

		O.l("recur=");
		O.l(findMaxNMinRecur(ary, 0, ary[0], ary[0]));

		int[] ansAry = findMaxNMin(ary);

		O.l("max=" + ansAry[0]);
		O.l("min=" + ansAry[1]);

	}
}