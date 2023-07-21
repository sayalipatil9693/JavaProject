class Department{
   int departid;
   String departname;

   Department()
   {
      departid = 1111;
      departname = "edjp";
   }


   void display()
   {
    System.out.println(departid + " " + departname);
   }
}
   class Employee extends Department
   {
      int empid;
      String name;

      Employee()
      {
         empid =101;
         name = "mohan";

      }
      void show()
      {
         System.out.println(empid + " " + name );
      }


   }
class SingleInheritance {
   public static void main(String[] args) {
      Employee obj = new Employee();
      obj.display();
      obj.show();
   }


    
}
