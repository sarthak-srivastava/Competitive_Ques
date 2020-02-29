SELECT  mv.movie_title as movie_title,
        mv.movie_year as movie_year,
        CONCAT(dir.director_first_name,dir.director_last_name) as director_name,
        CONCAT(ac.actor_first_name,ac.actor_last_name) as actor_name, mc.role as role 
FROM    actors as ac INNER JOIN movies_cast as mc ON ac.actor_id=mc.actor_id
        INNER JOIN movies as mv ON mv.movie_id=mc.movie_id
        INNER JOIN movies_directors as md ON md.movie_id=mv.movie_id
        INNER JOIN directors as dir ON md.director_id=dir.director_id
        ORDER BY mv.movie_time 
        LIMIT 1;
