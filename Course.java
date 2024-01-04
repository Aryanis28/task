import java.util.Scanner;

class courses 
{
    public void cse1()
    {
        Scanner sc=new Scanner(System.in);
        String name;
        int id;
        int available_seats=48;
        int admin;
        System.out.println("***********Welcome to the CSE Department************");
        System.out.println("***********The course Code is 590573****************");
        System.out.println("***********Title:Programming Subjects****************");
        System.out.println("***********Description:Basic and advanced concepts of programming.****************\n ***************We make the Best Engineers and produce the best environment for learning****************");
        System.out.println("***********Schedule:From 8am to 4pm****************");
        System.out.println("The capacity is:120 and available seats are:"+available_seats);
        System.out.println("Enter your ID");
        id=sc.nextInt();
        System.out.println("Enter your Name:");
        sc.nextLine();
        name=sc.nextLine();
        String yorn;
        

        System.out.println("Do you want to take admission:(yes/no)");
         yorn=sc.nextLine();

         if (yorn.equals("yes"))
         {
            System.out.println("Enter your admission no.given through CAP ROUND:");
            admin=sc.nextInt();

            System.out.println("\n\nProcessing.....");
            System.out.println("\n\n*************Admission done successfully***********");
            available_seats--;
            System.out.println("Available seats are:"+available_seats);

         }
         else if(yorn.equals("no"))
         {
            System.out.println("Proceed if you want to drop");
         }
         System.out.println("Do you want to leave our university:(yes/no)");
         String drop;
         drop=sc.nextLine();

         if(drop.equals("yes"))
         {
            available_seats++;
            System.out.println("The seats available are:"+available_seats);
            System.out.println("********Thank you for choosing our university*******");
         }
        }
    
         public void it()
         {
            Scanner sc=new Scanner(System.in);
        String name;
        int id;
        int available_seats=56;
        int admin;
        System.out.println("***********Welcome to the IT Department************");
        System.out.println("***********The course Code is 590574****************");
        System.out.println("***********Title:Deep Programming Subjects****************");
        System.out.println("***********Description:advanced concepts of programming and high level programming languages included.****************\n ***************We make the Best Engineers and produce the best environment for learning****************");
        System.out.println("***********Schedule:From 9am to 5pm****************");
        System.out.println("The capacity is:120 and available seats are:"+available_seats);
        System.out.println("Enter your ID");
        id=sc.nextInt();
        System.out.println("Enter your Name:");
        sc.nextLine();
        name=sc.nextLine();
        String yorn;System.out.println("Do you want to take admission:(yes/no)");
         yorn=sc.nextLine();

         if (yorn.equals("yes"))
         {
            System.out.println("Enter your admission no.given through CAP ROUND:");
            admin=sc.nextInt();

            System.out.println("\n\nProcessing.....");
            System.out.println("\n\n*************Admission done successfully***********");
            available_seats--;
            System.out.println("Available seats are:"+available_seats);

         }
         else if(yorn.equals("no"))
         {
            System.out.println("Proceed if you want to drop");
         }
         System.out.println("Do you want to leave our university:(yes/no)");
         String drop;
         drop=sc.nextLine();

         if(drop.equals("yes"))
         {
            available_seats++;
            System.out.println("The seats available are:"+available_seats);
            System.out.println("********Thank you for choosing our university*******");
         }
         }

         public void mechanical()
         {
            Scanner sc=new Scanner(System.in);
        String name;
        int id;
        int available_seats=114;
        int admin;
        System.out.println("***********Welcome to the Mechanical Department************");
        System.out.println("***********The course Code is 590575****************");
        System.out.println("***********Title:Advanced Machine Hardware Concepts****************");
        System.out.println("***********Description:High level hardware concepts which are rquired for big companies.****************\n ***************We make the Best Engineers and produce the best environment for learning****************");
        System.out.println("***********Schedule:From 7am to 5pm****************");
        System.out.println("The capacity is:120 and available seats are:"+available_seats);
        System.out.println("Enter your ID");
        id=sc.nextInt();
        System.out.println("Enter your Name:");
        sc.nextLine();
        name=sc.nextLine();
        String yorn;System.out.println("Do you want to take admission:(yes/no)");
         yorn=sc.nextLine();

         if (yorn.equals("yes"))
         {
            System.out.println("Enter your admission no.given through CAP ROUND:");
            admin=sc.nextInt();

            System.out.println("\n\nProcessing.....");
            System.out.println("\n\n*************Admission done successfully***********");
            available_seats--;
            System.out.println("Available seats are:"+available_seats);

         }
         else if(yorn.equals("no"))
         {
            System.out.println("Proceed if you want to drop");
         }
         System.out.println("Do you want to leave our university:(yes/no)");
         String drop;
         drop=sc.nextLine();

         if(drop.equals("yes"))
         {
            available_seats++;
            System.out.println("The seats available are:"+available_seats);
            System.out.println("********Thank you for choosing our university*******");
         }
         }

         public void civil()
         {
            Scanner sc=new Scanner(System.in);
        String name;
        int id;
        int available_seats=65;
        int admin;
        System.out.println("***********Welcome to the Civil Department************");
        System.out.println("***********The course Code is 590576****************");
        System.out.println("***********Title:Best architecture concepts****************");
        System.out.println("***********Description:Advanced concepts of the best architectures in the world.****************\n ***************We make the Best Engineers and produce the best environment for learning****************");
        System.out.println("***********Schedule:From 10am to 4pm****************");
        System.out.println("The capacity is:120 and available seats are:"+available_seats);
        System.out.println("Enter your ID");
        id=sc.nextInt();
        System.out.println("Enter your Name:");
        sc.nextLine();
        name=sc.nextLine();
        String yorn;System.out.println("Do you want to take admission:(yes/no)");
         yorn=sc.nextLine();

         if (yorn.equals("yes"))
         {
            System.out.println("Enter your admission no.given through CAP ROUND:");
            admin=sc.nextInt();

            System.out.println("\n\nProcessing.....");
            System.out.println("\n\n*************Admission done successfully***********");
            available_seats--;
            System.out.println("Available seats are:"+available_seats);

         }
         else if(yorn.equals("no"))
         {
            System.out.println("Proceed if you want to drop");
         }
         System.out.println("Do you want to leave our university:(yes/no)");
         String drop;
         drop=sc.nextLine();

         if(drop.equals("yes"))
         {
            available_seats++;
            System.out.println("The seats available are:"+available_seats);
            System.out.println("********Thank you for choosing our university*******");
         }
         }

         public void electrical()
         {
            Scanner sc=new Scanner(System.in);
        String name;
        int id;
        int available_seats=84;
        int admin;
        System.out.println("***********Welcome to the Electrical Department************");
        System.out.println("***********The course Code is 590577****************");
        System.out.println("***********Title:Concepts of Wiring****************");
        System.out.println("***********Description:advanced concepts of programming and high level programming languages included.****************\n ***************We make the Best Engineers and produce the best environment for learning****************");
        System.out.println("***********Schedule:From 8am to 4pm****************");
        System.out.println("The capacity is:120 and available seats are:"+available_seats);
        System.out.println("Enter your ID");
        id=sc.nextInt();
        System.out.println("Enter your Name:");
        sc.nextLine();
        name=sc.nextLine();
        String yorn;System.out.println("Do you want to take admission:(yes/no)");
         yorn=sc.nextLine();

         if (yorn.equals("yes"))
         {
            System.out.println("Enter your admission no.given through CAP ROUND:");
            admin=sc.nextInt();

            System.out.println("\n\nProcessing.....");
            System.out.println("\n\n*************Admission done successfully***********");
            available_seats--;
            System.out.println("Available seats are:"+available_seats);

         }
         else if(yorn.equals("no"))
         {
            System.out.println("Proceed if you want to drop");
         }
         System.out.println("Do you want to leave our university:(yes/no)");
         String drop;
         drop=sc.nextLine();

         if(drop.equals("yes"))
         {
            available_seats++;
            System.out.println("The seats available are:"+available_seats);
            System.out.println("********Thank you for choosing our university*******");
         }
         }

         public void extc()
         {
            Scanner sc=new Scanner(System.in);
        String name;
        int id;
        int available_seats=78;
        int admin;
        System.out.println("***********Welcome to the Electronics And telecommunication Department************");
        System.out.println("***********The course Code is 590578****************");
        System.out.println("***********Title:Both hardware and software parts****************");
        System.out.println("***********Description:All the advanced concepts.****************\n ***************We make the Best Engineers and produce the best environment for learning****************");
        System.out.println("***********Schedule:From 7am to 2pm****************");
        System.out.println("The capacity is:120 and available seats are:"+available_seats);
        System.out.println("Enter your ID");
        id=sc.nextInt();
        System.out.println("Enter your Name:");
        sc.nextLine();
        name=sc.nextLine();
        String yorn;System.out.println("Do you want to take admission:(yes/no)");
         yorn=sc.nextLine();

         if (yorn.equals("yes"))
         {
            System.out.println("Enter your admission no.given through CAP ROUND:");
            admin=sc.nextInt();

            System.out.println("\n\nProcessing.....");
            System.out.println("\n\n*************Admission done successfully***********");
            available_seats--;
            System.out.println("Available seats are:"+available_seats);

         }
         else if(yorn.equals("no"))
         {
            System.out.println("Proceed if you want to drop");
         }
         System.out.println("Do you want to leave our university:(yes/no)");
         String drop;
         drop=sc.nextLine();

         if(drop.equals("yes"))
         {
            available_seats++;
            System.out.println("The seats available are:"+available_seats);
            System.out.println("********Thank you for choosing our university*******");
         }
         }









    

   
}


class Course
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        courses co=new courses();
        System.out.println("\n\n**********Welcome to THE ARN UNIVERSITY*************\n\n");
        System.out.println("********Press 1: for Computer Engineering***************");
        System.out.println("********Press 2:for IT Engineering**************");
        System.out.println("********Press 3:for Mechanical Engineering**************");
        System.out.println("********Press 4:for Civil Engineering*******************");
        System.out.println("********Press 5:for Electrical Engineering********************");
        System.out.println("********Press 6:for Electronics And telecommunication*****************");
        int cor=sc.nextInt();

        switch (cor) {
            case 1:
                System.out.println("enter your adhaar card no. to verify");
                int adhaar=sc.nextInt();
                System.out.println("\n\nVerifying..........");
                System.out.println("\n\nDone..........\n\n");
                co.cse1();
                break;

                case 2:
                System.out.println("enter your adhaar card no. to verify");
                 adhaar=sc.nextInt();
                System.out.println("\n\nVerifying..........");
                System.out.println("\n\nDone..........\n\n");
                co.it();
                break;

                case 3:
                System.out.println("enter your adhaar card no. to verify");
                 adhaar=sc.nextInt();
                System.out.println("\n\nVerifying..........");
                System.out.println("\n\nDone..........\n\n");
                co.mechanical();
                break;

                case 4:
                System.out.println("enter your adhaar card no. to verify");
                 adhaar=sc.nextInt();
                System.out.println("\n\nVerifying..........");
                System.out.println("\n\nDone..........\n\n");
                co.civil();
                break;

                case 5:
                System.out.println("enter your adhaar card no. to verify");
                 adhaar=sc.nextInt();
                System.out.println("\n\nVerifying..........");
                System.out.println("\n\nDone..........\n\n");
                co.electrical();
                break;

                case 6:
                System.out.println("enter your adhaar card no. to verify");
                 adhaar=sc.nextInt();
                System.out.println("\n\nVerifying..........");
                System.out.println("\n\nDone..........\n\n");
                co.extc();
                break;

            default:
                break;
        }

    }
}