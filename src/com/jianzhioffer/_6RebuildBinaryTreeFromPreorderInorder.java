package com.jianzhioffer;

/**
 * 
 * @author Harry.Yang
 * 2018年7月29日 下午8:16:08
 */
public class _6RebuildBinaryTreeFromPreorderInorder {
	
	public static void main(String[] args) {
		
		int[] preorder= {1,2,4,7,3,5,6,8};
		int[] inorder={4,7,2,1,5,3,8,6};
		
	}
	
	static class Node{
		Node left;
		Node right;
		int value;
	}
	
	/**
	 * @param position 0:左子节点（根），1：右子节点
	 * @throws Exception 
	 */
	private static void rebuild(int[] preorder,int[] inorder,int position) throws Exception{
		if(preorder == null 
				|| inorder == null 
				|| preorder.length == 0 
				|| preorder.length != inorder.length){
			return;
		}
		
		int parentIndex = findIndex(inorder,preorder[0]);
		if(parentIndex == -1){
			throw new Exception("中序遍历或前序遍历数组有问题");
		}
		
		
	}

	private static int findIndex(int[] inorder, int i) {
		if(inorder == null || inorder.length == 0){
			return -1;
		}
		for (int index = 0;index < inorder.length ;index++){
			if(inorder[index]== i){
				return index;
			}
		}
		return -1;
	}
	
	private static int findIndexOfArray(int[] preorder,int[] leftTree){
		if(preorder == null || preorder.length == 0 || leftTree.length == 0 || preorder.length <leftTree.length){
			return -1;
		}
		
		
		return -1;
	}

}
