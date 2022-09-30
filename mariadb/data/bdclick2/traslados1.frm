TYPE=VIEW
query=select `bdclick2`.`bdtrasladosbodegas`.`Id` AS `Id`,`bdclick2`.`bdtrasladosbodegas`.`origen` AS `origen`,`bdclick2`.`bdtrasladosbodegas`.`destino` AS `destino`,`bdclick2`.`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdclick2`.`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdclick2`.`bdtrasladosbodegas`.`valor` AS `valor`,`bdclick2`.`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdclick2`.`bdtrasladosbodegas`.`estado` AS `estado`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdclick2`.`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdclick2`.`bdtrasladosbodegas`.`anulada` AS `anulada` from ((`bdclick2`.`bdtrasladosbodegas` join `bdclick2`.`bdbodegas` on((`bdclick2`.`bdtrasladosbodegas`.`origen` = `bdclick2`.`bdbodegas`.`codigo`))) join `bdclick2`.`bdbodegas` `bdbodegas_1` on((`bdclick2`.`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`)))
md5=e1c5c5e7a19ee20846d73a516f1950d1
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:51
create-version=2
source=select `bdtrasladosbodegas`.`Id` AS `Id`,`bdtrasladosbodegas`.`origen` AS `origen`,`bdtrasladosbodegas`.`destino` AS `destino`,`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdtrasladosbodegas`.`valor` AS `valor`,`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdtrasladosbodegas`.`estado` AS `estado`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdtrasladosbodegas`.`anulada` AS `anulada` from ((`bdtrasladosbodegas` join `bdbodegas` on((`bdtrasladosbodegas`.`origen` = `bdbodegas`.`codigo`))) join `bdbodegas` `bdbodegas_1` on((`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdtrasladosbodegas`.`Id` AS `Id`,`bdclick2`.`bdtrasladosbodegas`.`origen` AS `origen`,`bdclick2`.`bdtrasladosbodegas`.`destino` AS `destino`,`bdclick2`.`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdclick2`.`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdclick2`.`bdtrasladosbodegas`.`valor` AS `valor`,`bdclick2`.`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdclick2`.`bdtrasladosbodegas`.`estado` AS `estado`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdclick2`.`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdclick2`.`bdtrasladosbodegas`.`anulada` AS `anulada` from ((`bdclick2`.`bdtrasladosbodegas` join `bdclick2`.`bdbodegas` on((`bdclick2`.`bdtrasladosbodegas`.`origen` = `bdclick2`.`bdbodegas`.`codigo`))) join `bdclick2`.`bdbodegas` `bdbodegas_1` on((`bdclick2`.`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`)))
mariadb-version=100135
