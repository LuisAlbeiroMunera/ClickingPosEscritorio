TYPE=VIEW
query=select `bdclick3`.`bdterceros`.`id` AS `IdTercero`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdformatos`.`Id` AS `Id`,`bdclick3`.`bdformatos`.`formato` AS `Formato`,`bdclick3`.`bdformatos`.`tercero` AS `Tercero`,`bdclick3`.`bdformatos`.`fecha` AS `Fecha` from (`bdclick3`.`bdformatos` join `bdclick3`.`bdterceros` on((`bdclick3`.`bdformatos`.`tercero` = `bdclick3`.`bdterceros`.`idSistema`)))
md5=5aac5bfb5d12867c14c7d259015f6cb8
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:54
create-version=2
source=select `bdterceros`.`id` AS `IdTercero`,`bdterceros`.`nombre` AS `nombre`,`bdformatos`.`Id` AS `Id`,`bdformatos`.`formato` AS `Formato`,`bdformatos`.`tercero` AS `Tercero`,`bdformatos`.`fecha` AS `Fecha` from (`bdformatos` join `bdterceros` on((`bdformatos`.`tercero` = `bdterceros`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdterceros`.`id` AS `IdTercero`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdformatos`.`Id` AS `Id`,`bdclick3`.`bdformatos`.`formato` AS `Formato`,`bdclick3`.`bdformatos`.`tercero` AS `Tercero`,`bdclick3`.`bdformatos`.`fecha` AS `Fecha` from (`bdclick3`.`bdformatos` join `bdclick3`.`bdterceros` on((`bdclick3`.`bdformatos`.`tercero` = `bdclick3`.`bdterceros`.`idSistema`)))
mariadb-version=100135
