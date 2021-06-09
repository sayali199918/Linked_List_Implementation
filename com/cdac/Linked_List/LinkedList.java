package com.cdac.Linked_List;

public class LinkedList {
	Node head;
	
	public void insert(int data)        //insert at end
	{
		Node node=new Node();          //create a new node
		node.data=data;                //assign data
		node.next=null;               //assign null
		
		if(head==null) 
		{
			head=node;
		}
		else
		{   
			Node n=head;              //for traverse
			while(n.next!=null)       //check n.next is null or not
			{
				n=n.next;             //n points to next node
			}
			n.next=node;              //if null, n.next points to node
		}
	}
	public void insertAt(int index,int data)     //insert at in between
	{
		Node node = new Node();                  //new node
		node.data = data;
		node.next = null;
		
		if(index==0)
		{
			insertAtStart(data);
		}
		else{
		Node n = head;              
		for(int i=0;i<index-1;i++)
		{
			n = n.next;                   //n points to next (node)
		}
		node.next = n.next;                //this node points to which next points
		n.next = node;                      //next points to this node
		}
	}
	
	public void insertAtStart(int data)    //insert at start
	{
		Node node=new Node();              //new node
		node.data=data;
		node.next=null;
		node.next=head;                   //node.next points to which head points
		head=node;                        //head points to this node
	}
	
	public void deleteList() {
		head=null;
	}
	
	public void deleteAt(int index)
	{
		if(index==0)
		{
			head=head.next;
			
		}
		else
		{
			Node n=head;              
			Node n1=null;
			for(int i=0;i<index-1;i++)  
			{
				n=n.next;                  //n points to next node
			}
			n1=n.next;
			n.next=n1.next;                //this node points to which next points
			n1=null;                       //it is eligible fir garbage collection
		}
	}
	public void show()
	{
		Node node=head;                                  //reference for traverse
		while(node.next!=null)                          // prints till n!=null
		{
			System.out.print(node.data + " ");
			node=node.next;                            //node points to next(node)
		}
		System.out.print(node.data + " ");
	}
}
