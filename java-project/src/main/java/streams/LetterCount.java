// { autofold
package streams;

import java.util.stream.*;

public class LetterCount {

public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
	return Stream.of(names).filter(n -> n.length() > 5).mapToInt(String::length).sum();
}

}