import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by sconno05 on 07/12/2015.
 */
public class StringUtils {

    public static String betterString(String s1, String s2, TwoStringPredicate tester) {
        if (tester.isBetter(s1,s2)) {
            return s1;
        } else return s2;
    }

    public static List<String> allMatches(List<String> words, Predicate<String> tester) {
        List<String> testwords = new ArrayList<String>();
        for(int i = 0; i < words.size(); i++){
            if(tester.test(words.get(i))){
                testwords.add(words.get(i));
            }
        }

        return testwords;
    }
}