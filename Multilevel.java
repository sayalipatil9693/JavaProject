

class shape{
    shape()
    {
        System.out.println("shape no argument");
    }
    void func1()
    {
        System.out.println("func1");
    }
}
class Polygon extends shape
{
  Polygon()
  {
     System.out.println("polygon no argument");
  }
void func2()
     {
       System.out.println("func2");
     }
}
class Circle extends Polygon
 {
    Circle()
     {
        System.out.println("circle no argument");
     }
      void func3()
      {
        System.out.println("func3");
      }
 }

public class Multilevel {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.func1();
        obj.func2();
        obj.func3();
    }
    
}
