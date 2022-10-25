package p1;

public interface Printer {
	//javac impl adds : public static final
	int DATA = 12345;
	//func : javac impl adds : public abstract
	void print(String message);
}
