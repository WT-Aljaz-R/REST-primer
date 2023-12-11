create table osebe (
                       id integer not null primary key,
                       ime varchar(255) not null,
                       priimek varchar(255) not null
);

INSERT INTO osebe VALUES
                      (1, 'Janez', 'Novak'),
                      (2, 'Marko', 'Oblak'),
                      (3, 'Jan', 'Stanonik');