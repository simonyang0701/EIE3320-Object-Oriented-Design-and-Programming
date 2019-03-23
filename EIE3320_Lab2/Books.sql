DROP DATABASE IF EXISTS books;

CREATE DATABASE books;

USE books;

CREATE TABLE Authors
(
   AuthorID int NOT NULL AUTO_INCREMENT PRIMARY KEY,
   FirstName varchar(30) NOT NULL,
   LastName varchar(30) NOT NULL
);
CREATE TABLE BookInfo
(
   ISBN varchar(20) NOT NULL PRIMARY KEY,
   Title varchar(80) NOT NULL,
   Author varchar(30) NOT NULL,
   EditionNumber int NOT NULL,
   Publisher varchar(20) NOT NULL, 
   Copyright varchar(4) NOT NULL,
   Price double NOT NULL
);

CREATE TABLE AuthorISBN
(
   AuthorID int NOT NULL,
   ISBN varchar(20) NOT NULL,
   FOREIGN KEY (AuthorID) REFERENCES Authors(AuthorID),
   FOREIGN KEY (ISBN) References BookInfo(ISBN)
);

INSERT INTO Authors (FirstName,LastName) VALUES ('Harvey','Deitel');
INSERT INTO Authors (FirstName,LastName) VALUES ('Paul','Deitel');  
INSERT INTO Authors (FirstName,LastName) VALUES ('Andrew','Goldberg');
INSERT INTO Authors (FirstName,LastName) VALUES ('David','Choffnes');


INSERT INTO BookInfo (ISBN,Title,Author,EditionNumber,Publisher,Copyright,Price) VALUES ('0131869000','Visual Basic 2005 How to Program','Harvey Deitel',3,'Peachpit Press','2006',17.5);
INSERT INTO AuthorISBN (AuthorID,ISBN) VALUES (1,'0131869000');
INSERT INTO AuthorISBN (AuthorID,ISBN) VALUES (2,'0131869000');

INSERT INTO BookInfo (ISBN,Title,Author,EditionNumber,Publisher,Copyright,Price) VALUES ('0131525239','Beginning with Objective-C','Paul Deitel',3,'Wrox Wiley Pub','2010',20.0);    
INSERT INTO AuthorISBN (AuthorID,ISBN) VALUES (1,'0131525239');
INSERT INTO AuthorISBN (AuthorID,ISBN) VALUES (2,'0131525239');

INSERT INTO BookInfo (ISBN,Title,Author,EditionNumber,Publisher,Copyright,Price) VALUES ('0132222205','Java How to Program','Andrew Goldberg',3,'Peachpit','2010',25.0);    
INSERT INTO AuthorISBN (AuthorID,ISBN) VALUES (1,'0132222205');
INSERT INTO AuthorISBN (AuthorID,ISBN) VALUES (2,'0132222205');
      
INSERT INTO BookInfo (ISBN,Title,Author,EditionNumber,Publisher,Copyright,Price) VALUES ('0131857576','C++ How to Program','David Choffnes',5,'Peachpit','2005',30.5);  
INSERT INTO AuthorISBN (AuthorID,ISBN) VALUES (1,'0131857576');
INSERT INTO AuthorISBN (AuthorID,ISBN) VALUES (2,'0131857576');

INSERT INTO BookInfo (ISBN,Title,Author,EditionNumber,Publisher,Copyright,Price) VALUES ('0132404168','iPhone SDK 3','Andrew Goldberg',2,'McGraw-Hill','2010',18.0);
INSERT INTO AuthorISBN (AuthorID,ISBN) VALUES (1,'0132404168');
INSERT INTO AuthorISBN (AuthorID,ISBN) VALUES (2,'0132404168');

INSERT INTO BookInfo (ISBN,Title,Author,EditionNumber,Publisher,Copyright,Price) VALUES ('0131450913','HTML How to Program','Paul Deitel',2,'McGraw-Hill','2000',21.0);
INSERT INTO AuthorISBN (AuthorID,ISBN) VALUES (1,'0131450913');
INSERT INTO AuthorISBN (AuthorID,ISBN) VALUES (2,'0131450913');
INSERT INTO AuthorISBN (AuthorID,ISBN) VALUES (3,'0131450913');

INSERT INTO BookInfo (ISBN,Title,Author,EditionNumber,Publisher,Copyright,Price) VALUES ('0131828274','Internet & World Wide Web How to Program','David Choffnes',5,'McGraw-Hill','2011',22.5);
INSERT INTO AuthorISBN (AuthorID,ISBN) VALUES (1,'0131828274');
INSERT INTO AuthorISBN (AuthorID,ISBN) VALUES (2,'0131828274');
INSERT INTO AuthorISBN (AuthorID,ISBN) VALUES (4,'0131828274');
