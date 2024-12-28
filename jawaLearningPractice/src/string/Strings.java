package string;

import java.util.HashMap;

public class Strings {

	public static String longestString(String[] array) {
		
		String longestString = "";
		
		for (String x : array) {
			if (x.length() > longestString.length()) {
				longestString = x;
			}
		}
		
		return longestString;
	}
	
	public static boolean isPalindrom(String word) {
		boolean isPalindrom = false;
		
		char[] chars = word.toCharArray();
		int control = 0;
		
		if (chars.length % 2 == 0) {
			
			for (int i = 1; i <= chars.length / 2; i++) {
				if (chars[i - 1] == chars[chars.length - i]) {
					control++;
				}
			}
			
			if (control == chars.length / 2) isPalindrom = true;
			
		} else {
			
			for (int i = 1; i <= (chars.length - 1) / 2; i++) {
				if (chars[i - 1] == chars[chars.length - i]) {
					control++;
				}
			}
			
			if (control == (chars.length - 1) / 2) isPalindrom = true;
			
		}
		
		return isPalindrom;
	}
	
	public static String censorship(String oldString, String censorList) {
		String newString = "";
		
		String oldStr[] = oldString.split(" ");
		String censorArr[] = censorList.split(", ");
		
		for (String str : oldStr) {
			for (String cens : censorArr) {
				if (str.equals(cens) == true) {
					str = "***";
				}
			}
			newString += str + " ";
		}
		
		return newString;
	}
	
	public static int inputer(String first, String second) {
		int count = 0;
		
		String firs[] = first.split(" ");
		String secon[] = second.split(", ");
		
		for (String str : firs) {
			for (String cens : secon) {
				if (str.equals(cens) == true) {
					count++;
				}
			}
			
		}
		
		return count;
	}
	
	public static void buildDictionary(String text) {
		HashMap <Character, Integer> dictionary = new HashMap<>('я' - 'а' + 2);
		
		text = text.toLowerCase();
		char charText[] = text.toCharArray();
		char charDic[] = new char['я' - 'а' + 2];
		
		
		char start = 'а';
		for (int i = 0; i < 'я' - 'а' + 2; i++) {
			charDic[i] = start;
			start++;
		}
		charDic[charDic.length - 1] = 'ё';
		
		for (char chs : charDic) {
			int input = 0;
			for (char chStr : charText) {
				if (chs == chStr) input++;
			}
			dictionary.put(chs, input);
		}

		System.out.println(dictionary.toString());

		
		
		
	}
}
