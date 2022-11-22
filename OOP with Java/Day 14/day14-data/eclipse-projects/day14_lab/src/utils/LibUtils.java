package utils;

import java.util.HashMap;
import java.util.Map;

import com.app.core.Book;
import static com.app.core.Category.*;
import static java.time.LocalDate.parse;

public class LibUtils {
//add a static method to populate lib with some books
	public static Map<String, Book> populateLibrary() {
		Map<String, Book> map = new HashMap<>();
		map.put("bk-001", new Book("bk-001", SCIENCE, 500, parse("2020-01-19"), "Riya", 50));
		map.put("bk-009", new Book("bk-009", FICTION, 600, parse("2020-11-19"), "Ravi", 40));

		map.put("bk-003", new Book("bk-003", SCIENCE, 560, parse("2019-11-19"), "Riya", 30));

		map.put("bk-005", new Book("bk-005", TECHNOLOGY, 400, parse("2022-01-19"), "Mihir", 45));

		map.put("bk-002", new Book("bk-002", SCIENCE, 530, parse("2022-06-19"), "Riya", 55));

		return map;
	}
}
