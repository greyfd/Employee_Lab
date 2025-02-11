//********************************************************************
//  Firm.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates polymorphism via inheritance.
//********************************************************************

public class Firm
{
   //-----------------------------------------------------------------
   //  Creates a staff of employees for a firm and pays them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {   
       StaffMember[] staffList = new StaffMember[8];

      staffList[0] = new Executive ("Elliot", "123 Main Line",
         "555-0469", "123-45-6789", 2423.07);

      staffList[1] = new Employee ("Dr. Kelso", "456 Off Line",
         "555-0101", "987-65-4321", 1246.15);
      staffList[2] = new Employee ("Turk", "789 Off Rocker",
         "555-0000", "010-20-3040", 1169.23);

      staffList[3] = new Hourly ("Dr. Cox", "678 Fifth Ave.",
         "555-0690", "958-47-3625", 10.55);

      staffList[4] = new Volunteer ("J.D.", "987 Suds Blvd.",
         "555-8374");
      staffList[5] = new Volunteer ("Carla", "321 Duds Lane",
         "555-7282");
      staffList[6] = new Commission("Caden", "9847 George Lane", "847-654-1234", "986-735-3673", 6.25, .20);
      staffList[7] = new Commission("Talan", "6345 Pop Lane", "847-567-9876", "986-735-675", 9.75, .15);



      ((Executive)staffList[0]).awardBonus(500);
      ((Hourly)staffList[3]).addHours(40);
      ((Commission)staffList[6]).addHours(35);
      ((Commission)staffList[6]).addSales(400);
      ((Commission)staffList[7]).addHours(40);
      ((Commission)staffList[7]).addSales(950);




      for(StaffMember staffMember : staffList) {
         System.out.println(staffMember.toString());
         System.out.println("Pay: " + staffMember.pay());
         System.out.println();
      }
      
     //3 Write the code to award a bonus of 500 to Elliot
      


      //4 Write the code to add 40 hours to Dr. Cox
      
   

   //-----------------------------------------------------------------
   //  Pays all staff members.
   //-----------------------------------------------------------------

   


   }
}
