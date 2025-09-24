CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    DECLARE off INT;
  SET off = N - 1;
  RETURN (
    SELECT IFNULL(
      (
        SELECT DISTINCT salary
        FROM Employee
        ORDER BY salary DESC
        LIMIT  off,1
      ),
      NULL
    )
  );
END
