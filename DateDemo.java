package com.cts.javaTraining;

/**
 * @author 776480
 *
 */

import java.util.*;
import java.text.*;

public class DateDemo {
   public static void main(String args[]) {
      Date dNow = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("MMMM dd,yyyy\n hh:mm a");
      System.out.println("Current Date: " + ft.format(dNow));
   }
}
