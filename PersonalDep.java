/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package montlysalary;

/**
 *
 * @author Yo
 */
public class PersonalDep {
    //array fields
   
    private String mNameOfDepartment;
    private int[]mSalary = {10000,12000,10000,10000,10000};
    private String[] mEmployeeName = {"John","Sarah","Aaron","Bob","Chris"};
    private int[] mBonus = new int[5];
    
    public PersonalDep(String nameOfDepartment){
        mNameOfDepartment = nameOfDepartment;
    }
    
    public void isCalculatingBonus(){
        mBonus[0] = (int) (mSalary[0]*0.1d);
        mBonus[1] = (int) (mSalary[1]*0.1d);
        mBonus[2] = (int) (mSalary[2]*0.15d);
        mBonus[3] = (int) (mSalary[3]*0.08d);
        mBonus[4] = (int) (mSalary[4]*0.1d);
    }
    
    @Override
    public String toString(){
        return "Department: " + mNameOfDepartment; 
    }
  
    
    public void displayInfo(){
        System.out.println("Name    "+" Salary £   "+"Bonus £    ");
        System.out.println(mEmployeeName[0]+"  |  "+mSalary[0]+"  |  "+mBonus[0]);
        System.out.println(mEmployeeName[1]+" |  "+ mSalary[1]+"  |  "+mBonus[1]);
        System.out.println(mEmployeeName[2]+" |  "+ mSalary[2]+"  |  "+mBonus[2]);
        System.out.println(mEmployeeName[3]+"   |  "+ mSalary[3]+"  |  "+mBonus[3]);
        System.out.println(mEmployeeName[4]+" |  "+ mSalary[4]+"  |  "+mBonus[4]);
        
    }
    
     public int[] getBonus(){
        return mBonus;
    }
}
