public class DistanceConverter
{   
   static final double FEET_PER_YARD = 3;
   static final double INCHES_PER_FOOT = 12;
   
   public static void main(String[] args)
   {
      double yards = 3.5;
      double feet = yards * FEET_PER_YARD;
      double inches = feet * INCHES_PER_FOOT;
      
      System.out.println(yards + "yards are" + feet + "feet");
      System.out.println(yards + "yards are" + inches + "inches");
   }
}