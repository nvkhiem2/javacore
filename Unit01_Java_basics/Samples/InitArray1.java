// Fig. 7.14: InitArray.java
// Initializing two-dimensional arrays.

import javax.swing.*;
import java.util.Arrays;

public class InitArray1 extends JApplet {
  static JTextArea outputArea = new JTextArea();

  public static void main( String args[] )
  {
     int array1[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
     int array2[][] = { { 1, 2 }, { 3 }, { 4, 5, 6 } };

     outputArea.setText( "Values in array1 by row are\n" );
     buildOutput( array1 );

     outputArea.append( "\nValues in array2 by row are\n" );
     buildOutput( array2 );

  } // end method init

    private static void buildOutput(int[][] array1) {
        System.out.println("array1 = " + Arrays.deepToString(array1));
    }
  }

