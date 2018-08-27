package com.jianzhioffer;

import com.tool.ToolUtils;
import com.utilclass.Node;

/**
 * 从前序和中序数组中重构二叉树
 * @author Harry.Yang
 * 2018年7月29日 下午8:16:08
 */
public class _6RebuildBinaryTreeFromPreorderInorder {
	
	public static void main(String[] args) throws Exception {
		
		int[] preorder= {1,2,4,7,3,5,6,8};
		int[] inorder={4,7,2,1,5,3,8,6};
		Node root = rebuild(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
		ToolUtils.printTree(root);
	}
	
	/**
	 * @param position 0:左子节点（根），1：右子节点
	 * @throws Exception 
	 */
	private static Node rebuild(int[] preorder,int[] inorder,int leftRange1,int rightRange1,int leftRange2,int rightRange2) throws Exception{
		if(preorder == null 
				|| inorder == null 
				|| preorder.length == 0 
				|| preorder.length != inorder.length
				|| leftRange1>= rightRange1
				|| leftRange2 >=rightRange2
				|| leftRange1>rightRange1
				|| rightRange1>=preorder.length
				|| rightRange2>=preorder.length){
			return null;
		}
		
		int parentIndex = findIndex(inorder,preorder[leftRange1],leftRange2,rightRange2);
		if(parentIndex == -1){
			throw new RuntimeException("中序遍历或前序遍历数组有问题");
		}
	    int leftChildNum = parentIndex-leftRange2;//leftRange2~parentIndex-1
	    int rightChildNum = rightRange2-parentIndex;//parentIndex+1~rightRange2
	    //rebuild left tree
	    Node leftChild = rebuild(preorder,inorder,leftRange1+1,leftRange1+ leftChildNum,leftRange2,parentIndex-1);
		//rebuild right tree
	    Node rightChild = rebuild(preorder,inorder,leftRange1+leftChildNum+1,rightRange1,parentIndex+1,rightRange2);
	    Node parent = new Node();
	    parent.value=preorder[leftRange1];
	    parent.left= leftChild;
	    parent.right= rightChild;
	    return parent;	    
	}

	private static int findIndex(int[] inorder, int i,int leftRange,int rightRange) {
		if(inorder == null || inorder.length == 0){
			return -1;
		}
		for (int index = leftRange;index <= rightRange ;index++){
			if(inorder[index]== i){
				return index;
			}
		}
		return -1;
	}
	
//	private static int findIndexOfArray(int[] preorder,int[] leftTree){
//		if(preorder == null || preorder.length == 0 || leftTree.length == 0 || preorder.length <leftTree.length){
//			return -1;
//		}
//		
//		
//		return -1;
//	}

}
