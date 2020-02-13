
show variables like '%character%';
show variables like 'collation%';

show variables like '%storage_engine%';

SHOW VARIABLES LIKE '%version%';

drop table if exists 'account';

create table 'account'
(
  account_id bigint(20) not null,
  account_name varchar(20) not null,
  account_surname varchar(20) not null,
  account_given_name varchar(20) not null,
  password varchar(20) not null,
  mobile varchar(20) not null,
  email varchar(20) not null,
  role tinyint(2) not null,
  create_time datetime not null,
  update_time datetime not null,
  primary key(account_id)
) engine = innodb default charset = utf8;


create table 'account_test'
(
  account_id varchar(36)
)