package cn.heweiming.commons.beanutils;

import java.util.Date;

public class Person {

	private String name;
	private Character sex;
	private Integer age;
	private Double income;
	private Date birthday;
	private String password;

	public Integer getAge() {
		return age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public Double getIncome() {
		return income;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public Character getSex() {
		return sex;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setSex(Character sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", age=" + age
				+ ", income=" + income + ", birthday=" + birthday
				+ ", password=" + password + "]";
	}

}
