import java.util.Scanner;

public class Project_Yusuf_Shire
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      int policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;

      System.out.print("Please enter the Policy Number: ");
      policyNumber = keyboard.nextInt();
      keyboard.nextLine();

      System.out.println();

      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();

      System.out.println();

      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = keyboard.nextLine();

      System.out.println();

      System.out.print("Please enter the Policyholder's Last Name: ");
      lastName = keyboard.nextLine();

      System.out.println();

      System.out.print("Please enter the Policyholder's Age: ");
      age = keyboard.nextInt();
      keyboard.nextLine();

      System.out.println();

      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokingStatus = keyboard.nextLine();

      System.out.println();

      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = keyboard.nextDouble();

      System.out.println();

      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weight = keyboard.nextDouble();

      System.out.println();

      Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age,
                                 smokingStatus, height, weight);

      System.out.println("Policy Number: " + policy.getPolicyNumber());
      System.out.println();
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println();
      System.out.println("Policyholder's First Name: " + policy.getFirstName());
      System.out.println();
      System.out.println("Policyholder's Last Name: " + policy.getLastName());
      System.out.println();
      System.out.println("Policyholder's Age: " + policy.getAge());
      System.out.println();
      System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
      System.out.println();
      System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
      System.out.println();
      System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
      System.out.println();
      System.out.printf("Policyholder's BMI: %.2f\n", policy.calculateBMI());
      System.out.println();
      System.out.printf("Policy Price: $%.2f\n", policy.calculatePolicyPrice());
   }
}