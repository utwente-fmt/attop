package parser;

// Why Java does not have a 2-tuple packed by default remains a mystery to me.
// I've made it immutable, because I do not need mutable tuples and this eases the use,
// because encapsulation is ensured without ugly getters and setters.
public class Pair<X,Y> {
	public final X first;
	public final Y last;
	public Pair(X first, Y last) {
		this.first = first;
		this.last = last;
	}
}
