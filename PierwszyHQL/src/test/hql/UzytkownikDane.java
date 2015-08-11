package test.hql;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="DaneUzytkownika",schema = "test7")
public class UzytkownikDane {
	
	@Id
	@SequenceGenerator(name = "userName_seq", sequenceName = "test7.userName_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userName_seq")
	private int userID;
	
	@Column(name ="UserName")
	private String userName;
	
	@Column(name = "DataDolaczenia")
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
