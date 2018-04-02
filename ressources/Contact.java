package ressources;

public class Contact {

	private String name;
	private String number;
	private String email;
	private String responsabilite;

	public Contact(String name, String number, String email, String responsabilite) {
		this.name = name;
		this.number = number;
		this.email = email;
		this.responsabilite = responsabilite;
	}

	public String getResponsabilite() {
		return responsabilite;
	}

	public void setResponsabilite(String responsabilite) {
		this.responsabilite = responsabilite;
	}

	public String toString() {
		return "Contact [name=" + name + ", number=" + number + ", email=" + email + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
