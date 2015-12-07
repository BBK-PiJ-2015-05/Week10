import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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

        return words.stream().filter(tester::test).collect(Collectors.toList());
    }

    public static List<String> transformedList(List<String> words, Function<String,String> tester){
        return words.stream().map(tester::apply).collect(Collectors.toList());
    }
}