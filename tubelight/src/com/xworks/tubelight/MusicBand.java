package com.xworks.tubelight;

public class MusicBand {

/*	 public static int reverse(int a) {
		int rem=0;
		int revs=0;
		while (a!=0)
		{
			rem=a%10;
			revs= revs*10+rem;
			a=a/10;
		}
		return revs;
	}
	 public static void main(String[] args) {
		 int a=5462;
				 System.err.println(reverse(a));
		 
		 System.out.println(MusicBand.reverse(2456));
}
}*/

public static void main(String[] args) {
	
// initializing variables
int num = 5;

// first 5 gets printed and then
// increment to 6
System.out.println("Post " + "increment = " + num++);
System.out.println(num);
System.out.println(num);

// num was 6, incremented to 7
// then printed
System.out.println("Pre  "  + "increment = " + ++num);
System.out.println(num);
}
}
