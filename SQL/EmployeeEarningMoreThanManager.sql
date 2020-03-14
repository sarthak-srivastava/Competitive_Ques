/* Write your PL/SQL query statement below */

SELECT e1.Name as Employee
FROM Employee e1 
INNER JOIN
    Employee e2
ON e1.ManagerID=e2.Id
WHERE e1.Salary>e2.Salary;
