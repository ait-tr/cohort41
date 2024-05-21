-- Создать таблицу с констрейнтами UNIQUE и CHECK

CREATE TABLE users (
    id serial PRIMARY KEY,
    username varchar(64) UNIQUE,
    age int CHECK (age > 18)
);
