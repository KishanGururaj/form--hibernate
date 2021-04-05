package com.wolken.wolkenapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="user_table")

@NoArgsConstructor
@NamedQuery(name = "selectAll", query = "from UserDTO us")
@NamedQuery(name = "delete", query = "delete from UserDTO us where us.id=:id")

@Getter
@Setter
@ToString

public class UserDTO {
	@Id
	@Column(name="user_id")
	private Integer id;
	@Column(name="user_age")
	private Integer age;
	@Column(name="user_name")
	private String userName;
	@Column(name="user_email_id")
	private String emailId;
	@Column(name="user_password")
	private String password;

	/*
	 * public FruitsDTO() { // TODO Auto-generated constructor stub }
	 */
	/*
	 * public int getFruitId() { return fruitId; } public void setFruitId(int
	 * fruitId) { this.fruitId = fruitId; } public String getFruitName() { return
	 * fruitName; } public void setFruitName(String fruitName) { this.fruitName =
	 * fruitName; }
	 */

}
