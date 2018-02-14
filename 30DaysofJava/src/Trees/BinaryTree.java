package Trees;

public class BinaryTree {

	private TreeNode root;
	public TreeNode find(Integer data) {
		if (root != null)
			return root.find(data);
		return null;
	}

	public Integer largest() {
		if (this.root != null)
			return root.largest();
		return null;
	}

	public Integer smallest() {
		if (this.root != null)
			return root.smallest();
		return null;
	}

	public void insert(Integer data) {
		if (root == null)
			this.root = new TreeNode(data);
		else
			root.insert(data);
	}
	
	public int height() {
		if (this.root == null) return 0;
		return this.root.height();
	}

	public void delete(Integer data) {
		TreeNode current = this.root;
		TreeNode parent = this.root;
		boolean isLeftChild = false;

		if (current == null)
			return; // tree is empty

		while (current != null && current.getData() != data) {
			parent = current;
			if (data < current.getData()) {
				current = current.getLeftChild();
				isLeftChild = true;
			} else {
				current = current.getRightChild();
				isLeftChild = false;
			}
		}
		if (current == null)
			return; // node to be deleted not found

		// this is case 1
		if (current.getLeftChild() == null && current.getRightChild() == null) {
			if (current == root) {
				root = null; // no elements in tree now
			} else {
				if (isLeftChild)
					parent.setLeftChild(null);
				else
					parent.setRightChild(null);
			}
		}
		// This is case 2 broken down further into 2 separate cases
		else if (current.getRightChild() == null) {// current has left child
			if (current == root) {
				root = current.getLeftChild();
			} else if (isLeftChild) {
				parent.setLeftChild(current.getLeftChild());
			} else {
				parent.setRightChild(current.getLeftChild());
			}
		} else if (current.getLeftChild() == null) {// current has right child
			if (current == root) {
				root = current.getRightChild();
			} else if (isLeftChild) {
				parent.setLeftChild(current.getRightChild());
			} else {
				parent.setRightChild(current.getRightChild());
			}
		}
		// This is case 3 - Most complicated (node to be deleted has 2 children)
		else {
			TreeNode successor = getSuccessor(current);
			if (current == root)
				root = successor;
			else if (isLeftChild) {
				parent.setLeftChild(successor);
			} else {
				parent.setRightChild(successor);
			}
			successor.setLeftChild(current.getLeftChild());
		}
	}

	private TreeNode getSuccessor(TreeNode node) {
		TreeNode parentOfSuccessor = node;
		TreeNode successor = node;
		TreeNode current = node.getRightChild();
		while (current != null) {
			parentOfSuccessor = successor;
			successor = current;
			current = current.getLeftChild();
		}
	}
}
