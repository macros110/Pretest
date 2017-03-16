package pretest.q1;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public  Set<String> findWords(Set<String> wordSet){
		Set<String> set = new HashSet<>();
		set = wordSet;
		return set;
	}
	
	
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		Set<String> set = new HashSet<>();
		set.add("life");
		set.add("require");
		set.add("option");
		set.add("hall");
		
		System.out.println(solution.findWords(set));
	}
}
