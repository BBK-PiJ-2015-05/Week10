import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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

        return words.stream().filter(tester::test).collect(Collectors.toList());
    }

    public static <T> List<T> transformedList2(List<T> words, Function<T,T> tester){
        return words.stream().map(tester::apply).collect(Collectors.toList());
    }
}