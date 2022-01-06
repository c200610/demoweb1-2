DROP TABLE IF EXISTS ACCOUNT;

CREATE TABLE ACCOUNT (
    ID IDENTITY NOT NULL PRIMARY KEY,
    FIRST_NAME VARCHAR(255) NOT NULL,
    LAST_NAME VARCHAR(255) NOT NULL,
    USER_NAME VARCHAR(255) NOT NULL,
    PASSWORD VARCHAR(255) NOT NULL,
    AGE INT NOT NULL,
    TEL VARCHAR(255) NOT NULL,
    ADDRESS VARCHAR(255) NOT NULL,
    GENDER BOOLEAN NOT NULL,
    SCHOOLS VARCHAR(255) NOT NULL
);