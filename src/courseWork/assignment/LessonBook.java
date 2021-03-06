package courseWork.assignment;

import javax.annotation.processing.SupportedSourceVersion;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static courseWork.assignment.Index.*;
import static courseWork.assignment.Index.attendLessons;

public class LessonBook {


    TimeTable t = new TimeTable();
    void booking()
    {
        sYoga=0;sRunning=0;sBodyFit=0;sBodyBlitz=0; sAquacise=0; sZumba=0;
        Scanner o = new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO BOOK RESPECTIVE LESSON: ");
        int bookLesson = o.nextInt();
        for(int i=0;i< bookedLessons.length;i++)
        {
            for(int j=0;j<bookedLessons[i].length;j++)
            {
                if(bookedLessons[i][j].equals("YOGA"))
                {
                    sYoga++;
                }
                if(bookedLessons[i][j].equals("RUNNING"))
                {
                    sRunning++;
                }
                if(bookedLessons[i][j].equals("BODY FIT"))
                {
                    sBodyFit++;
                }
                if(bookedLessons[i][j].equals("BODY BLITZ"))
                {
                    sBodyBlitz++;
                }
                if(bookedLessons[i][j].equals("AQUACISE"))
                {
                    sAquacise++;
                }
                if(bookedLessons[i][j].equals("ZUMBA"))
                {
                    sZumba++;
                }

            }
        }

            if (bookLesson==1)
            {
                if (Index.sYoga<4){
                    if(Index.students[a][2].equals("Yoga"))
                    {
                        System.out.println("Error-> You have already Booked it\n");
                        t.selectTimeTable();
                    }
                    else{
                        Index.sYoga++;
                        Random r = new Random();
                        List<Integer> codes = new ArrayList<>();
                        for (int i = 0; i < 10; i++)
                        {
                            int x = r.nextInt(9999);
                            while (codes.contains(x))
                                x = r.nextInt(9999);
                            codes.add(x);
                        }
                        String orderNo = String.format("%04d", codes.get(0));

                        System.out.println("Status: Booked");
                        System.out.println("lesson Booked by "+Index.students[a][1]+"\n");
                        Index.students[a][2]="Yoga";
                        bookedLessons[a][0]=Index.students[a][1];
                        bookedLessons[a][1]="Yoga";
                        bookedLessonsID[a][0]= students[a][1];
                        bookedLessonsID[a][1]=orderNo;

                    }


                }
                else{
                    System.out.println("SEATS FULL...");
                    sYoga=0;sRunning=0;sBodyFit=0;sBodyBlitz=0; sAquacise=0; sZumba=0;
                    t.selectTimeTable();
                }

            }
            else if (bookLesson==2){
                if (Index.sRunning<4){
                    if(Index.students[a][3].equals("RUNNING"))
                    {
                        System.out.println("Error-> You have already Booked it\n");
                        t.selectTimeTable();
                    }
                    else
                    {
                        Index.sRunning++;
                        Random r = new Random();
                        List<Integer> codes = new ArrayList<>();
                        for (int i = 0; i < 10; i++)
                        {
                            int x = r.nextInt(9999);
                            while (codes.contains(x))
                                x = r.nextInt(9999);
                            codes.add(x);
                        }
                        String orderNo = String.format("%04d", codes.get(0));


                        System.out.println("Status: Booked");
                        System.out.println("lesson Booked by "+Index.students[a][1]);
                        Index.students[a][3]="RUNNING";
                        bookedLessons[a][0]=Index.students[a][1];
                        bookedLessons[a][2]="RUNNING";
                        bookedLessonsID[a][0]= students[a][1];
                        bookedLessonsID[a][2]=orderNo;
                    }

                }
                else{
                    System.out.println("SEATS FULL...");
                    sYoga=0;sRunning=0;sBodyFit=0;sBodyBlitz=0; sAquacise=0; sZumba=0;
                    t.selectTimeTable();

                }

            }
            else if (bookLesson==3){
                if (Index.sBodyFit<4){
                    if(Index.students[a][4].equals("BODY FIT"))
                    {
                        System.out.println("Error-> You have already Booked it\n");
                        t.selectTimeTable();
                    }
                    else
                    {
                        Index.sBodyFit++;
                        Random r = new Random();
                        List<Integer> codes = new ArrayList<>();
                        for (int i = 0; i < 10; i++)
                        {
                            int x = r.nextInt(9999);
                            while (codes.contains(x))
                                x = r.nextInt(9999);
                            codes.add(x);
                        }
                        String orderNo = String.format("%04d", codes.get(0));

                        System.out.println("Status: Booked");
                        System.out.println("lesson Booked by "+Index.students[a][1]);
                        Index.students[a][4]="BODY FIT";
                        bookedLessons[a][0]=Index.students[a][1];
                        bookedLessons[a][3]="BODY FIT";
                        bookedLessonsID[a][0]= students[a][1];
                        bookedLessonsID[a][3]=orderNo;
                    }

                }
                else{
                    System.out.println("SEATS FULL...");
                    sYoga=0;sRunning=0;sBodyFit=0;sBodyBlitz=0; sAquacise=0; sZumba=0;
                    t.selectTimeTable();
                }

            }


            if (bookLesson==4){
                if (Index.sBodyBlitz<4){
                    if(Index.students[a][5].equals("BODY BLITZ"))
                    {
                        System.out.println("Error-> You have already Booked it\n");
                        t.selectTimeTable();
                    }
                    else
                    {
                        Index.sBodyBlitz++;
                        Random r = new Random();
                        List<Integer> codes = new ArrayList<>();
                        for (int i = 0; i < 10; i++)
                        {
                            int x = r.nextInt(9999);
                            while (codes.contains(x))
                                x = r.nextInt(9999);
                            codes.add(x);
                        }
                        String orderNo = String.format("%04d", codes.get(0));
                        System.out.println("Status: Booked");
                        System.out.println("lesson Booked by "+Index.students[a][1]);
                        Index.students[a][5]="BODY BLITZ";
                        bookedLessons[a][0]=Index.students[a][1];
                        bookedLessons[a][4]="BODY BLITZ";
                        bookedLessonsID[a][0]= students[a][1];
                        bookedLessonsID[a][4]=orderNo;
                    }

                }
                else{
                    System.out.println("SEATS FULL...");
                    sYoga=0;sRunning=0;sBodyFit=0;sBodyBlitz=0; sAquacise=0; sZumba=0;
                    t.selectTimeTable();

                }

            }
            else if (bookLesson==5){
                if (Index.sAquacise<4){
                    if(Index.students[a][6].equals("AQUACISE"))
                    {
                        System.out.println("Error-> You have already Booked it\n");
                        t.selectTimeTable();
                    }
                   else {
                        Index.sAquacise++;
                        Random r = new Random();
                        List<Integer> codes = new ArrayList<>();
                        for (int i = 0; i < 10; i++)
                        {
                            int x = r.nextInt(9999);
                            while (codes.contains(x))
                                x = r.nextInt(9999);
                            codes.add(x);
                        }
                        String orderNo = String.format("%04d", codes.get(0));
                        System.out.println("Status: Booked");
                        System.out.println("lesson Booked by "+Index.students[a][1]);
                        Index.students[a][6]="AQUACISE";
                        bookedLessons[a][0]=Index.students[a][1];
                        bookedLessons[a][5]="AQUACISE";
                        bookedLessonsID[a][0]= students[a][1];
                        bookedLessonsID[a][5]=orderNo;
                    }
                }
                else{
                    System.out.println("SEATS FULL...");
                    sYoga=0;sRunning=0;sBodyFit=0;sBodyBlitz=0; sAquacise=0; sZumba=0;
                    t.selectTimeTable();
                }

            }
            else if (bookLesson==6){
                if (Index.sZumba<4){
                    if(Index.students[a][7].equals("ZUMBA"))
                    {
                        System.out.println("Error-> You have already Booked it\n");
                        t.selectTimeTable();
                    }
                    else
                    {
                        Index.sZumba++;
                        Random r = new Random();
                        List<Integer> codes = new ArrayList<>();
                        for (int i = 0; i < 10; i++)
                        {
                            int x = r.nextInt(9999);
                            while (codes.contains(x))
                                x = r.nextInt(9999);
                            codes.add(x);
                        }
                        String orderNo = String.format("%04d", codes.get(0));
                        System.out.println("Status: Booked");
                        System.out.println("lesson Booked by "+Index.students[a][1]);
                        Index.students[a][7]="ZUMBA";
                        bookedLessons[a][0]=Index.students[a][1];
                        bookedLessons[a][6]="ZUMBA";
                        bookedLessonsID[a][0]= students[a][1];
                        bookedLessonsID[a][6]=orderNo;
                    }
                }
                else
                {
                    System.out.println("SEATS FULL...");
                    sYoga=0;sRunning=0;sBodyFit=0;sBodyBlitz=0; sAquacise=0; sZumba=0;
                    t.selectTimeTable();
                }
            }
        mainMenuAttend();

    }

    void mainMenuAttend()
    {
        System.out.println("1: TO CHANGE BOOKING ");
        System.out.println("2: TO CANCEL BOOKING ");
        System.out.println("3: TO BOOK LESSON ");
        System.out.println("4: TO ATTEND LESSON ");
        System.out.println("5: Monthly Lesson Report ");
        System.out.println("6: Monthly Champion Exercise Report ");
        System.out.println("7: Exit ");
        System.out.print("choose an option: ");
        Scanner a = new Scanner(System.in);
        int c=a.nextInt();
        if (c==1){
           changeBooking changebook= new changeBooking();
           changebook.changeBookingLesson();
        }
        else if (c==2){
            System.out.println("DO YOU REALLY WANT TO CANCEL BOOKING? ");
            Scanner ip= new Scanner(System.in);

            System.out.println("press y for yes, and n to go to main menu: ");
            char opt = ip.next().charAt(0);
            if (opt == 'y'){
                cancelBooking();
            }
            else if(opt == 'n'){
                mainMenuAttend();
            }
            else{
                System.out.println("WRONG INPUT");
                mainMenuAttend();

            }
        }
        else if(c==3){
            t.selectTimeTable();
        }
        else if(c==4){
            Attend attend = new Attend();
            attend.attendLesson();
        }
        else if(c==5){
            monthlyReport mR= new monthlyReport();
            mR.WeeksReport();
        }
        else if(c==6){
            monthlyReport mR2= new monthlyReport();
            mR2.championExerciseReport();
        }
        else if(c==7){
            System.exit(0);
        }
        else{
            System.out.println("Wrong INPUT!!!");
            mainMenuAttend();
        }
    }

     void cancelBooking() {
         int z=0;
         for (int i=a;i<a+1;i++)
         {
             for(int j=0;j<bookedLessons[i].length;j++)
             {
                 if(j==0){
                     System.out.println("Lessons Booked by Mr."+bookedLessons[i][j]+" are:");
                     System.out.println("\nBooking ID : Booked Lessons");
                 }
                 if(j!=0)
                 {
                     if(bookedLessons[i][j]!="null")
                     {
                         z++;
                         System.out.println(z+": "+bookedLessonsID[i][j]+" : "+bookedLessons[i][j]);
                     }

                 }
             }
         }



    int p=0;
    System.out.print("Enter Booking ID of lesson you wanna change: ");
         Scanner scan = new Scanner(System.in);
   String atp=scan.next();

   for (int k=a;k<a+1;k++)
    {
        for (int j=0;j<bookedLessons[k].length;j++)
        {
            if(bookedLessonsID[k][j].equals(atp))
            {p=1;
                bookedLessonsID[k][j]="null";
                bookedLessons[k][j]="null";
                students[k][j+1]="null";

                System.out.println("Status: Cancelled\n");
                mainMenuAttend();
            }

        }
    }
            if(p==0)
    {
        System.out.println("\nError-->This Booking ID doesn't exist");
        System.out.println("Try Again...\n");
       cancelBooking();
    }
            System.out.println();

}
}
