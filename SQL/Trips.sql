SELECT
    t.Request_at As Day,
    round(sum(if(status != 'completed', 1, 0)) / sum(1), 2) AS 'Cancellation Rate' 
FROM
    Trips as t
JOIN
    (SELECT * FROM Users WHERE Users.Banned="No") as Usr ON t.Client_Id = Usr.Users_Id
JOIN
    (SELECT * FROM Users WHERE Users.Banned="No") as Usr1 ON t.Driver_Id = Usr1.Users_Id
WHERE
    t.Request_at BETWEEN "2013-10-01" AND "2013-10-03"
GROUP BY
    t.Request_at
