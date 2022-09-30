TYPE=VIEW
query=select `bdclick`.`bdterceros`.`idSistema` AS `IdSistema`,sum(if((`bdclick`.`bdagenda`.`estado` = \'Atendido\'),1,0)) AS `Atendido`,sum(if((`bdclick`.`bdagenda`.`estado` = \'No vino\'),1,0)) AS `NoVino`,sum(if((`bdclick`.`bdagenda`.`estado` = \'Reagendada\'),1,0)) AS `Reagendada`,sum(if((`bdclick`.`bdagenda`.`estado` = \'Cancelada\'),1,0)) AS `Cancelada`,sum(if((`bdclick`.`bdagenda`.`estado` = \'Registrada\'),1,0)) AS `Registrada` from (`bdclick`.`bdterceros` left join `bdclick`.`bdagenda` on((`bdclick`.`bdagenda`.`cliente` = `bdclick`.`bdterceros`.`idSistema`))) group by `bdclick`.`bdterceros`.`idSistema`
md5=61fc910b2607ee64e83de22614fafb23
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:23
create-version=2
source=select `bdterceros`.`idSistema` AS `IdSistema`,sum(if((`bdagenda`.`estado` = \'Atendido\'),1,0)) AS `Atendido`,sum(if((`bdagenda`.`estado` = \'No vino\'),1,0)) AS `NoVino`,sum(if((`bdagenda`.`estado` = \'Reagendada\'),1,0)) AS `Reagendada`,sum(if((`bdagenda`.`estado` = \'Cancelada\'),1,0)) AS `Cancelada`,sum(if((`bdagenda`.`estado` = \'Registrada\'),1,0)) AS `Registrada` from (`bdterceros` left join `bdagenda` on((`bdagenda`.`cliente` = `bdterceros`.`idSistema`))) group by `bdterceros`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdterceros`.`idSistema` AS `IdSistema`,sum(if((`bdclick`.`bdagenda`.`estado` = \'Atendido\'),1,0)) AS `Atendido`,sum(if((`bdclick`.`bdagenda`.`estado` = \'No vino\'),1,0)) AS `NoVino`,sum(if((`bdclick`.`bdagenda`.`estado` = \'Reagendada\'),1,0)) AS `Reagendada`,sum(if((`bdclick`.`bdagenda`.`estado` = \'Cancelada\'),1,0)) AS `Cancelada`,sum(if((`bdclick`.`bdagenda`.`estado` = \'Registrada\'),1,0)) AS `Registrada` from (`bdclick`.`bdterceros` left join `bdclick`.`bdagenda` on((`bdclick`.`bdagenda`.`cliente` = `bdclick`.`bdterceros`.`idSistema`))) group by `bdclick`.`bdterceros`.`idSistema`
mariadb-version=100135
