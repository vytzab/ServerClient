package lt.viko.eif.vytzab.serverClient.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Player {

	private String firstName;
	private String lastName;
	private Integer age;
	private String height;
	private String weight;
	private String nationality;
	private String status;

	@XmlElementWrapper(name = "records")
	@XmlElement(name = "record")
	private List<Record> records = new ArrayList<Record>();

	public Player(String firstName, String lastName, Integer age, String height, String weight, String nationality,
			String status) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.nationality = nationality;
		this.status = status;
	}

	public Player() {

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Record> getRecords() {
		return records;
	}

	public void setRecords(List<Record> records) {
		this.records = records;
	}

	@Override
	public String toString() {
		String string = this.getFirstName() + " " + this.getLastName() + "\n  Age: " + this.getAge() + "\n  Height: "
				+ this.getHeight() + "\n  Weight: " + this.getWeight() + "\n  Nationality: " + this.getNationality()
				+ "\n  Record: " + this.getRecords().toString() + "\n  Status: " + this.getStatus();
		return string;
	}
}
