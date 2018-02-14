package Trees;

public class TreeNode {
private Integer data; //tree will have integrer type of data
private TreeNode leftChild;
private TreeNode RightChild;
//we are not putting set data becuase we will be setting data through constructor

public TreeNode (Integer data) {
	this.data = data;
	
}
public TreeNode getLeftChild() {
	return leftChild;
}
public void setLeftChild(TreeNode leftChild) {
	this.leftChild = leftChild;
}
public TreeNode getRightChild() {
	return RightChild;
}
public void setRightChild(TreeNode rightChild) {
	RightChild = rightChild;
}
public Integer getData() {
	return data;
}

}
