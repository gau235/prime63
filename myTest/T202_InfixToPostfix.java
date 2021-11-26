package myTest;

import static java.lang.System.out;

import lgpl3.o.O;

/**
 * Infix to postfix.<br/>
 * Infix to postfix.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=T202_InfixToPostfix" >T202_InfixToPostfix.java</a>
 *
 */
class T202_InfixToPostfix {

	public static void main(String[] sAry) {

		String sInfix = "((a+b)*(x-n))";
		O.l("infix=\n" + sInfix);

		char[] cAry = sInfix.toCharArray();
		char[] stack = new char[cAry.length];

		String sPostfix = "";
		for (int i = 0, k = 0; i < cAry.length; i++) {

			if (cAry[i] >= 'a' && cAry[i] <= 'z')
				sPostfix += cAry[i];

			if (cAry[i] == '*' || cAry[i] == '/')
				stack[k++] = cAry[i];

			if (cAry[i] == '+' || cAry[i] == '-')
				stack[k++] = cAry[i];

			if (cAry[i] == ')')
				sPostfix += stack[--k];

		}

		out.println("postfix=\n" + sPostfix);

	}
}