package generic;

//Create a Holder class , that can hold ANY data type (primitive/ref type)
public class Holder<T> {
	private T ref;

	public Holder(T ref) {
		super();
		this.ref = ref;
	}

	public T getRef() {
		return ref;
	}
	
}
