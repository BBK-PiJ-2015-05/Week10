import java.util.ArrayList;
import java.util.List;

/**
 * Created by sconno05 on 07/12/2015.
 */
public class Main {
    public static void main(String[] args) {

        String test1 = "Sarah";
        String test2 = "Ollie";
        String test3 = ":)";
        String test4 = "George";
        List<String> words = new ArrayList<String>();
        words.add(test1);
        words.add(test2);
        words.add(test3);
        words.add(test4);
        List<String> shortWords = StringUtils.allMatches(words, s -> s.length() < 4);
        List<String> wordsWithB = StringUtils.allMatches(words,
                s -> s.contains("b"));
        List<String> evenLengthWords = StringUtils.allMatches(words,
                s -> (s.length() % 2) == 0);


        System.out.println(StringUtils2.betterElement(test1, test2, (s1, s2) -> false));
        System.out.println(StringUtils.betterString("Ollie", "Sarah", (a, b) -> a.charAt(0) > b.charAt(0)));
        System.out.println(shortWords);
        System.out.println(wordsWithB);
        System.out.println(evenLengthWords);

        List<String> shortWords2 = StringUtils2.allMatches2(words, s -> s.length() < 4);
        List<String> wordsWithB2 = StringUtils2.allMatches2(words,
                s -> s.contains("b"));
        List<String> evenLengthWords2 = StringUtils2.allMatches2(words,
                s -> (s.length() % 2) == 0);
        System.out.println(shortWords2);
        System.out.println(wordsWithB2);
        System.out.println(evenLengthWords2);
    }
}
