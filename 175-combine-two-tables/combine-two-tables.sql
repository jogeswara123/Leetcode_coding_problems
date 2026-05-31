# Write your MySQL query statement below
SELECT 
    p.firstName, 
    p.lastName, 
    b.city, 
    b.state 
FROM 
    Person p 
LEFT JOIN 
    Address b ON p.personId = b.personId;
