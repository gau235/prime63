package myTest;

import lgpl3.o.O;

/**
 * Binary search.<br/>
 * Binary search.
 *
 * @version 2021/10/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=R49_BiSearch" >R49_BiSearch.java</a>
 *
 */
class R49_BiSearch {

	static int biSearch(int[] sortedAry, final int key) {

		int left = 0;
		int right = sortedAry.length - 1;

		int mid, vMid;

		while (left <= right) {

			mid = (left + right) / 2;
			vMid = sortedAry[mid];

			if (vMid == key)
				return mid;

			if (vMid < key)

				left = mid + 1;
			else
				right = mid - 1; // vMid > key

		}

		return -left;

	}

	static int biSearchRecur(int[] sortedAry, final int key, int left, int right) {

		if (left > right)
			return -left;

		int mid = (right + left) / 2;
		int vMid = sortedAry[mid];

		if (vMid == key)
			return mid;

		if (vMid < key)

			return biSearchRecur(sortedAry, key, mid + 1, right);
		else
			return biSearchRecur(sortedAry, key, left, mid - 1); // vMid > key

	}

	public static void main(String[] sAry) {

		int[] sortedAry = { 10, 20, 30, 40, 50 };
		int key = 40;

		int foundIdx = biSearch(sortedAry, key);
		O.l("biSearch=" + foundIdx);

		int foundIdx2 = biSearchRecur(sortedAry, key, 0, sortedAry.length);
		O.l("biSearchRecur=" + foundIdx2);

	}
}