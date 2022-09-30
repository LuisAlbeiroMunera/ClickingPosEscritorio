TYPE=VIEW
query=(select `bdclick6`.`bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdclick6`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick6`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad2`,`bdclick6`.`bdtrasladosbodegas`.`anulada` AS `anulada` from (`bdclick6`.`bdtrasladosbodegas` left join `bdclick6`.`bdtrasladosbodegasprod` on((`bdclick6`.`bdtrasladosbodegas`.`Id` = `bdclick6`.`bdtrasladosbodegasprod`.`traslado`))) group by `bdclick6`.`bdtrasladosbodegasprod`.`traslado`,`bdclick6`.`bdtrasladosbodegasprod`.`producto`,`bdclick6`.`bdtrasladosbodegasprod`.`cantidad`,`bdclick6`.`bdtrasladosbodegas`.`anulada`,`bdclick6`.`bdtrasladosbodegas`.`destino` having ((`bdclick6`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick6`.`bdtrasladosbodegas`.`destino` = \'123-55\')))
md5=5bc338a6dd352f4d8f92dec28b0ea10d
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:35
create-version=2
source=(select `bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdtrasladosbodegasprod`.`cantidad` AS `cantidad2`,`bdtrasladosbodegas`.`anulada` AS `anulada` from (`bdtrasladosbodegas` left join `bdtrasladosbodegasprod` on((`bdtrasladosbodegas`.`Id` = `bdtrasladosbodegasprod`.`traslado`))) group by `bdtrasladosbodegasprod`.`traslado`,`bdtrasladosbodegasprod`.`producto`,`bdtrasladosbodegasprod`.`cantidad`,`bdtrasladosbodegas`.`anulada`,`bdtrasladosbodegas`.`destino` having ((`bdtrasladosbodegas`.`anulada` = 0) and (`bdtrasladosbodegas`.`destino` = \'123-55\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdclick6`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick6`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad2`,`bdclick6`.`bdtrasladosbodegas`.`anulada` AS `anulada` from (`bdclick6`.`bdtrasladosbodegas` left join `bdclick6`.`bdtrasladosbodegasprod` on((`bdclick6`.`bdtrasladosbodegas`.`Id` = `bdclick6`.`bdtrasladosbodegasprod`.`traslado`))) group by `bdclick6`.`bdtrasladosbodegasprod`.`traslado`,`bdclick6`.`bdtrasladosbodegasprod`.`producto`,`bdclick6`.`bdtrasladosbodegasprod`.`cantidad`,`bdclick6`.`bdtrasladosbodegas`.`anulada`,`bdclick6`.`bdtrasladosbodegas`.`destino` having ((`bdclick6`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick6`.`bdtrasladosbodegas`.`destino` = \'123-55\')))
mariadb-version=100135
