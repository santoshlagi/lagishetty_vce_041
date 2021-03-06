import java.util.Date;
import java.util.Arrays;
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		
		return this.students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here

		if(students==null){
			throw new IllegalArgumentException();
		}
		else{
			this.students=students;
		}
	}

	@Override
	public Student getStudent(int index) {
		if(index<=0 || index>=this.students.length){
			throw new IllegalArgumentException();
		}
		else{
		return this.students[index];
		}
	}

	@Override
	public void setStudent(Student student, int index) {
		if(students==null){
			throw new IllegalArgumentException();
		}
		if(index<=0 || index>=this.students.length){
			throw new IllegalArgumentException();
		}
		else{
			this.students[index]=student;
		}
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		if(student==null){
			throw new IllegalArgumentException();
		}
		else{
			Student[] x= new Student[this.students.length+1];
			x[0]=student;
			int j=0;
			for(int i=1;i<=this.students.length;i++) {
			x[i]=this.students[j];
			j++;
			}
			this.students = new Student[x.length];
			this.students = x;
}
		
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		if(student == null) {
		throw new IllegalArgumentException();
		}
		else {
			Student[] x= new Student[this.students.length+1];
			x[this.students.length-1]=student;
	
			x[this.students.length]=this.students[this.students.length-1];
				x[this.students.length+1]= this.students[this.students.length];
				this.students = new Student[x.length];
			this.students = x;
}
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		if(index<0 || index>=this.students.length || student == null) {
			throw new IllegalArgumentException();
			}
		else {
			Student[] x= new Student[this.students.length+1];
			x[index]=student;
			for(int i=index;i<this.students.length;i++) {
		x[i+1]=this.students[i];
		}
		this.students = new Student[x.length];
		this.students = x;
}
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		if(index<0 || index>=this.students.length) {
		throw new IllegalArgumentException();
		}
		else {
		Student[] x= new Student[this.students.length-1];
		x=this.students;
		for(int i=index;i<this.students.length;i++) {
		x[i]=this.students[i+1];
		}
		this.students = new Student[x.length];
		this.students = x;
		}
		}
		// Add your implementation here
	

	@Override
	public void remove(Student student) {
		if(student==null) {
		throw new IllegalArgumentException();
		}
		else {

			for(int i=0;i<this.students.length;i++) {
			if(student==this.students[i]) {
			Student[] x= new Student[this.students.length-1];
			x=this.students;
			for(int j=i;j<this.students.length;j++) {
		x[j]=this.students[j+1];
		}
			this.students = new Student[x.length];
				this.students = x;
		break;
}
}
}
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		if(index<0 || index>=this.students.length) {
			throw new IllegalArgumentException();
		}
		else {
		Student[] x= new Student[index];

		for(int i=0;i<index;i++) {
		x[i]=this.students[i];
		}
		this.students = new Student[x.length];
		this.students = x;
		}
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		if(student==null) {
		throw new IllegalArgumentException();
		}
		else {

			for(int i=0;i<this.students.length;i++) {
			if(student==this.students[i]) {
		Student[] x= new Student[i+1];
		for(int j=0;j<i+1;j++) {
		x[j]=this.students[j];
		}
		this.students = new Student[x.length];
		this.students = x;
		break;
}
}
}
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		if(index<0 || index>=this.students.length) {
			throw new IllegalArgumentException();
		}
		else {
		Student[] x= new Student[this.students.length-index-1];

			for(int i=index;i<this.students.length;i++) {
			x[i]=this.students[i];
		}
		this.students = new Student[x.length];
		this.students = x;
	}
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		if(student==null) {
		throw new IllegalArgumentException();
		}
	else {

	for(int i=0;i<this.students.length;i++) {
		if(student==this.students[i]) {
		Student[] x= new Student[this.students.length-i-1];

		for(int j=0;j<=i;j++) {
			x[j]=this.students[j];
		}
		this.students = new Student[x.length];
		this.students = x;
		break;
	}
	}
	}
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		if(date==null) {
			throw new IllegalArgumentException();
		}
		else {
			Student[] x=students;
			int j=0;
		for(int i=0;i<this.students.length;i++) {
		if(this.students[i].getBirthDate().equals(date)) {
		x[j]=this.students[i];
		j++;
		}
	}
		Student[] y = new Student[j+1];
	y=x;
	return y;
}
		// Add your implementation here
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		return null;
		// Add your implementation here
		
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
	Student[] s =this.students;
	int count = Integer.MIN_VALUE;
	int j=0;
	for(int i=0;i<this.students.length;i++) {
	if(count<this.students[i].getAvgMark()) {
	s[j]=students[i];
	j++;
	}
	}
	Student[] y = new Student[j+1];
	y=s;
	return y;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		if(student == null) {
		throw new IllegalArgumentException();
	}
		else {
		for(int i=0;i<this.students.length;i++) {
			if(this.students[i]==student) {
				return this.students[i+1];
		}
	}
	}
	return null;
	}
	
}
