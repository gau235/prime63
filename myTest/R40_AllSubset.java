package myTest;

import lgpl3.comb.powerSet.PowerSet;

/**
 * To reverse.<br/>
 * To reverse.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=R40_AllSubset" >R40_AllSubset.java</a>
 *
 */
class R40_AllSubset {

	public static void main(String[] args) {

		args = new String[] { "A", "B", "C", "D" };

		PowerSet.printAll(args, 0, "");

	}
}