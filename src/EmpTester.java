public class EmpTester {
    public static void main(String[] args) {
//        Emp emp1 = new Emp("Adele", 1500);
//        Emp emp2 = new Emp("Burt", 1500);
//        emp1.displayInfo();
//        emp2.displayInfo();

        SalEmp salEmp1 = new SalEmp("Carol", 2000, 1200);
        SalEmp salEmp2 = new SalEmp("Jean", 2000, 1200);

        salEmp1.displayInfo();
        salEmp2.displayInfo();

        HourlyEmp empHour1 = new HourlyEmp("Gloria", 200, 15, 1000);


        empHour1.displayInfo();

        CommEmp comEmp = new CommEmp("Doug", 200000, 0.10, 1000);

        comEmp.displayInfo();
        BusinessCar car = new BusinessCar("Toyota", "Lexus", "2015");
        BusinessCar car2 = new BusinessCar("Toyota", "Camry", "2015");
        BusinessCar car3 = new BusinessCar("Ford", "Taurus", "1900");

        BpCommEmp bpCommEmp = new BpCommEmp("Grace", 300000, 0.2, 1500, car);
        BpCommEmp bpCommEmp2 = new BpCommEmp("Luke", 200000, 0.2, 3000, car2);
        BpCommEmp bpCommEmp3 = new BpCommEmp("Linda", 300000, 0.2, 1500, car3);
        bpCommEmp.displayInfo();
        bpCommEmp2.displayInfo();
        bpCommEmp3.displayInfo();
        // Extra credit: if Linda has no car, we pass 4 parameters
        System.out.println("Linda has no car: ");
        BpCommEmp bpCommEmp4 = new BpCommEmp("Linda", 300000, 0.2, 1500);
        bpCommEmp4.displayInfo();
        Emp[]emp = new Emp[4];
        emp[0]=salEmp1;
        emp[1]=empHour1;
        emp[2]=comEmp;
        emp[3]=bpCommEmp;
        for (int i=0;i<emp.length;i++){
            if (emp[i] instanceof CommEmp) System.out.printf("Wow! Employee %d is a %s%n",i,emp[i].getClass().getName());

            System.out.printf("Employee %d is a %s%n",i,emp[i].getClass().getName() );
        }


    }
}
