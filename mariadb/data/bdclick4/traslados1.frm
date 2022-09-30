TYPE=VIEW
query=select `bdclick4`.`bdtrasladosbodegas`.`Id` AS `Id`,`bdclick4`.`bdtrasladosbodegas`.`origen` AS `origen`,`bdclick4`.`bdtrasladosbodegas`.`destino` AS `destino`,`bdclick4`.`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdclick4`.`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdclick4`.`bdtrasladosbodegas`.`valor` AS `valor`,`bdclick4`.`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdclick4`.`bdtrasladosbodegas`.`estado` AS `estado`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdclick4`.`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdclick4`.`bdtrasladosbodegas`.`anulada` AS `anulada` from ((`bdclick4`.`bdtrasladosbodegas` join `bdclick4`.`bdbodegas` on((`bdclick4`.`bdtrasladosbodegas`.`origen` = `bdclick4`.`bdbodegas`.`codigo`))) join `bdclick4`.`bdbodegas` `bdbodegas_1` on((`bdclick4`.`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`)))
md5=f9bf70ea2d12d21f5f019ac14f0e73cb
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:33
create-version=2
source=select `bdtrasladosbodegas`.`Id` AS `Id`,`bdtrasladosbodegas`.`origen` AS `origen`,`bdtrasladosbodegas`.`destino` AS `destino`,`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdtrasladosbodegas`.`valor` AS `valor`,`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdtrasladosbodegas`.`estado` AS `estado`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdtrasladosbodegas`.`anulada` AS `anulada` from ((`bdtrasladosbodegas` join `bdbodegas` on((`bdtrasladosbodegas`.`origen` = `bdbodegas`.`codigo`))) join `bdbodegas` `bdbodegas_1` on((`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdtrasladosbodegas`.`Id` AS `Id`,`bdclick4`.`bdtrasladosbodegas`.`origen` AS `origen`,`bdclick4`.`bdtrasladosbodegas`.`destino` AS `destino`,`bdclick4`.`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdclick4`.`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdclick4`.`bdtrasladosbodegas`.`valor` AS `valor`,`bdclick4`.`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdclick4`.`bdtrasladosbodegas`.`estado` AS `estado`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdclick4`.`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdclick4`.`bdtrasladosbodegas`.`anulada` AS `anulada` from ((`bdclick4`.`bdtrasladosbodegas` join `bdclick4`.`bdbodegas` on((`bdclick4`.`bdtrasladosbodegas`.`origen` = `bdclick4`.`bdbodegas`.`codigo`))) join `bdclick4`.`bdbodegas` `bdbodegas_1` on((`bdclick4`.`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`)))
mariadb-version=100135
