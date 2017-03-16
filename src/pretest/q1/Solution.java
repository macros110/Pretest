package pretest.q1;

import java.util.HashSet;
import java.util.Set;


public class Solution {
	public  Set<String> findWords(Set<String> wordSet){
		Set<String> set = new HashSet<>();
		for (String word : wordSet) {
			if(isOneLine4KeyBoard(word)){
				set.add(word);
			}
		}
		return set;
	}
	private boolean isOneLine4KeyBoard(String word){
		boolean flag = true;
		String wordUC = word.toUpperCase();
		char first = wordUC.charAt(0);
		if("QWERTYUIOP".indexOf(first)>-1){
			for(int i=1;i<word.length();i++){
				if ("QWERTYUIOP".indexOf(wordUC.charAt(i))==-1) {
					flag = false;
				}
			}
		}
		if("ASDFGHJKL".indexOf(first)>-1){
			for(int i=1;i<word.length();i++){
				if ("ASDFGHJKL".indexOf(wordUC.charAt(i))==-1) {
					flag = false;
				}
			}
		}
		if("ZXCVBNM".indexOf(first)>-1){
			for(int i=1;i<word.length();i++){
				if ("ZXCVBNM".indexOf(wordUC.charAt(i))==-1) {
					flag = false;
				}
			}
		}
		return flag;
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
