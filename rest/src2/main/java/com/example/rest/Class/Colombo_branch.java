package com.example.rest.Class;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Colombo_branch")
public class Colombo_branch {
	

    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	    private Integer id;
	    @Column(name="vehical")
	    private String vehical;
	    @Column(name="start_city")
	    private String start_city;
	    @Column(name="end_city")
	    private String end_city;
	    @Column(name="end_place")
	    private String end_place;
	    
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getVehical() {
			return vehical;
		}
		public void setVehical(String vehical) {
			this.vehical = vehical;
		}
		public String getStart_city() {
			return start_city;
		}
		public void setStart_city(String start_city) {
			this.start_city = start_city;
		}
		public String getEnd_city() {
			return end_city;
		}
		public void setEnd_city(String end_city) {
			this.end_city = end_city;
		}
		public String getEnd_place() {
			return end_place;
		}
		public void setEnd_place(String end_place) {
			this.end_place = end_place;
		}
		
		public Colombo_branch(String vehical, String start_city, String end_city, String end_place) {
			super();
			this.vehical = vehical;
			this.start_city = start_city;
			this.end_city = end_city;
			this.end_place = end_place;
		}
		
		public Colombo_branch() {
			
		}
	    
	    

}
