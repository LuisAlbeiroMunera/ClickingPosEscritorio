TYPE=VIEW
query=select `bdclick1`.`bdterceros`.`idSistema` AS `idSistema`,sum(if((`bdclick1`.`bdpeluqueria`.`estado` = \'Atendido\'),1,0)) AS `Atendido`,sum(if((`bdclick1`.`bdpeluqueria`.`estado` = \'No vino\'),1,0)) AS `NoVino`,sum(if((`bdclick1`.`bdpeluqueria`.`estado` = \'Reagendada\'),1,0)) AS `Reagendada`,sum(if((`bdclick1`.`bdpeluqueria`.`estado` = \'Cancelada\'),1,0)) AS `Cancelada`,sum(if((`bdclick1`.`bdpeluqueria`.`estado` = \'Registrada\'),1,0)) AS `Registrada` from (`bdclick1`.`bdterceros` left join `bdclick1`.`bdpeluqueria` on((`bdclick1`.`bdpeluqueria`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`))) group by `bdclick1`.`bdterceros`.`idSistema`
md5=0c0c1a68d76f3b9a1977e5b1173326fa
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:34
create-version=2
source=select `bdterceros`.`idSistema` AS `idSistema`,sum(if((`bdpeluqueria`.`estado` = \'Atendido\'),1,0)) AS `Atendido`,sum(if((`bdpeluqueria`.`estado` = \'No vino\'),1,0)) AS `NoVino`,sum(if((`bdpeluqueria`.`estado` = \'Reagendada\'),1,0)) AS `Reagendada`,sum(if((`bdpeluqueria`.`estado` = \'Cancelada\'),1,0)) AS `Cancelada`,sum(if((`bdpeluqueria`.`estado` = \'Registrada\'),1,0)) AS `Registrada` from (`bdterceros` left join `bdpeluqueria` on((`bdpeluqueria`.`cliente` = `bdterceros`.`idSistema`))) group by `bdterceros`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdterceros`.`idSistema` AS `idSistema`,sum(if((`bdclick1`.`bdpeluqueria`.`estado` = \'Atendido\'),1,0)) AS `Atendido`,sum(if((`bdclick1`.`bdpeluqueria`.`estado` = \'No vino\'),1,0)) AS `NoVino`,sum(if((`bdclick1`.`bdpeluqueria`.`estado` = \'Reagendada\'),1,0)) AS `Reagendada`,sum(if((`bdclick1`.`bdpeluqueria`.`estado` = \'Cancelada\'),1,0)) AS `Cancelada`,sum(if((`bdclick1`.`bdpeluqueria`.`estado` = \'Registrada\'),1,0)) AS `Registrada` from (`bdclick1`.`bdterceros` left join `bdclick1`.`bdpeluqueria` on((`bdclick1`.`bdpeluqueria`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`))) group by `bdclick1`.`bdterceros`.`idSistema`
mariadb-version=100135
