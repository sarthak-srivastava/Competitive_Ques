SELECT movie_title 
FROM 
  movies JOIN movies_cast ON movies.movie_id = movies_cast.movie_id
WHERE
  movies_cast.actor_id IN 
  (SELECT actor_id 
  FROM 
    movies_cast 
  GROUP BY 
     actor_id 
  HAVING COUNT(actor_id) > 1);
