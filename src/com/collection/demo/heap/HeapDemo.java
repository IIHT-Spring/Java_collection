package com.collection.demo.heap;

 class HeapDemo {
	//variable for the class
	private int[] Heap;
	private int size;
	private int maxsize;
	 // front variable as a static with unity
	private static final int FRONT = 1;
	
	public void MinHeap(int maxsize)
	{
		this.maxsize = maxsize;
		this.size= 0;
		Heap = new int[this.maxsize + 1];
		Heap[0] = Integer.MIN_VALUE;
	}
	
	private int parent(int pos) {return pos / 2 ;}
	
	private int leftChild(int pos) {return (2*pos);}
	
	
	private int rightChild(int pos) {
		return (2*pos) +1;
	}
	
	private boolean ifLeft(int pos)
	{
		if(pos > (size/2) && pos <= size) {
			return true;
		}
			return false; 
	}
	private void swap(int fpos, int spos)
	{
		int tmp;
		tmp = Heap[fpos];
		Heap[fpos] = Heap[spos];
		Heap[spos] = tmp;
	}

	private void minHeapify(int pos)
	{
		if(!ifLeft(pos)) {
			if(Heap[pos] > Heap[leftChild(pos)] || Heap[pos] > Heap[rightChild(pos)]) {
				// swap the left child and hepify
				if(Heap[leftChild(pos)] < Heap[rightChild(pos)]) {
					swap(pos, leftChild(pos));
					minHeapify(leftChild(pos));
				}
				else {
					swap(pos, rightChild(pos));
					minHeapify(rightChild(pos));
				}
			}
		}
	}
	
	public void insert
	(int element) {
		if(size >= maxsize) {
			return;
		}
		Heap[++size] = element;
		int current = size;
		
		while (Heap[current] < Heap[parent(current)] ) {
			swap(current, parent(current));
			current = parent(current);
		}
		
	}
	public void print() {
		for(int i = 1; i <= size/2 ; i++) {
			System.out.println(
			"parent: "+ Heap[i]
			+"left child: " + Heap[2*i]
			+ "right child: " + Heap[2*i+1]
			);
			System.out.println();
		}
	}
	
	public int remove() {
		int popped = Heap[FRONT];
		Heap[FRONT] = Heap[size --];
		minHeapify(FRONT);
		return popped;
	}
	public static void main(String[] args) {
		System.out.println("the minimun heap is ");
		
		HeapDemo minHeap = new HeapDemo();
		
		
		minHeap.insert(5);
		minHeap.insert(3);
		minHeap.insert(17);
		minHeap.insert(10);
		minHeap.insert(84);
		minHeap.insert(19);
		minHeap.insert(6);
		minHeap.insert(22);
		minHeap.insert(9);
		
		minHeap.print();
		
	//	System.out.println("The min value is " + minHeap.remove());
		
	}
}


































