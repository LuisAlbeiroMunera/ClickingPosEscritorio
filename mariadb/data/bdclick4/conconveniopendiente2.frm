TYPE=VIEW
query=select `bdclick4`.`bdconvenio`.`Id` AS `Id`,`bdclick4`.`bdconvenio`.`nit` AS `nit`,`bdclick4`.`bdconvenio`.`montoTotal` AS `montoTotal`,if(isnull(`bdclick4`.`totalconvenios`.`total`),0,`bdclick4`.`totalconvenios`.`total`) AS `total2`,`bdclick4`.`bdconvenio`.`convenio` AS `convenio`,`bdclick4`.`bdconvenio`.`fechaFinalizacion` AS `fechaFinalizacion` from (`bdclick4`.`bdconvenio` left join `bdclick4`.`totalconvenios` on((`bdclick4`.`bdconvenio`.`convenio` = `bdclick4`.`totalconvenios`.`convenio`)))
md5=3ec6db10bdb9a07ccd44e6e00e2055fb
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:25
create-version=2
source=select `bdconvenio`.`Id` AS `Id`,`bdconvenio`.`nit` AS `nit`,`bdconvenio`.`montoTotal` AS `montoTotal`,if(isnull(`totalconvenios`.`total`),0,`totalconvenios`.`total`) AS `total2`,`bdconvenio`.`convenio` AS `convenio`,`bdconvenio`.`fechaFinalizacion` AS `fechaFinalizacion` from (`bdconvenio` left join `totalconvenios` on((`bdconvenio`.`convenio` = `totalconvenios`.`convenio`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdconvenio`.`Id` AS `Id`,`bdclick4`.`bdconvenio`.`nit` AS `nit`,`bdclick4`.`bdconvenio`.`montoTotal` AS `montoTotal`,if(isnull(`bdclick4`.`totalconvenios`.`total`),0,`bdclick4`.`totalconvenios`.`total`) AS `total2`,`bdclick4`.`bdconvenio`.`convenio` AS `convenio`,`bdclick4`.`bdconvenio`.`fechaFinalizacion` AS `fechaFinalizacion` from (`bdclick4`.`bdconvenio` left join `bdclick4`.`totalconvenios` on((`bdclick4`.`bdconvenio`.`convenio` = `bdclick4`.`totalconvenios`.`convenio`)))
mariadb-version=100135
