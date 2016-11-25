package lists;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import data.*;
import lists.SinglyLinkedList.Node;

public class SinglyLinkedList<T> implements Listable<T> {
	
	private Node head;
	
	class Node{
		T data;
		Node next;
	}

	@Override
	public void add(T data) {
		
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;

		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		
	}
	
	@Override
	public void addFirst(T data) {
		Node n = new Node();
		n.data = data;
		n.next=head;
		head=n;
		
	}

	@Override
	public void addLast(T data) {
		Node t = head;
		while(t.next != null){
			t = t.next;
		}
		Node n = new Node();
		n.data=data;
		n.next=null;
		t.next=n;
		
	}

	@Override
	public T get(int index) {
		int p=0;
		Node n = head;
		while(n.next != null && p != index){
			n = n.next; p++;
		}
		return n.data;
	}

	@Override
	public void printAll() {
		Node n = head;
		while(n != null){
			System.out.println(n.data);
			n = n.next;
		}
	}
	


	@Override
	public int getSize() {
		int p=0;
		Node t = head;
		while(t.next != null){
			t = t.next;
			p++;
		}
		return p;
	}

	@Override
	public void delete(int index) {
		Node n = head;
		int p=0;
		while(p != index-1){
			n = n.next;
			p++;
		}
		n.next = n.next.next;
	}

	@Override
	public void clear() {
		head=null;
	}

	@Override
	public void search(String f, String l, int s,String p) {
		Node n = head;
		boolean b= false;
		while(n != null){
			String ff = ((Student) n.data).getFname();
			String ll = ((Student) n.data).getLname();
			int ss = ((Student) n.data).getSn();
			String pp = ((Student) n.data).getProg();
			if(ff==f && ll==l && ss==s && pp==p ){
				System.out.println(n.data);
				b= true;
			}
			n = n.next;
		}
		if(b==false){
			System.out.println("Student not found !");
		}
		
	}

	//bubble sort
	@Override
	public void sort1() {
		 
		Node n = head;
		Node tmp = new Node();
		boolean b = true;
		while(b){
			b = false;
			while(n.next != null){
				
				if(((Student) n.data).getSn() < ((Student) n.next.data).getSn()){
					tmp.data = n.data;
					n.data = n.next.data;
					n.next.data = tmp.data;
					b = true;
				}
				n = n.next;
			}
			n = head;
		}
		

	}
	
	
	//selection sort
	@Override
	public void sort2() {
		Node n = head;
		Node tmp = new Node();
		Node k = head;
		Node c = head;
		Node d = null;
		while(n.next != null){
			d=n;
			k=n.next;
			
			while(k != null){
				if(((Student) k.data).getSn() < ((Student) d.data).getSn()){
					tmp.data = k.data;
					d = k;
					d.data = n.data;
					n.data = tmp.data;
					d=n;
				}
				k = k.next;
			}
			n = n.next;
		}
		
	}


	

}
