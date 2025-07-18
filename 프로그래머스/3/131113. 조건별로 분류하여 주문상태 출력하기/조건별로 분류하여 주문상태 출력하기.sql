-- 코드를 입력하세요
SELECT
    ORDER_ID,
    PRODUCT_ID,
    DATE_FORMAT(OUT_DATE, '%Y-%m-%d') AS OUT_DATE, 
    IF(ISNULL(OUT_DATE), '출고미정', IF(OUT_DATE < '2022-05-02', '출고완료', '출고대기')) AS 출고여부
FROM FOOD_ORDER 
ORDER BY ORDER_ID;