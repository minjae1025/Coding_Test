-- 코드를 입력하세요
SELECT BOOK_ID, SUBSTR(PUBLISHED_DATE, 1) AS 'PUBLISHED_DATE'
FROM BOOK
WHERE PUBLISHED_DATE LIKE '2021-%' AND CATEGORY = '인문'
ORDER BY PUBLISHED_DATE;