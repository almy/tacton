package com.myftiu.data.structure;

/**
 * @author by ali myftiu on 10/10/14.
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Organisation<T> implements Iterable<Organisation<T>> {

	public T data;
	public Organisation<T> root;
	public List<Organisation<T>> subOrgs;
    public int depth = 1;

	public boolean isRoot() {
		return root == null;
	}

	public boolean isLeaf() {
		return subOrgs.size() == 0;
	}

	private List<Organisation<T>> elementsIndex;

	public Organisation(T data) {
		this.data = data;
		this.subOrgs = new LinkedList<Organisation<T>>();
		this.elementsIndex = new LinkedList<Organisation<T>>();
		this.elementsIndex.add(this);
	}

	public Organisation<T> addChild(T child) {
		Organisation<T> childNode = new Organisation<T>(child);
		childNode.root = this;
		this.subOrgs.add(childNode);
		this.registerChildForSearch(childNode);
        depth++;
		return childNode;
	}


	public int getLevel() {
		if (this.isRoot())
			return 0;
		else
			return root.getLevel() + 1;
	}

	private void registerChildForSearch(Organisation<T> node) {
		elementsIndex.add(node);
		if (root != null)
			root.registerChildForSearch(node);
	}

	public Organisation<T> findTreeNode(Comparable<T> cmp) {
		for (Organisation<T> element : this.elementsIndex) {
			T elData = element.data;
			if (cmp.compareTo(elData) == 0)
				return element;
		}

		return null;
	}

	@Override
	public String toString() {
		return data != null ? data.toString() : "[data null]";
	}

	@Override
	public Iterator<Organisation<T>> iterator() {
		NodeIterator<T> iter = new NodeIterator<T>(this);
		return iter;
	}







}
