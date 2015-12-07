import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by sconno05 on 07/12/2015.
 */
public class StringUtils2 {

    public static <T> T betterElement(T s1, T s2, TwoElementPredicate<T> tester) {
        if (tester.isBetter(s1,s2)) {
            return s1;
        } else return s2;
    }

    public static <T> List<T> allMatches2(List<T> words, Predicate<T> tester) {
        List<T> testwords = new ArrayList<T>();
        for(int i = 0; i < words.size(); i++){
            if(tester.test(words.get(i))){
                testwords.add(words.get(i));
            }
        }

        return testwords;
    }
}