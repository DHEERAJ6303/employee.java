class Employee {

    /**
     * @param args the command line arguments
     */
    private final String name;
    private final int year;
    private final String address;
    private final int salary;
    public Employee(String employee,String employeeaddress,int employeeyear,int employeesalary){
        name =employee;
        address =employeeaddress;
        year=employeeyear;
        salary=employeesalary;
        
        
    }
    public String getName(){
        return name;
        
    }
    public String getAddress(){
        return address;
        
    }
    public int getYear(){
        return year;
    }
    public int getSalary(){
        return salary;
        
    }
  
    
        
    
}
class Emp{

    public static void main(String[] args){
        Employee e1 = new Employee("Robert", "64C- WallsStreet", 1994, 6000);
    Employee e2 = new Employee("Sam", "68d- WallsStreet", 2000, 7000 );
    Employee e3 = new Employee("John","26B- WallsStreet", 1999, 600000);
    System.out.println("Name\tYear of joining\tSalary\tAddress");
      // printing details of employee 3
      System.out.println(e1.getName()+"\t"+e1.getYear()+"\t\t\t"+e1.getSalary()+"\t"+e1.getAddress());  // printing details of employee 1
      System.out.println(e2.getName()+"\t"+e2.getYear()+"\t\t\t"+e2.getSalary()+"\t"+e2.getAddress());  // printing details of employee 2
      System.out.println(e3.getName()+"\t"+e3.getYear()+"\t\t\t"+e3.getSalary()+"\t"+e3.getAddress());// printing details of employee 3
  }
      
    


}

    
