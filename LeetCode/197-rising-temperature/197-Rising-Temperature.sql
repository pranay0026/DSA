WITH info AS (
    SELECT 
        id,
        recorddate,
        temperature,
        LAG(temperature) OVER (ORDER BY recorddate) AS prev_temperature,
        LAG(recorddate) OVER (ORDER BY recorddate) AS prev_record_date
    FROM weather
)
SELECT id 
FROM info 
WHERE temperature > prev_temperature
  AND DATEDIFF(recorddate, prev_record_date) = 1;
