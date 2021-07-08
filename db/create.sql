CREATE TABLE IF NOT EXISTS engine(
    id SERIAL PRIMARY KEY,
    volume TEXT
);

CREATE TABLE IF NOT EXISTS driver (
    id SERIAL PRIMARY KEY,
    name TEXT
);

CREATE TABLE  IF NOT EXISTS cars (
    id SERIAL PRIMARY KEY ,
    name TEXT,
    model TEXT,
    year INT,
    engine_id INT NOT NULL REFERENCES engine(id)
);

CREATE TABLE IF NOT EXISTS owner_car(
        id serial PRIMARY KEY ,
        driver_id INT NOT NULL REFERENCES driver(id),
        car_id INT NOT NULL REFERENCES cars(id)
);
