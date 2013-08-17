import java.util.Iterator;

public class ObjectList {

	Node head;
	public ObjectList() {
		head = null;

	}

	public Node getHead() {
		return head;
	}

	public Boolean isEmpty() {

		return head == null? true : false;
	}

	public void add(Object newItem) {

		if (head == null) {
			head = new Node(newItem);
			return;
		}
		
		Node prev = null;
		Node curr = head;
		while (curr != null) {
			prev = curr;
			curr = curr.next;
		}

		prev.next = new Node(newItem);


	}

	public void addAll(ObjectList newList) {

		if (head == null) {
			head = newList.getHead();
			return;
		}

		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}

		curr.next = newList.getHead();


	}

	public int getSize() {

		Node curr = head;
		int i = 0;
		while (curr != null) {
			i++;
			curr = curr.next;
		}
		return i;
	}

	public Object get(int index) {

		Node curr = head;

		int i = 0;
		while (index > i && curr.next != null) {
			curr = curr.next;
			i++;
		}

		return curr.getItem();
	}

	public void clear() {
		head = null;
	}

	public void printList() {

		for (int i = 0; i < this.getSize(); i++)
			System.out.print((Integer)this.get(i) + ", ");

		System.out.println();
	}

}