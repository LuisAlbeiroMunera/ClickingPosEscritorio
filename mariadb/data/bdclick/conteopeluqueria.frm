TYPE=VIEW
query=select `bdclick`.`bdterceros`.`idSistema` AS `idSistema`,sum(if((`bdclick`.`bdpeluqueria`.`estado` = \'Atendido\'),1,0)) AS `Atendido`,sum(if((`bdclick`.`bdpeluqueria`.`estado` = \'No vino\'),1,0)) AS `NoVino`,sum(if((`bdclick`.`bdpeluqueria`.`estado` = \'Reagendada\'),1,0)) AS `Reagendada`,sum(if((`bdclick`.`bdpeluqueria`.`estado` = \'Cancelada\'),1,0)) AS `Cancelada`,sum(if((`bdclick`.`bdpeluqueria`.`estado` = \'Registrada\'),1,0)) AS `Registrada` from (`bdclick`.`bdterceros` left join `bdclick`.`bdpeluqueria` on((`bdclick`.`bdpeluqueria`.`cliente` = `bdclick`.`bdterceros`.`idSistema`))) group by `bdclick`.`bdterceros`.`idSistema`
md5=0d9a0f10b7b8c20f11a46b468c225028
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:23
create-version=2
source=select `bdterceros`.`idSistema` AS `idSistema`,sum(if((`bdpeluqueria`.`estado` = \'Atendido\'),1,0)) AS `Atendido`,sum(if((`bdpeluqueria`.`estado` = \'No vino\'),1,0)) AS `NoVino`,sum(if((`bdpeluqueria`.`estado` = \'Reagendada\'),1,0)) AS `Reagendada`,sum(if((`bdpeluqueria`.`estado` = \'Cancelada\'),1,0)) AS `Cancelada`,sum(if((`bdpeluqueria`.`estado` = \'Registrada\'),1,0)) AS `Registrada` from (`bdterceros` left join `bdpeluqueria` on((`bdpeluqueria`.`cliente` = `bdterceros`.`idSistema`))) group by `bdterceros`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdterceros`.`idSistema` AS `idSistema`,sum(if((`bdclick`.`bdpeluqueria`.`estado` = \'Atendido\'),1,0)) AS `Atendido`,sum(if((`bdclick`.`bdpeluqueria`.`estado` = \'No vino\'),1,0)) AS `NoVino`,sum(if((`bdclick`.`bdpeluqueria`.`estado` = \'Reagendada\'),1,0)) AS `Reagendada`,sum(if((`bdclick`.`bdpeluqueria`.`estado` = \'Cancelada\'),1,0)) AS `Cancelada`,sum(if((`bdclick`.`bdpeluqueria`.`estado` = \'Registrada\'),1,0)) AS `Registrada` from (`bdclick`.`bdterceros` left join `bdclick`.`bdpeluqueria` on((`bdclick`.`bdpeluqueria`.`cliente` = `bdclick`.`bdterceros`.`idSistema`))) group by `bdclick`.`bdterceros`.`idSistema`
mariadb-version=100135
