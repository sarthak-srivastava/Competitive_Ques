/* Write your PL/SQL query statement below */

SELECT 
    Email
FROM 
    (SELECT Email, count(*) as freq FROM Person GROUP BY Email) 
WHERE 
    freq>=2; 
