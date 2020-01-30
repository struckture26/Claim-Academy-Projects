package phoneBook;

import java.util.*;

public class MainApplication
{
	
	 
	public static void main(String[] args) 
	{

		PersonInfo[] contactList = new PersonInfo[0];
		PersonInfo tempPerson = new PersonInfo();

		
		 //Prompt the user to enter an option:
			Scanner scanner = new Scanner(System.in);

			
			boolean running = true;
			
			while (running) {
				System.out.print("1 = Add New Record \r2 = Search Record \r3 = Delete Record \r4 = Update Record \r5 = Show all Records \r6 = Exit \r Select Option: ");
				byte userChoice = scanner.nextByte();
				
				// Based on the userChoice input, the following switch statements will be used
				switch (userChoice)
				{
					case 1: // Adding new record option
						tempPerson = addcontact();
						contactList = PersonInfo.addNewContact(contactList, tempPerson);
						
						break;
						
					case 2: // Search record case with method below
						Scanner scanner2 = new Scanner(System.in);
						System.out.print("1 = Search by First Name \r2 = Search by Last Name \r3 = Search by Telephone \r4 = Search by City \r5 = Search by State \r Select Option: ");
						byte searchRecord = scanner2.nextByte();
						
						
						
						
						search(searchRecord, contactList);
						
						break;
						
					case 3: //Delete record using telephone
						Scanner scanner9 = new Scanner(System.in);
						System.out.print("Enter telephone number: ");
						String telephoneDelete = scanner9.next();
						
						contactList = deleteRecord(telephoneDelete, contactList);
						
						break;
						
					case 4:  //Update record using telephone
						
						Scanner scanner10 = new Scanner(System.in);
						System.out.print("Enter telephone number: ");
						String telephoneUpdate = scanner10.next();
						
						updateRecord(contactList, telephoneUpdate);
						
						break;
						
					case 5:  //Show all the records
						/// this case is to show all records
						displayAllRecords(contactList);
						break;
						
					case 6: // End the program
						System.out.println("Have a good day!");
						System.exit(0);
					
					default:
						System.out.println("Choice Error, try again");
						break;
						
			}
				
		}
				
				
	}
		
		
	public static PersonInfo addcontact() 
	{
		Scanner scanner1 = new Scanner (System.in);
		System.out.println("Enter contact info: ");
		String addNew = scanner1.nextLine();
		
		
		String [] temp = addNew.split(", ");
		String wholeName = temp[0]; 
		String street = temp[1];
		String city = temp[2];
		String state = temp[3];
		String zip = temp[4];
		String phoneNumber = temp [5];
		
		String firstName;
		String middleName;
		String lastName;
			
		String [] temp1 = wholeName.split(" ");
		
			if (temp1.length == 3)
			{
				firstName = temp1[0];
				middleName = temp1[1];
				lastName = temp1[temp1.length - 1];
			}
			else if (temp1.length == 4)
			{
				firstName = temp1[0];
				middleName = temp1[1] + " " + temp1[2];
				lastName = temp1[temp1.length - 1];
			}
			else
			{
				firstName = temp1[0];
				middleName = "";
				lastName = temp1[temp1.length-1];
			}
			
		
				
			
		
		Address address = new Address(street ,city, state, zip);
		
		
		PersonInfo person = new PersonInfo(firstName, middleName, lastName, address, phoneNumber);
		
		return person;
		
		
	
	}

	public static void displayRecords(PersonInfo[] contactList)
	{
		PersonInfo[] temp = contactList;
		
		
		
		for (int i = 0; i < temp.length; i++)
		{
			System.out.println(temp.toString());
		}
		
		
	}
	
	public static void search(byte searchRecord, PersonInfo[] contactList)
	{
		
		switch (searchRecord)
		{
		
			case 1: // Search by first name
				
				//Prompt user to enter first name for search parameter
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter First Name: ");
				String firstSearch = scanner.next();
			
				for (int i = 0; i < contactList.length; i++)
				{
					PersonInfo temp = new PersonInfo();
					temp = contactList[i];
					
					System.out.println(contactList.length);
					
					if (temp.getFirstName().equals(firstSearch))
						
					{
						System.out.println(temp.toString());
					}
					
					
				}
			
			
				break;
				
				case 2: // Search by last name
				Scanner scanner2 = new Scanner(System.in);
				System.out.println("Enter Last Name: ");
				String lastSearch = scanner2.next();

			
				for (int i = 0; i < contactList.length; i++)
				{
					PersonInfo temp = new PersonInfo();
					temp = contactList[i];
					
					System.out.println(contactList.length);
					
					if (temp.getLastName().equals(lastSearch))
						
					{
						System.out.println(temp.toString());
					}
					
					
				}
			
			
				break;
				
			case 3: //Search by Phone Num. 
				Scanner scanner3 = new Scanner(System.in);
				System.out.println("Enter Telephone: ");
				String phoneNumberSearch = scanner3.next();

				for (int i = 0; i < contactList.length; i++)
				{
					PersonInfo temp = new PersonInfo();
					temp = contactList[i];
					
					System.out.println(contactList.length);
					
					if (temp.getPhoneNumber().equals(phoneNumberSearch))
						
					{
						System.out.println(temp.toString());
					}
				
				}
				break;
				
				case 4: //Search by City
				Scanner scanner4 = new Scanner(System.in);
				System.out.println("Enter City: ");
				String citySearch = scanner4.nextLine();
				
				for (int i = 0; i < contactList.length; i++)
				{
					PersonInfo temp = new PersonInfo();
					temp = contactList[i];
					
					System.out.println(contactList.length);
					
					if (temp.getAddress().getCity().equals(citySearch))
						
					{
						System.out.println(temp.toString());
					}
				
				}
				
				break;
				
				case 5: //Search by State
					Scanner scanner5 = new Scanner(System.in);
					System.out.println("Enter State: ");
					String stateSearch = scanner5.next();
					
					for (int i = 0; i < contactList.length; i++)
					{
						PersonInfo temp = new PersonInfo();
						temp = contactList[i];
						
						System.out.println(contactList.length);
						
						if (temp.getAddress().getState().equals(stateSearch))
							
						{
							System.out.println(temp.toString());
						}
					
					}
					
					break;
			}
	}
	
	private static PersonInfo[] deleteRecord(String telephoneDelete, PersonInfo[] contactList) 
		{
		
		PersonInfo[] targetArray = new PersonInfo[0];
			
		
		for (int i = 0; i < contactList.length ; i++)
			{
				PersonInfo temp = contactList[i];
				
				if (!temp.getPhoneNumber().equals(telephoneDelete))
				{
					
					targetArray = PersonInfo.addNewContact(targetArray, temp);
					
				}
			
			}
			return targetArray;
		}
	

	public static void updateRecord(PersonInfo[] contactList, String telephoneUpdate)
	
	{
		PersonInfo temp = new PersonInfo();
		for (int i = 0; i < contactList.length; i++)
		{
			temp = contactList[i];
			
			if (temp.getPhoneNumber().equals(telephoneUpdate))
				
			{
				System.out.println("Record to update: " + temp.toString());
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter New Phone#: ");
				String newPhoneNumber = scanner.next();
				temp.setPhoneNumber(newPhoneNumber);
			}
		
		}
	}

	public static void displayAllRecords (PersonInfo[] contactList)
	{
		PersonInfo temp = new PersonInfo();
		
		for (int i = 0; i < contactList.length; i++)
		{
			temp = contactList[i];
			System.out.println(temp);
		}
	}
}