# Write your MySQL query statement below
select Customers.name as Customers 
from Customers
left join Orders
On (Customers.id = Orders.customerId)
where Orders.id is null;
