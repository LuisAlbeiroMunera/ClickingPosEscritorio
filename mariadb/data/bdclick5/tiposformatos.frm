TYPE=VIEW
query=select `bdclick5`.`bdterceros`.`id` AS `IdTercero`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdformatos`.`Id` AS `Id`,`bdclick5`.`bdformatos`.`formato` AS `Formato`,`bdclick5`.`bdformatos`.`tercero` AS `Tercero`,`bdclick5`.`bdformatos`.`fecha` AS `Fecha` from (`bdclick5`.`bdformatos` join `bdclick5`.`bdterceros` on((`bdclick5`.`bdformatos`.`tercero` = `bdclick5`.`bdterceros`.`idSistema`)))
md5=13d52c9f09d79c64990ea2bbc9084dad
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:51
create-version=2
source=select `bdterceros`.`id` AS `IdTercero`,`bdterceros`.`nombre` AS `nombre`,`bdformatos`.`Id` AS `Id`,`bdformatos`.`formato` AS `Formato`,`bdformatos`.`tercero` AS `Tercero`,`bdformatos`.`fecha` AS `Fecha` from (`bdformatos` join `bdterceros` on((`bdformatos`.`tercero` = `bdterceros`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdterceros`.`id` AS `IdTercero`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdformatos`.`Id` AS `Id`,`bdclick5`.`bdformatos`.`formato` AS `Formato`,`bdclick5`.`bdformatos`.`tercero` AS `Tercero`,`bdclick5`.`bdformatos`.`fecha` AS `Fecha` from (`bdclick5`.`bdformatos` join `bdclick5`.`bdterceros` on((`bdclick5`.`bdformatos`.`tercero` = `bdclick5`.`bdterceros`.`idSistema`)))
mariadb-version=100135
