package myTest;

import lgpl3.o.O;
import lgpl3.o.ary.Ary32_2D;

/**
 * Matrix.<br/>
 * Matrix.
 *
 * @version 2021/11/19_10:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=T844_MatrixChain" >T844_MatrixChain.java</a>
 *
 */
class T844_MatrixChain {

	// A=4*3 B=3*2 C=2*5
	static int[] chain = { 0, 4, 3, 2, 5 }; // 4*3*2 + 4*2*5 VS 3*2*5 + 4*3*5

	// static int[] chain = { 0, 8, 4, 10, 3, 20, 4 };

	static int n = chain.length - 2;

	static int[][] costM = new int[n + 1][n + 1];

	static int[][] midM = new int[n + 1][n + 1];

	public static void main(String[] sAry) {

		// Ary32_2D.fill(costM, 9999);

		int i, j, k;

		int gap;

		int tmpCost;

		for (gap = 1; gap < n; gap++) {

			for (i = 1, j = i + gap; j <= n; i++, j++) {

				O.l("costM " + i + "," + j);

				costM[i][j] = 9_999;

				for (k = i; k < j; k++) {

					tmpCost = costM[i][k] + costM[k + 1][j] + chain[i] * chain[k + 1] * chain[j + 1];

					if (tmpCost < costM[i][j]) {

						O.l("do " + i + "X" + j + " from: " + k + " newCostM " + i + "," + j + "= " + tmpCost);

						costM[i][j] = tmpCost;

						midM[i][j] = k;

					}
				}
			}
		}

		O.l("costM=\n" + Ary32_2D.toMatrixStr(costM));

		O.l("chain 1X" + n + " from: " + midM[1][n]);
		O.l("midM=\n" + Ary32_2D.toMatrixStr(midM));

	}
}
