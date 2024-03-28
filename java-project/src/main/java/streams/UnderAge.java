// { autofold
package streams;

import java.util.*;
import java.util.stream.Collectors;

public class UnderAge {
// }

	public static Set<String> getKidNamesV7(List<Person> people) {
		Set<String> kids = new HashSet<>();
		for (Person person : people) {
			if (person.getAge() < 18) {
				kids.add(person.getName());
			}
		}
		return kids;
	}

	public static Set<String> getKidNames(List<Person> people) {
		return people.stream()
				.filter(person -> person.getAge() < 18)
				.map(Person::getName)
				.collect(Collectors.toSet());
	}

// { autofold
}
// }
