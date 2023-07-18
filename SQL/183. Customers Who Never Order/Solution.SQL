SELECT name AS Customers
FROM Customers CUS
WHERE CUS.id NOT IN (
    SELECT customerId 
    FROM Orders ORD
)
