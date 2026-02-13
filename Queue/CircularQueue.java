package com.Queue;

public class CircularQueue {
	int []queue;
	int front,rear,size;
	public CircularQueue(int data) {
		this.size = data;
		queue = new int[data];
		front = -1;
		rear = -1;
	}

	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue(20);
		cq.enqueue(45);
		cq.enqueue(69);
		cq.dequeue();
	}

	private void enqueue(int data) {
		if((rear+1)%size==front) {
			System.out.println("Queue full !!!");
			return;
		}
		if(front==-1) {
			front=0;
		}
		rear = (rear+1)%size;
		queue[rear]=data;
		System.out.println("Data inserted in Queue : "+data);
	}

	private void dequeue() {
		if(front==-1) {
			System.out.println("Queue Empty ");
			return;
		}
		int data = queue[front];
		if(front==rear) {
			front=rear=-1;
		}else {
			front = (front+1)%size;
		}
		System.out.println("Data is Delete : "+data);
	}
}
