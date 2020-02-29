SELECT CONCAT(dir.director_first_name,dir.director_last_name) as director_name,
mv.movie_title as movie_title 
FROM movies_cast as mc 
INNER JOIN movies as mv ON mc.movie_id=mv.movie_id 
INNER JOIN movies_directors as md ON md.movie_id=mv.movie_id 
INNER JOIN directors as dir ON dir.director_id=md.director_id 
WHERE mc.role="SeanMaguire";
