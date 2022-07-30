package com.bridgelabz;

public class Mysql {
	public static void main(String[] args) {
		System.out.println("Welcome to AddressBook in DataBase");
		
		 create database Address_Book_Service;
		 use Address_Book_Service;
		 show databases;
		 
		 create table address_book(
				 
		    first_name varchar(40),
		    last_name varchar(30),
		    address varchar(65),
		    city varchar(30),
		    state varchar(50),
		    zip int,
		    phone_number long,
		    email varchar(20));
		 
		 select * from address_book;
		  
		 insert into address_book values("Sanjith","Vallag","Rajkumar","Hassan","Karnataka",573103,9664564653,"sanjithj@gmail.com");
		 insert into address_book values("Raj","Gururaj","Kolkata","Calicut","Mumbai",455338,942946461222,"sagar@gmail.com");
		 insert into address_book values("Vikas","Hansraj","Vizar","Bangalore","TamilNadu",4133756,9654644429,"sanjay@gmail.com");
		 insert into address_book values("Elwin","Das","Velankani","Mumbai","Bombay",509338,7867656202,"veera@gmail.com");
		   
		 SET SQL_SAFE_UPDATES = 0;
		 
	     update address_book set city="Arsikere" where first_name = "Sanjith";
	     
	     delete from address_book  where first_name = "Sanjith";
	     
	     select * from address_book where city = "Hassan" or state = "Karnataka";

	     select count(state&city) from address_book;

	     select * from address_book order by first_name;
	     
	     alter table address_book add column name varchar(45);

	     update address_book set name = "Friend" where first_name = "Vikas";
	     
		 insert into address_book values("Sanjith","Vallag","Rajkumar","Hassan","Karnataka",573103,9664564653,"sanjithj@gmail.com","Friend","Family");
		
	 }

	}

}
