package q3;

/**
 * Method that uses the generic TwoElementPredicate, rather than the
 * String-specific TwoStringPredicate.
 */

public class ElementUtils {
    private ElementUtils() {
    }

    public static <T> T betterElement(T element1, T element2,
                                      TwoElementPredicate<T> tester) {
        if (tester.isBetter(element1, element2)) {
            return (element1);
        }
        return (element2);
    }
}
