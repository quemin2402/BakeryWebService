INSERT INTO Users (
    name, age, gender, phone_number, email
)
VALUES
    (
        'John Doe', 30, 'M', '123-456-7890',
        'johndoe@example.com'
    ),
    (
        'Jane Smith', 25, 'F', '098-765-4321',
        'janesmith@example.com'
    ),
    (
        'Chris Johnson', 28, 'O', '555-555-5555',
        'chrisj@example.com'
    );
INSERT INTO Pastry (name, category, description, price)
VALUES
    (
        'Croissant', 'French', 'Flaky buttery pastry',
        250
    ),
    (
        'Danish', 'French', 'Sweet pastry with fruit filling',
        300
    ),
    (
        'Muffin', 'French', 'Soft pastry with blueberries',
        200
    );
INSERT INTO Orders (
    user_id, street, city, state, postal_code,
    country, total
)
VALUES
    (
        1, '123 Main St', 'Anytown', 'Anystate',
        '12345', 'CountryA', 550
    ),
    (
        2, '456 Elm St', 'Othertown', 'Otherstate',
        '54321', 'CountryB', 600
    ),
    (
        3, '789 Oak St', 'Sometown', 'Somestate',
        '67890', 'CountryC', 450
    );
INSERT INTO Pastry_Orders (order_id, pastry_id)
VALUES
    (1, 1),
    (1, 2),
    (2, 3),
    (3, 1),
    (3, 3);
