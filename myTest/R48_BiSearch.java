package myTest;

import lgpl3.o.O;

/**
 * Binary search.<br/>
 * Binary search.
 */
class R48_BiSearch {

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

		return -1;

	}

	static int biSearchRecur(int[] sortedAry, final int key, int left, int right) {

		if (right <= left)

			return -1; // Arrays.binarySearch(sortedAry, 0)

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
		int key = 440;

		O.l("biSearch=" + biSearch(sortedAry, key));

		O.l("biSearchRecur=" + biSearchRecur(sortedAry, key, 0, sortedAry.length));

	}
}