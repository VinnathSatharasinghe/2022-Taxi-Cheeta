package com.example.rest.Class;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin {
	
        @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)

	    private Integer id;
	    @Column(name="name")
	    private String name;
	    @Column(name="email")
	    private String email;
	    @Column(name="pass")
	    private String pass;
	    
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPass() {
			return pass;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
		public Admin(String name, String email, String pass) {
			super();
			this.name = name;
			this.email = email;
			this.pass = pass;
		}
		
		public Admin() {
			
		}

}
