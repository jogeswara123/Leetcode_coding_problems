/* Write your PL/SQL query statement below */
SELECT c.name AS customers
FROM Customers c
WHERE NOT EXISTS (
    SELECT 1 
    FROM Orders o 
    WHERE o.customerId = c.id
)ORDER BY c.id;

