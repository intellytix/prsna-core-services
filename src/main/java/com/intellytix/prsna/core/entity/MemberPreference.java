package com.intellytix.prsna.core.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "member_preference",schema = "prsna")
public class MemberPreference implements Serializable {

	public static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="member_preference_id")
	private Long id;

	@Column(name ="memeber_id")
	private Long memberId;

	@Column(name ="language_preference")
	private String languagePreference;

	@Column(name ="optin_email_notification")
	private Boolean optInEmailNotification;

	@Column(name ="optin_sms")
	private String optInSms;

	@Column(name ="create_date")
	private Date createDate;

	@Column(name ="update_date")
	private Date updateDate;

	@Column(name ="create_user")
	private String createUser;

	@Column(name ="update_user")
	private String updateUser;

	public MemberPreference(Long id, Long memberId, String languagePreference, Boolean optInEmailNotification, String optInSms, Date createDate, Date updateDate, String createUser, String updateUser) {
		this.id = id;
		this.memberId = memberId;
		this.languagePreference = languagePreference;
		this.optInEmailNotification = optInEmailNotification;
		this.optInSms = optInSms;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.createUser = createUser;
		this.updateUser = updateUser;
	}

	public MemberPreference() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getLanguagePreference() {
		return languagePreference;
	}

	public void setLanguagePreference(String languagePreference) {
		this.languagePreference = languagePreference;
	}

	public Boolean getOptInEmailNotification() {
		return optInEmailNotification;
	}

	public void setOptInEmailNotification(Boolean optInEmailNotification) {
		this.optInEmailNotification = optInEmailNotification;
	}

	public String getOptInSms() {
		return optInSms;
	}

	public void setOptInSms(String optInSms) {
		this.optInSms = optInSms;
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
		return "MemberPreference{" +
				"id=" + id +
				", memberId=" + memberId +
				", languagePreference='" + languagePreference + '\'' +
				", optInEmailNotification=" + optInEmailNotification +
				", optInSms='" + optInSms + '\'' +
				", createDate=" + createDate +
				", updateDate=" + updateDate +
				", createUser='" + createUser + '\'' +
				", updateUser='" + updateUser + '\'' +
				'}';
	}
}
