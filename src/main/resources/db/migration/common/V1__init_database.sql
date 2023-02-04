drop table if exists book;
drop table if exists book_seq;
create table book (
       id varchar(36) not null,
        isbn varchar(255),
        publisher varchar(255),
        title varchar(255),
        primary key (id)
    ) engine=InnoDB;