package string_handling;

public class TestStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Testing String Builder");
		System.out.println(sb);
		System.out.println("length " + sb.length() + " capacity " + sb.capacity());
		StringBuilder sb2 = sb.append(false).append(12345).append("strings").append(123.45);
		System.out.println(sb);
		System.out.println(sb2);
		System.out.println(sb == sb2);
		int index = sb.indexOf("String");
		sb.delete(index, index + 6);
		System.out.println(sb);
		sb.insert(0, "new data");
		System.out.println(sb);
	}

}
