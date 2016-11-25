package data;
import sort.Comperator;
public class MatriculationsNumberComparator implements Comperator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getSn() - o2.getSn();
	}

}
