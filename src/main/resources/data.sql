CREATE TABLE USERS (
    USER_ID INT,
    USER_NAME CHAR(20),
    CREATE_DATE  DATE,
    USER_PASS CHAR(30)
);

CREATE TABLE BLOGS (
    USER_ID INT,
    BLOG_NAME CHAR(255),
    BLOG_CATEGORY INT,
    BLOG_TEXT text(5000)
)
