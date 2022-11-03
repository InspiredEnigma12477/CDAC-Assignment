package generics;

import java.util.List;

import fruits.Orange;
import static generics.GenUtils.*;

public class Test3 {

	public static void main(String[] args) {
		List<Orange> oranges=List.of(new Orange(),new Orange(),new Orange());
		displayTastes(oranges);
		

	}

}
