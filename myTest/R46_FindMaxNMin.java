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

		for (int idx = 0, v; idx < ary.length; idx++) {

			v = ary[idx]; // O.l("v=" + v);

			if (v > max)

				max = v;

			if (v < min)

				min = v;

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

		int[] bsae = { 40, 50, 10, 30 };

		O.l("findMaxNMinRecur=");
		O.l(findMaxNMinRecur(bsae, 0, bsae[0], bsae[0]));

		int[] maxNMin = findMaxNMin(bsae);

		O.l("findMaxNMin=");
		O.l("max=" + maxNMin[0]);
		O.l("min=" + maxNMin[1]);

	}
}