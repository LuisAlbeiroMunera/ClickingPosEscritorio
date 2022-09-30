TYPE=VIEW
query=select `bdclick6`.`bdterceros`.`id` AS `IdTercero`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdformatos`.`Id` AS `Id`,`bdclick6`.`bdformatos`.`formato` AS `Formato`,`bdclick6`.`bdformatos`.`tercero` AS `Tercero`,`bdclick6`.`bdformatos`.`fecha` AS `Fecha` from (`bdclick6`.`bdformatos` join `bdclick6`.`bdterceros` on((`bdclick6`.`bdformatos`.`tercero` = `bdclick6`.`bdterceros`.`idSistema`)))
md5=19158b4243941ee475255708ddfcea9b
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:39
create-version=2
source=select `bdterceros`.`id` AS `IdTercero`,`bdterceros`.`nombre` AS `nombre`,`bdformatos`.`Id` AS `Id`,`bdformatos`.`formato` AS `Formato`,`bdformatos`.`tercero` AS `Tercero`,`bdformatos`.`fecha` AS `Fecha` from (`bdformatos` join `bdterceros` on((`bdformatos`.`tercero` = `bdterceros`.`idSistema`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdterceros`.`id` AS `IdTercero`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdformatos`.`Id` AS `Id`,`bdclick6`.`bdformatos`.`formato` AS `Formato`,`bdclick6`.`bdformatos`.`tercero` AS `Tercero`,`bdclick6`.`bdformatos`.`fecha` AS `Fecha` from (`bdclick6`.`bdformatos` join `bdclick6`.`bdterceros` on((`bdclick6`.`bdformatos`.`tercero` = `bdclick6`.`bdterceros`.`idSistema`)))
mariadb-version=100135
