import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PigLatin {
	public static void main(String[] args) throws IOException {
		Scanner scan=new Scanner(System.in);
		String t=" ";
		List<String> list=new ArrayList<>();
		while(t.length()>0) {
			t=scan.nextLine();
			if(t.length()>0)
			list.add(t);
		}
		String vowels[]= {"a","e","i","o","u"};
		List<String> asList = Arrays.asList(vowels);
		List<String> finalList=new ArrayList<>();
		list.stream().forEach(sen->{
			String[] split = sen.split(" ");
			String fullSentenceAfter="";
			for(int i=0;i<split.length;i++) {
				String word=split[i];
				String charAt = Character.toString(word.charAt(0));
				if(asList.contains(charAt)) {
					 word=word.concat("yay");
				}
				else {
					String dummy="";
					String real=word;
					for(int l=0;l<real.length();l++) {
						String charac=Character.toString(real.charAt(l));
						if(asList.contains(charac)){
							word=word.concat(dummy).concat("ay");
							break;
						}else {
							word=word.replaceFirst(charac, "");
							dummy=dummy.concat(charac);
						}
					}
				}
				fullSentenceAfter=fullSentenceAfter.concat(word+" ");
			}
			finalList.add(fullSentenceAfter);
		});
		finalList.stream().forEach(sentence->{
			System.out.println(sentence.trim());
		});
		 scan.close();
	}
}
