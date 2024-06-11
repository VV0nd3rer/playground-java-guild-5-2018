// { autofold
package streams;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Challenge {
// }

public static String getString(List<Integer> list) {
	return list.stream().map(number -> number % 2 == 0 ? "e" + number : "o" + number)
			.collect(Collectors.joining(","));
}

// { autofold
}
// }