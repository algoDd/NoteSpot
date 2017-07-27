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

create table notespot.upload (
  id                        serial not null,
  filebase64                varchar(255),
  filetype                  varchar(255),
  String filesize           varchar(255),
  String filename           varchar(255),
  constraint pk_upload primary key (id))
;




# --- !Downs

drop table if exists notespot.login cascade;

drop table if exists notespot.upload cascade;

