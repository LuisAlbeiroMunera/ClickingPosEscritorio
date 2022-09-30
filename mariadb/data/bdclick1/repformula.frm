TYPE=VIEW
query=select `bdclick1`.`bdhistoriaclinica`.`id` AS `idHistoria`,`bdclick1`.`bdterceros`.`id` AS `Id`,`bdclick1`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`conformulamedica`.`Id` AS `formulaId`,`conformulamedica`.`historia` AS `consultaId`,`conformulamedica`.`prescripcion` AS `prescripcion`,`conformulamedica`.`posologia` AS `posologia`,`conformulamedica`.`fecha` AS `fecha`,`bdclick1`.`bdterceros`.`telefono` AS `telefono` from ((`bdclick1`.`bdconsultaclinica` join (`bdclick1`.`bdterceros` join `bdclick1`.`bdhistoriaclinica` on((`bdclick1`.`bdterceros`.`idSistema` = `bdclick1`.`bdhistoriaclinica`.`paciente`))) on((`bdclick1`.`bdconsultaclinica`.`historia` = `bdclick1`.`bdhistoriaclinica`.`id`))) join `bdclick1`.`conformulamedica` on((`bdclick1`.`bdconsultaclinica`.`historia` = `conformulamedica`.`historia`))) group by `bdclick1`.`bdhistoriaclinica`.`id`,`bdclick1`.`bdterceros`.`id`,`bdclick1`.`bdterceros`.`idSistema`,`bdclick1`.`bdterceros`.`nombre`,`conformulamedica`.`Id`,`conformulamedica`.`historia`,`conformulamedica`.`prescripcion`,`conformulamedica`.`posologia`,`conformulamedica`.`fecha`,`bdclick1`.`bdterceros`.`telefono` order by `bdclick1`.`bdhistoriaclinica`.`id`,`conformulamedica`.`Id` desc
md5=5e8cd19ba68c1d3ffefc9d2f608cefec
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:37
create-version=2
source=select `bdhistoriaclinica`.`id` AS `idHistoria`,`bdterceros`.`id` AS `Id`,`bdterceros`.`idSistema` AS `idSistema`,`bdterceros`.`nombre` AS `nombre`,`conformulamedica`.`Id` AS `formulaId`,`conformulamedica`.`historia` AS `consultaId`,`conformulamedica`.`prescripcion` AS `prescripcion`,`conformulamedica`.`posologia` AS `posologia`,`conformulamedica`.`fecha` AS `fecha`,`bdterceros`.`telefono` AS `telefono` from ((`bdconsultaclinica` join (`bdterceros` join `bdhistoriaclinica` on((`bdterceros`.`idSistema` = `bdhistoriaclinica`.`paciente`))) on((`bdconsultaclinica`.`historia` = `bdhistoriaclinica`.`id`))) join `conformulamedica` on((`bdconsultaclinica`.`historia` = `conformulamedica`.`historia`))) group by `bdhistoriaclinica`.`id`,`bdterceros`.`id`,`bdterceros`.`idSistema`,`bdterceros`.`nombre`,`conformulamedica`.`Id`,`conformulamedica`.`historia`,`conformulamedica`.`prescripcion`,`conformulamedica`.`posologia`,`conformulamedica`.`fecha`,`bdterceros`.`telefono` order by `bdhistoriaclinica`.`id`,`conformulamedica`.`Id` desc
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdhistoriaclinica`.`id` AS `idHistoria`,`bdclick1`.`bdterceros`.`id` AS `Id`,`bdclick1`.`bdterceros`.`idSistema` AS `idSistema`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`conformulamedica`.`Id` AS `formulaId`,`conformulamedica`.`historia` AS `consultaId`,`conformulamedica`.`prescripcion` AS `prescripcion`,`conformulamedica`.`posologia` AS `posologia`,`conformulamedica`.`fecha` AS `fecha`,`bdclick1`.`bdterceros`.`telefono` AS `telefono` from ((`bdclick1`.`bdconsultaclinica` join (`bdclick1`.`bdterceros` join `bdclick1`.`bdhistoriaclinica` on((`bdclick1`.`bdterceros`.`idSistema` = `bdclick1`.`bdhistoriaclinica`.`paciente`))) on((`bdclick1`.`bdconsultaclinica`.`historia` = `bdclick1`.`bdhistoriaclinica`.`id`))) join `bdclick1`.`conformulamedica` on((`bdclick1`.`bdconsultaclinica`.`historia` = `conformulamedica`.`historia`))) group by `bdclick1`.`bdhistoriaclinica`.`id`,`bdclick1`.`bdterceros`.`id`,`bdclick1`.`bdterceros`.`idSistema`,`bdclick1`.`bdterceros`.`nombre`,`conformulamedica`.`Id`,`conformulamedica`.`historia`,`conformulamedica`.`prescripcion`,`conformulamedica`.`posologia`,`conformulamedica`.`fecha`,`bdclick1`.`bdterceros`.`telefono` order by `bdclick1`.`bdhistoriaclinica`.`id`,`conformulamedica`.`Id` desc
mariadb-version=100135