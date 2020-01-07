# Write your MySQL query statement below
SELECT FirstName, LastName, City, State FROM Person LEFT JOIN Address on Person.PersonId = Address.PersonId;
