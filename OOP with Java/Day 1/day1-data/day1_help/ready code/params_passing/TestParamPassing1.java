package params_passing;
class TestParamPassing1 {
	public static void main(String[] args) {
		int data=12345;
		// write a static method to update emp sal.
		Emp e1 = new Emp(1, "aa", 1000);

		System.out.println("orig sal bef  =" + e1.getSal());
		testMe(e1.getSal(), 100);
		System.out.println("in main, after updation  =" 
		+ e1.getSal());//1000
	}
//sal=1000,inc=100
	static void testMe(double sal, double inc) {
		sal += inc;
		System.out.println("in meth sal=" + sal);//1100
	}

}
