import java.util.ArrayList;
import java.util.List;

public class PigLatinTranslator {
	boolean startsVowel;

	public String translate(String input) {
		String[] splitInput = input.split(" ");
		String translated = "";
		for (String s : splitInput) {
			translated += "" + translator(s) + " ";
		}
		return translated.trim();
	}

	public String translator(String input) {
		StringBuffer s = new StringBuffer(input.toLowerCase().trim());
		List<Character> charList = new ArrayList<Character>();
		for (char ch : s.toString().toCharArray()) {
			charList.add(ch);
		}
		List<Character> FinalCharList = new ArrayList<Character>(charList);

		if (input.charAt(0) == 'y' && input.charAt(1) == 't')
			startsVowel = true;
		else if (input.charAt(0) == 'x' && input.charAt(1) == 'r')
			startsVowel = true;
		if (isVowel(input.charAt(0)) || startsVowel) {
			if (charList.get(0) == 'y' && isVowel(input.charAt(1))) {
				startsVowel = false;
				for (int i = 0; i < 1; i++) {
					FinalCharList.add(charList.get(i));
					FinalCharList.remove(charList.get(i));
				}
				FinalCharList.add('a');
				FinalCharList.add('y');

				return getStringRepresentation(FinalCharList);
			}

			charList.add('a');
			charList.add('y');

			return getStringRepresentation(charList);
		}
		int indexVowel = getIndexVowel(input);
		if (charList.get(0) == 'q' && charList.get(1) == 'u')
			indexVowel = 2;
		if (charList.get(1) == 'q' && charList.get(2) == 'u')
			indexVowel = 3;
		// System.out.println(charList.get(0));

		for (int i = 0; i < indexVowel; i++) {
			FinalCharList.add(charList.get(i));
			FinalCharList.remove(charList.get(i));
		}
		FinalCharList.add('a');
		FinalCharList.add('y');

		return getStringRepresentation(FinalCharList);

	}

	private boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y')
			return true;
		return false;
	}

	private int getIndexVowel(String s) {
		int i = 0;
		for (char ch : s.toCharArray()) {

			if (isVowel(ch))
				return i;
			i++;
		}
		if (i == -1)
			throw new IllegalArgumentException("No vowel found");
		return -1;
	}

	private String getStringRepresentation(List<Character> list) {
		StringBuffer builder = new StringBuffer(list.size());
		for (Character ch : list) {
			builder.append(ch);
		}
		return builder.toString();
	}
}