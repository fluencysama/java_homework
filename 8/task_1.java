package homework;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

class books{
	
	int num;
	String name;
	int danjia;
	String chubanshe;
	
	public books(int num1,String name1,int danjia1,String chubanshe1) {
		num = num1;
		name = name1;
		danjia = danjia1;
		chubanshe = chubanshe1;
	}
	
	public int getnum(){
		return num;
	}
	
	public String getname(){
		return name;
	}

	public int getdanjia(){
		return danjia;
	}
	
	public String getchubanshe(){
		return chubanshe;
	}
	
}

public class task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		String name;
		int danjia;
		String chubanshe;
		
		String temp;
		
		Scanner input = new Scanner(System.in); 
		
		LinkedList<books> shelf = new LinkedList<books>();
		
		System.out.println("请输入书的编号");
		while(input.hasNext()){ 
			
			num = input.nextInt();
			if(num<0) {
				System.out.println("结束循环");
				break;
			}
			System.out.println("请输入书的名称");
			temp = input.nextLine();
			name = input.nextLine();
			System.out.println("请输入书的单价");
			danjia = input.nextInt(); 
			System.out.println("请输入书的出版社");
			temp = input.nextLine();
			chubanshe = input.nextLine();
			
			books tmp = new books(num,name,danjia,chubanshe);
	        shelf.add(tmp);
			
			System.out.println("请输入书的编号");
			}

	       Iterator it = shelf.iterator();
	       while(it.hasNext()) {
	    	  books cat = (books)it.next();
	          System.out.print(cat.getnum()+"   ");
	          System.out.print(cat.getname()+"   ");
	          System.out.print(cat.getdanjia()+"   ");
	          System.out.print(cat.getchubanshe()+"   ");
	          System.out.println();
	       }

	}

}
