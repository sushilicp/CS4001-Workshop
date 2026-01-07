

public class Insta
{
    private String userName;
    private int likesCount;
    
    public String getUserName()
    {
        return this.userName;
    }
    
    public void setUserName(String myUserName)
    {
        this.userName=myUserName;
    }
    
    public int getLikesCount()
    {
        return this.likesCount;
    }
    
    public void setLikesCount(int myLikesCount)
    {
        if(myLikesCount>0)
        {
            this.likesCount=myLikesCount;
        }
        else
        {
            System.out.println("Invalid likes count");
        }
    }
    
    @Override
    public String toString()
    {
        return "Instagram username:"+this.userName+"\nLikes count:"+this.likesCount;
    }
    
    
}
