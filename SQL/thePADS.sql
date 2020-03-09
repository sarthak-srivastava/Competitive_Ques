/*
Enter your query here.
*/
SELECT CONCAT(t.Name, CONCAT("(",CONCAT(LEFT(t.Occupation, 1),")"))) FROM (SELECT * FROM OCCUPATIONS ORDER BY Name) as t;
SELECT CONCAT('There are a total of ', COUNT(Occupation), ' ', LOWER(Occupation), 's.') FROM OCCUPATIONS GROUP BY Occupation ORDER BY COUNT(Occupation), Occupation;
