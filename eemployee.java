import java.util.*;
class eemployee
{
int empid,salary;
String empname,eaddress;
eemployee (int emid,String ename,String address,int sal)
{
Empid=empid;
Empname=ename;
eaddress=address;
salary=sal;
}
void print()
{
System.out.println(“Employee id : “+Empid);
System.out.println(“Employee Name : “+Empname);
System.out.println(“Employee Address : “+eaddress);
System.out.println(“Employee Salary : “+salary);
}
}
class teacher extends employee
{
String dept,sub1,sub2,sub3;
teacher(String deptm,String subj1,String subj2,String subj3)
{
dept=deptm;
sub1= subj1;
sub2= subj2;
sub3= subj3;
}
Void show()
{
System.out.println(“Department: “+dept);
System.out.println(“Subject 1: “+sub1);
System.out.println(“Subject 2: “+sub2);
System.out.println(“Subject 3: “+sub3);
}
Public static void main (String args[])
{
Teacher t=new teacher[3];
t[1].print();
t[1].show();
t[2].print();
t[2].show();
t[3].print();
t[3].show();
}
}
