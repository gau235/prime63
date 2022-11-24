package myTest;

import lgpl3.o.O;

/**
 * The implements and extends.<br/>
 * The implements and extends.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T933_TestConstructor" >T933_TestConstructor.java</a>
 *
 */
class A {

	A() {

		O.l("A1=");
	}

	A(String s) {

		O.l("A2=" + s);
	}
}

class BBB extends A {

	BBB() {

		// super();
		super("BBB");

	}
}

public class T933_TestConstructor {

	public static void main(String[] sAry) {

		new BBB();
	}
}