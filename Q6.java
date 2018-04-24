package javachallengequestions;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner Mathreader = new Scanner(System.in);
   Scanner Sciencereader = new Scanner(System.in);
   Scanner Englishreader = new Scanner(System.in);
   Integer MathScore = 0;
   Integer ScienceScore = 0;
   Integer EnglishScore = 0;
   int Flag = 0;
   System.out.println("Enter Math score");
   MathScore = Mathreader.nextInt();
   System.out.println("Enter Science score");
   ScienceScore = Sciencereader.nextInt();
   System.out.println("Enter English score");
   EnglishScore = Englishreader.nextInt();
   Integer AvgScore = (MathScore+ScienceScore+EnglishScore)/3;
   
   if(AvgScore > 81 && AvgScore <=100) {
	   Flag = 1; //Excellent
   } else if(AvgScore > 60 && AvgScore <=80)
	   Flag =2; //Good
   else if (AvgScore > 0 && AvgScore < 60){
	   Flag = 3; //Poor
   } else {
	   System.out.println("you scored : " + AvgScore);
   }
   
   switch(Flag) {
   case 1 : System.out.println("Excellent");
             break;
             
   case 2 : System.out.println("Good");
            break;
            
   case 3 : System.out.println("Poor");
            break;
   }
   
   System.out.println(AvgScore);
   Mathreader.close();
   Sciencereader.close();
   Englishreader.close();
	}

}
