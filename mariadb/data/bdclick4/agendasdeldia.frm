TYPE=VIEW
query=select `bdclick4`.`bdagenda`.`Id` AS `cita`,`bdclick4`.`bdagenda`.`cliente` AS `cliente`,`bdclick4`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick4`.`bdagenda`.`fecha` AS `fecha`,`bdclick4`.`bdagenda`.`estado` AS `estado` from `bdclick4`.`bdagenda` where ((`bdclick4`.`bdagenda`.`fecha` = cast(now() as date)) and (`bdclick4`.`bdagenda`.`estado` <> \'Atendido\'))
md5=ea3637e38e84985850b740bd419d6af4
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:25
create-version=2
source=select `bdagenda`.`Id` AS `cita`,`bdagenda`.`cliente` AS `cliente`,`bdagenda`.`aCargo` AS `aCargo`,`bdagenda`.`fecha` AS `fecha`,`bdagenda`.`estado` AS `estado` from `bdagenda` where ((`bdagenda`.`fecha` = cast(now() as date)) and (`bdagenda`.`estado` <> \'Atendido\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdagenda`.`Id` AS `cita`,`bdclick4`.`bdagenda`.`cliente` AS `cliente`,`bdclick4`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick4`.`bdagenda`.`fecha` AS `fecha`,`bdclick4`.`bdagenda`.`estado` AS `estado` from `bdclick4`.`bdagenda` where ((`bdclick4`.`bdagenda`.`fecha` = cast(now() as date)) and (`bdclick4`.`bdagenda`.`estado` <> \'Atendido\'))
mariadb-version=100135
