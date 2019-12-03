select status from orders;

select status from orders
group by status;

select status,count(*) as 'so luong status'
from orders 
group by status;

select status,sum(priceEach*quantityOrdered) as amount
from orders inner join orderdetails
on orders.orderNumber=orderdetails.orderNumber
group by status;

select orderNumber,(priceEach*quantityOrdered) as amount
from orderdetails
group by orderNumber;

select year(orderDate) as year,priceEach*quantityOrdered as mount
FROM orders inner join orderdetails
on orders.orderNumber=orderdetails.orderNumber
 where status='shipped'
 group by year
 having year>2003;
 
 