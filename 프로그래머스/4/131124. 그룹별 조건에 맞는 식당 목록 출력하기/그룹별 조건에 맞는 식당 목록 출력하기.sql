-- 코드를 입력하세요
SELECT M.MEMBER_NAME, R.REVIEW_TEXT, DATE_FORMAT(R.REVIEW_DATE, "%Y-%m-%d")
FROM
    MEMBER_PROFILE AS M
    JOIN REST_REVIEW AS R
    ON M.MEMBER_ID = R.MEMBER_ID
WHERE 
    M.MEMBER_ID IN (SELECT T.MEMBER_ID 
                    FROM (SELECT * FROM REST_REVIEW 
                          GROUP BY MEMBER_ID 
                          ORDER BY COUNT(*) DESC
                          LIMIT 1) AS T
                    )
ORDER BY R.REVIEW_DATE ASC, R.REVIEW_TEXT ASC