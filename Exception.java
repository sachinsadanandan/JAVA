
importjava.lang.Exception;
importjava.lang.*; 
importjava.lang.Exception; 
importjava.io.DataInputStream;
class MyException extends Exception
{ 
MyException(String message)
{ 
super(message); 
} 
} 
classuserdef
{ public static void main(String a[]) 
{ int age; 
DataInputStream ds=new DataInputStream(System.in);
try
{ System.out.println("Enter the age (above 15 abd below 25) :"); age=Integer.parseInt(ds.readLine()); 
if(age 25) 
{ throw new MyException("Number not in range"); 
} 
System.out.println(" the number is :" +age);
} 
catch(MyException)
{ System.out.println("Caught MyException"); 
System.out.println(e.getMessage());
} 
catch(Exception e)
{ 
System.out.println(e); 
} 
} 
}

