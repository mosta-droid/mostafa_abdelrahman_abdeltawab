package sec3_2;
public class mammal implements animal
{

    int nooflegs;
    String favfood;

    public mammal(int nooflegs, String favfood) 
    {
        this.nooflegs = nooflegs;
        this.favfood = favfood;
    }
    
    @Override
    public void eat() 
    {
        
    }

    @Override
    public void travel() 
    {
        
    }
    public int getNooflegs() 
    {
        return nooflegs;
    }
    public String getFavfood() 
    {
        return favfood;
    }

    
}
