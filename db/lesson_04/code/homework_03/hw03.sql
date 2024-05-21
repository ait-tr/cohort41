-- Напишите select запросы с применением новых операторов фильтрации

select * from "Participants" where age > 25;
select * from "Participants" where country = 'UK';
select * from "Participants" where name ilike '%a%';
select * from "Participants" where age in (30, 18, 34);