# Write your MySQL query statement below
select e.name as Employee  from Employee  e join Employee  m ON e.managerID=m.id where e.salary>m.salary;