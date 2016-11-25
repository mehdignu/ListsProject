package main;
import Prog1Tools.IOTools;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import data.MatriculationsNumberComparator;
import data.PrenameComperator;
import data.Student;
import lists.DoublyLinkedList;
import lists.Listable;
import lists.SinglyLinkedList;
import sort.SelectionSort;
import sort.Sortable;

public class main {

	public static void main(String[] args) {
		Student s1 = new Student("mehdi", "Dridi", 22, "1");
		Student s2 = new Student("Donald", "bock", 23, "0");
		Student s3 = new Student("micky", "mouse", 21, "1");
		Student s4 = new Student("yoo", "hoo", 20, "1");
		
		
		Listable<Student> list = new DoublyLinkedList<Student>();
		//Listable<Student> list = new SinglyLinkedList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.addFirst(s4);
		list.addFirst(s4);
		list.addLast(s3);
		list.addLast(s3);
		//System.out.println("de : "+list.get(1));
		System.out.println(list.getSize());
		list.printAll();
		//System.out.println("");
	/*	List<Student> l = Arrays.asList(s1, s2, s3, s4);
		Sortable<Student> doSort = new SelectionSort<Student>();
		doSort.sort(l, new MatriculationsNumberComparator());
		printStudents(l);
		
		System.out.println("sortiert nach Prename");
		Sortable<Student> doSort1 = new SelectionSort<Student>();
		doSort1.sort(l, new PrenameComperator());
		printStudents(l);*/
		
	}
	
	public static void printStudents(List<Student> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + ". " + list.get(i));
		}
	}
	
	
	public static void input(Listable<Student> list){
		
        String	f = IOTools.readString("enter first name !");
        String	l = IOTools.readString("enter last name !");
        int	n = IOTools.readInteger("enter Student number !");
        String	p = IOTools.readString("enter program !");
        Student s = new Student(f,l,n,p);
        list.add(s);
		
	}

}
