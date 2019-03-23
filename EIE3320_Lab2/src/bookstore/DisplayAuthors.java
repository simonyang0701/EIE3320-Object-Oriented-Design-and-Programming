package bookstore;


//Displaying the contents of the authors table.
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DisplayAuthors 
{
// database URL                              
static final String DATABASE_URL = "jdbc:mysql://localhost:3306/books";

// launch the application
public static void main( String args[] )
{
   Connection connection = null; // manages connection
   Statement statement = null; // query statement
   ResultSet resultSet = null; // manages results
 
	/*
	 * 	Specify to the DriverManager which JDBC drivers to try to make Connections with.
	 */
	try {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   
   
   // connect to database books and query database
   try 
   {
      // establish connection to database                              
      connection = DriverManager.getConnection( 
			 DATABASE_URL, "guest", "guest" );

      // create Statement for querying database
      statement = connection.createStatement();
      
      // query database                                        
      resultSet = statement.executeQuery(            
         "SELECT authorID, firstName, lastName FROM authors" );
      
      // process query results
      ResultSetMetaData metaData = resultSet.getMetaData();
      int numberOfColumns = metaData.getColumnCount();     
      System.out.println( "Authors Table of Books Database:\n" );
      
      for ( int i = 1; i <= numberOfColumns; i++ )
         System.out.printf( "%-8s\t", metaData.getColumnName( i ) );
      System.out.println();
      
      while ( resultSet.next() ) 
      {
         for ( int i = 1; i <= numberOfColumns; i++ )
            System.out.printf( "%-8s\t", resultSet.getObject( i ) );
         System.out.println();
      } // end while
   }  // end try
   catch ( SQLException sqlException )                                
   {                                                                  
      sqlException.printStackTrace();
   } // end catch                                                     
   finally // ensure resultSet, statement and connection are closed
   {                                                             
      try                                                        
      {                                                          
         resultSet.close();                                      
         statement.close();                                      
         connection.close();                                     
      } // end try                                               
      catch ( Exception exception )                              
      {                                                          
         exception.printStackTrace();                            
      } // end catch                                             
   } // end finally                                              
} // end main
} // end class DisplayAuthors



/**************************************************************************
* (C) Copyright 1992-2010 by Deitel & Associates, Inc. and               *
* Pearson Education, Inc. All Rights Reserved.                           *
*                                                                        *
* DISCLAIMER: The authors and publisher of this book have used their     *
* best efforts in preparing the book. These efforts include the          *
* development, research, and testing of the theories and programs        *
* to determine their effectiveness. The authors and publisher make       *
* no warranty of any kind, expressed or implied, with regard to these    *
* programs or to the documentation contained in these books. The authors *
* and publisher shall not be liable in any event for incidental or       *
* consequential damages in connection with, or arising out of, the       *
* furnishing, performance, or use of these programs.                     *
*************************************************************************/

