# Итоговая работа

## Информация о проекте

Необходимо организовать систему учета для питомника, в котором живут домашние и вьючные животные.

## Задание

1. Используя команду cat в терминале операционной системы Linux, создать два файла Домашние животные (заполнив файл собаками, кошками, хомяками) и Вьючные животными заполнив файл (Лошадьми, верблюдами и ослы), а затем объединить их. Просмотреть содержимое созданного файла. Переименовать файл, дав ему новое имя (Друзья человека).

#### Создание файлов:

![image](https://github.com/kiberkan/Animals_final_work/blob/main/screenshot/1.png)

#### Объеденение файлов

![image](https://github.com/kiberkan/Animals_final_work/blob/main/screenshot/2.png)


2. Создать директорию, переместить файл туда.

#### Создание деректории и перемешение файла

![image](https://github.com/kiberkan/Animals_final_work/blob/main/screenshot/3.png)

3. Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория.

![image](https://github.com/kiberkan/Animals_final_work/blob/main/screenshot/4.png)

4. Установить и удалить deb-пакет с помощью dpkg.

![image](https://github.com/kiberkan/Animals_final_work/blob/main/screenshot/5.png)

5. Выложить историю команд в терминале ubuntu.
```
Task 1
cat pets.txt
cat pack_animals.txt
cat pets.txt pack_animals.txt > all_animals.txt
cat all_animals.txt
mv all_animals.txt human_friends.txt

Task 2
mkdir animal
mv human_friends.txt animal/
ls -l animal
ls -l

Task 3
sudo apt instlall mysql-server mysql-client
systemctl status mysql.service


Task 4
sudo dpkg -i google-chrome-stable_current_amd64.deb
sudo dpkg -r google-chrome-stable
```
6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние
животные и вьючные животные, в составы которых в случае домашних
животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные
войдут: Лошади, верблюды и ослы.

![image](https://github.com/kiberkan/Animals_final_work/blob/main/screenshot/6.png)

7. В подключенном MySQL репозитории создать базу данных “Друзья
человека”
```sql
CREATE DATABASE Human_friends;
```

8. Создать таблицы с иерархией из диаграммы в БД
```sql
USE Human_friends;

CREATE TABLE class_animals
(
	Id INT AUTO_INCREMENT PRIMARY KEY, 
	Class_name VARCHAR(30)
);

CREATE TABLE pack_animals
(
	  Id INT AUTO_INCREMENT PRIMARY KEY,
    Genus_name VARCHAR (30),
    Class_id INT,
    FOREIGN KEY (Class_id) REFERENCES class_animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE home_animals
(
	  Id INT AUTO_INCREMENT PRIMARY KEY,
    Genus_name VARCHAR (30),
    Class_id INT,
    FOREIGN KEY (Class_id) REFERENCES class_animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE cats 
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Name VARCHAR(30), 
    Birthday DATE,
    Commands VARCHAR(30),
    Genus_id int,
    Foreign KEY (Genus_id) REFERENCES home_animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE dogs 
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Name VARCHAR(30), 
    Birthday DATE,
    Commands VARCHAR(30),
    Genus_id int,
    Foreign KEY (Genus_id) REFERENCES home_animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE hamsters 
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Name VARCHAR(30), 
    Birthday DATE,
    Commands VARCHAR(30),
    Genus_id int,
    Foreign KEY (Genus_id) REFERENCES home_animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE horses 
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Name VARCHAR(30), 
    Birthday DATE,
    Commands VARCHAR(30),
    Genus_id int,
    Foreign KEY (Genus_id) REFERENCES pack_animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE camels 
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Name VARCHAR(30), 
    Birthday DATE,
    Commands VARCHAR(30),
    Genus_id int,
    Foreign KEY (Genus_id) REFERENCES pack_animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE donkeys 
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Name VARCHAR(30), 
    Birthday DATE,
    Commands VARCHAR(30),
    Genus_id int,
    Foreign KEY (Genus_id) REFERENCES pack_animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
);


```

9. Заполнить низкоуровневые таблицы именами(животных), командами
которые они выполняют и датами рождения
```sql

INSERT INTO class_animals (Class_name)
VALUES ('вьючные'),
('домашние');

INSERT INTO pack_animals (Genus_name, Class_id)
VALUES ('Лошади', 2),
('Ослы', 2),  
('Верблюды', 2);

INSERT INTO home_animals (Genus_name, Class_id)
VALUES ('Кошки', 1),
('Собаки', 1),  
('Хомяки', 1);

INSERT INTO cats (Name, Birthday, Commands, Genus_id)
VALUES ('Том', '2018-04-02', 'дай лапку', 1),
('Барсик', '2016-02-04', 'кушать', 1),
('Дымок', '2020-04-04', 'кушать', 1),  
('Яшка', '2022-08-01', '', 1);

INSERT INTO dogs (Name, Birthday, Commands, Genus_id)
VALUES ('Граф', '2019-01-01', 'голос, дай лапу', 2),
('Беляш', '2021-06-12', 'сидеть, лежать', 2),  
('Тузик', '2018-06-01', 'след, фас', 2), 
('Арнольд', '2018-07-10', 'место', 2);

INSERT INTO hamsters (Name, Birthday, Commands, Genus_id)
VALUES ('Абрамс', '2020-10-12', '', 3),
('Фуман', '2021-03-12', '', 3),  
('Леший', '2022-07-11', '', 3), 
('Колобок', '2022-05-10', '', 3);

INSERT INTO horses (Name, Birthday, Commands, Genus_id)
VALUES ('Белоснежка', '2020-06-12', 'но, бегом, шагом', 1),
('Царь', '2020-03-10', 'но, бегом, шагом', 1),  
('Дарк', '2018-07-05', 'но, бегом, шагом', 1), 
('Сарина', '2017-05-01', 'но, бегом, шагом', 1);

INSERT INTO camels (Name, Birthday, Commands, Genus_id)
VALUES ('Горыныч', '2022-04-10', '', 2),
('Торнадо', '2019-02-02', '', 2),  
('Люстра', '2018-12-12', '', 2), 
('Запад', '2022-05-12', '', 2);

INSERT INTO donkeys (Name, Birthday, Commands, Genus_id)
VALUES ('Олен', '2015-04-11', '', 3),
('Василёк', '2022-03-12', '', 3),  
('Туризмо', '2023-07-12', '', 3), 
('Шагатор', '2022-12-10', '', 3);

```
