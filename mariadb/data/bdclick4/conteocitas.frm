TYPE=VIEW
query=select `bdclick4`.`bdterceros`.`idSistema` AS `IdSistema`,sum(if((`bdclick4`.`bdagenda`.`estado` = \'Atendido\'),1,0)) AS `Atendido`,sum(if((`bdclick4`.`bdagenda`.`estado` = \'No vino\'),1,0)) AS `NoVino`,sum(if((`bdclick4`.`bdagenda`.`estado` = \'Reagendada\'),1,0)) AS `Reagendada`,sum(if((`bdclick4`.`bdagenda`.`estado` = \'Cancelada\'),1,0)) AS `Cancelada`,sum(if((`bdclick4`.`bdagenda`.`estado` = \'Registrada\'),1,0)) AS `Registrada` from (`bdclick4`.`bdterceros` left join `bdclick4`.`bdagenda` on((`bdclick4`.`bdagenda`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`))) group by `bdclick4`.`bdterceros`.`idSistema`
md5=e27a74f81b0b7988f98f32850f51288f
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:27
create-version=2
source=select `bdterceros`.`idSistema` AS `IdSistema`,sum(if((`bdagenda`.`estado` = \'Atendido\'),1,0)) AS `Atendido`,sum(if((`bdagenda`.`estado` = \'No vino\'),1,0)) AS `NoVino`,sum(if((`bdagenda`.`estado` = \'Reagendada\'),1,0)) AS `Reagendada`,sum(if((`bdagenda`.`estado` = \'Cancelada\'),1,0)) AS `Cancelada`,sum(if((`bdagenda`.`estado` = \'Registrada\'),1,0)) AS `Registrada` from (`bdterceros` left join `bdagenda` on((`bdagenda`.`cliente` = `bdterceros`.`idSistema`))) group by `bdterceros`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdterceros`.`idSistema` AS `IdSistema`,sum(if((`bdclick4`.`bdagenda`.`estado` = \'Atendido\'),1,0)) AS `Atendido`,sum(if((`bdclick4`.`bdagenda`.`estado` = \'No vino\'),1,0)) AS `NoVino`,sum(if((`bdclick4`.`bdagenda`.`estado` = \'Reagendada\'),1,0)) AS `Reagendada`,sum(if((`bdclick4`.`bdagenda`.`estado` = \'Cancelada\'),1,0)) AS `Cancelada`,sum(if((`bdclick4`.`bdagenda`.`estado` = \'Registrada\'),1,0)) AS `Registrada` from (`bdclick4`.`bdterceros` left join `bdclick4`.`bdagenda` on((`bdclick4`.`bdagenda`.`cliente` = `bdclick4`.`bdterceros`.`idSistema`))) group by `bdclick4`.`bdterceros`.`idSistema`
mariadb-version=100135
