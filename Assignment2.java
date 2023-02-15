import java.util.Scanner;
public class Assignment2{
      public static void main(String[] args){
        String ans;
        Scanner totalEmployee = new Scanner(System.in);
        Scanner supervisorName = new Scanner(System.in);
        Scanner timeNuclearWaste = new Scanner(System.in);
        Scanner totalWasteWeight = new Scanner(System.in);
        Scanner isElectricMotorReplaced = new Scanner(System.in);
        Scanner coreTemperature = new Scanner(System.in);
        System.out.println("1.Enter total number of employee: ");
        int totalEmployeeValue = totalEmployee.nextInt();
        System.out.println("2.Enter the name of supervisor: ");
        String supervisorNameValue = supervisorName.nextLine();
        System.out.println("3.Enter number of time the nuclear waste is removed from the core: ");
        int timeNuclearWasteValue = timeNuclearWaste.nextInt();
        System.out.println("4.Enter the total weight of the waste produced every 1 week: ");
        Float totalWasteWeightValue = totalWasteWeight.nextFloat();
        System.out.println("5.Is Electric Motor being replaced every 18 days?");
        char isElectricMotorReplacedValue = isElectricMotorReplaced.next().charAt(0);
         System.out.println("6.What is the core average temperature(celsius) of the Nuclear Reactor?");
        Float coreTemperatureValue = coreTemperature.nextFloat();
        if(isElectricMotorReplacedValue == 'n')
        {
          ans = "Electric Motor is not being replaced every 18 days.";
        }
        else
        {
           ans = "Electric Motor is beign replaced every 18 days.";
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Summary of the interview");
        System.out.println("Last we conducted interview on the Nuclear Reactor name JX00-XC-HB1 which is located in the East of Japan.We got some useful information. They have " + totalEmployeeValue +" number of employees whose supervisor is "+supervisorNameValue+"."+timeNuclearWasteValue+" time the nuclear waste is removed from the core and "+totalWasteWeightValue+" total weight of the waste produced every 1 week. Similary, "+ans+"  The core average temperature of the nuclear reactor is "+coreTemperatureValue+"C and in kelvin it is "+(coreTemperatureValue+273.15)+"K.");
      }
}
