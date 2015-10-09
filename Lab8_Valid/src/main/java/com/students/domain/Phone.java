/**
 * 
 */
package com.students.domain;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

/**
 * @author B.Pirasanth
 *
 */
public class Phone implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Pattern(regexp="^\\d{3}",message="{Pattern.area}")
 	private int area;
 	
	@Pattern(regexp="^\\d{3}",message="{Pattern.prefix}")
 	private int prefix;
 	
	@Pattern(regexp="^\\d{4}",message="{Pattern.number}")
 	private int number;
	

 
	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

 	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getPrefix() {
		return prefix;
	}

	public void setPrefix(int prefix) {
		this.prefix = prefix;
	}
}
