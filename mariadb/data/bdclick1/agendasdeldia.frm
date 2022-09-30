TYPE=VIEW
query=select `bdclick1`.`bdagenda`.`Id` AS `cita`,`bdclick1`.`bdagenda`.`cliente` AS `cliente`,`bdclick1`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick1`.`bdagenda`.`fecha` AS `fecha`,`bdclick1`.`bdagenda`.`estado` AS `estado` from `bdclick1`.`bdagenda` where ((`bdclick1`.`bdagenda`.`fecha` = cast(now() as date)) and (`bdclick1`.`bdagenda`.`estado` <> \'Atendido\'))
md5=a178ed766ce2fe34530ce4886ba38b98
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:32
create-version=2
source=select `bdagenda`.`Id` AS `cita`,`bdagenda`.`cliente` AS `cliente`,`bdagenda`.`aCargo` AS `aCargo`,`bdagenda`.`fecha` AS `fecha`,`bdagenda`.`estado` AS `estado` from `bdagenda` where ((`bdagenda`.`fecha` = cast(now() as date)) and (`bdagenda`.`estado` <> \'Atendido\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdagenda`.`Id` AS `cita`,`bdclick1`.`bdagenda`.`cliente` AS `cliente`,`bdclick1`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick1`.`bdagenda`.`fecha` AS `fecha`,`bdclick1`.`bdagenda`.`estado` AS `estado` from `bdclick1`.`bdagenda` where ((`bdclick1`.`bdagenda`.`fecha` = cast(now() as date)) and (`bdclick1`.`bdagenda`.`estado` <> \'Atendido\'))
mariadb-version=100135
