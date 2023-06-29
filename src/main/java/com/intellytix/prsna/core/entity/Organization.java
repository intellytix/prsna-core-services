package com.intellytix.prsna.core.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "organization",schema = "prsna")
public class Organization implements Serializable {
	public static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="organization_id")
	private Long id;
	
	@Column(name ="organization_name")
	private String organizationName;

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

	@Column(name ="create_date")
	private Date createDate;

	@Column(name ="update_date")
	private Date updateDate;

	@Column(name ="create_user")
	private String createUser;

	@Column(name ="update_user")
	private String updateUser;

	public Organization(Long id, String organizationName, String addressLine1, String addressLine2, String state, String zipCode, String country,
						Date createDate, String createUser, Date updateDate, String updateUser) {
		this.id = id;
		this.organizationName = organizationName;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
		this.createDate = createDate;
		this.createUser = createUser;
		this.updateDate = updateDate;
		this.updateUser = updateUser;
	}

	public Organization() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
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
		return "Organization{" +
				"id=" + id +
				", organizationName='" + organizationName + '\'' +
				", addressLine1='" + addressLine1 + '\'' +
				", addressLine2='" + addressLine2 + '\'' +
				", state='" + state + '\'' +
				", zipCode='" + zipCode + '\'' +
				", country='" + country + '\'' +
				", createDate=" + createDate +
				", updateDate=" + updateDate +
				", createUser='" + createUser + '\'' +
				", updateUser='" + updateUser + '\'' +
				'}';
	}
}
