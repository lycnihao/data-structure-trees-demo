package org.smallnico.datastructure.tree.test;

import org.junit.Test;
import org.smallnico.datastructure.btree.BPlusTree;
import org.smallnico.datastructure.btree.BTree;

public class BPlusTreeTest {

	@Test
	public void insertTest() {
		BTree<Integer> btree = new BPlusTree<Integer>(20);
		int count = 1000;
		while(count -- > 0) {
		    btree.put(count, count);
		    System.out.println(btree);
		    System.out.println();
		}
		
		System.out.println(">>> search：" + btree.search(555));
	}
}
