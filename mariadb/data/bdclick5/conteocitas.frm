TYPE=VIEW
query=select `bdclick5`.`bdterceros`.`idSistema` AS `IdSistema`,sum(if((`bdclick5`.`bdagenda`.`estado` = \'Atendido\'),1,0)) AS `Atendido`,sum(if((`bdclick5`.`bdagenda`.`estado` = \'No vino\'),1,0)) AS `NoVino`,sum(if((`bdclick5`.`bdagenda`.`estado` = \'Reagendada\'),1,0)) AS `Reagendada`,sum(if((`bdclick5`.`bdagenda`.`estado` = \'Cancelada\'),1,0)) AS `Cancelada`,sum(if((`bdclick5`.`bdagenda`.`estado` = \'Registrada\'),1,0)) AS `Registrada` from (`bdclick5`.`bdterceros` left join `bdclick5`.`bdagenda` on((`bdclick5`.`bdagenda`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`))) group by `bdclick5`.`bdterceros`.`idSistema`
md5=535bf7ac4bc26d784bfc0d512e5213bf
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:46
create-version=2
source=select `bdterceros`.`idSistema` AS `IdSistema`,sum(if((`bdagenda`.`estado` = \'Atendido\'),1,0)) AS `Atendido`,sum(if((`bdagenda`.`estado` = \'No vino\'),1,0)) AS `NoVino`,sum(if((`bdagenda`.`estado` = \'Reagendada\'),1,0)) AS `Reagendada`,sum(if((`bdagenda`.`estado` = \'Cancelada\'),1,0)) AS `Cancelada`,sum(if((`bdagenda`.`estado` = \'Registrada\'),1,0)) AS `Registrada` from (`bdterceros` left join `bdagenda` on((`bdagenda`.`cliente` = `bdterceros`.`idSistema`))) group by `bdterceros`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdterceros`.`idSistema` AS `IdSistema`,sum(if((`bdclick5`.`bdagenda`.`estado` = \'Atendido\'),1,0)) AS `Atendido`,sum(if((`bdclick5`.`bdagenda`.`estado` = \'No vino\'),1,0)) AS `NoVino`,sum(if((`bdclick5`.`bdagenda`.`estado` = \'Reagendada\'),1,0)) AS `Reagendada`,sum(if((`bdclick5`.`bdagenda`.`estado` = \'Cancelada\'),1,0)) AS `Cancelada`,sum(if((`bdclick5`.`bdagenda`.`estado` = \'Registrada\'),1,0)) AS `Registrada` from (`bdclick5`.`bdterceros` left join `bdclick5`.`bdagenda` on((`bdclick5`.`bdagenda`.`cliente` = `bdclick5`.`bdterceros`.`idSistema`))) group by `bdclick5`.`bdterceros`.`idSistema`
mariadb-version=100135
