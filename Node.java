

public class Node {

	Object item;
	Node next;

	public Node(Object item) {

		next = null;
		this.item = item;
	}

	public Object getItem() {
		return item;
	}
}