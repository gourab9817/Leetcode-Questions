# Write your MySQL query statement below
select max(customer_number ) as customer_number from Orders group by customer_number order by COUNT(*) DESC limit 1;