package exc_handling;

public class Test1 {

	public static void main(String[] args) {
		try {
			// Testing un checked excs : Javac DOES NOT force hadnling of the un chked excs
			// upon the prog
			int[] data = { 10, 20, 30, 40 };
			System.out.println(data[3]);
			String s = "dsaf";
			System.out.println("char at index 0 " + s.charAt(0));
			System.out.println("parsed int value " + Integer.parseInt("abc12345"));
			int a=100;
			int b=0;
			System.out.println("div result "+(a/b));
			System.out.println("end of try....");
		}
//		 catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(1);
//		} catch (NullPointerException e) {
//			System.out.println(2);
//		} catch (NumberFormatException e) {
//			System.out.println(3);
//		}
		catch (Exception e) {
			System.out.println("in catch-all");
			System.out.println(e);//e.toString : prints : name of exc class + detailed err mesg
			System.out.println("Err mesg "+e.getMessage());
			System.out.println("Printing err stack trace");
			e.printStackTrace();
		}
		System.out.println("main continues....");
	}

}
