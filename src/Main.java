class Main {
 
    public static void main (String[] args){
        Person person = new Person("Justine Kyle B. Remulta" , 2002);
        Student student= new Student("Justine Kyle B. Remulta" , 2002 , "BSIT");
        Instructor instructor= new Instructor("Ma'am Phoebe Sudaria" , 1991 , 40000);
        
        System.out.println("Student Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Year of Birth: " + student.getYearOfBirth());
        System.out.println("Major: " + student.getMajor());
        
        
        System.out.println("-------------------------------------");
        
        System.out.println("Instructor Information:");
        System.out.println("Name: " + instructor.getName());
        System.out.println("Year of Birth: " + instructor.getYearOfBirth());
        System.out.println("Salary: $" + instructor.getSalary());
        
    
    }
}
