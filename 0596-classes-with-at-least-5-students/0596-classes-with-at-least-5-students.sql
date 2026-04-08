# Write your MySQL query statement below
select class from (
    select class, count(class) as c from courses
    group by class 
    order by count(class)
) s
where c>=5;