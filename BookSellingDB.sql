CREATE TABLE [Admin] (
  [AdminId] int identity(1,1),
  [AdminEmail] varchar(50),
  [AdminName] varchar(50),
  [Password] varchar(50),
  PRIMARY KEY ([AdminId])
);

CREATE TABLE [User] (
  [UserId] int identity(1,1),
  [FirstName] varchar(50),
  [LastName] varchar(50),
  [Email] varchar(50),
  [ContactNumber] varchar(11),
  [Address] varchar(100),
  [Passwords] varchar(50),
  PRIMARY KEY ([UserId])
);

CREATE TABLE [Post] (
  [PostId] int identity(1,1),
  [PostTime] datetime,
  [SellStatus] BIT NOT NULL DEFAULT (0),
  [Price] int,
  [UserId] int FOREIGN KEY REFERENCES [User] (UserId),
  [AdminId] int FOREIGN KEY REFERENCES [Admin] (AdminId),
  PRIMARY KEY ([PostId])
);

CREATE TABLE [Order] (
  [OrderId] int identity(1,1),
  [UserId] int FOREIGN KEY REFERENCES [User] (UserId),
  [OrderDate] datetime,
  PRIMARY KEY ([OrderId])
);


CREATE TABLE [Payment] (
  [PaymentId] int identity(1,1),
  [PaymentDate] datetime,
  [PaymentStatus] BIT,
  [OrderId] int FOREIGN KEY REFERENCES [Order] (OrderId),
  PRIMARY KEY ([PaymentId])
);

CREATE TABLE [Delivery] (
  [DeliveryId] int identity(1,1),
  [DeliveryDate] datetime,
  [DeliveryStatus] BIT,
  [OrderId] int FOREIGN KEY REFERENCES [Order] (OrderId),
  PRIMARY KEY ([DeliveryId])
);


CREATE TABLE [Book] (
  [BookId] int identity(1,1),
  [BookName] varchar(50) NOT NULL,
  [Writer] varchar(50) NOT NULL,
  [Description] varchar(50),
  [PostId] int FOREIGN KEY REFERENCES [Post] (PostId),
  PRIMARY KEY ([BookId])
);

select * from [User]
select * from [Post]
select * from [Book]
select * from [Admin]
select * from [Order]
select * from [Payment]
select * from [Delivery]


insert into [Admin] (AdminEmail,AdminName,Password) values('mehjabeenShachi@gmail.com','Mehjabeen Shachi',987654321)








Drop TABLE [Post]
Drop TABLE [Book]
Drop TABLE [Admin]
Drop TABLE [User]
Drop TABLE [Order]
Drop TABLE [Payment]
Drop TABLE [Delivery]