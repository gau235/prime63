package myTest;

import lgpl3.o.keyNV.NodInBiSearchTree32;

/**
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=R20_TreeCopyNSwap" >R20_TreeCopyNSwap.java</a>
 *
 */
class R20_TreeCopyNSwap {

	NodInBiSearchTree32 treeCopy(NodInBiSearchTree32 nod) {

		if (nod != null) {

			NodInBiSearchTree32 p = new NodInBiSearchTree32(nod.val);

			p.left = treeCopy(nod.left);
			p.right = treeCopy(nod.right);

			return p;

		}

		return null;

	}

	void swap(NodInBiSearchTree32 nod) {

		if (nod != null) {

			NodInBiSearchTree32 tmp = nod.left;
			nod.left = nod.right;
			nod.right = tmp;

			swap(nod.left);
			swap(nod.right);

		}
	}
}
