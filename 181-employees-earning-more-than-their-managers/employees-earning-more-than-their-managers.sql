# Write your MySQL query statement below
select e.name as Employee  from Employee as e join Employee as m ON e.managerID=m.id where e.salary>m.salary;