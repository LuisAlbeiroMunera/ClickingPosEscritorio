TYPE=VIEW
query=select `bdclick6`.`bdtrasladosbodegas`.`Id` AS `Id`,`bdclick6`.`bdtrasladosbodegas`.`origen` AS `origen`,`bdclick6`.`bdtrasladosbodegas`.`destino` AS `destino`,`bdclick6`.`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdclick6`.`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdclick6`.`bdtrasladosbodegas`.`valor` AS `valor`,`bdclick6`.`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdclick6`.`bdtrasladosbodegas`.`estado` AS `estado`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdclick6`.`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdclick6`.`bdtrasladosbodegas`.`anulada` AS `anulada` from ((`bdclick6`.`bdtrasladosbodegas` join `bdclick6`.`bdbodegas` on((`bdclick6`.`bdtrasladosbodegas`.`origen` = `bdclick6`.`bdbodegas`.`codigo`))) join `bdclick6`.`bdbodegas` `bdbodegas_1` on((`bdclick6`.`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`)))
md5=b03881c66beaffcf19a738b9125e1e87
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:42
create-version=2
source=select `bdtrasladosbodegas`.`Id` AS `Id`,`bdtrasladosbodegas`.`origen` AS `origen`,`bdtrasladosbodegas`.`destino` AS `destino`,`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdtrasladosbodegas`.`valor` AS `valor`,`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdtrasladosbodegas`.`estado` AS `estado`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdtrasladosbodegas`.`anulada` AS `anulada` from ((`bdtrasladosbodegas` join `bdbodegas` on((`bdtrasladosbodegas`.`origen` = `bdbodegas`.`codigo`))) join `bdbodegas` `bdbodegas_1` on((`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdtrasladosbodegas`.`Id` AS `Id`,`bdclick6`.`bdtrasladosbodegas`.`origen` AS `origen`,`bdclick6`.`bdtrasladosbodegas`.`destino` AS `destino`,`bdclick6`.`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdclick6`.`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdclick6`.`bdtrasladosbodegas`.`valor` AS `valor`,`bdclick6`.`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdclick6`.`bdtrasladosbodegas`.`estado` AS `estado`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdclick6`.`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdclick6`.`bdtrasladosbodegas`.`anulada` AS `anulada` from ((`bdclick6`.`bdtrasladosbodegas` join `bdclick6`.`bdbodegas` on((`bdclick6`.`bdtrasladosbodegas`.`origen` = `bdclick6`.`bdbodegas`.`codigo`))) join `bdclick6`.`bdbodegas` `bdbodegas_1` on((`bdclick6`.`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`)))
mariadb-version=100135
