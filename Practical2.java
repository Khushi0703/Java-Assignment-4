package test.com; 
import java.io.IOException; 
public class Practical2 
{ 
void m()throws IOException 
{ 
throw new IOException("device error"); //throw an exception 
} 
void n()throws IOException 
{ 
m(); //call the m() method 
} 
void p() 
{ 
try 
{ 
n(); //call the n() method 
} 
catch(Exception e) 
{ 
System.out.println(e); 
} //catch the Exception 
} 
public static void main(String args[]) 
{ 
Prac4_2 obj=new Prac4_2(); 
obj.p();
System.out.println("Then Normal flow "); 
} 
}

/*
   class JavaException{
   public static void main(String args[]){
  try{
       throw new MyException(2);
       // throw is used to create a new exception and throw it.
  }
 catch(MyException e){
    System.out.println(e) ;
 }
}
}
class MyException extends Exception{
   int a;
   MyException(int b) {
     a=b;
   }
   public String toString(){
     return ("Exception Number =  "+a) ;
  }
}

 */