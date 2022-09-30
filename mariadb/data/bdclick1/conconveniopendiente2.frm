TYPE=VIEW
query=select `bdclick1`.`bdconvenio`.`Id` AS `Id`,`bdclick1`.`bdconvenio`.`nit` AS `nit`,`bdclick1`.`bdconvenio`.`montoTotal` AS `montoTotal`,if(isnull(`bdclick1`.`totalconvenios`.`total`),0,`bdclick1`.`totalconvenios`.`total`) AS `total2`,`bdclick1`.`bdconvenio`.`convenio` AS `convenio`,`bdclick1`.`bdconvenio`.`fechaFinalizacion` AS `fechaFinalizacion` from (`bdclick1`.`bdconvenio` left join `bdclick1`.`totalconvenios` on((`bdclick1`.`bdconvenio`.`convenio` = `bdclick1`.`totalconvenios`.`convenio`)))
md5=556a896e38ad79c0649fcb65272d5f27
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:32
create-version=2
source=select `bdconvenio`.`Id` AS `Id`,`bdconvenio`.`nit` AS `nit`,`bdconvenio`.`montoTotal` AS `montoTotal`,if(isnull(`totalconvenios`.`total`),0,`totalconvenios`.`total`) AS `total2`,`bdconvenio`.`convenio` AS `convenio`,`bdconvenio`.`fechaFinalizacion` AS `fechaFinalizacion` from (`bdconvenio` left join `totalconvenios` on((`bdconvenio`.`convenio` = `totalconvenios`.`convenio`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdconvenio`.`Id` AS `Id`,`bdclick1`.`bdconvenio`.`nit` AS `nit`,`bdclick1`.`bdconvenio`.`montoTotal` AS `montoTotal`,if(isnull(`bdclick1`.`totalconvenios`.`total`),0,`bdclick1`.`totalconvenios`.`total`) AS `total2`,`bdclick1`.`bdconvenio`.`convenio` AS `convenio`,`bdclick1`.`bdconvenio`.`fechaFinalizacion` AS `fechaFinalizacion` from (`bdclick1`.`bdconvenio` left join `bdclick1`.`totalconvenios` on((`bdclick1`.`bdconvenio`.`convenio` = `bdclick1`.`totalconvenios`.`convenio`)))
mariadb-version=100135
