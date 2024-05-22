// step 1
// посчитать количество документов с фильтром tripduration > 1000

db.trips.countDocuments( { tripduration: {$gt: 1000} } );

// 2755

// ---

// step 2
// посчитать количество документов с фильтром usertype == "Subscriber"

db.trips.countDocuments( { usertype: "Subscriber" } )

// 8011

// ---

// step 3
// посчитать количество документов с фильтром usertype == "Subscriber" and "birth year" < 1990

db.trips.countDocuments( {
    usertype: "Subscriber", "birth year": {$lt: 1990}
} )

// 7036

// ---

// step 4
// используя $expr посчитайте все трипы у которых "start station id" > "end station id"

db.trips.countDocuments( {
	$expr: {$gt: ["$start station id", "$end station id"]}
} )

// 4933

// ---

// step 5
// найдите все трипы у которых {"end station id": 3104} и получите из них только
// "start station name", при этом сортируйте по полю "start station id"

db.trips.find(
    {"end station id": 3104},
    {"start station name": 1, "_id": 0}
).sort({ "start station id": 1 })
