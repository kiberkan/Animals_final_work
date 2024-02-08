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

![image](https://github.com/kiberkan/Animals_final_work/blob/main/screenshot/6-Диаграма.png)
