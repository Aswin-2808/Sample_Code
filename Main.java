/*public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
    System.out.println("It is awesome!");
    System.out.println(2*5+20-15/3);
int a=5,b=5,c=a+b;
double db=a;
    System.out.println("Calculated Answer: " + c);
    System.out.println(db); 
  }
}

public class Main{
public static void myMethod(){
	System.out.println("hi aswin"+(20+30));
}
public static void main(String[] args){
myMethod();
}
}*/


public class Main {
    public static void myMethod(int age) {
        if (age < 24) {
            System.out.println("Not Eligible");
        } else {
            System.out.println("Eligible");
        }
    }
public static void myMethod2(){
int a=20,b=30,c=a+b;
System.out.println("Total is :"+c);
}
    public static void main(String[] args) {
        //myMethod(25);
     Main meth = new Main();
	meth.myMethod2();

    }
}




