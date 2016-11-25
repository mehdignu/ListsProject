package main;
import Prog1Tools.IOTools; 
import java.util.Scanner;
import data.Student;
import lists.Listable;
import lists.SinglyLinkedList;

public class main {

	public static void main(String[] args) {
		Student s1 = new Student("mehdi", "Dridi", 22, "1");
		Student s2 = new Student("Donald", "bock", 23, "0");
		Student s3 = new Student("micky", "mouse", 21, "1");
		Student s4 = new Student("yoo", "hoo", 20, "1");
		
		
		Listable<Student> list = new SinglyLinkedList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.sort1();
		list.printAll();
		
		
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
