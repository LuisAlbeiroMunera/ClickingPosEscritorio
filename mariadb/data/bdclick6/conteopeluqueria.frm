TYPE=VIEW
query=select `bdclick6`.`bdterceros`.`idSistema` AS `idSistema`,sum(if((`bdclick6`.`bdpeluqueria`.`estado` = \'Atendido\'),1,0)) AS `Atendido`,sum(if((`bdclick6`.`bdpeluqueria`.`estado` = \'No vino\'),1,0)) AS `NoVino`,sum(if((`bdclick6`.`bdpeluqueria`.`estado` = \'Reagendada\'),1,0)) AS `Reagendada`,sum(if((`bdclick6`.`bdpeluqueria`.`estado` = \'Cancelada\'),1,0)) AS `Cancelada`,sum(if((`bdclick6`.`bdpeluqueria`.`estado` = \'Registrada\'),1,0)) AS `Registrada` from (`bdclick6`.`bdterceros` left join `bdclick6`.`bdpeluqueria` on((`bdclick6`.`bdpeluqueria`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`))) group by `bdclick6`.`bdterceros`.`idSistema`
md5=d437ad7022085b6db58e8e92c90f2bf1
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:34
create-version=2
source=select `bdterceros`.`idSistema` AS `idSistema`,sum(if((`bdpeluqueria`.`estado` = \'Atendido\'),1,0)) AS `Atendido`,sum(if((`bdpeluqueria`.`estado` = \'No vino\'),1,0)) AS `NoVino`,sum(if((`bdpeluqueria`.`estado` = \'Reagendada\'),1,0)) AS `Reagendada`,sum(if((`bdpeluqueria`.`estado` = \'Cancelada\'),1,0)) AS `Cancelada`,sum(if((`bdpeluqueria`.`estado` = \'Registrada\'),1,0)) AS `Registrada` from (`bdterceros` left join `bdpeluqueria` on((`bdpeluqueria`.`cliente` = `bdterceros`.`idSistema`))) group by `bdterceros`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdterceros`.`idSistema` AS `idSistema`,sum(if((`bdclick6`.`bdpeluqueria`.`estado` = \'Atendido\'),1,0)) AS `Atendido`,sum(if((`bdclick6`.`bdpeluqueria`.`estado` = \'No vino\'),1,0)) AS `NoVino`,sum(if((`bdclick6`.`bdpeluqueria`.`estado` = \'Reagendada\'),1,0)) AS `Reagendada`,sum(if((`bdclick6`.`bdpeluqueria`.`estado` = \'Cancelada\'),1,0)) AS `Cancelada`,sum(if((`bdclick6`.`bdpeluqueria`.`estado` = \'Registrada\'),1,0)) AS `Registrada` from (`bdclick6`.`bdterceros` left join `bdclick6`.`bdpeluqueria` on((`bdclick6`.`bdpeluqueria`.`cliente` = `bdclick6`.`bdterceros`.`idSistema`))) group by `bdclick6`.`bdterceros`.`idSistema`
mariadb-version=100135
