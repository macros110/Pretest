package pretest.q2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	private class Node{
		public Node left;
		public Node right;
		public int value;
		@Override
		public String toString() {
			return "Node:"+ value;
		}
	}
	public List<Node> findPath(Node rootNode,int sum){
		List<Node> nodes = new ArrayList<>();
		Node bufNode = rootNode;
		int total = 0;
		nodes.add(rootNode);
//		while(!(bufNode.right == null && bufNode.left == null)){			
//			total += bufNode.value;
//			bufNode = bufNode.left;
//		}
		return nodes;
	}
	
	private int sumOfNodeList(List<Node> nodes){
		int sum = 0;
		for (Node node : nodes) {
			sum += node.value;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		Node rootNode = sol.new Node();
		rootNode.value = 5;
		rootNode.left = sol.new Node();
		rootNode.left.value = -2;
		rootNode.left.left = null;
		rootNode.left.right = sol.new Node();
		rootNode.left.right.value = 1;
		rootNode.left.right.left = null;
		rootNode.left.right.right = sol.new Node();
		rootNode.left.right.right.value = 10;
		rootNode.left.right.right.left = null;
		rootNode.left.right.right.right = null;
		
		rootNode.right = sol.new Node();
		rootNode.right.value = -3;
		rootNode.right.left = sol.new Node();
		rootNode.right.left.value = 5;
		rootNode.right.left.left = sol.new Node();
		rootNode.right.left.left.value = 8;
		rootNode.right.left.left.left = null;
		rootNode.right.left.left.right = null;
		rootNode.right.left.right = null;
		rootNode.right.right = sol.new Node();
		rootNode.right.right.value = 9;
		rootNode.right.right.left = sol.new Node();
		rootNode.right.right.left.value = 4;
		rootNode.right.right.right = sol.new Node();
		rootNode.right.right.right.value = 4;
		rootNode.right.right.left.left = null;
		rootNode.right.right.left.right = null;
		rootNode.right.right.right.left = null;
		rootNode.right.right.right.right = null;
		
		
		
		System.out.println(sol.findPath(rootNode,15));

	}
}
