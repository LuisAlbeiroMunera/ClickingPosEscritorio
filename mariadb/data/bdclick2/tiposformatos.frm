TYPE=VIEW
query=select `bdclick2`.`bdterceros`.`id` AS `IdTercero`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdformatos`.`Id` AS `Id`,`bdclick2`.`bdformatos`.`formato` AS `Formato`,`bdclick2`.`bdformatos`.`tercero` AS `Tercero`,`bdclick2`.`bdformatos`.`fecha` AS `Fecha` from (`bdclick2`.`bdformatos` join `bdclick2`.`bdterceros` on((`bdclick2`.`bdformatos`.`tercero` = `bdclick2`.`bdterceros`.`idSistema`)))
md5=b3dfb62e02190f7a4d4fc98652f7bae9
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:48
create-version=2
source=select `bdterceros`.`id` AS `IdTercero`,`bdterceros`.`nombre` AS `nombre`,`bdformatos`.`Id` AS `Id`,`bdformatos`.`formato` AS `Formato`,`bdformatos`.`tercero` AS `Tercero`,`bdformatos`.`fecha` AS `Fecha` from (`bdformatos` join `bdterceros` on((`bdformatos`.`tercero` = `bdterceros`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdterceros`.`id` AS `IdTercero`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdformatos`.`Id` AS `Id`,`bdclick2`.`bdformatos`.`formato` AS `Formato`,`bdclick2`.`bdformatos`.`tercero` AS `Tercero`,`bdclick2`.`bdformatos`.`fecha` AS `Fecha` from (`bdclick2`.`bdformatos` join `bdclick2`.`bdterceros` on((`bdclick2`.`bdformatos`.`tercero` = `bdclick2`.`bdterceros`.`idSistema`)))
mariadb-version=100135
