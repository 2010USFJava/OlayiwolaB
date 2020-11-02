package com.revature.customer;

import java.io.Serializable;

import com.revature.util.Details;
import com.revature.util.IOFile;
import com.revature.util.LogThis;

public class Customer implements Serializable{
			/**
	 * 
	 */
	private static final long serialVersionUID = 8585962566256332549L;
			private String firstName;
			private String lastName;
			private String address;
			private String userName;
			private String password;
			private String driverLicense;
			
			
			public Customer() {
				super();
				Details.customerList.add(this);
				IOFile.writeCustomerFile(Details.customerList);
				}


			public Customer(String firstName, String lastName, String address, String userName, String password, String driverLicense) {
				super();
				this.firstName = firstName;
				this.lastName = lastName;
				this.address = address;
				this.userName = userName;
				this.password = password;
				this.driverLicense = driverLicense;
				Details.customerList.add(this);
				IOFile.writeCustomerFile(Details.customerList);
				LogThis.LogIt("info", "A new Customer," + this.firstName +", has Register to Open an Account");//to make sure works with the arraylist

			}


			public String getFirstName() {
				return firstName;
			}


			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}


			public String getLastName() {
				return lastName;
			}


			public void setLastName(String lastName) {
				this.lastName = lastName;
			}


			public String getAddress() {
				return address;
			}


			public void setAddress(String address) {
				this.address = address;
			}


			public String getUserName() {
				return userName;
			}


			public void setUserName(String userName) {
				this.userName = userName;
			}


			public String getPassword() {
				return password;
			}


			public void setPassword(String password) {
				this.password = password;
			}



			public String getDriverLicense() {
				return driverLicense;
			}


			public void setDriverLicense(String driverLicense) {
				this.driverLicense = driverLicense;
			}


			@Override
			public String toString() {
				return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
						+ ", userName=" + userName + ", password=" + password + ", driverLicense="
						+ driverLicense + "]";
			}
}
