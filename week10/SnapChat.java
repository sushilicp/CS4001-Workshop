

public class SnapChat
{
    private String username;
    private int age;
    
    public String getUsername()
    {
        return this.username;
    }
    
    public int getAge()
    {
        return this.age;
    }
    
    public void setUsername(String myName)
    {
        this.username=myName;
        
    }
    
    public void setAge(int myAge)
    {
        if(myAge>13 && myAge<120)
        {
            this.age=myAge;
        }
        else
        {
            System.out.println("Invalid age");
        }
    
    }
    
    @Override
    public String toString()
    {
        return "SnapChat username:"+this.username+"\nAge:"+this.age;
    }
        
}
