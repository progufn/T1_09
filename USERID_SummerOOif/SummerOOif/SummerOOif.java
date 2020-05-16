/**
 * This Object-Oriented version of the "Summer" class
 * is stripped down to the essentials for illustrating the
 * use of the "if" statement. 
 *
 * SKELETON FOR LAB TEST.
 * 
 * @author Raymond Lister
 * @version April 2015
 */
public class SummerOOif
{
    private int sum;       // sum of all integers received
    private int minimum;   // the minimum integer received
    private int maximum;   // the maximum integer received
    private int count;     // number of integers received

    /**
     * The constructor now follows. This version of Summer doesn't
     * have the "dangerous" zero parameter constructor, as the
     * zero parameter constructor cannot realistically initialise
     * fields "minimum" and "maximum".
     */

    /**
     * Initialise all the fields / private data memnbers 
     * 
     * @param   firstNumber The first number of a series 
     */
    public SummerOOif(int num)
    {
        sum = num;
        minimum = num;
        maximum = num;
        count = 1;
    } 

    /**
     * @param  newNumber   a new number in the series 
     */
    public void putNumber(int newNumber)
    {
        sum = sum + newNumber; // could write "sum += newNumber"
        count = count + 1;     // could write "++count"
        
        if(newNumber < minimum)
        {
            minimum = newNumber;
        }
        if(newNumber > maximum)
        {
            maximum = newNumber;
        }
        
        //add whatever code is required here in the method body
        //to update (when necessary) the values of "minimum" and "maximum"
    }
    
    /**
     * @return     The minimum of all the numbers received 
     */
    public int getMinimum()
    {
        return minimum;
    }
    
        
    /**
     * @return     The maximum of all the numbers received 
     */
    public int getMaximum()
    {
        return maximum;
    }

} // class SummerOO
