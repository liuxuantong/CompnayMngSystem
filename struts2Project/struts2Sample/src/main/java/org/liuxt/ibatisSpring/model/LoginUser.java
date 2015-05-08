package org.liuxt.ibatisSpring.model;

import java.sql.Timestamp;


public class LoginUser extends CommonBean {
	
	String userId;
	String kanjiName;
	String kanaName;
	String mail;
	String tel;
	String deleteFlg;
	Timestamp regDt;
	String regId;
	Timestamp updDt;
	String updId;
	String password;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getKanjiName() {
		return kanjiName;
	}
	public void setKanjiName(String kanjiName) {
		this.kanjiName = kanjiName;
	}
	public String getKanaName() {
		return kanaName;
	}
	public void setKanaName(String kanaName) {
		this.kanaName = kanaName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getDeleteFlg() {
		return deleteFlg;
	}
	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}
	public Timestamp getRegDt() {
		return regDt;
	}
	public void setRegDt(Timestamp regDt) {
		this.regDt = regDt;
	}
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	public Timestamp getUpdDt() {
		return updDt;
	}
	public void setUpdDt(Timestamp updDt) {
		this.updDt = updDt;
	}
	public String getUpdId() {
		return updId;
	}

	public void setUpdId(String updId) {
		this.updId = updId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
