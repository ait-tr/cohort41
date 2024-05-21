CREATE TABLE "Volunteers"(
    "volunteer_id" INTEGER NOT NULL,
    "name" VARCHAR(25) NOT NULL,
    "role" VARCHAR(200) NOT NULL,
    "event_id" INTEGER NOT NULL
);
ALTER TABLE
    "Volunteers" ADD PRIMARY KEY("volunteer_id");
CREATE TABLE "Results"(
    "result_id" INTEGER NOT NULL,
    "participant_id" INTEGER NOT NULL,
    "time" TIME(0) WITHOUT TIME ZONE NOT NULL,
    "position" INTEGER NOT NULL,
    "event_id" INTEGER NOT NULL
);
ALTER TABLE
    "Results" ADD PRIMARY KEY("result_id");
ALTER TABLE
    "Results" ADD CONSTRAINT "results_participant_id_unique" UNIQUE("participant_id");
CREATE TABLE "Participants"(
    "participant_id" INTEGER NOT NULL,
    "name" VARCHAR(25) NOT NULL,
    "age" INTEGER NOT NULL,
    "gender" VARCHAR(45) NOT NULL,
    "country" VARCHAR(45) NOT NULL,
    "event_id" INTEGER NOT NULL
);
ALTER TABLE
    "Participants" ADD PRIMARY KEY("participant_id");
CREATE TABLE "Sponsors"(
    "sponsor_id" INTEGER NOT NULL,
    "name" VARCHAR(60) NOT NULL,
    "contact_info" VARCHAR(255) NOT NULL
);
ALTER TABLE
    "Sponsors" ADD PRIMARY KEY("sponsor_id");
CREATE TABLE "Events"(
    "event_id" INTEGER NOT NULL,
    "name" VARCHAR(49) NOT NULL,
    "date" DATE NOT NULL
);
ALTER TABLE
    "Events" ADD PRIMARY KEY("event_id");
CREATE TABLE "SponsorsEvents"(
    "id" INTEGER NOT NULL,
    "event_id" INTEGER NOT NULL,
    "sponsor_id" INTEGER NOT NULL
);
ALTER TABLE
    "SponsorsEvents" ADD PRIMARY KEY("id");
ALTER TABLE
    "SponsorsEvents" ADD CONSTRAINT "sponsorsevents_sponsor_id_foreign" FOREIGN KEY("sponsor_id") REFERENCES "Sponsors"("sponsor_id");
ALTER TABLE
    "SponsorsEvents" ADD CONSTRAINT "sponsorsevents_event_id_foreign" FOREIGN KEY("event_id") REFERENCES "Events"("event_id");
ALTER TABLE
    "Results" ADD CONSTRAINT "results_participant_id_foreign" FOREIGN KEY("participant_id") REFERENCES "Participants"("participant_id");
ALTER TABLE
    "Participants" ADD CONSTRAINT "participants_event_id_foreign" FOREIGN KEY("event_id") REFERENCES "Events"("event_id");
ALTER TABLE
    "Volunteers" ADD CONSTRAINT "volunteers_event_id_foreign" FOREIGN KEY("event_id") REFERENCES "Events"("event_id");
ALTER TABLE
    "Results" ADD CONSTRAINT "results_event_id_foreign" FOREIGN KEY("event_id") REFERENCES "Events"("event_id");

INSERT INTO "Events" ("event_id", "name", "date") VALUES
(1, 'Городской марафон', '2024-03-10'),
(2, 'Пляжный забег', '2024-04-15'),
(3, 'Ночной полумарафон', '2024-06-05'),
(4, 'забег "Костяная нога"','2024-10-22');

INSERT INTO "Participants" (participant_id, "name", "age", "gender", "country", "event_id") VALUES
(1, 'John Doe', 30, 'Male', 'USA', 1),
(2, 'Emma Stone', 25, 'Female', 'UK', 1),
(3, 'Alejandro S', 28, 'Male', 'Spain', 2),
(4, 'Chen Wei', 22, 'Male', 'China', 3);

INSERT INTO "Results" (result_id, participant_id, time, position, event_id) VALUES
(1, 1, '02:15:00', 1, 1),
(2, 2, '02:30:00', 2, 1),
(3, 3, '03:00:00', 1, 2);

INSERT INTO "Sponsors" ("sponsor_id", "name", "contact_info") VALUES
(1, 'Adidas', 'contact@adidas.com'),
(2, 'Nike', 'nike_sponsor@mail.com'),
(3, 'Puma', 'puma_support@puma.com');

INSERT INTO "SponsorsEvents" ("id","event_id", "sponsor_id") VALUES
(1,1,1),
(2,1,2),
(3,2,1);

INSERT INTO "Volunteers" ("volunteer_id", "name", "role", "event_id") VALUES
(1, 'Sarah Connor', 'Medical Assistant', 1),
(2, 'Rick Grimes', 'Route Planner', 2),
(3, 'Lara Croft', 'Logistics Coordinator', 3);