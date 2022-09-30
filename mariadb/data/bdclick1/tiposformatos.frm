TYPE=VIEW
query=select `bdclick1`.`bdterceros`.`id` AS `IdTercero`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdformatos`.`Id` AS `Id`,`bdclick1`.`bdformatos`.`formato` AS `Formato`,`bdclick1`.`bdformatos`.`tercero` AS `Tercero`,`bdclick1`.`bdformatos`.`fecha` AS `Fecha` from (`bdclick1`.`bdformatos` join `bdclick1`.`bdterceros` on((`bdclick1`.`bdformatos`.`tercero` = `bdclick1`.`bdterceros`.`idSistema`)))
md5=e89cf6ea8fc2fbe228b39b152bc614a7
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:38
create-version=2
source=select `bdterceros`.`id` AS `IdTercero`,`bdterceros`.`nombre` AS `nombre`,`bdformatos`.`Id` AS `Id`,`bdformatos`.`formato` AS `Formato`,`bdformatos`.`tercero` AS `Tercero`,`bdformatos`.`fecha` AS `Fecha` from (`bdformatos` join `bdterceros` on((`bdformatos`.`tercero` = `bdterceros`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdterceros`.`id` AS `IdTercero`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdformatos`.`Id` AS `Id`,`bdclick1`.`bdformatos`.`formato` AS `Formato`,`bdclick1`.`bdformatos`.`tercero` AS `Tercero`,`bdclick1`.`bdformatos`.`fecha` AS `Fecha` from (`bdclick1`.`bdformatos` join `bdclick1`.`bdterceros` on((`bdclick1`.`bdformatos`.`tercero` = `bdclick1`.`bdterceros`.`idSistema`)))
mariadb-version=100135
