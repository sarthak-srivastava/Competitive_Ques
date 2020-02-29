SELECT rv.reviewer_name AS reviewer_name FROM 
reviewers as rv INNER JOIN
ratings as rt 
ON rv.reviewer_id = rt.reviewer_id 
WHERE rt.reviewer_stars IS NULL;
