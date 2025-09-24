# Write your MySQL query statement below
select e.unique_id ,a.name from Employees  a left join EmployeeUNI e on a.id=e.id 