## Part 1: Test it with SQL
id - INT
employer - VARCHAR
name - VARCHAR
skills - VARCHAR

## Part 2: Test it with SQL
SELECT name
FROM employer
WHERE (location = "Saint Louis, MO");

## Part 3: Test it with SQL
DROP TABLE job;

## Part 4: Test it with SQL
SELECT name, description
FROM skill
JOIN job_skills ON skill.id = job_skills.skills_id
ORDER BY name ASC;