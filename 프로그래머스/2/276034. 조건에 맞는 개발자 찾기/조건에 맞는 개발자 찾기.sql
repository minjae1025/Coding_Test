-- 코드를 작성해주세요
SELECT
    DISTINCT ID,
    EMAIL,
    FIRST_NAME,
    LAST_NAME
FROM
    DEVELOPERS d
    JOIN SKILLCODES s
    ON s.name IN ('C#', 'Python')
    AND d.skill_code & s.code = s.code
ORDER BY ID;