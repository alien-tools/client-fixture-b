package clientb;

import moduleb.B;
import nestedb.NestedB;

public class ClientB {
	public void moduleB() {
		B b = new B();
		b.b();
	}

	public void nestedB() {
		NestedB nestedB = new NestedB();
		nestedB.nestedB();
	}
}
