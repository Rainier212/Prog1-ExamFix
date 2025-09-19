/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    public string setfullname(String fullname){
        fullname = new fullname();
    }
    
    public String getfullname(){
        return(fullname);
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     * (Question 12)
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        if(age>=16){
            System.out.println("You can drive"); 
        } else {
            System.out.println("You have to  wait" + (16-age) + " years to start driving.");
        }
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     * (Question 13)
     */
    private double calculatePay(){
        int hours = hoursWorked();
        double taxes = taxes(0.3);
        salary = hourlyWage * (hours + unpaidHours);
        calculatePay = salary - (salary * taxes);
        return(calculatePay);
    }

    /*
     * Output the payment record and resets unpaid hours
     * (Question 14)
     */
    public void paySalary(){
        double payment = calculatePay();
        System.outprintln("fullname has received a wire transfer of" + calculatePay + "CAD");
        setunpaidHours(0.0);
    }
}