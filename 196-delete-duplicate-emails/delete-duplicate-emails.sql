# Write your MySQL query statement below
delete p1 from Person  as p1 join Person as q on p1.email=q.email and p1.id>q.id 