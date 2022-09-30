TYPE=VIEW
query=select `bdclick`.`bdtrasladosbodegas`.`Id` AS `Id`,`bdclick`.`bdtrasladosbodegas`.`origen` AS `origen`,`bdclick`.`bdtrasladosbodegas`.`destino` AS `destino`,`bdclick`.`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdclick`.`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdclick`.`bdtrasladosbodegas`.`valor` AS `valor`,`bdclick`.`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdclick`.`bdtrasladosbodegas`.`estado` AS `estado`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdclick`.`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdclick`.`bdtrasladosbodegas`.`anulada` AS `anulada` from ((`bdclick`.`bdtrasladosbodegas` join `bdclick`.`bdbodegas` on((`bdclick`.`bdtrasladosbodegas`.`origen` = `bdclick`.`bdbodegas`.`codigo`))) join `bdclick`.`bdbodegas` `bdbodegas_1` on((`bdclick`.`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`)))
md5=cdc8074f90ef3636c9e078e70268aad1
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:30
create-version=2
source=select `bdtrasladosbodegas`.`Id` AS `Id`,`bdtrasladosbodegas`.`origen` AS `origen`,`bdtrasladosbodegas`.`destino` AS `destino`,`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdtrasladosbodegas`.`valor` AS `valor`,`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdtrasladosbodegas`.`estado` AS `estado`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdtrasladosbodegas`.`anulada` AS `anulada` from ((`bdtrasladosbodegas` join `bdbodegas` on((`bdtrasladosbodegas`.`origen` = `bdbodegas`.`codigo`))) join `bdbodegas` `bdbodegas_1` on((`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdtrasladosbodegas`.`Id` AS `Id`,`bdclick`.`bdtrasladosbodegas`.`origen` AS `origen`,`bdclick`.`bdtrasladosbodegas`.`destino` AS `destino`,`bdclick`.`bdtrasladosbodegas`.`fecha` AS `fecha`,`bdclick`.`bdtrasladosbodegas`.`unidades` AS `unidades`,`bdclick`.`bdtrasladosbodegas`.`valor` AS `valor`,`bdclick`.`bdtrasladosbodegas`.`diasPlazo` AS `diasPlazo`,`bdclick`.`bdtrasladosbodegas`.`estado` AS `estado`,`bdbodegas_1`.`nombre` AS `BodegaDestino`,`bdclick`.`bdbodegas`.`nombre` AS `BodegaOrigen`,`bdclick`.`bdtrasladosbodegas`.`anulada` AS `anulada` from ((`bdclick`.`bdtrasladosbodegas` join `bdclick`.`bdbodegas` on((`bdclick`.`bdtrasladosbodegas`.`origen` = `bdclick`.`bdbodegas`.`codigo`))) join `bdclick`.`bdbodegas` `bdbodegas_1` on((`bdclick`.`bdtrasladosbodegas`.`destino` = `bdbodegas_1`.`codigo`)))
mariadb-version=100135
