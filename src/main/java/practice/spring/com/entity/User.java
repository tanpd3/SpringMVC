package practice.spring.com.entity;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import practice.spring.com.validator.Phone;

public class User {
	
public User() {}
	
public User(String id, String name, String email, Date dateOfBirth, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
	}

@NotNull(message = "Id may not be null")
@NotBlank
private String id;

@NotBlank
@Length(min = 5, max = 10)
private String name;

@NotBlank
@Email
private String email;

@NotNull
@DateTimeFormat(pattern = "dd/MM/yyyy")
@Past
private Date dateOfBirth;

@Phone(message = "Phone Number is invalid")
private String phoneNumber;

/**
 * @return the id
 */
public String getId() {
	return id;
}

/**
 * @param id the id to set
 */
public void setId(String id) {
	this.id = id;
}

/**
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}

/**
 * @return the email
 */
public String getEmail() {
	return email;
}

/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}

/**
 * @return the dateOfBirth
 */
public Date getDateOfBirth() {
	return dateOfBirth;
}

/**
 * @param dateOfBirth the dateOfBirth to set
 */
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

/**
 * @return the phoneNumber
 */
public String getPhoneNumber() {
	return phoneNumber;
}

/**
 * @param phoneNumber the phoneNumber to set
 */
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}


}
