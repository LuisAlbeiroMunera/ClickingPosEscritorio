TYPE=VIEW
query=select `bdclick3`.`bdagenda`.`Id` AS `cita`,`bdclick3`.`bdagenda`.`cliente` AS `cliente`,`bdclick3`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick3`.`bdagenda`.`fecha` AS `fecha`,`bdclick3`.`bdagenda`.`estado` AS `estado` from `bdclick3`.`bdagenda` where ((`bdclick3`.`bdagenda`.`fecha` = cast(now() as date)) and (`bdclick3`.`bdagenda`.`estado` <> \'Atendido\'))
md5=dc81b282c8df4af2dc33818111fe921c
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:48
create-version=2
source=select `bdagenda`.`Id` AS `cita`,`bdagenda`.`cliente` AS `cliente`,`bdagenda`.`aCargo` AS `aCargo`,`bdagenda`.`fecha` AS `fecha`,`bdagenda`.`estado` AS `estado` from `bdagenda` where ((`bdagenda`.`fecha` = cast(now() as date)) and (`bdagenda`.`estado` <> \'Atendido\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdagenda`.`Id` AS `cita`,`bdclick3`.`bdagenda`.`cliente` AS `cliente`,`bdclick3`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick3`.`bdagenda`.`fecha` AS `fecha`,`bdclick3`.`bdagenda`.`estado` AS `estado` from `bdclick3`.`bdagenda` where ((`bdclick3`.`bdagenda`.`fecha` = cast(now() as date)) and (`bdclick3`.`bdagenda`.`estado` <> \'Atendido\'))
mariadb-version=100135
