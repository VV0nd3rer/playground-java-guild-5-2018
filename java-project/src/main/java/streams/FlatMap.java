// { autofold
package streams;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class FlatMap {
// }

    public static List<String> transformV7(List<List<String>> collection) {
        List<String> newCollection = new ArrayList<>();
        for (List<String> subCollection : collection) {
            for (String value : subCollection) {
                newCollection.add(value);
            }
        }
        return newCollection;
    }

    public static List<String> transform(List<List<String>> collection) {

        // https://stackoverflow.com/questions/39874242/what-is-the-difference-between-stream-and-stream-of
        // return Stream.of(collection).flatMap(item -> Stream.of(item)).collect(toList());
        return collection.stream().flatMap(Collection::stream).collect(toList());
    }

// { autofold
}
// }