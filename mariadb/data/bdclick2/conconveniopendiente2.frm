TYPE=VIEW
query=select `bdclick2`.`bdconvenio`.`Id` AS `Id`,`bdclick2`.`bdconvenio`.`nit` AS `nit`,`bdclick2`.`bdconvenio`.`montoTotal` AS `montoTotal`,if(isnull(`bdclick2`.`totalconvenios`.`total`),0,`bdclick2`.`totalconvenios`.`total`) AS `total2`,`bdclick2`.`bdconvenio`.`convenio` AS `convenio`,`bdclick2`.`bdconvenio`.`fechaFinalizacion` AS `fechaFinalizacion` from (`bdclick2`.`bdconvenio` left join `bdclick2`.`totalconvenios` on((`bdclick2`.`bdconvenio`.`convenio` = `bdclick2`.`totalconvenios`.`convenio`)))
md5=a277eb939bf18339096389de512603a4
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:43
create-version=2
source=select `bdconvenio`.`Id` AS `Id`,`bdconvenio`.`nit` AS `nit`,`bdconvenio`.`montoTotal` AS `montoTotal`,if(isnull(`totalconvenios`.`total`),0,`totalconvenios`.`total`) AS `total2`,`bdconvenio`.`convenio` AS `convenio`,`bdconvenio`.`fechaFinalizacion` AS `fechaFinalizacion` from (`bdconvenio` left join `totalconvenios` on((`bdconvenio`.`convenio` = `totalconvenios`.`convenio`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdconvenio`.`Id` AS `Id`,`bdclick2`.`bdconvenio`.`nit` AS `nit`,`bdclick2`.`bdconvenio`.`montoTotal` AS `montoTotal`,if(isnull(`bdclick2`.`totalconvenios`.`total`),0,`bdclick2`.`totalconvenios`.`total`) AS `total2`,`bdclick2`.`bdconvenio`.`convenio` AS `convenio`,`bdclick2`.`bdconvenio`.`fechaFinalizacion` AS `fechaFinalizacion` from (`bdclick2`.`bdconvenio` left join `bdclick2`.`totalconvenios` on((`bdclick2`.`bdconvenio`.`convenio` = `bdclick2`.`totalconvenios`.`convenio`)))
mariadb-version=100135
