package com.intellytix.prsna.core.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "member_auth",schema = "prsna")
public class MemberAuth implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="member_auth_id")
    private Long id;

    @Column(name ="member_id")
    private Long memberId;

    @Column(name ="auth_token")
    private String authToken;

    @Column(name ="user_name")
    private String userName;

    @Column(name ="password")
    private String password;

    @Column(name ="create_date")
    private Date createDate;

    @Column(name ="update_date")
    private Date updateDate;

    @Column(name ="create_user")
    private String createUser;

    @Column(name ="update_user")
    private String updateUser;

    public MemberAuth(Long id, Long memberId, String authToken, String userName, String password, Date createDate, Date updateDate, String createUser, String updateUser) {
        this.id = id;
        this.memberId = memberId;
        this.authToken = authToken;
        this.userName = userName;
        this.password = password;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.createUser = createUser;
        this.updateUser = updateUser;
    }

    public MemberAuth() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        return "MemberAuth{" +
                "id=" + id +
                ", memberId=" + memberId +
                ", authToken='" + authToken + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", createUser='" + createUser + '\'' +
                ", updateUser='" + updateUser + '\'' +
                '}';
    }
}
