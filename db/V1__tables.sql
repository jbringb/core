create table symptoms
(
    id          serial primary key,
    name        varchar(255) not null,
    description text
);