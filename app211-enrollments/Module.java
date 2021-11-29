
/**
 * This class is a model of a module which forms part of a BNU course.
 *
 * @author John McCormack
 * @version (a version number or a date)
 */
public class Module
{
    // instance variables 
    private String Code;
    private String Title;
    private int Credit;
    /**
     * Constructor for objects of class Module
     */
    public Module(String Code, String Title)
    {
       // initialise instance variables
       this.Code = Code;
       this.Title = Title;
       Credit = 0;
    }
    
    /**
     * 
     */
    public String getCode()
    {
        //
        return this.Code;
    }
    
    /**
     * 
     */
    public String getTitle()
    {
        //
        return this.Title;
    }
    
    /**
     * 
     */
    public int getCredit()
    {
        //
        return this.Credit;
    }
    
    /**
     * 
     */
    public void setCredit(int Credit)
    {
        //
        this.Credit = Credit;
    }
    
    /**
     * Print the details of the course, the list
     * of students enrolled and the module
     */
    public void print()
    {
        //printHeading();
        
        System.out.println(" Module Code: " + Code + ": " + Title);
        System.out.println();
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void Print()
    {
        // put your code here
        
    }
}
