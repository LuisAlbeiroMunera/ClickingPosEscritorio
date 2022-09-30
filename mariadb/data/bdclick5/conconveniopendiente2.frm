TYPE=VIEW
query=select `bdclick5`.`bdconvenio`.`Id` AS `Id`,`bdclick5`.`bdconvenio`.`nit` AS `nit`,`bdclick5`.`bdconvenio`.`montoTotal` AS `montoTotal`,if(isnull(`bdclick5`.`totalconvenios`.`total`),0,`bdclick5`.`totalconvenios`.`total`) AS `total2`,`bdclick5`.`bdconvenio`.`convenio` AS `convenio`,`bdclick5`.`bdconvenio`.`fechaFinalizacion` AS `fechaFinalizacion` from (`bdclick5`.`bdconvenio` left join `bdclick5`.`totalconvenios` on((`bdclick5`.`bdconvenio`.`convenio` = `bdclick5`.`totalconvenios`.`convenio`)))
md5=ebdd033eafe980eacf59b3a64e2e23a8
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:45
create-version=2
source=select `bdconvenio`.`Id` AS `Id`,`bdconvenio`.`nit` AS `nit`,`bdconvenio`.`montoTotal` AS `montoTotal`,if(isnull(`totalconvenios`.`total`),0,`totalconvenios`.`total`) AS `total2`,`bdconvenio`.`convenio` AS `convenio`,`bdconvenio`.`fechaFinalizacion` AS `fechaFinalizacion` from (`bdconvenio` left join `totalconvenios` on((`bdconvenio`.`convenio` = `totalconvenios`.`convenio`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdconvenio`.`Id` AS `Id`,`bdclick5`.`bdconvenio`.`nit` AS `nit`,`bdclick5`.`bdconvenio`.`montoTotal` AS `montoTotal`,if(isnull(`bdclick5`.`totalconvenios`.`total`),0,`bdclick5`.`totalconvenios`.`total`) AS `total2`,`bdclick5`.`bdconvenio`.`convenio` AS `convenio`,`bdclick5`.`bdconvenio`.`fechaFinalizacion` AS `fechaFinalizacion` from (`bdclick5`.`bdconvenio` left join `bdclick5`.`totalconvenios` on((`bdclick5`.`bdconvenio`.`convenio` = `bdclick5`.`totalconvenios`.`convenio`)))
mariadb-version=100135
