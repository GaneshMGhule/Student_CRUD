package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "Stud_id")
	    private int studId;
	    
	    @Column(name="Stud_name", nullable = false)
	    private String StudName;
	    
	    @Column(name="email" ,nullable = false ,unique = true)
	    private String email;

		public Student() {
			super();
		}

		public Student( String studName, String email) {
			this.StudName = studName;
			this.email = email;
		}

		

		

		public String getStudName() {
			return StudName;
		}

		public void setStudName(String studName) {
			StudName = studName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public String toString() {
			return "Student [studId=" + studId + ", StudName=" + StudName + ", email=" + email + "]";
		}
	    
	    
	    
	    
}
