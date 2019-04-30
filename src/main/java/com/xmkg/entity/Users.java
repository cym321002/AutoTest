package com.xmkg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tuser")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name="PKID")
    private int pkId;
    @Column(name="GUID")
    private String guId;
    @Column(name="UserCode")
    private String userCode;
    @Column(name="UserPwd")
    private String userPwd;
    @Column(name="UserName")
    private String userName;
    @Column(name="NickName")
    private String nickName;
    @Column(name="UserType")
    private int userType;
    @Column(name="UserSex")
    private int userSex;
    @Column(name="UserRank")
    private String userRank;
    @Column(name="Company")
    private String  company;
    @Column(name="Email")
    private String email;
    @Column(name="Phone")
    private String phone;
    @Column(name="AvatarPath")
    private String avatarPath;
    @Column(name="SmallAvatarPath")
    private String smallAvatarPath;
    @Column(name="UserStatus")
    private int userStatus;
    @Column(name="RFID")
    private String rfId;
    @Column(name="ContactInfo")
    private String contactInfo;
    @Column(name="Sort")
    private int sort;
    @Column(name="FillTime")
    private Date fillTime;
    @Column(name="Ext1")
    private String ext1;
    @Column(name="Ext2")
    private String ext2;
    @Column(name="Ext3")
    private String ext3;
    
	public int getPkId() {
		return pkId;
	}
	public void setPkId(int pkId) {
		this.pkId = pkId;
	}
	public String getGuId() {
		return guId;
	}
	public void setGuId(String guId) {
		this.guId = guId;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public int getUserSex() {
		return userSex;
	}
	public void setUserSex(int userSex) {
		this.userSex = userSex;
	}
	public String getUserRank() {
		return userRank;
	}
	public void setUserRank(String userRank) {
		this.userRank = userRank;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAvatarPath() {
		return avatarPath;
	}
	public void setAvatarPath(String avatarPath) {
		this.avatarPath = avatarPath;
	}
	public String getSmallAvatarPath() {
		return smallAvatarPath;
	}
	public void setSmallAvatarPath(String smallAvatarPath) {
		this.smallAvatarPath = smallAvatarPath;
	}
	public int getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}
	public String getRfId() {
		return rfId;
	}
	public void setRfId(String rfId) {
		this.rfId = rfId;
	}
	public String getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public Date getFillTime() {
		return fillTime;
	}
	public void setDateTime(Date fillTime) {
		this.fillTime = fillTime;
	}
	public String getExt1() {
		return ext1;
	}
	public void setExt1(String ext1) {
		this.ext1 = ext1;
	}
	public String getExt2() {
		return ext2;
	}
	public void setExt2(String ext2) {
		this.ext2 = ext2;
	}
    
    
    
   
}
