TYPE=VIEW
query=select `bdclick1`.`bdtrasladosbodegas`.`Id` AS `Id`,`bdclick1`.`bdtrasladosbodegas`.`origen` AS `origen`,`bdclick1`.`bdtrasladosbodegas`.`destino` AS `destino`,`bdclick1`.`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdclick1`.`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdclick1`.`bdtrasladosbodegas`.`valor` AS `valor`,`bdclick1`.`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdclick1`.`bdtrasladosbodegas`.`estado` AS `estado`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdclick1`.`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdclick1`.`bdtrasladosbodegas`.`anulada` AS `anulada` from ((`bdclick1`.`bdtrasladosbodegas` join `bdclick1`.`bdbodegas` on((`bdclick1`.`bdtrasladosbodegas`.`origen` = `bdclick1`.`bdbodegas`.`codigo`))) join `bdclick1`.`bdbodegas` `bdbodegas_1` on((`bdclick1`.`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`)))
md5=599193048e771650478245569f098b5b
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:40
create-version=2
source=select `bdtrasladosbodegas`.`Id` AS `Id`,`bdtrasladosbodegas`.`origen` AS `origen`,`bdtrasladosbodegas`.`destino` AS `destino`,`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdtrasladosbodegas`.`valor` AS `valor`,`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdtrasladosbodegas`.`estado` AS `estado`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdtrasladosbodegas`.`anulada` AS `anulada` from ((`bdtrasladosbodegas` join `bdbodegas` on((`bdtrasladosbodegas`.`origen` = `bdbodegas`.`codigo`))) join `bdbodegas` `bdbodegas_1` on((`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdtrasladosbodegas`.`Id` AS `Id`,`bdclick1`.`bdtrasladosbodegas`.`origen` AS `origen`,`bdclick1`.`bdtrasladosbodegas`.`destino` AS `destino`,`bdclick1`.`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdclick1`.`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdclick1`.`bdtrasladosbodegas`.`valor` AS `valor`,`bdclick1`.`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdclick1`.`bdtrasladosbodegas`.`estado` AS `estado`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdclick1`.`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdclick1`.`bdtrasladosbodegas`.`anulada` AS `anulada` from ((`bdclick1`.`bdtrasladosbodegas` join `bdclick1`.`bdbodegas` on((`bdclick1`.`bdtrasladosbodegas`.`origen` = `bdclick1`.`bdbodegas`.`codigo`))) join `bdclick1`.`bdbodegas` `bdbodegas_1` on((`bdclick1`.`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`)))
mariadb-version=100135
