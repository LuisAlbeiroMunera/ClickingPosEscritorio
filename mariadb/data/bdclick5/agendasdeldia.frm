TYPE=VIEW
query=select `bdclick5`.`bdagenda`.`Id` AS `cita`,`bdclick5`.`bdagenda`.`cliente` AS `cliente`,`bdclick5`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick5`.`bdagenda`.`fecha` AS `fecha`,`bdclick5`.`bdagenda`.`estado` AS `estado` from `bdclick5`.`bdagenda` where ((`bdclick5`.`bdagenda`.`fecha` = cast(now() as date)) and (`bdclick5`.`bdagenda`.`estado` <> \'Atendido\'))
md5=5ca82f8c570ee073dd1600d06e0f72b5
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:44
create-version=2
source=select `bdagenda`.`Id` AS `cita`,`bdagenda`.`cliente` AS `cliente`,`bdagenda`.`aCargo` AS `aCargo`,`bdagenda`.`fecha` AS `fecha`,`bdagenda`.`estado` AS `estado` from `bdagenda` where ((`bdagenda`.`fecha` = cast(now() as date)) and (`bdagenda`.`estado` <> \'Atendido\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdagenda`.`Id` AS `cita`,`bdclick5`.`bdagenda`.`cliente` AS `cliente`,`bdclick5`.`bdagenda`.`aCargo` AS `aCargo`,`bdclick5`.`bdagenda`.`fecha` AS `fecha`,`bdclick5`.`bdagenda`.`estado` AS `estado` from `bdclick5`.`bdagenda` where ((`bdclick5`.`bdagenda`.`fecha` = cast(now() as date)) and (`bdclick5`.`bdagenda`.`estado` <> \'Atendido\'))
mariadb-version=100135
