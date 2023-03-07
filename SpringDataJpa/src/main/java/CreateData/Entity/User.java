package CreateData.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(name="user_name")	
private String name;
@Column(name="user_surname")
private String surname;
@Column(name="user_gmail",nullable = false,unique = false)
private String gmail;
	
	
	
	
	
}
