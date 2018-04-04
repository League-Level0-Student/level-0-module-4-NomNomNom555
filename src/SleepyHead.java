//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /*
         * Ask the user for these values using
         * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         */
     
    int fundays=JOptionPane.showConfirmDialog(null, "Is it a weekend?","",JOptionPane.YES_NO_OPTION);   
    System.out.println(fundays);
   if(fundays==0) {
    JOptionPane.showMessageDialog(null,"Sleep in.");	
    }
   if(fundays==1) { 
	   int sleep=JOptionPane.showConfirmDialog(null, "Is it a week day?","",JOptionPane.YES_NO_OPTION);
	    System.out.println(sleep);
	    if(sleep==0) {
	    int TenHP=JOptionPane.showConfirmDialog(null, "Are you on vacation?","",JOptionPane.YES_NO_OPTION);
	    System.out.println(TenHP);
	    if(TenHP==1) {
	    JOptionPane.showMessageDialog(null,"Get up you lazybones!");	
	    }
	    if(TenHP==0) {
	    JOptionPane.showMessageDialog(null, "Sleep in.");
	    }
	    }
	    if(sleep==1) {
	    	JOptionPane.showMessageDialog(null,"You're lying! You said it wasn't a weekend either!");
	   }

   }
   
  
        /*
    
    
         /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
    
    }
}
