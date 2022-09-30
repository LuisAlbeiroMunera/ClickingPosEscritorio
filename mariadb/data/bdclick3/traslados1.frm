TYPE=VIEW
query=select `bdclick3`.`bdtrasladosbodegas`.`Id` AS `Id`,`bdclick3`.`bdtrasladosbodegas`.`origen` AS `origen`,`bdclick3`.`bdtrasladosbodegas`.`destino` AS `destino`,`bdclick3`.`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdclick3`.`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdclick3`.`bdtrasladosbodegas`.`valor` AS `valor`,`bdclick3`.`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdclick3`.`bdtrasladosbodegas`.`estado` AS `estado`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdclick3`.`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdclick3`.`bdtrasladosbodegas`.`anulada` AS `anulada` from ((`bdclick3`.`bdtrasladosbodegas` join `bdclick3`.`bdbodegas` on((`bdclick3`.`bdtrasladosbodegas`.`origen` = `bdclick3`.`bdbodegas`.`codigo`))) join `bdclick3`.`bdbodegas` `bdbodegas_1` on((`bdclick3`.`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`)))
md5=72b78f262a77a29ca2d59d2a27616a56
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:56
create-version=2
source=select `bdtrasladosbodegas`.`Id` AS `Id`,`bdtrasladosbodegas`.`origen` AS `origen`,`bdtrasladosbodegas`.`destino` AS `destino`,`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdtrasladosbodegas`.`valor` AS `valor`,`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdtrasladosbodegas`.`estado` AS `estado`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdtrasladosbodegas`.`anulada` AS `anulada` from ((`bdtrasladosbodegas` join `bdbodegas` on((`bdtrasladosbodegas`.`origen` = `bdbodegas`.`codigo`))) join `bdbodegas` `bdbodegas_1` on((`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdtrasladosbodegas`.`Id` AS `Id`,`bdclick3`.`bdtrasladosbodegas`.`origen` AS `origen`,`bdclick3`.`bdtrasladosbodegas`.`destino` AS `destino`,`bdclick3`.`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdclick3`.`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdclick3`.`bdtrasladosbodegas`.`valor` AS `valor`,`bdclick3`.`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdclick3`.`bdtrasladosbodegas`.`estado` AS `estado`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdclick3`.`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdclick3`.`bdtrasladosbodegas`.`anulada` AS `anulada` from ((`bdclick3`.`bdtrasladosbodegas` join `bdclick3`.`bdbodegas` on((`bdclick3`.`bdtrasladosbodegas`.`origen` = `bdclick3`.`bdbodegas`.`codigo`))) join `bdclick3`.`bdbodegas` `bdbodegas_1` on((`bdclick3`.`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`)))
mariadb-version=100135
