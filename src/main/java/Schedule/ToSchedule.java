package Schedule;

import java.util.Scanner;

public class ToSchedule {
   int month = 2, day = 2, hour = 2, optionMounth, optionDay, optionHour;
   String namePatient, nameProcedure, nameMonth;
   private String[][][] date = new String[month][day][hour];
   Scanner input = new Scanner(System.in);

   public void calendar()
   {

      System.out.println("""
                
                |===============|
                |Available dates|
                |===============|
                """);

      for (int i = 0; i <= month-1; i++)
      {
         for (int j = 0; j <= day-1; j++)
         {
            for (int k = 0; k <= hour-1; k++)
            {
               if (i == 0)
               {
                  nameMonth = "January";
               }

               else if (i == 1)
               {
                  nameMonth = "February";
               }

               date[i][j][k] = (nameMonth + "/" + (j+1) + " at " + (k+8) + ":00");
               System.out.println(date[i][j][k]);
            }
         }
      }
   }

   public ToSchedule() {

      calendar();

      System.out.println("""
              
              Choose the month:
              1. January
              2. February""");

      this.optionMounth = input.nextInt();

      if (this.optionMounth == 1)
      {
         nameMonth = "January";
      }

      else if (this.optionMounth == 2)
      {
         nameMonth = "February";
      }

      System.out.println("Choose the day");

      this.optionDay = input.nextInt();

      System.out.println("choose the time");

      this.optionHour = input.nextInt();

      first:
      for (int i = 0; i <= month-1; i++)
      {
         second:
         for (int j = 0; j <= day - 1; j++)
         {
            third:
            for (int k = 0; k <= hour - 1; k++)
            {
               if(date[i][j][k].equals(this.nameMonth + "/" + this.optionDay + " at " + this.optionHour + ":00"))
               {
                  System.out.println("Enter the patient's name");
                  this.namePatient = input.next();

                  System.out.println("Enter the Procedure name");
                  this.nameProcedure = input.next();

                  String schedule = this.nameMonth + "/" + this.optionDay + " at " + this.optionHour + ":00";

                  System.out.println("The patient's " + namePatient + " scheduled their procedure of " + nameProcedure + " for " + schedule);
                  return;
               }
            }
         }
      }
      System.out.println("This date and time is not available");
   }
}
