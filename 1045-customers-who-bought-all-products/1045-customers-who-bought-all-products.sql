select customer_id from(
    select customer_id, count(distinct product_key)  as cou
    from customer 
  
   
      group by customer_id 
)d
 where cou = (select count(*) from product);