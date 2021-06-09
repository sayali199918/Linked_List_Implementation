package com.cdac.Linked_List;

public class Runner {

	public static void main(String[] args) {
		LinkedList list =new LinkedList();
		list.insert(200);
		list.insert(400);
		list.insert(500);
		list.insert(600);
		//list.insert(100);
		list.insertAt(1,300);
		list.insertAtStart(100);	
		//list.deleteAt(5);		
		list.show();
		
		
	}

}
