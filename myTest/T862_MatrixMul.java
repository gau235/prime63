package myTest;

import lgpl3.o.O;

/**
 * Matrix.<br/>
 * Matrix.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=T862_MatrixMul" >T862_MatrixMul.java</a>
 *
 */
class T862_MatrixMul extends T860_Matrix {

	T862_MatrixMul() {

		m1 = m2 = retM = null;
	}

	T862_MatrixMul(float[][] m1, float[][] m2) {

		setMatrix(m1, m2);
	}

	@Override
	protected boolean checkDim() {

		return m1[0].length == m2.length;
	}

	@Override
	protected float[][] matrixOp() {

		if (!checkDim())
			return retM = null;

		int retLen1 = m1.length;
		int retLen2 = m2[0].length;
		retM = new float[retLen1][retLen2];
		// M1= i*j
		// M2= j*k
		// retM= M1 X M2 => i*k

		for (int i = 0; i < m1.length; i++) {

			for (int k = 0; k < m2[0].length; k++) // 總共做 i*k 次

				for (int j = 0; j < m1[0].length; j++) // 每次做 j 個加法運算
					retM[i][k] += (m1[i][j] * m2[j][k]);

		}

		return retM;

	}

	public static void main(String[] sAry) {

		float[][] m1 = { { 1, 2, 3 }, { 4, 5, 6 } };
		// m1:
		// [1,2,3]
		// [4,5,6]

		float[][] m2 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		// m2:
		// [1,2]
		// [3,4]
		// [5,6]

		T862_MatrixMul m3 = new T862_MatrixMul(m1, m2);

		m3.matrixOp();

		O.l(m3.toString());

	}
}