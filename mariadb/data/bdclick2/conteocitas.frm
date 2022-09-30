TYPE=VIEW
query=select `bdclick2`.`bdterceros`.`idSistema` AS `IdSistema`,sum(if((`bdclick2`.`bdagenda`.`estado` = \'Atendido\'),1,0)) AS `Atendido`,sum(if((`bdclick2`.`bdagenda`.`estado` = \'No vino\'),1,0)) AS `NoVino`,sum(if((`bdclick2`.`bdagenda`.`estado` = \'Reagendada\'),1,0)) AS `Reagendada`,sum(if((`bdclick2`.`bdagenda`.`estado` = \'Cancelada\'),1,0)) AS `Cancelada`,sum(if((`bdclick2`.`bdagenda`.`estado` = \'Registrada\'),1,0)) AS `Registrada` from (`bdclick2`.`bdterceros` left join `bdclick2`.`bdagenda` on((`bdclick2`.`bdagenda`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`))) group by `bdclick2`.`bdterceros`.`idSistema`
md5=f56241159a1e6d47346143a434fb77ac
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:44
create-version=2
source=select `bdterceros`.`idSistema` AS `IdSistema`,sum(if((`bdagenda`.`estado` = \'Atendido\'),1,0)) AS `Atendido`,sum(if((`bdagenda`.`estado` = \'No vino\'),1,0)) AS `NoVino`,sum(if((`bdagenda`.`estado` = \'Reagendada\'),1,0)) AS `Reagendada`,sum(if((`bdagenda`.`estado` = \'Cancelada\'),1,0)) AS `Cancelada`,sum(if((`bdagenda`.`estado` = \'Registrada\'),1,0)) AS `Registrada` from (`bdterceros` left join `bdagenda` on((`bdagenda`.`cliente` = `bdterceros`.`idSistema`))) group by `bdterceros`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdterceros`.`idSistema` AS `IdSistema`,sum(if((`bdclick2`.`bdagenda`.`estado` = \'Atendido\'),1,0)) AS `Atendido`,sum(if((`bdclick2`.`bdagenda`.`estado` = \'No vino\'),1,0)) AS `NoVino`,sum(if((`bdclick2`.`bdagenda`.`estado` = \'Reagendada\'),1,0)) AS `Reagendada`,sum(if((`bdclick2`.`bdagenda`.`estado` = \'Cancelada\'),1,0)) AS `Cancelada`,sum(if((`bdclick2`.`bdagenda`.`estado` = \'Registrada\'),1,0)) AS `Registrada` from (`bdclick2`.`bdterceros` left join `bdclick2`.`bdagenda` on((`bdclick2`.`bdagenda`.`cliente` = `bdclick2`.`bdterceros`.`idSistema`))) group by `bdclick2`.`bdterceros`.`idSistema`
mariadb-version=100135
