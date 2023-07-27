import java.io.*;
import java.sql.*;

public class displayallrecord
{
	static String rows[][] = new String [100][9];

	static int row=0;
	
	displayallrecord()
	
	{	   	
	 try
	  {
		DAO db=new DAO();
		Connection conn=db.getConnection();
				
	    String selectQuery = "select * from  enquiry";
	    	    
	    PreparedStatement preparedStatement = conn.prepareStatement(selectQuery);

	    ResultSet result = preparedStatement.executeQuery();
	      	      
	    while (result.next())
       /* {
	    	System.out.print("Customerid= "+result.getString(1));
	    	System.out.print("Name= "+result.getString(2));
	    	System.out.print("Email= "+result.getString(3));
	    	System.out.print("MobileNo= "+result.getString(4));
	    	System.out.print("Address= "+result.getString(5));
	    	System.out.print("Budget= "+result.getString(6));
	    	System.out.print("Model= "+result.getString(7));
	    	System.out.print("Payment= "+result.getString(8));
	    	System.out.println();
	    }   */
	    {	    	
			for (int i = 0; i < 9; i++)
				rows[row][i] =result.getString((i+1));
				row++;
			
	    }
	   ViewCustomer.populateArray(rows);
	  }
	  catch(Exception e)
	  {
		System.out.println(e);
	  }
    }
}
