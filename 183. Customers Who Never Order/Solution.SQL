SELECT name
FROM Customer CUS
WHERE CUS.referee_id != 2
OR CUS.referee_id IS NULL
