package polymorphism.hospital;

public class Hospital {
        private static final int MAX_EMPLOYEES = 3;
        Person[] employees = new Person[MAX_EMPLOYEES];
        private int employeesNumber = 0;


        public void add(Person person){
           if(employeesNumber<MAX_EMPLOYEES){
               employees[employeesNumber] = person;
               employeesNumber++;
           }else{
               System.out.println("You can't add more employees");
           }
        }

        public String getInfo() {
            String result = "";
            for (int i = 0; i < employeesNumber; i++) {
                result += employees[i].getInfo() + "\n";
            }
           return result;
        }
    }


