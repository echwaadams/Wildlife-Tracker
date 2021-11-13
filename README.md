Wildlife Tracker

Wildlife Tracker is an app that allows one to record sightings of various animal,It allows one to create rangers,locations,animals and sightings. It also allows you to view rangers locations sightings and animals. One can also view sightings a ranger has made and locations with the sightings that have occured in them

Author

Adams Echwa

Setup/Installation Requirements

.Fork this repo

. Clone the repo

. Open in terminal

.Navigate to appropriate directory using the cd command

. Type in the command git clone and paste the url of the cloned repo and press enter.

Setup Requirements for Database

- In PSQL:
- CREATE DATABASE wildlife_tracker;
- \c wildlife_tracker;
- CREATE TABLE animals (id serial PRIMARY KEY,name varchar, type varchar, health varchar, age varchar);
- CREATE TABLE locations(id serial PRIMARY KEY, name varchar);
- CREATE TABLE locations-sightings(id serial PRIMARY KEY, location_id INT, sighting_id INT);
- CREATE TABLE rangers(id serial PRIMARY KEY, name varchar, badge_number varchar);
- CREATE TABLE rangers_sighting(id serial PRIMARY KEY, ranger_id INT,sighting_id INT);
- CREATE TABLE sightings (id serial PRIMARY KEY,animal_id INT,ranger_id INT,location_id INT,time TIMESTAMP); 
- CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;

In order to run locally
. Go to DB.class in main/java folder and make necessary changes.

. Go to DatabaseRule in test/java folder and make necessary changes.

Technologies Used
. Java

. CSS

. HBS

Support and contact details

for any issues and contributions you can reach me at: adamsechwa18@gmail.com

License

This project is licensed under the terms of the MIT license . Copyright (c) 2020 Adams Echwa