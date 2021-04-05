
	
	package dell.com.lockaccounts.frontend;

	import dell.com.lockaccounts.userstories.FileTransactions;

/**
	 * Created by Sudhindra.
	 * User: Sudhindra
	 * Date: 23/3/2021
	 * Time: 12:25 PM
	 * Title: Frontend object
	 * Description: Contains Front-End Screen and Termination Screen Methods
	 */

	import dell.com.lockaccounts.userstories.Menu;

	public class FrontEnd 
	
{

	public static void main(String[] args) 
	{
			// TODO Auto-generated method stub
		
			homeScreen();
			FileTransactions.FileFields();
			Menu.Menu(); 
			
           
	}

	public static void homeScreen()
	{
					// TODO Auto-generated method stub
					System.out.println("########################################################");
					System.out.println("##                                                    ##");
					System.out.println("##         LOCK YOUR SOCIAL ACCOUNTS APPLICATION      ##");
					System.out.println("##                 VERSION A                          ##");
					System.out.println("##         Developer - SUDHINDRA PRASAD               ##");
					System.out.println("##                                                    ##");
					System.out.println("########################################################\n");
					

	}


	public static void Terminate() 
	{
					// TODO Auto-generated method stub
					System.out.println("\n##########################################################");
					System.out.println("##                                                         ##");
					System.out.println("##     THANKS FOR VISITING LOCK YOUR ACCOUNTS APPLICATION  ##");
					System.out.println("##                                                         ##"); 
					System.out.println("############################################################\n");
		
	}
	

}
