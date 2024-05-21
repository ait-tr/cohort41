## Task 04. 

[Файл с данными](https://github.com/neelabalan/mongodb-sample-dataset/raw/main/sample_training/trips.json)

## step 0

    скачать файл, испортировать его в коллекцию trips в mongo compass (сначала создайте коллекцию trips) 

## step 1

    посчитать количество документов с фильтром tripduration > 1000

## step 2

    посчитать количество документов с фильтром usertype == "Subscriber"

## step 3

    посчитать количество документов с фильтром usertype == "Subscriber" and "birth year" < 1990

## step 4

    используя $expr посчитайте все трипы у которых "start station id" > "end station id"

## step 5

    найдите все трипы у которых {"end station id": 3104} и получите из них только 
    "start station name", при этом сортируйте по полю "start station id"