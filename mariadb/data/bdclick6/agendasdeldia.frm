TYPE=VIEW
query=select `bdclick6`.`bdagenda`.`Id` AS `cita`,`bdclick6`.`bdagenda`.`cliente` AS `cliente`,`bdclick6`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick6`.`bdagenda`.`fecha` AS `fecha`,`bdclick6`.`bdagenda`.`estado` AS `estado` from `bdclick6`.`bdagenda` where ((`bdclick6`.`bdagenda`.`fecha` = cast(now() as date)) and (`bdclick6`.`bdagenda`.`estado` <> \'Atendido\'))
md5=b35fb5c2cfffc282d49dac2f6ca63572
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:32
create-version=2
source=select `bdagenda`.`Id` AS `cita`,`bdagenda`.`cliente` AS `cliente`,`bdagenda`.`aCargo` AS `aCargo`,`bdagenda`.`fecha` AS `fecha`,`bdagenda`.`estado` AS `estado` from `bdagenda` where ((`bdagenda`.`fecha` = cast(now() as date)) and (`bdagenda`.`estado` <> \'Atendido\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdagenda`.`Id` AS `cita`,`bdclick6`.`bdagenda`.`cliente` AS `cliente`,`bdclick6`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick6`.`bdagenda`.`fecha` AS `fecha`,`bdclick6`.`bdagenda`.`estado` AS `estado` from `bdclick6`.`bdagenda` where ((`bdclick6`.`bdagenda`.`fecha` = cast(now() as date)) and (`bdclick6`.`bdagenda`.`estado` <> \'Atendido\'))
mariadb-version=100135
