TYPE=VIEW
query=select `bdclick`.`bdconvenio`.`Id` AS `Id`,`bdclick`.`bdconvenio`.`nit` AS `nit`,`bdclick`.`bdconvenio`.`montoTotal` AS `montoTotal`,if(isnull(`bdclick`.`totalconvenios`.`total`),0,`bdclick`.`totalconvenios`.`total`) AS `total2`,`bdclick`.`bdconvenio`.`convenio` AS `convenio`,`bdclick`.`bdconvenio`.`fechaFinalizacion` AS `fechaFinalizacion` from (`bdclick`.`bdconvenio` left join `bdclick`.`totalconvenios` on((`bdclick`.`bdconvenio`.`convenio` = `bdclick`.`totalconvenios`.`convenio`)))
md5=1d899559c94c68669b1835fb8b28cdcb
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:22
create-version=2
source=select `bdconvenio`.`Id` AS `Id`,`bdconvenio`.`nit` AS `nit`,`bdconvenio`.`montoTotal` AS `montoTotal`,if(isnull(`totalconvenios`.`total`),0,`totalconvenios`.`total`) AS `total2`,`bdconvenio`.`convenio` AS `convenio`,`bdconvenio`.`fechaFinalizacion` AS `fechaFinalizacion` from (`bdconvenio` left join `totalconvenios` on((`bdconvenio`.`convenio` = `totalconvenios`.`convenio`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdconvenio`.`Id` AS `Id`,`bdclick`.`bdconvenio`.`nit` AS `nit`,`bdclick`.`bdconvenio`.`montoTotal` AS `montoTotal`,if(isnull(`bdclick`.`totalconvenios`.`total`),0,`bdclick`.`totalconvenios`.`total`) AS `total2`,`bdclick`.`bdconvenio`.`convenio` AS `convenio`,`bdclick`.`bdconvenio`.`fechaFinalizacion` AS `fechaFinalizacion` from (`bdclick`.`bdconvenio` left join `bdclick`.`totalconvenios` on((`bdclick`.`bdconvenio`.`convenio` = `bdclick`.`totalconvenios`.`convenio`)))
mariadb-version=100135
