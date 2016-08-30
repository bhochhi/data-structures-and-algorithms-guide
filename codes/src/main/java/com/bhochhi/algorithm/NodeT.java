package com.bhochhi.algorithm;

import java.util.ArrayList;
import java.util.List;

public class NodeT {
	String value;
	String name;

	NodeT parentNode;
	NodeT leftNode;
	NodeT rightNode;

	public boolean hasChild() {
		return leftNode != null || rightNode != null;
	}

	public List<NodeT> getChildren() {
		List<NodeT> nodes = new ArrayList<NodeT>();
		if (leftNode != null) {
			nodes.add(leftNode);
		}
		if (rightNode != null) {
			nodes.add(rightNode);
		}
		return nodes;
	}

}
