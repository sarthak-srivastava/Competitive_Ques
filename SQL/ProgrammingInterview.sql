BEGIN TRANSACTION;

/* Create a table called NAMES */
CREATE TABLE Salesperson(Id integer PRIMARY KEY, Name text, Age integer, Salary integer);
CREATE TABLE Customer(Id integer PRIMARY KEY, Name text, City text, 'Industry Type' text);
CREATE TABLE Orders('Number' integer PRIMARY KEY,order_date date, cust_id integer, salesperson_id integer, Amount integer );
/* Create few records in this table */
INSERT INTO Salesperson VALUES(1,'Abe',61,140000);
INSERT INTO Salesperson VALUES(2,'Bob',34,44000);
INSERT INTO Salesperson VALUES(5,'Chris',34,40000);
INSERT INTO Salesperson VALUES(7,'Dan',41,52000);
INSERT INTO Salesperson VALUES(8,'Ken',57,115000);
INSERT INTO Salesperson VALUES(11,'Joe',38,38000);

INSERT INTO Customer VALUES(4,'Samsonic','pleasant','J');

INSERT INTO Customer VALUES(6,'Panasung','oaktown','J');

INSERT INTO Customer VALUES(7,'Samony','jackson','B');

INSERT INTO Customer VALUES(9,'Orange','Jackson','B');

INSERT INTO Orders VALUES(10,8/2/96,4,2,540);
INSERT INTO Orders VALUES(20,1/30/99,4,8,1800);
INSERT INTO Orders VALUES(30,7/14/95,9,1,460);
INSERT INTO Orders VALUES(40,1/29/98,7,2,2400);
INSERT INTO Orders VALUES(50,2/3/98,6,7,600);
INSERT INTO Orders VALUES(60,3/2/98,6,7,720);
INSERT INTO Orders VALUES(70,5/6/98,9,7,150);

COMMIT;

/* Display all the records from the table */
SELECT Salesperson.Name FROM Salesperson INNER JOIN Orders on Salesperson.id=Orders.salesperson_id INNER JOIN Customer ON Customer.id=Orders.cust_id
    WHERE Customer.Name='Samsonic';

SELECT Salesperson.Name FROM Salesperson WHERE Salesperson.Name NOT IN (SELECT Salesperson.Name FROM Salesperson INNER JOIN Orders on Salesperson.id=Orders.salesperson_id INNER JOIN Customer ON Customer.id=Orders.cust_id
    WHERE Customer.Name='Samsonic') ;

SELECT S.Name FROM (SELECT Salesperson.Name as Name FROM Salesperson INNER JOIN Orders on Salesperson.id=Orders.salesperson_id INNER JOIN Customer ON Customer.id=Orders.cust_id) as S GROUP BY S.Name HAVING Count(*)>2;
-- SELECT * FROM Customer;
