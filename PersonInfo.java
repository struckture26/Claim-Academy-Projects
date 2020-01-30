package phoneBook;

public class PersonInfo extends MainApplication
{

	
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String phoneNumber;
	private Address address;
	
	
	
	
	public PersonInfo()
	{}

	public PersonInfo(String firstName, String middleName,  String lastName, Address address, String phoneNumber)
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	public static PersonInfo[] addNewContact(PersonInfo[] source, PersonInfo value)
	{
		PersonInfo[] temp = new PersonInfo[source.length + 1];
		for (int i = 0; i < source.length; i++)
		{
			temp[i] = source[i];
		}
		temp[source.length] = value;
		return temp;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	

	
	public String getPhoneNumber()
	{
		return this.phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	

	public Address getAddress()
	{
		return this.address;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

	public String toString() {
		return "First Name: " + firstName + "\tMiddle Name: " + middleName + 
				"\tLast Name: " + lastName + "\nAddress: " + address + 
				"\tPhone Number: " + phoneNumber.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
	}
	
	
}
