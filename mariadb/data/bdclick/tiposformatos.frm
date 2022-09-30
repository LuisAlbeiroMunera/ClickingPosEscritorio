TYPE=VIEW
query=select `bdclick`.`bdterceros`.`id` AS `IdTercero`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdformatos`.`Id` AS `Id`,`bdclick`.`bdformatos`.`formato` AS `Formato`,`bdclick`.`bdformatos`.`tercero` AS `Tercero`,`bdclick`.`bdformatos`.`fecha` AS `Fecha` from (`bdclick`.`bdformatos` join `bdclick`.`bdterceros` on((`bdclick`.`bdformatos`.`tercero` = `bdclick`.`bdterceros`.`idSistema`)))
md5=f2613a654e38f28870d8c7ea64fa4a6f
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:27
create-version=2
source=select `bdterceros`.`id` AS `IdTercero`,`bdterceros`.`nombre` AS `nombre`,`bdformatos`.`Id` AS `Id`,`bdformatos`.`formato` AS `Formato`,`bdformatos`.`tercero` AS `Tercero`,`bdformatos`.`fecha` AS `Fecha` from (`bdformatos` join `bdterceros` on((`bdformatos`.`tercero` = `bdterceros`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdterceros`.`id` AS `IdTercero`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdformatos`.`Id` AS `Id`,`bdclick`.`bdformatos`.`formato` AS `Formato`,`bdclick`.`bdformatos`.`tercero` AS `Tercero`,`bdclick`.`bdformatos`.`fecha` AS `Fecha` from (`bdclick`.`bdformatos` join `bdclick`.`bdterceros` on((`bdclick`.`bdformatos`.`tercero` = `bdclick`.`bdterceros`.`idSistema`)))
mariadb-version=100135
