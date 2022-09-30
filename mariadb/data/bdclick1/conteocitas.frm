TYPE=VIEW
query=select `bdclick1`.`bdterceros`.`idSistema` AS `IdSistema`,sum(if((`bdclick1`.`bdagenda`.`estado` = \'Atendido\'),1,0)) AS `Atendido`,sum(if((`bdclick1`.`bdagenda`.`estado` = \'No vino\'),1,0)) AS `NoVino`,sum(if((`bdclick1`.`bdagenda`.`estado` = \'Reagendada\'),1,0)) AS `Reagendada`,sum(if((`bdclick1`.`bdagenda`.`estado` = \'Cancelada\'),1,0)) AS `Cancelada`,sum(if((`bdclick1`.`bdagenda`.`estado` = \'Registrada\'),1,0)) AS `Registrada` from (`bdclick1`.`bdterceros` left join `bdclick1`.`bdagenda` on((`bdclick1`.`bdagenda`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`))) group by `bdclick1`.`bdterceros`.`idSistema`
md5=06573cd0cbecf8b6a35ada6533e93e39
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:34
create-version=2
source=select `bdterceros`.`idSistema` AS `IdSistema`,sum(if((`bdagenda`.`estado` = \'Atendido\'),1,0)) AS `Atendido`,sum(if((`bdagenda`.`estado` = \'No vino\'),1,0)) AS `NoVino`,sum(if((`bdagenda`.`estado` = \'Reagendada\'),1,0)) AS `Reagendada`,sum(if((`bdagenda`.`estado` = \'Cancelada\'),1,0)) AS `Cancelada`,sum(if((`bdagenda`.`estado` = \'Registrada\'),1,0)) AS `Registrada` from (`bdterceros` left join `bdagenda` on((`bdagenda`.`cliente` = `bdterceros`.`idSistema`))) group by `bdterceros`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdterceros`.`idSistema` AS `IdSistema`,sum(if((`bdclick1`.`bdagenda`.`estado` = \'Atendido\'),1,0)) AS `Atendido`,sum(if((`bdclick1`.`bdagenda`.`estado` = \'No vino\'),1,0)) AS `NoVino`,sum(if((`bdclick1`.`bdagenda`.`estado` = \'Reagendada\'),1,0)) AS `Reagendada`,sum(if((`bdclick1`.`bdagenda`.`estado` = \'Cancelada\'),1,0)) AS `Cancelada`,sum(if((`bdclick1`.`bdagenda`.`estado` = \'Registrada\'),1,0)) AS `Registrada` from (`bdclick1`.`bdterceros` left join `bdclick1`.`bdagenda` on((`bdclick1`.`bdagenda`.`cliente` = `bdclick1`.`bdterceros`.`idSistema`))) group by `bdclick1`.`bdterceros`.`idSistema`
mariadb-version=100135
