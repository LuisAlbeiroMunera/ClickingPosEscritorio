TYPE=VIEW
query=select `bdclick4`.`bdterceros`.`idSistema` AS `idSistema`,sum(if((`bdclick4`.`bdpeluqueria`.`estado` = \'Atendido\'),1,0)) AS `Atendido`,sum(if((`bdclick4`.`bdpeluqueria`.`estado` = \'No vino\'),1,0)) AS `NoVino`,sum(if((`bdclick4`.`bdpeluqueria`.`estado` = \'Reagendada\'),1,0)) AS `Reagendada`,sum(if((`bdclick4`.`bdpeluqueria`.`estado` = \'Cancelada\'),1,0)) AS `Cancelada`,sum(if((`bdclick4`.`bdpeluqueria`.`estado` = \'Registrada\'),1,0)) AS `Registrada` from (`bdclick4`.`bdterceros` left join `bdclick4`.`bdpeluqueria` on((`bdclick4`.`bdpeluqueria`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`))) group by `bdclick4`.`bdterceros`.`idSistema`
md5=dd8361b802020879e244abd362348bf2
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:27
create-version=2
source=select `bdterceros`.`idSistema` AS `idSistema`,sum(if((`bdpeluqueria`.`estado` = \'Atendido\'),1,0)) AS `Atendido`,sum(if((`bdpeluqueria`.`estado` = \'No vino\'),1,0)) AS `NoVino`,sum(if((`bdpeluqueria`.`estado` = \'Reagendada\'),1,0)) AS `Reagendada`,sum(if((`bdpeluqueria`.`estado` = \'Cancelada\'),1,0)) AS `Cancelada`,sum(if((`bdpeluqueria`.`estado` = \'Registrada\'),1,0)) AS `Registrada` from (`bdterceros` left join `bdpeluqueria` on((`bdpeluqueria`.`cliente` = `bdterceros`.`idSistema`))) group by `bdterceros`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdterceros`.`idSistema` AS `idSistema`,sum(if((`bdclick4`.`bdpeluqueria`.`estado` = \'Atendido\'),1,0)) AS `Atendido`,sum(if((`bdclick4`.`bdpeluqueria`.`estado` = \'No vino\'),1,0)) AS `NoVino`,sum(if((`bdclick4`.`bdpeluqueria`.`estado` = \'Reagendada\'),1,0)) AS `Reagendada`,sum(if((`bdclick4`.`bdpeluqueria`.`estado` = \'Cancelada\'),1,0)) AS `Cancelada`,sum(if((`bdclick4`.`bdpeluqueria`.`estado` = \'Registrada\'),1,0)) AS `Registrada` from (`bdclick4`.`bdterceros` left join `bdclick4`.`bdpeluqueria` on((`bdclick4`.`bdpeluqueria`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`))) group by `bdclick4`.`bdterceros`.`idSistema`
mariadb-version=100135
