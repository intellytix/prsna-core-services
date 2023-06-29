package com.intellytix.prsna.core.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "member",schema = "prsna")
public class Member implements Serializable {

	public static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="member_id")
	private Long id;

	@Column(name ="organization_id")
	private Long organizationId;

	@Column(name ="legal_name")
	private String legalName;

	@Column(name ="spiritual_name")
	private String spiritualName;

	@Column(name ="email")
	private String email;

	@Column(name ="phone_number")
	private String phoneNumber;

	@Column(name ="date_of_birth")
	private Date dateOfBirth;

	@Column(name ="address_line1")
	private String addressLine1;

	@Column(name ="address_line2")
	private String addressLine2;

	@Column(name ="state")
	private String state;

	@Column(name ="zip_code")
	private String zipCode;

	@Column(name ="country")
	private String country;

	@Column(name ="user_type")
	private String userType;

	@Column(name ="registered_member_id")
	private Long registeredMemberId;

	@Column(name ="last_login_date")
	private Date lastLoginDate;

	@Column(name ="create_date")
	private Date createDate;

	@Column(name ="update_date")
	private Date updateDate;

	@Column(name ="create_user")
	private String createUser;

	@Column(name ="update_user")
	private String updateUser;

	public Member(Long id, Long organizationId, String legalName, String spiritualName, String email, String phoneNumber, String addressLine1, String addressLine2, String state, String zipCode, String country, String userType, Date lastLoginDate, Date createDate, Date updateDate, String createUser, String updateUser) {
		this.id = id;
		this.organizationId = organizationId;
		this.legalName = legalName;
		this.spiritualName = spiritualName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.state = state;
		this.zipCode = zipCode;
		this.country = country;
		this.userType = userType;
		this.lastLoginDate = lastLoginDate;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.createUser = createUser;
		this.updateUser = updateUser;
	}

	public Member() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(Long organizationId) {
		this.organizationId = organizationId;
	}

	public String getLegalName() {
		return legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getSpiritualName() {
		return spiritualName;
	}

	public void setSpiritualName(String spiritualName) {
		this.spiritualName = spiritualName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	@Override
	public String toString() {
		return "Member{" +
				"id=" + id +
				", organizationId=" + organizationId +
				", legalName='" + legalName + '\'' +
				", spiritualName='" + spiritualName + '\'' +
				", email='" + email + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				", addressLine1='" + addressLine1 + '\'' +
				", addressLine2='" + addressLine2 + '\'' +
				", state='" + state + '\'' +
				", zipCode='" + zipCode + '\'' +
				", country='" + country + '\'' +
				", userType='" + userType + '\'' +
				", lastLoginDate=" + lastLoginDate +
				", createDate=" + createDate +
				", updateDate=" + updateDate +
				", createUser='" + createUser + '\'' +
				", updateUser='" + updateUser + '\'' +
				'}';
	}


}
