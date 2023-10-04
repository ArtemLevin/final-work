DROP SCHEMA IF EXISTS human_friends;

CREATE SCHEMA human_friends;

CREATE TABLE IF NOT EXISTS `human_friends`.`parent_class` (
  `id` INT NOT NULL,
  `class_name` VARCHAR(45) NULL);

CREATE TABLE IF NOT EXISTS `human_friends`.`animals` (
  `class_name` INT NOT NULL,
  `animal_type_name` VARCHAR(45) NOT NULL,
  `animal_type_id` INT NOT NULL);

CREATE TABLE IF NOT EXISTS `human_friends`.`nursery` (
  `nursery_animal_id` INT NOT NULL,
  `class_name` INT NOT NULL,
  `animal_type_name` INT NOT NULL,
  `animal_name` VARCHAR(45) NOT NULL,
  `animal_sound` VARCHAR(45) NOT NULL,
  `animal_birthday` DATE NOT NULL);

CREATE TABLE IF NOT EXISTS `human_friends`.`dogs` (
  `class_name` INT NOT NULL,
  `animal_type_name` INT NOT NULL,
  `animal_name` VARCHAR(45) NOT NULL,
  `animal_sound` VARCHAR(45) NOT NULL,
  `animal_bday` DATE NOT NULL);

CREATE TABLE IF NOT EXISTS `human_friends`.`cats` (
  `class_name` INT NOT NULL,
  `animal_type_name` INT NOT NULL,
  `animal_name` VARCHAR(45) NOT NULL,
  `animal_sound` VARCHAR(45) NOT NULL,
  `animal_bday` DATE NOT NULL,
  `catscol` VARCHAR(45) NOT NULL);

CREATE TABLE IF NOT EXISTS `human_friends`.`hamsters` (
  `class_name` INT NOT NULL,
  `animal_type_name` INT NOT NULL,
  `animal_name` VARCHAR(45) NOT NULL,
  `animal_sound` VARCHAR(45) NOT NULL,
  `animal_bday` DATE NOT NULL);

CREATE TABLE IF NOT EXISTS `human_friends`.`horses` (
  `class_name` INT NOT NULL,
  `animal_type_name` INT NOT NULL,
  `animal_name` VARCHAR(45) NOT NULL,
  `animal_sound` VARCHAR(45) NOT NULL,
  `animal_bday` DATE NOT NULL);

CREATE TABLE IF NOT EXISTS `human_friends`.`camels` (
  `class_name` INT NOT NULL,
  `animal_type_name` INT NOT NULL,
  `animal_name` VARCHAR(45) NOT NULL,
  `animal_sound` VARCHAR(45) NOT NULL,
  `animal_bday` DATE NOT NULL);

CREATE TABLE IF NOT EXISTS `human_friends`.`donkeys` (
  `class_name` INT NOT NULL,
  `animal_type_name` INT NOT NULL,
  `animal_name` VARCHAR(45) NOT NULL,
  `animal_sound` VARCHAR(45) NOT NULL,
  `animal_bday` DATE NOT NULL);

INSERT human_friends.animals(class_name, animal_type_name, animal_type_id)
VALUES
(1, "dog", 1),
(1, "cat", 2),
(1, "hamster", 3),
(2, "horse", 4),
(2, "camel", 5),
(2, "donkey", 6);

USE humanfriends;

INSERT human_friends.nursery(nursery_animal_id, class_name, animal_type_name, animal_name, animal_sound, animal_birthday)
VALUES
(2, 1, 1, "Grchko", "guf-guf", "2022-02-05"),
(3, 1, 1, "Petrunko", "guf-guf", "2022-03-10"),
(4, 1, 2, "Strchko", "meow", "2022-03-09"),
(5, 1, 2, "Ruchko", "mewo", "2021-02-05"),
(6, 1, 3, "Prchko", "hamster-meow", "2020-01-10"),
(7, 1, 3, "Vukalo", "hamster-meow", "2020-07-05"),
(8, 2, 1, "Furchko", "horse-go-go", "2019-10-10"),
(9, 2, 2, "Camelchko", "camel-go-go", "2023-01-11"),
(10, 2, 3, "Donkeychko", "donkey-go-go", "2005-02-05");


DELETE from human_friends.nursery
WHERE class_name=2 and animal_type_name=2;

INSERT human_friends.donkeys(class_name,animal_type_name,animal_name,animal_sound,animal_bday)
VALUES
(2, 3, "Trulechko", "donkey-go-go", "2020-06-07");

INSERT human_friends.donkeys(class_name,animal_type_name,animal_name,animal_sound,animal_bday)
VALUES
(2, 1, "Ylechko", "horse-go-go", "2020-05-06");

CREATE TABLE IF NOT EXISTS human_friends.horses_and_donkeys
SELECT *
FROM human_friends.horses 
UNION select *
FROM human_friends.donkeys;

CREATE TABLE IF NOT EXISTS human_friends.young_animals
SELECT * from human_friends.nursery
WHERE TIMESTAMPDIFF(YEAR, animal_birthday, NOW())  BETWEEN 1 and 3;
ALTER TABLE human_friends.young_animals 
ADD animals_age INT;
UPDATE human_friends.young_animals
SET animals_age=TIMESTAMPDIFF(MONTH, animal_birthday, NOW());
