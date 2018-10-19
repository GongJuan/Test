package servlet;

public class Student extends Person{
	private int num;
	public Student(String name, int age, String sex,int num) {
		
		super(name, age, sex);
		this.num=num;
	
	}

public void showof()
{
	System.out.println("学号："+num);
}
	public void show()
	{
		System.out.println("初始化学号："+"20160101001\n");
	}
	
	public static void main(String[] args)
	{	
		Student student=new Student("小敏\n", 18, "女\n",12342);
	    student.shows();
		student.show();
		student.showinfo();
		student.showof();
		
		
		
		
	}
}
