/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringformating;

/**
 *
 * @author MC03353
 */
public class StringFormating {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        stringFormat();
    }
    
    
    static void stringFormat() {

        String sAlignLeft = "| %10s %-1s %-28s | \r\n"; //padding between strings
        String sAlign1 = "| %10s %-12.12s %-18s | \r\n"; //different padding between strings
        String sFiller = ("|                                            | \n");

//        int iWidth = sFiller.length();
//        int iPadding = iWidth - 34;
//        int iPadStart = iPadding/2;
//      will work ou the middle of the String (remember to alter if you line width or string is odd or even 
        
        System.out.format("+--------------------------------------------+\n");
        System.out.format(sAlign1,"Ref:","MC123B","Date:","Static Date"); //the Strings can be replaced with variables or methods with a return value
        
        System.out.print(sFiller);
        System.out.format(sAlignLeft,"Name:","MC","Digital");//aligned Left and is formatted inline with line 26
        System.out.format(sAlign1,"Name:","MC","Digital"); //different alignement
        
       
        System.out.print(sFiller);
        System.out.format(sAlign1,"Name:","MC","Digital");
        System.out.format(sAlign1,"Name:","MC","Digital");
        
        System.out.print(sFiller);
        System.out.println("+--------------------------------------------+");       
        System.out.println("\n");
    }// end of stringFormat
}//end of class     
