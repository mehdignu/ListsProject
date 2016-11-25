package data;

import sort.Comperator;

public class PrenameComperator implements Comperator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if((o1 == null) && (o2 == null)){
			return 0;
		}else if(o1.getFname() == null){
			return 1;
		} else if (o2.getFname() == null){
			return -1;
		}
		return o1.getFname().compareTo(o2.getFname());
	}
}
