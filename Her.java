class A 
{
    A()
    {
        System.out.println("A class");
    }
    void display1()
    {
        System.out.println("A display1");
    }

}

class B extends A
{
   B()
   {
    System.out.println("B class");
   }
    void display2()
    {
        System.out.println("B display2");
    }

}

class C extends A
{
  C()
  {
    System.out.println("C class");
  }
  void display3()
  {
    System.out.println("C display3");
  }

}

public class Her {
    public static void main(String[] args) {
        B obj = new B(); // A & B both constuct get called
        obj.display1();  // A shared data with B hence A & B fun get accessed
        obj.display2();

        C obc = new C();  //A & C both constuct get called
        obj.display1();   // A shared data with C hence A & C fun get accessed
        obc.display3();

    }
    
}
