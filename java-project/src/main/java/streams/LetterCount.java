// { autofold
package streams;

import java.util.Arrays;
import java.util.stream.*;

public class LetterCount {

public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
	return Arrays.stream(names).filter(n -> n.length() > 5).mapToInt(String::length).sum();
	//return Stream.of(names).filter(n -> n.length() > 5).mapToInt(String::length).sum();
}

}