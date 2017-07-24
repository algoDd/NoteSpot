# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table notespot.login (
  id                        serial not null,
  username                  varchar(255),
  email_id                  varchar(255),
  password                  varchar(255),
  old_password              varchar(255),
  constraint pk_login primary key (id))
;




# --- !Downs

drop table if exists notespot.login cascade;

