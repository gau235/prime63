package myTest;

import lgpl3.o.O;

/**
 * Matrix.<br/>
 * Matrix.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T864_MatrixAdd" >T864_MatrixAdd.java</a>
 *
 */
class T864_MatrixAdd extends T860_Matrix {

	T864_MatrixAdd() {

		m1 = m2 = retM = null;
	}

	T864_MatrixAdd(float[][] m1, float[][] m2) {

		setMatrix(m1, m2);
	}

	@Override
	protected boolean checkDim() {

		return (m1.length == m2.length) && (m1[0].length == m2[0].length);
	}

	@Override
	protected float[][] matrixOp() {

		if (!checkDim())
			return retM = null;

		retM = new float[m1.length][m1[0].length];

		for (int i = 0; i < m1.length; i++) {

			for (int j = 0; j < m1[0].length; j++)
				retM[i][j] = m1[i][j] + m2[i][j];

		}

		return retM;

	}

	public static void main(String[] sAry) {

		float[][] m1 = { { 1, 2, 3 }, { 4, 5, 6 } };
		// m1:
		// [1,2,3]
		// [4,5,6]

		float[][] m2 = { { 10, 20, 30 }, { 40, 50, 60 } };
		// m2:
		// [10,20,30]
		// [40,50,60]

		T864_MatrixAdd m3 = new T864_MatrixAdd(m1, m2);

		m3.matrixOp();

		O.l(m3.toString());

	}
}