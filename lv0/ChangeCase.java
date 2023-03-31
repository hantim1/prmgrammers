package lv0;

public class ChangeCase {
	public String solution(String my_string) {
		String answer = "";
		String str = my_string.toUpperCase();
		char[] arr = new char[my_string.length()];

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == my_string.charAt(i)) {
				arr[i] = Character.toLowerCase(str.charAt(i));
			} else {
				arr[i] = str.charAt(i);
			}

		}
		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}

		return answer;
	}
}
