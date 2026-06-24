package first;
import java.util.*;
public class project {
	static double price;
	static int power(int x,int pow) {
		int result=1;
		while(pow>0) {
			result*=x;
			pow--;
		}
		return result;
	}
	static void series1() {
		for(int i=2;i<18;i+=2)
			System.out.print(i+" ");
		    System.out.println();
	}
	static void series2() {
		for(int i=50;i>=0;i-=10)
			System.out.print(i+" ");
			System.out.println();
	}
	static void square(int n) {
			System.out.println(n*n);
	}
	static void cube(int n) {
			System.out.println(n*n*n);
	}
	static void splitDigit(long n) {
		while(n>0){
			long a=n%10;
			n=n/10;
			System.out.println(a);
		}
	}
	static void spyNumber(int n) {
		int sum=0,pro=1;
		while(n>0){
			int a=n%10;
			n=n/10;
			sum+=a;
			pro*=a;
		}
		if(sum==pro) {
			System.out.println("spy number");
		}
		else {
			System.out.println("not a spy number");
		}
	}
	static void sqareDigits(long n) {
		while(n>0){
			long a=n%10;
			n=n/10;
			System.out.println(a*a);
		}
	}
	static void countDigits(long n) {
		int count=0;
		long temp=n;
		while(n>0){
			long a=n%10;
			n=n/10;
			count++;
		}
		System.out.println(temp+" is a "+count+" digit number");
	}
	static void printSumOfDivisors(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	static double input() {
		Scanner sc=new Scanner(System.in);
		return price=sc.nextDouble();
	}
	static void calculateCharge(double price) {
		if(price<=50000.0) {
			System.out.println(price);
		}
		else if(price>50000.0 && price<=100000.0) {
			System.out.println(price*0.9);
		}
		else if(price>100000.0 && price<=150000.0) {
			System.out.println(price*0.85);
		}
		else {
			System.out.println(price*0.8);
		}
	}
	static void sum(int a,double b) {
		double sum=(double)a+b;
		System.out.println(sum);
	}
	static void isCapital(char a) {
		if(a>=65 && a<=90) {
			System.out.println(a+" is a capital letter");
		}
		else {
			System.out.println(a+" is not a capital letter");
		}
	}
	static void isVowel(char a) {
		if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U'||a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
			System.out.println(a+" is a vowel");
		}
		else {
			System.out.println(a+" is a consonant");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.
		int sumodd=0;
		int sumeven=0;
		for (int i=0;i<=10;i++) {
			
			if (i%2==0) {
				sumeven+=i;
			}
			else {
				sumodd+=i;
			}
		}
		System.out.println(sumodd);
		System.out.println(sumeven);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		for (int i=0;i<10;i++) {
			System.out.println(n+"x"+i+"="+n*i);
		}
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int fact=1;
		for (int i=n;i>=1;i--) {
			fact*=i;
		}
		System.out.println(fact);
		for(char i='a';i<='z';i++) {
			System.out.println(i);
		}
		int m=5,n=10;
		for (int i=n;i>=1;i--) {
			System.out.println(m*i);
		}
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int sum=0;
		while(n>0) {
			sum+=n%10;
			n=n/10;
		}
		if(n%sum==0) {
			System.out.println("Harshad Number");
		}
		else {
			System.out.println("Not a Harshad Number");
		}
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		System.out.println(sum);*/
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int num=0;
		int temp=n;
		while(n>0) {
			num=10*num+n%10;
			n=n/10;
		}
		if(temp==num) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int pow=0;
		int temp=n;
		int temp2=n;
		while(n>0) {
			n=n/10;
			pow++;
		}
		int res=0;
		while(temp>0) {
			int x=temp%10;
			res+=power(x,pow);
			temp=temp/10;
		}
		if (res==temp2) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not a Armstrong Number");
		}
		int a[]=new int[20];
		System.out.println("Enter the value of the array: ");
		for(int i=0;i<20;i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0], min=a[0], sum=0;
		for(int i=1;i<20;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		for(int i=1;i<20;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		for(int i=0;i<20;i++) {
			sum+=a[i];
		}
		System.out.println("Minimum: "+min);
		System.out.println("Maximum: "+max);
		System.out.println("Sum: "+sum);
		series1();
		series2();
		square(10);
		cube(10);
		splitDigit(4327);
		spyNumber(1124);
		sqareDigits(42316);
		countDigits(34562);
		printSumOfDivisors(10);
		double a=input();
		calculateCharge(a);
		sum(2,2.0);
		isCapital('A');
		isVowel('a');
	}
}
