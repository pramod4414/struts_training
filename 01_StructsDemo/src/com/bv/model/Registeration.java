package com.bv.model;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class Registeration extends ActionSupport {
	private String username, password;
	private String cfmPassword;
	private String gender;
	private String hobbies[];
	private int age;
	private Date dob;
	private String skills;
	private String doubleSelectRole;
	private String doubleSelectExpertise;
	private String bio;
	private String email;
	private String mobile;
	private File userImage;
	private String userImageContentType;
	private String userImageFileName;

	public File getUserImage() {
		return userImage;
	}

	public void setUserImage(File userImage) {
		this.userImage = userImage;
	}

	public String getUserImageContentType() {
		return userImageContentType;
	}

	public void setUserImageContentType(String userImageContentType) {
		this.userImageContentType = userImageContentType;
	}

	public String getUserImageFileName() {
		return userImageFileName;
	}

	public void setUserImageFileName(String userImageFileName) {
		this.userImageFileName = userImageFileName;
	}

	public String getCfmPassword() {
		return cfmPassword;
	}

	public void setCfmPassword(String cfmPassword) {
		this.cfmPassword = cfmPassword;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// @RequiredStringValidator(message="Select gender")
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	// @RequiredStringValidator(message="Select hobbies")
	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getDoubleSelectRole() {
		return doubleSelectRole;
	}

	public void setDoubleSelectRole(String doubleSelectRole) {
		this.doubleSelectRole = doubleSelectRole;
	}

	public String getDoubleSelectExpertise() {
		return doubleSelectExpertise;
	}

	public void setDoubleSelectExpertise(String doubleSelectExpertise) {
		this.doubleSelectExpertise = doubleSelectExpertise;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * public String execute() { return "success"; }
	 */

	/*
	 * public void validate() { if(username.equals("pramod") &&
	 * password.equals("pramod")) addActionMessage("valid user");
	 * 
	 * else { addActionError("Invalid user");
	 * 
	 * }
	 */

	/*
	 * if(LoginService.validateUser1(username, password)) {
	 * addActionMessage("Valid User"); } else { addActionError("Invalid Error"); }
	 */

	/*
	 * if(username == null || username.equals("") ) {
	 * addFieldError("username","username is required"); }
	 * 
	 * 
	 * 
	 * if (password.length() >10 || password.length() < 6) {
	 * addFieldError("password","password length betn 6 to 10  ");
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * String specialChars =
	 * "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)"; if
	 * (!password.matches(specialChars )) { addFieldError(
	 * "password","password at leat contain one alphanumeric character "); }
	 * 
	 * 
	 * if(age < 18 || age >65) { addFieldError("age", "age is required"); }
	 * 
	 * if(gender.length() < 0 ) { addFieldError("gender", "kindly select Gender"); }
	 * 
	 * 
	 * 
	 */

	public String execute() {

		String filePath = ServletActionContext.getServletContext().getRealPath("/").concat("userimages");
		try {
			System.out.println("Image Location:" + filePath);// see the server console for actual location
			File fileToCreate = new File(filePath, userImageFileName);
			FileUtils.copyFile(userImage, fileToCreate);// copying source file to new file

			
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
		
	}
}
