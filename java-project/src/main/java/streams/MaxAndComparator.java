// { autofold
package streams;


import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class MaxAndComparator {
// }

	public static Person getOldestPersonV7(List<Person> people) {
		Person oldestPerson = new Person("", 0);
		for (Person person : people) {
			if (person.getAge() > oldestPerson.getAge()) {
				oldestPerson = person;
			}
		}
		return oldestPerson;
	}

	public static Person getOldestPerson(List<Person> people) {
		return people.stream()
				.max(comparing(Person::getAge))
				.get();
	}

// { autofold
}
// }
