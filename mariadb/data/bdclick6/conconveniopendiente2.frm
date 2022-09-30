TYPE=VIEW
query=select `bdclick6`.`bdconvenio`.`Id` AS `Id`,`bdclick6`.`bdconvenio`.`nit` AS `nit`,`bdclick6`.`bdconvenio`.`montoTotal` AS `montoTotal`,if(isnull(`bdclick6`.`totalconvenios`.`total`),0,`bdclick6`.`totalconvenios`.`total`) AS `total2`,`bdclick6`.`bdconvenio`.`convenio` AS `convenio`,`bdclick6`.`bdconvenio`.`fechaFinalizacion` AS `fechaFinalizacion` from (`bdclick6`.`bdconvenio` left join `bdclick6`.`totalconvenios` on((`bdclick6`.`bdconvenio`.`convenio` = `bdclick6`.`totalconvenios`.`convenio`)))
md5=7e297957572f86775ef37c62f0bdfa23
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:33
create-version=2
source=select `bdconvenio`.`Id` AS `Id`,`bdconvenio`.`nit` AS `nit`,`bdconvenio`.`montoTotal` AS `montoTotal`,if(isnull(`totalconvenios`.`total`),0,`totalconvenios`.`total`) AS `total2`,`bdconvenio`.`convenio` AS `convenio`,`bdconvenio`.`fechaFinalizacion` AS `fechaFinalizacion` from (`bdconvenio` left join `totalconvenios` on((`bdconvenio`.`convenio` = `totalconvenios`.`convenio`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdconvenio`.`Id` AS `Id`,`bdclick6`.`bdconvenio`.`nit` AS `nit`,`bdclick6`.`bdconvenio`.`montoTotal` AS `montoTotal`,if(isnull(`bdclick6`.`totalconvenios`.`total`),0,`bdclick6`.`totalconvenios`.`total`) AS `total2`,`bdclick6`.`bdconvenio`.`convenio` AS `convenio`,`bdclick6`.`bdconvenio`.`fechaFinalizacion` AS `fechaFinalizacion` from (`bdclick6`.`bdconvenio` left join `bdclick6`.`totalconvenios` on((`bdclick6`.`bdconvenio`.`convenio` = `bdclick6`.`totalconvenios`.`convenio`)))
mariadb-version=100135
