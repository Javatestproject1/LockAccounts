package dell.com.lockaccounts.userstories;

/**
	 * Created by Sudhindra.
	 * User: Sudhindra
	 * Date: 25/3/2021
	 * Time: 12:25 PM
	 * Title: File Operations
	 * Description: Contains methods to Add/List/Delete/Search file names
	 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import dell.com.lockaccounts.constant.*;

public class FileTransactions {
	public static void FileFields() {
		try {
			FileWriter myWriter = new FileWriter(Constant.FILENAME, true);
			FileReader fr = new FileReader(Constant.FILENAME);
			BufferedReader reader = new BufferedReader(fr);
			System.out.println("File opened for reading");

			if ((reader.readLine()) == null) {

				System.out.println("File is empty");
				//FileWriter myWriter = new FileWriter(Constant.FILENAME, true);
				myWriter.write("Application Name  -->  Username --> Password");

				myWriter.close();
			}fr.close();

		} catch (IOException e) {
			System.out.println("An error occurred.");
		}
	}

	public static boolean addNewEntry() {
		System.out.println("Please enter file name to add: \n");
		Scanner sc1 = new Scanner(System.in);
		try {
			FileWriter myWriter = new FileWriter(Constant.FILENAME, true);
			myWriter.write("\n" + sc1.nextLine());
			myWriter.close();
			sc1.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
		}
		return false;
	}

	public static boolean deleteExistingFileName() {
		
		Scanner sc2 = new Scanner(System.in);	
		
		System.out.println("\n" + "Please enter file name to delete: \n");
		try {
			Path pathFinder = Paths.get(Constant.FILENAME);
			Charset charset = StandardCharsets.UTF_8;

			String content = new String(Files.readAllBytes(pathFinder), charset);
			String deleteExistingFileName = sc2.nextLine();
			
		
			if (content.contains(deleteExistingFileName)) {
				content = content.replaceAll(deleteExistingFileName, "");
				Files.write(pathFinder, content.getBytes(charset));
				System.out.println("File name '" + deleteExistingFileName + "' deleted successfully \n");
			} else {
				System.out.println("\nFile name not found. Please provide valid file name.\n");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("An error occurred.");
		}
		sc2.close();
		return false;
	}

	public static boolean searchUserInputedFileName() {
		System.out.println("\n" + "Please enter file name to Search : \n");
		Scanner sc3 = new Scanner(System.in);
		try {
			Path pathFinder = Paths.get(Constant.FILENAME);
			Charset charset = StandardCharsets.UTF_8;

			String content = new String(Files.readAllBytes(pathFinder), charset);
			String deleteExistingFileName = sc3.nextLine();
			if (content.contains(deleteExistingFileName)) {
				// content = content.replaceAll(deleteExistingFileName, "");
				// Files.write(pathFinder, content.getBytes(charset));
				System.out.println("File name '" + deleteExistingFileName + "' found successfully \n");
			} else {
				System.out.println("\n File name not found \n");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("An error occurred.");
		}
		sc3.close();
		return false;
	}

	public static boolean ListAllFiles() {
		// TODO Auto-generated method stub
		System.out.println("\n" + "List of file names in ascending order: \n");

		try {
			FileReader fr = new FileReader(Constant.FILENAME);
			BufferedReader reader = new BufferedReader(fr);
			ArrayList<String> strvalue = new ArrayList<>();
			String line = "";
			if ((line = reader.readLine()) == null) {
				System.out.println("Empty File, there is no data");

			} else {
				while ((line = reader.readLine()) != null) {
					strvalue.add(line);
				}
				// System.out.println(str);
				Collections.sort(strvalue);
				for (String s : strvalue)
					System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Empty File, it has no entries");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("An error occured while reading the file");
		}
		return false;

	}
}
