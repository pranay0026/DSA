# Write your MySQL query statement below
with ranked_salary as(
    select salary,departmentId,name, dense_rank() over(partition by departmentId order by salary desc) as `rank`
    from employee
)

select d.name as `department`,e.name as `employee`,e.salary as salary 
from ranked_salary as e inner join department d on e.departmentId=d.Id
where e.`rank`<=3;