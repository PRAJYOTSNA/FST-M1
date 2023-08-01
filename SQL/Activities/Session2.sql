SELECT * FROM salesman;

UPDATE salesman SET salesman_city='Mexico' WHERE SALESMAN_ID=5001;

SELECT * FROM salesman;

UPDATE salesman SET salesman_city='Mexico' WHERE SALESMAN_ID=5001;

SELECT * FROM salesman;

ALTER TABLE salesman RENAME COLUMN commission TO sales_commission;

ALTER TABLE salesman RENAME COLUMN commission TO sales_commission;

SELECT * FROM salesman;

UPDATE salesman SET salesman_city='Mexico' WHERE salesman_id=5001 AND salesman_id=5007 
SELECT * FROM salesman;

UPDATE salesman SET salesman_city='Mexico' WHERE salesman_id=5001 OR salesman_id=5007 
SELECT * FROM salesman;

SELECT * FROM salesman;

SELECT * FROM salesman WHERE salesman_name LIKE 'James %';

SELECT DISTINCT * FROM salesman;

SELECT * FROM salesman ORDER_BY salesman_city;

SELECT * FROM salesman ORDER_BY salesman_city;

SELECT * FROM salesman ORDER BY salesman_city;

SELECT * FROM salesman ORDER BY salesman_city DESC;

SELECT * FROM salesman ORDER BY salesman_city, salesman_name;

SELECT * FROM salesman ORDER BY salesman_city DESC, salesman_name ASC;

SELECT 1 FROM DUAL;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

SELECT DISTINCT customer_id from orders;

SELECT order_no FROM orders ORDER BY order_date;

SELECT order_no FROM orders ORDER BY purchase_amount DESC;

SELECT * FROM orders WHERE purchase_amount < 500;

SELECT * FROM orders WHERE purchase_amount BETWEEN 1000 AND 2000;

SELECT DISTINCT customer_id from orders;

SELECT order_no FROM orders ORDER BY order_date;

SELECT order_no FROM orders ORDER BY purchase_amount DESC;

SELECT * FROM orders WHERE purchase_amount < 500;

SELECT * FROM orders WHERE purchase_amount BETWEEN 1000 AND 2000;

SELECT * from orders;

SELECT SUM(purchase_amount) FROM orders GROUP BY purchase_amount;

SELECT * from orders;

SELECT SUM(purchase_amount) FROM orders GROUP BY purchase_amount;

SELECT SUM(purchase_amount) FROM orders;

SELECT SUM(purchase_amount) FROM orders;

SELECT AVG(purchase_amount) FROM orders;

SELECT MAX(purchase_amount) FROM orders;

SELECT MIN(purchase_amount) FROM orders;

SELECT SUM(purchase_amount) FROM orders;

SELECT AVG(purchase_amount) FROM orders;

SELECT MAX(purchase_amount) FROM orders;

SELECT MIN(purchase_amount) FROM orders;

SELECT * from orders;

SELECT SUM(purchase_amount) FROM orders;

SELECT AVG(purchase_amount) FROM orders;

SELECT MAX(purchase_amount) FROM orders;

SELECT MIN(purchase_amount) FROM orders;

SELECT * from orders;

SELECT COUNT(distinct salesman_id) FROM orders;

SELECT * from orders;

SELECT * from orders;

SELECT customer_id, MAX(purchase_amount) FROM orders GROUP By customer_id;

SELECT salesman_id, order_date, MAX(purchase_amount) FROM orders WHERE order_date=to_date('2012-08-17','YYYY-MM-DD') GROUP BY salesman_id, order_date;

SELECT customer_id, order_date, MAX(purchase_amount) FROM orders GROUP BY customer_id, order_date HAVING MAX(purchase_amount) IN (2030, 3450, 5760, 6000);