package pretest.q2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	private class Node{
		public Node left;
		public Node right;
		public int value;
	}
	public List<Node> findPath(Node rootNode,int sum){
		List<Node> nodes = new ArrayList<>();
		Node bufNode = rootNode;
		int total = 0;
		nodes.add(rootNode);
		while(!(bufNode.right == null && bufNode.left == null)){			
			total += bufNode.value;
			bufNode = bufNode.left;
		}
		return nodes;
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();

	}
}
