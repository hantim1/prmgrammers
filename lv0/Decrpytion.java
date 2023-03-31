package lv0;

public class Decrpytion {
	public String solution(String cipher, int code) {
		String answer = "";
		char[] arr = new char[(cipher.length() / code)+1];

		for (int i = 1; i< arr.length; i++) {
			arr[i] = cipher.charAt(code * i - 1);
			answer += arr[i];
		}

		return answer;
	}
}
