import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class PigLatin {
	public static void main(String[] args) throws IOException {

		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while (null != (line = sc.readLine())) {

			String vowels[] = { "a", "e", "i", "o", "u" };
			List<String> asList = Arrays.asList(vowels);
			String[] split = line.split(" ");
			String fullSentenceAfter = "";
			for (int i = 0; i < split.length; i++) {
				String word = split[i];
				String charAt = Character.toString(word.charAt(0));
				if (asList.contains(charAt)) {
					word = word.concat("yay");
				} else {
					String dummy = "";
					String real = word;
					for (int l = 0; l < real.length(); l++) {
						String charac = Character.toString(real.charAt(l));
						if (asList.contains(charac)) {
							word = word.concat(dummy).concat("ay");
							break;
						} else {
							word = word.replaceFirst(charac, "");
							dummy = dummy.concat(charac);
						}
					}
				}
				fullSentenceAfter = fullSentenceAfter.concat(word + " ");
			}
			System.out.println(fullSentenceAfter);
		}
		sc.close();
	}
}
