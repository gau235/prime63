package myTest;

import static java.lang.System.out;

/**
 * To shuffle.<br/>
 * To shuffle.
 *
 * @version 2021/05/15_19:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=T250_ShuffleStr" >T250_ShuffleStr.java</a>
 *
 */
class T250_ShuffleStr {

	public static void main(String[] argAry) {

		String largeS = "school";

		String[] smallSAry = largeS.split(""); // O.Z

		for (int i = 0; i != smallSAry.length; i++) {

			int rnd = (int) (Math.random() * smallSAry.length);

			String smallS = smallSAry[i];
			smallSAry[i] = smallSAry[rnd];
			smallSAry[rnd] = smallS;

		}

		for (String smallS : smallSAry)
			out.print(smallS);

	}
}