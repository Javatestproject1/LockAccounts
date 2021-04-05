
	package dell.com.lockaccounts.userstories;

	/**
	 * Created by Sudhindra.
	 * User: Sudhindra
	 * Date: 24/3/2021
	 * Time: 10:25 PM
	 * Title: Options Menu
	 * Description: Contains logic to provide options to user 
	 */
	import java.io.FileNotFoundException;
	import java.util.Scanner;
	import java.io.File;
	import dell.com.lockaccounts.frontend.*;
	
	
	public class Menu 
	{
			public static void Menu()
			{
					System.out.println("Please select among the below choices");
					System.out.println("1 List file names in Alphabetical order");
					System.out.println("2 Add an entry / Delete an entry / Search an entry in a file");
					System.out.println("3 Terminate the application");
					System.out.println("\n");
					Scanner sc = new Scanner(System.in);
		
					int choice = sc.nextInt();
				    boolean flag = true;
				  
				    while(flag)
				    {
						switch(choice) 
						{
								
								case 1 : 
								flag = FileTransactions.ListAllFiles(); 
								FrontEnd.Terminate();
								break;
								case 2 :
								System.out.println("Please select among the below choices");
								System.out.println("1 Add new entry, Enter Application Name --> Username --> Password Ex: WebTours --> Jojo--> Bean ");
								System.out.println("2 Delete an entry in a file");
								System.out.println("3 Search an entry in a file");
								System.out.println("4 Terminate the application");
								System.out.println("\n");
								System.out.println("\n");
								choice = sc.nextInt();
								switch(choice) 
								{
									case 1 : 
									flag = FileTransactions.addNewEntry();
									FrontEnd.homeScreen();
									break;
									case 2 :
									flag = FileTransactions.deleteExistingFileName();
									FrontEnd.Terminate();
									break;
									case 3 :
									flag = FileTransactions.searchUserInputedFileName();
									FrontEnd.Terminate();
									break;
									case 4 :
										flag = false;
										FrontEnd.Terminate();
										break;
									
									default :
									System.out.println("Please select among the below choices");
									System.out.println("1 Add new entry, Username--> Password Ex: Jojo--> Bean ");
									System.out.println("2 Delete an entry in file");
									System.out.println("3 Search an entry in a file");
									System.out.println("\n");
									System.out.println("\n");
									System.out.println("\n");
									System.out.println("\n");
									System.out.println("\n");
									choice = sc.nextInt();
									break;
								} 
									break;
									case 3 :
									flag = false;
									FrontEnd.Terminate();
									break;
									default :
									System.out.println("Please select among the below choices");
									System.out.println("1 List entries in the file name in alphabetical order");
									System.out.println("2 Add / Delete / Search an entry in a file");
									System.out.println("3 Terminate the Application");
									System.out.println("\n");
									System.out.println("\n");
									System.out.println("\n");
									choice = sc.nextInt();
									flag = true;
						} 
				    } 
							sc.close(); 
			} 
}

	

