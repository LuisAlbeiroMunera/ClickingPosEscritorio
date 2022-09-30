TYPE=VIEW
query=select `bdclick4`.`bdterceros`.`id` AS `IdTercero`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdformatos`.`Id` AS `Id`,`bdclick4`.`bdformatos`.`formato` AS `Formato`,`bdclick4`.`bdformatos`.`tercero` AS `Tercero`,`bdclick4`.`bdformatos`.`fecha` AS `Fecha` from (`bdclick4`.`bdformatos` join `bdclick4`.`bdterceros` on((`bdclick4`.`bdformatos`.`tercero` = `bdclick4`.`bdterceros`.`idSistema`)))
md5=54f0e1c91c627085f0a3bf4fcd61da98
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:31
create-version=2
source=select `bdterceros`.`id` AS `IdTercero`,`bdterceros`.`nombre` AS `nombre`,`bdformatos`.`Id` AS `Id`,`bdformatos`.`formato` AS `Formato`,`bdformatos`.`tercero` AS `Tercero`,`bdformatos`.`fecha` AS `Fecha` from (`bdformatos` join `bdterceros` on((`bdformatos`.`tercero` = `bdterceros`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdterceros`.`id` AS `IdTercero`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdformatos`.`Id` AS `Id`,`bdclick4`.`bdformatos`.`formato` AS `Formato`,`bdclick4`.`bdformatos`.`tercero` AS `Tercero`,`bdclick4`.`bdformatos`.`fecha` AS `Fecha` from (`bdclick4`.`bdformatos` join `bdclick4`.`bdterceros` on((`bdclick4`.`bdformatos`.`tercero` = `bdclick4`.`bdterceros`.`idSistema`)))
mariadb-version=100135
