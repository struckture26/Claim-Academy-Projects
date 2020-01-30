package phoneBook;

public class Address extends PersonInfo
{

	
	private String street;
	private String city;
	private String state;
	private String zip;
	
	
	
	public Address()
	{}

	public Address(String street, String city, String state, String zip)
	{
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	
	

	public String getStreetName()
	{
		return this.street;
	}

	public void setStreetName(String streetName)
	{
		this.street = streetName;
	}

	public String getCity()
	{
		return this.city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getState()
	{
		return this.state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String getZip()
	{
		return this.zip;
	}

	public void setZip(String zip)
	{
		this.zip = zip;
	}

	public String toString() {
		return "Address streetName=" + street + ", city=" + city + ", state="
				+ state + ", zip=" + zip;
	}
	
	
}
