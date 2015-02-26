import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MaskOutWords {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		String text = "";
		
		System.out.println("Input number of words: ");
		number = sc.nextInt();
		String[] words = new String[number];
		for (int i = 0; i < number; i++) {
			System.out.println("Input words: ");
			words[i] = sc.next();
		}
		System.out.println("Input text: ");
		text = sc.nextLine();
		text = sc.nextLine();
		System.out.println(maskOutWords(words, text));
	}
	
	static String maskOutWords(String words[], String text){
		for (int i = 0; i < words.length; i++) {
			String stars = starNumber(words[i]);
			text = text.replaceAll(words[i], stars);
		}
		return text;
	}
	static String starNumber(String word){
		String star = "*";
		String stars = "";
		for (int i = 0; i < word.length(); i++) {
			stars = stars.concat(star);
		}
		return stars;
	}
}
