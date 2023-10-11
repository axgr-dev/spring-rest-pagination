CREATE TABLE books
(
    id     VARCHAR(36) PRIMARY KEY,
    title  VARCHAR(255)   NOT NULL,
    author VARCHAR(255)   NOT NULL,
    price  DECIMAL(10, 2) NOT NULL
);
