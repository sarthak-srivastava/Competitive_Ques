# Write your MySQL query statement below
SELECT s.* 
FROM
(SELECT CASE 
        WHEN id in (SELECT MAX(id) FROM seat) AND MOD(id, 2)=1 THEN id 
        WHEN MOD(id, 2)=0 THEN id-1 
        ELSE id+1 
        END
        as id, student 
        FROM 
            seat 
        ORDER BY 
            id ) as s;
