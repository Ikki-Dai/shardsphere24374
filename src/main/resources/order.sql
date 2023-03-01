create table `order` (
                         id int auto_increment,
                         product varchar(32) not null default '',
                         amount int not null default 1,
                         create_time timestamp default current_timestamp,
                         primary key (id)
) engine = InnoDB;

insert into product_order (product, amount, create_time)
values
    ('book', 2, '2023-02-09 10:00:00'),
    ('pen',3, '2023-02-09 06:00:00'),
    ('ink', 1, '2023-02-09 17:00:00');