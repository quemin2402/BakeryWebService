CREATE TABLE Users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    age INT,
    gender VARCHAR(50),
    phone_number VARCHAR(20),
    email VARCHAR(255)
);

CREATE TABLE Pastry (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    description TEXT,
    price BIGINT
);

CREATE TABLE Orders (
    id SERIAL PRIMARY KEY,
    user_id INT REFERENCES Users(id) ON DELETE SET NULL,
    street VARCHAR(255),
    city VARCHAR(100),
    state VARCHAR(100),
    postal_code VARCHAR(20),
    country VARCHAR(100),
    total BIGINT
);

CREATE TABLE Pastry_Orders (
     order_id INT REFERENCES Orders(id) ON DELETE CASCADE,
     pastry_id INT REFERENCES Pastry(id) ON DELETE CASCADE,
     PRIMARY KEY (order_id, pastry_id)
);