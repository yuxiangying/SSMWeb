CREATE TABLE yxy.userinfo (
  id number(8) primary key NOT NULL,
  email varchar(255) NOT NULL,
  password varchar(255) NOT NULL,
  username varchar(255) NOT NULL,
  role varchar(255) NOT NULL,
  status number(1) NOT NULL,
  regTime Date NOT NULL,
  regIp varchar(255) NOT NULL
);

comment on column yxy.userinfo.id is '用户ID';
comment on column yxy.userinfo.email is '用户邮箱';
comment on column yxy.userinfo.password is '用户密码';
comment on column yxy.userinfo.username is '用户昵称';
comment on column yxy.userinfo.role is '用户身份';
comment on column yxy.userinfo.status is '用户状态';
comment on column yxy.userinfo.regTime is '注册时间';
comment on column yxy.userinfo.regIp is '注册IP';

INSERT INTO userinfo VALUES ('1', 'xxx', 'xxxxx', 'xxxxx', 'root', '0', SYSDATE, '127.0.0.1');
