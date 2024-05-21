-- Напишите select запросы с применением группировки и агрегации

select avg(age) as avg_age, gender from "Participants" group by gender;
select count(*) as runner_count, country from "Participants" group by country;


-- age > 25 and name != Egor or age < 40
