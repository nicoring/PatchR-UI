# User SCHEMA

# --- !Ups

CREATE TABLE user (
    email varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    fullname varchar(255),
    isAdmin boolean NOT NULL,
    PRIMARY KEY (email)
    );


# --- !Downs

DROP TABLE User;