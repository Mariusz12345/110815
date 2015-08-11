package test.hql;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DaneUzytkownika")
public class UzytkownikDane {
	
	@Id
	@Column(name = "UserID")
	private int userID;
	@Column(name ="UserName")
	private String userName;
	private Date dataDolaczenia;
	
	public Date getDataDolaczenia() {
		return dataDolaczenia;
	}
	public void setDataDolaczenia(Date dataDolaczenia) {
		this.dataDolaczenia = dataDolaczenia;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
