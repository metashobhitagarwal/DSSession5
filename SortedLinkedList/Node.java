package SortedLinkedList;

class Node<T> {

	T data;
	Node<T> next;

	public Node() {
		next = null;
		data = null;
	}

	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}

	public void setLink(Node<T> next) {
		this.next = next;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getLink() {
		return this.next;
	}

	public T getData() {
		return this.data;
	}
}