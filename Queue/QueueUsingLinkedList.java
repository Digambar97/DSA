package com.Queue;

public class QueueUsingLinkedList {
	Node front,rear;
	public static void main(String[] args) {
		QueueUsingLinkedList ql = new QueueUsingLinkedList();
		ql.enqueue(23);
		ql.enqueue(86);
		ql.dequeue();
	}

	private void enqueue(int data) {
		Node newNode = new Node(data);
		if(rear==null) {
			front  =rear = newNode;
			return;
		}
		rear.next = newNode;
		rear = newNode;
		System.out.println("Data is Inserted on Queue : "+data);
	}

	private void dequeue() {
		if(front==null) {
			System.out.println("Queue Empty");
			return;
		}
		int value =  front.data;
		front = front.next;
		System.out.println("Data is Deleted : "+value);
		if(front==null) {
			rear=null;
		}
	}
}

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}