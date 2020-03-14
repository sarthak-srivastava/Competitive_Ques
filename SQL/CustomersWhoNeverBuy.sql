/* Write your PL/SQL query statement below */
SELECT c1.Name as Customers FROM Customers c1
WHERE c1.Id NOT IN
(SELECT c.Id FROM Customers c INNER JOIN Orders o ON c.Id=o.CustomerId);
