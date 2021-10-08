/**
	Sistema para gestão de uma assitência técnica de computadores e periféricos
    @author Lucas Lima
*/

create database dbinfox;
use dbinfox;

create table usuarios(
	id int primary key auto_increment,
    usuario varchar(50) not null,
    login varchar(50) not null unique,
    senha varchar(250) not null,
    perfil varchar(50) not null
);

-- a linha abaixo insere uma senha com criptografia
-- md5 criptografa a senha!!!
insert into usuarios(usuario,login,senha,perfil)
values('José de Assis','admin',md5('0123456789'),'administrador');
insert into usuarios(usuario,login,senha,perfil)
values('Kelly Cristina','kelly',md5('9876543210'),'operador');

select * from usuarios;
select * from usuarios where id=1;
-- selecionando o usuário e sua senha (tela de login)
select * from usuarios where login='admin' and senha=md5('0123456789');

update usuarios set usuario='Kelly Cristina dos Santos',login='kellycris',senha=md5('1234'),perfil='operador' where id=2;
select * from usuarios where id=2;

delete from usuarios where id=3;

-- char (tipo de dados que aceita uma String de caracteres não variáveis)
create table clientes(
	idcli int primary key auto_increment,
    nome varchar(50) not null,
    cep char(9),
    endereço varchar(50) not null,
    numero varchar(12) not null,
    complemento varchar(30) not null,
    bairro varchar(50) not null,
    cidade varchar(50) not null,
    uf char(2) not null,
    fone varchar(15) not null
);

insert into clientes(nome,cep,endereço,numero,complemento,bairro,cidade,uf,fone)
values('Lucas Lima','03572-070','Rua Lessa','3A','Casa 1','JD Santa Terezinha','São Paulo','SP','(11)96461-5367');
insert into clientes(nome,cep,endereço,numero,complemento,bairro,cidade,uf,fone)
values('Antonio Elvis','03572-020','Rua Olga Fadel Abarca','183','Casa 2','JD Santa Terezinha','São Paulo','SP','(11)98537-6679');
insert into clientes(nome,cep,endereço,numero,complemento,bairro,cidade,uf,fone)
values('Laissa Cazak','08041-730','Rua Erva Grossa','170','Casa 1','JD Lageado','São Paulo','SP','(11)96461-5399');
insert into clientes(nome,cep,endereço,numero,complemento,bairro,cidade,uf,fone)
values('Roberto Justus','15370-496','Avenida Paulista','1510','Apartamento 45','Bela Vista','São Paulo','SP','(11)96541-5599');
insert into clientes(nome,cep,endereço,numero,complemento,bairro,cidade,uf,fone)
values('Letícia Oliveira','32017-240','Rua Presidente Kennedy','170','Apartamento 33','Arcadia','Minas Gerais','MG','(31)97045-4050');

select * from clientes;

-- foreign key (FK) cria um relacionamento de 1 para muitos (clente + tbos)
create table tbos (
	os int primary key auto_increment,
    dataos timestamp default current_timestamp,
    tipo varchar(20) not null,
    statusos varchar(30) not null,
    equipamento varchar(200) not null,
    defeito varchar(200) not null,
    tecnico varchar(50),
    valor decimal(10,2),
    idcli int not null,
    foreign key(idcli) references clientes(idcli)
);

describe tbos;

insert into tbos
(tipo,statusos,equipamento,defeito,idcli)
values
('orçamento','bancada','Notebook Lenovo G90','Não Liga',1);

insert into tbos
(tipo,statusos,equipamento,defeito,tecnico,valor,idcli)
values
('orçamento','aguardando aprovação','Impressora HP2020','papel enroscando','Robson',60.00,1);

insert into tbos
(tipo,statusos,equipamento,defeito,tecnico,valor,idcli)
values
('serviço','retirado','Notebook Itautec 2500','formatação do windows','Sirlene',90.00,2);

insert into tbos
(tipo,statusos,equipamento,defeito,tecnico,valor,idcli)
values
('serviço','retirado','PC Positivo','troca da fonte','Robson',100.00,3);

insert into tbos
(tipo,statusos,equipamento,defeito,tecnico,valor,idcli)
values
('orçamento','aguardando aprovação','Notebook Sony X10','tela quebrada','Sirlene','1600',1);

insert into tbos
(tipo,statusos,equipamento,defeito,tecnico,valor,idcli)
values
('serviço','pendente','Notebook HP H100','adição de memoria ram','Robson','300',4);


select * from tbos;

-- (inner join) união de tabelas relacionadas para consultas e updates
-- relatório 1
select * from tbos inner join clientes 
on tbos.idcli = clientes.idcli;

-- relatório 2
select
tbos.equipamento,tbos.defeito,tbos.statusos as status_os,tbos.valor,clientes.nome,clientes.fone
from tbos inner join clientes on tbos.idcli = clientes.idcli
where statusos = 'aguardando aprovação';

-- relatório 3
select 
tbos.os,date_format(tbos.dataos, '%d/%m/%Y - %H:%i' ) as data_os,tbos.statusos as status_os,tbos.equipamento,tbos.defeito,tbos.valor
from tbos inner join clientes on tbos.idcli = clientes.idcli where statusos = 'retirado';

-- relatório 4
select sum(valor) as faturamento from tbos where statusos = 'retirado';














