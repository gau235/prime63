package myTest;

/**
 * Matrix.<br/>
 * Matrix.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=T860_Matrix" >T860_Matrix.java</a>
 *
 */
abstract class T860_Matrix {

	protected float[][] m1;

	protected float[][] m2;

	protected float[][] retM;

	protected abstract boolean checkDim();

	protected abstract float[][] matrixOp();

	protected void setMatrix(float[][] m1, float[][] m2) {

		this.m1 = m1;
		this.m2 = m2;

	}

	@Override
	public String toString() {

		if (retM == null)
			return null;

		String s = "";
		for (int i = 0; i < retM.length; i++) {

			for (int j = 0; j < retM[0].length; j++)
				s += (retM[i][j] + "\t");

			s += "\n";

		}

		return s;

	}
}
