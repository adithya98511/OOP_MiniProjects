import java.util.Scanner;

public class Email
{
    // Declare variables

    private String firstname;
    private String lastname;
    private String department;
    private String password;
    private int mailboxCapacity;
    private String altEmail;


    //contructor for getting fname and lname

    public Email(String firstname, String lastname)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        // class var   // var we pass from the constructor

        //checking for the result
        System.out.println("Email created for "+this.firstname + " " + this.lastname);

       this.department = askDepartment();
        System.out.println("Department is :"+department);

    }


    private String askDepartment()
    {
        System.out.println("Enter your Department:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1)
        {
            return "Sales";
        } else if (choice == 2)
        {
         return "Development";
        } else if (choice == 3)
        {
         return "Other";
        }else
        {
            return  "None";
        }

    }

    //Generate a random pw

    // set the mailbox capacity

    //set the alternative email

    //change your password

    //get mailbox,alternative email

}
