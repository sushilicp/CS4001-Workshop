

public class Rocket
{
   private String country;
   private int year;
   
   public String getCountry()
   {
       return this.country;
   }
   
   public int getYear()
   {
       return this.year;
   }
   
   public void setCountry(String myCountry)
   {
       this.country=myCountry;
   }
   
   public void setYear(int myYear)
   {
       if(myYear>1900 && myYear<2026)
       {
           this.year=myYear;
       }
       else
       {
           System.out.println("Invalid year!!!");
       }
   }
   
   @Override
   public String toString()
   {
       return "Country:"+this.country+"\nYear:"+this.year;
   }
}
