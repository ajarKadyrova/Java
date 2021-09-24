CREATE DATABASE BookShop;
USE BookShop;

CREATE TABLE Book(ID int AUTO_INCREMENT PRIMARY KEY NOT NULL,
                     title varchar(50) NOT NULL,
                     publishedYear int,
                     price double NOT NULL,
                     publisherID int,
                     authorID int NOT NULL);

CREATE TABLE Author(ID int AUTO_INCREMENT PRIMARY KEY NOT NULL,
					authorName varchar(50) NOT NULL,
                    authorAddress varchar(50),
					url varchar(50));
                     
CREATE TABLE Publisher(ID int AUTO_INCREMENT PRIMARY KEY NOT NULL,
					publisherName varchar(50) NOT NULL,
                    publisherAddress varchar(50),
                    publisherPhone varchar(50) NOT NULL,
					url varchar(50));

CREATE TABLE Customer(ID int AUTO_INCREMENT PRIMARY KEY NOT NULL,
					customerName varchar(50) NOT NULL,
                    customerAddress varchar(50),
                    email varchar(50) NOT NULL,
                    passwordC varchar(50) NOT NULL,
					phone varchar(50));

CREATE TABLE ShoppingCart(ID int AUTO_INCREMENT PRIMARY KEY NOT NULL,
					bookID int NOT NULL,
                    bookCount int NOT NULL,
					customerID int NOT NULL);

ALTER TABLE Book ADD FOREIGN KEY (publisherID) REFERENCES Publisher(ID);
ALTER TABLE Book ADD FOREIGN KEY (authorID) REFERENCES Author(ID);
ALTER TABLE ShoppingCart ADD FOREIGN KEY (customerID) REFERENCES Customer(ID);