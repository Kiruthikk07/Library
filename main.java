package FR8;
import java.util.Scanner;
public class Main {
	static String arr[]=new String[]{"java","Python","JavaScript","HTML and CSS","Advanced Java","PHP","Kotlin","SQL","Ruby","Flutter"};
	
	public static void booksList() {
		System.out.println("----------------");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("----------------");
	}
	public static void getBook() {
		Scanner sc=new Scanner(System.in);
		System.out.println("-------------------------------");
		System.out.println("Enter 1 to get Java");
		System.out.println("Enter 2 to get Python");
		System.out.println("Enter 3 to get JavaScript");
		System.out.println("Enter 4 to get HTML and CSS");
		System.out.println("Enter 5 to get Advanced Java");
		System.out.println("Enter 6 to get PHP");
		System.out.println("Enter 7 to get Kotlin");
		System.out.println("Enter 8 to get SQL");
		System.out.println("Enter 9 to get Ruby");
		System.out.println("Enter 10 to get Flutter");
		System.out.println("-------------------------------");
		int input=sc.nextInt();
		if(arr[input-1]=="") {
			System.out.println("----------------------------------------------");
			System.out.println("Sorry ,The book is currentlly not available");
			System.out.println("----------------------------------------------");
		}
		else {
			arr[input-1]="";
			System.out.println("--------------------------------");
			System.out.println("Book successfully taken");
			System.out.println("--------------------------------");
			
		}
	}
	public static void returnBook() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the book name : ");
		String book=sc.nextLine();
		System.out.println("Enter the ID : ");
		int id=sc.nextInt();
		if(arr[id-1]=="") {
			arr[id-1]=book;
			System.out.println("--------------------------------");
			System.out.println("Book successfully returned");
			System.out.println("--------------------------------");
		}
		else {
			System.out.println("-----------------------------------------");
			System.out.println("Already a book is available in that ID");
			System.out.println("-----------------------------------------");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the student : ");
		String name=sc.nextLine();
		System.out.println("Welcome " + name + " !");
		
		while(true) {
			System.out.println("-----------------------------------");
			System.out.println("Enter 1 to check the list of books"); 
			System.out.println("Enter 2 to get the book");
			System.out.println("Enter 3 to Return the book");
			System.out.println("Enter 4 to Exit");
			System.out.println("-----------------------------------");
			int input=sc.nextInt();
			
			switch(input) {
			case 1:
				booksList();
				break;
			case 2:
				getBook();
				break;
			case 3:
				returnBook();
				break;
			case 4:
				System.out.println("Thank you " + name +" !");
			    System.exit(0);
			    default:
			    	System.out.println("---------------------");
			    	System.out.println("Enter a Valid number");
			    	System.out.println("---------------------");
			}
		}
	}
}
