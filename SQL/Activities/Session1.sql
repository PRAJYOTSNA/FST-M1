CREATE TABLE Customers(cust_id int PRIMARY KEY, 
		       cust_name varchar(32),
			cust_location varchar(10));

INSERT INTO Customers VALUES(1, 'Alpha', 'Hyderabad');
INSERT INTO Customers(cust_id, cust_name) VALUES(2, 'Beta');

SELECT * FROM Customers;



CREATE TABLE salesman(salesman_id int ,  
    salesman_name varchar2(20),  
    salesman_city varchar2(20),  
    commission int  
    )

INSERT INTO salesman VALUES(5001,'James Hogg','New York',15)
INSERT ALL INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13)  
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)  
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)  
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)  
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 

select * from salesman
select distinct * from salesman
select distinct salesman_id from salesman
select salesman_id,salesman_city from salesman
select * from salesman where salesman_city='Paris'
select salesman_id,commission from salesman where salesman_name='Paul Adam'

