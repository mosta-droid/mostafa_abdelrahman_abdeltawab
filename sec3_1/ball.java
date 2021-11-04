package sec3_1;
public class ball implements tossable
{
    private String brandname;

    public void ball(String brandname) 
    {
        this.brandname = brandname;
    }

    public String getBrandname() 
    {
        return brandname;
    }
    public void bouncce(){};
    @Override
    public void toss() 
    {
        
    }
    
}
