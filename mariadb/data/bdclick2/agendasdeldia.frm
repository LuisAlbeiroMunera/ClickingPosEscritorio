TYPE=VIEW
query=select `bdclick2`.`bdagenda`.`Id` AS `cita`,`bdclick2`.`bdagenda`.`cliente` AS `cliente`,`bdclick2`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick2`.`bdagenda`.`fecha` AS `fecha`,`bdclick2`.`bdagenda`.`estado` AS `estado` from `bdclick2`.`bdagenda` where ((`bdclick2`.`bdagenda`.`fecha` = cast(now() as date)) and (`bdclick2`.`bdagenda`.`estado` <> \'Atendido\'))
md5=2a7604d47c5c637e99d92bc5a0b980b5
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:42
create-version=2
source=select `bdagenda`.`Id` AS `cita`,`bdagenda`.`cliente` AS `cliente`,`bdagenda`.`aCargo` AS `aCargo`,`bdagenda`.`fecha` AS `fecha`,`bdagenda`.`estado` AS `estado` from `bdagenda` where ((`bdagenda`.`fecha` = cast(now() as date)) and (`bdagenda`.`estado` <> \'Atendido\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdagenda`.`Id` AS `cita`,`bdclick2`.`bdagenda`.`cliente` AS `cliente`,`bdclick2`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick2`.`bdagenda`.`fecha` AS `fecha`,`bdclick2`.`bdagenda`.`estado` AS `estado` from `bdclick2`.`bdagenda` where ((`bdclick2`.`bdagenda`.`fecha` = cast(now() as date)) and (`bdclick2`.`bdagenda`.`estado` <> \'Atendido\'))
mariadb-version=100135
