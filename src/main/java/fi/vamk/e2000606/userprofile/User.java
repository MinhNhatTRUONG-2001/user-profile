package fi.vamk.e2000606.userprofile;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="user")
@NamedQuery(name="User.findAll", query="SELECT p FROM User p")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	private String email;

	private String phone;

	private int profile;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile", referencedColumnName = "id", insertable = false, updatable = false)
    private Profile profiles;

	public User() {
	}

	public int getProfile() {
		return profile;
	}

	public void setProfile(int profile) {
		this.profile = profile;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}