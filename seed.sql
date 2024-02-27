INSERT INTO Users (name, age, gender, phone_number, email)
VALUES
    (
        'Ben Black', 30, 0, '87787753796',
        'blackben@mail.ru'
    ),
    (
        'Jane Smith', 25, 1, '87793625583',
        'janesmith@gmail.com'
    ),
    (
        'Alice Johnson', 28, 1, '87123456789',
        'alicejohnson@yahoo.com'
    ),
    (
        'Bob Anderson', 35, 0, '87234567890',
        'bobanderson@hotmail.com'
    ),
    (
        'Eva Brown', 22, 1, '87987654321',
        'evabrown@gmail.com'
    ),
    (
        'Michael White', 32, 0, '87876543210',
        'michaelwhite@mail.com'
    );
INSERT INTO Pastry (name, category, description, price)
VALUES
    (
        'Croissant', 'PuffPastry', 'Flaky buttery pastry',
        250
    ),
    (
        'Danish', 'SweetPastry', 'Sweet pastry with fruit filling',
        300
    ),
    (
        'Muffin', 'SweetPastry', 'Soft pastry with blueberries',
        200
    ),
    (
        'Cinnamon Roll', 'SweetPastry', 'Sweet and aromatic roll with cinnamon',
        280
    ),
    (
        'Strudel', 'SeasonalPastry', 'Layered pastry with fruit and nut filling',
        320
    ),
    (
        'Scone', 'SourdoughPastry', 'British-style sweet or savory baked goods',
        230
    ),
    (
        'Pretzel', 'SaltyPastry', 'Twisted bread with a salty crust',
        270
    ),
    (
        'Pumpkin Pie', 'SeasonalPastry', 'Classic pie with pumpkin filling',
        380
    ),
    (
        'Chocolate Babka', 'SweetPastry', 'Sweet bread swirled with chocolate filling',
        320
    );
INSERT INTO Orders (user_id, street, city, state, postal_code, country, total)
VALUES
    (
        1, 'Mangilik El 53a', 'Astana', 'Akmola Region',
        '010000', 'Kazakhstan', 550
    ),
    (
        4, 'Uly Dala 25', 'Astana', 'Akmola Region',
        '010000', 'Kazakhstan', 600
    ),
    (
        2, 'Tauelsizdik 18b', 'Astana', 'Akmola Region',
        '010000', 'Kazakhstan', 450
    );
INSERT INTO pastry_orders(orders_id, pastry_id)
VALUES
    (1, 2),
    (1, 3),
    (3, 6),
    (3, 9),
    (2, 5);