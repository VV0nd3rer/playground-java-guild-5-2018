// { autofold
package streams;

import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;

public class UpperCase {

    public static Collection<String> mapToUppercaseV7(String... names) {
        Collection<String> uppercaseNames = new ArrayList<>();
        for (String name : names) {
            uppercaseNames.add(name.toUpperCase());
        }
        return uppercaseNames;
    }

    public static Collection<String> mapToUppercase(String... names) {
        return Arrays.stream(names).map(String::toUpperCase).collect(toList());
        //return Stream.of(names).map(String::toUpperCase).collect(toList());
    }

}