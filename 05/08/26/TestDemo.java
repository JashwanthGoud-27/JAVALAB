class Test
{
int a, b; 
Test()
{ 
a=10; b=20;
System.out.println("Value of a: "+a); 
System.out.println("Value of b: "+b);
}
void test()
{
System.out.println("Test method called");
}
}
class TestDemo
{
public static void main(String[] args)
{
Test t1=new Test();
t1.test();
}
}
