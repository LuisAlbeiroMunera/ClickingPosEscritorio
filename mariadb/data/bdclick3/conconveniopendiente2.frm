TYPE=VIEW
query=select `bdclick3`.`bdconvenio`.`Id` AS `Id`,`bdclick3`.`bdconvenio`.`nit` AS `nit`,`bdclick3`.`bdconvenio`.`montoTotal` AS `montoTotal`,if(isnull(`bdclick3`.`totalconvenios`.`total`),0,`bdclick3`.`totalconvenios`.`total`) AS `total2`,`bdclick3`.`bdconvenio`.`convenio` AS `convenio`,`bdclick3`.`bdconvenio`.`fechaFinalizacion` AS `fechaFinalizacion` from (`bdclick3`.`bdconvenio` left join `bdclick3`.`totalconvenios` on((`bdclick3`.`bdconvenio`.`convenio` = `bdclick3`.`totalconvenios`.`convenio`)))
md5=3ff17676cc1e541fbc976f5055d0275c
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:48
create-version=2
source=select `bdconvenio`.`Id` AS `Id`,`bdconvenio`.`nit` AS `nit`,`bdconvenio`.`montoTotal` AS `montoTotal`,if(isnull(`totalconvenios`.`total`),0,`totalconvenios`.`total`) AS `total2`,`bdconvenio`.`convenio` AS `convenio`,`bdconvenio`.`fechaFinalizacion` AS `fechaFinalizacion` from (`bdconvenio` left join `totalconvenios` on((`bdconvenio`.`convenio` = `totalconvenios`.`convenio`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdconvenio`.`Id` AS `Id`,`bdclick3`.`bdconvenio`.`nit` AS `nit`,`bdclick3`.`bdconvenio`.`montoTotal` AS `montoTotal`,if(isnull(`bdclick3`.`totalconvenios`.`total`),0,`bdclick3`.`totalconvenios`.`total`) AS `total2`,`bdclick3`.`bdconvenio`.`convenio` AS `convenio`,`bdclick3`.`bdconvenio`.`fechaFinalizacion` AS `fechaFinalizacion` from (`bdclick3`.`bdconvenio` left join `bdclick3`.`totalconvenios` on((`bdclick3`.`bdconvenio`.`convenio` = `bdclick3`.`totalconvenios`.`convenio`)))
mariadb-version=100135
