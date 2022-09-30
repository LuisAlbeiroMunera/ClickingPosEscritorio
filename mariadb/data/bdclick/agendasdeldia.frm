TYPE=VIEW
query=select `bdclick`.`bdagenda`.`Id` AS `cita`,`bdclick`.`bdagenda`.`cliente` AS `cliente`,`bdclick`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick`.`bdagenda`.`fecha` AS `fecha`,`bdclick`.`bdagenda`.`estado` AS `estado` from `bdclick`.`bdagenda` where ((`bdclick`.`bdagenda`.`fecha` = cast(now() as date)) and (`bdclick`.`bdagenda`.`estado` <> \'Atendido\'))
md5=074a4c76417cc90896b849498ba8d2c8
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:21
create-version=2
source=select `bdagenda`.`Id` AS `cita`,`bdagenda`.`cliente` AS `cliente`,`bdagenda`.`aCargo` AS `aCargo`,`bdagenda`.`fecha` AS `fecha`,`bdagenda`.`estado` AS `estado` from `bdagenda` where ((`bdagenda`.`fecha` = cast(now() as date)) and (`bdagenda`.`estado` <> \'Atendido\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdagenda`.`Id` AS `cita`,`bdclick`.`bdagenda`.`cliente` AS `cliente`,`bdclick`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick`.`bdagenda`.`fecha` AS `fecha`,`bdclick`.`bdagenda`.`estado` AS `estado` from `bdclick`.`bdagenda` where ((`bdclick`.`bdagenda`.`fecha` = cast(now() as date)) and (`bdclick`.`bdagenda`.`estado` <> \'Atendido\'))
mariadb-version=100135
