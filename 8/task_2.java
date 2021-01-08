package homework;

import java.util.*;

class student implements Comparable{
	String id;
	String name;
	int age;
	
	public student(	String id1,String name1,int age1) {
		id = id1;
		name = name1;
		age = age1;
	}
	
	 public int compareTo(Object o) {
	      if (!(o instanceof student))
	        throw new RuntimeException("不是Cat对象");
	      student p = (student) o;
	      if (this.age > p.age)
	        return 1;
	      if (this.age == p.age){
	        return this.name.compareTo(p.name);
	      }
	      return -1;
	}
	 
		public int getId() {
			return id;
		}
	 
		public void setId(int id) {
			this.id = id;

		public String getName() {
			return name;
		}
	 
		public void setName(String name) {
			this.name = name;
		}
	 
		public int getAge() {
			return age;
		}
	 
		public void setAge(int age) {
			this.age = age;

}

public class task_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id;
		String name;
		int age;
		
		String temp;
		
		Scanner input = new Scanner(System.in); 
		Set<student> banji = new TreeSet<student>();
		
		
		
		System.out.println("请输入学生的学号");
		while(input.hasNext()){ 
			
			id = input.nextLine();
			if(id=="exit") {
				System.out.println("结束循环");
				break;
			}
			System.out.println("请输入学生的姓名");
			temp = input.nextLine();
			name = input.nextLine();
			System.out.println("请输入学生的年龄");
			temp = input.nextLine();
			age = input.nextInt();					//也可以直接创建类，然后使用内置函数；因为没写内置函数，故采用构造器
			
			
			student tmp = new student(id,name,age);
	        banji.add(tmp);
			
			System.out.println("请输入学生的学号");
			}
		

		for(student s:banji){
			System.out.println(s.getName()+"-----------"+s.getAge());

		
		
	}

}
