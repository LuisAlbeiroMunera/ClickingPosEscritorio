TYPE=VIEW
query=(select `bdclick1`.`bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdclick1`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick1`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad2`,`bdclick1`.`bdtrasladosbodegas`.`anulada` AS `anulada` from (`bdclick1`.`bdtrasladosbodegas` left join `bdclick1`.`bdtrasladosbodegasprod` on((`bdclick1`.`bdtrasladosbodegas`.`Id` = `bdclick1`.`bdtrasladosbodegasprod`.`traslado`))) group by `bdclick1`.`bdtrasladosbodegasprod`.`traslado`,`bdclick1`.`bdtrasladosbodegasprod`.`producto`,`bdclick1`.`bdtrasladosbodegasprod`.`cantidad`,`bdclick1`.`bdtrasladosbodegas`.`anulada`,`bdclick1`.`bdtrasladosbodegas`.`destino` having ((`bdclick1`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick1`.`bdtrasladosbodegas`.`destino` = \'123-55\')))
md5=c54f29bd0502cdcd77c23709040ce899
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:35
create-version=2
source=(select `bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdtrasladosbodegasprod`.`cantidad` AS `cantidad2`,`bdtrasladosbodegas`.`anulada` AS `anulada` from (`bdtrasladosbodegas` left join `bdtrasladosbodegasprod` on((`bdtrasladosbodegas`.`Id` = `bdtrasladosbodegasprod`.`traslado`))) group by `bdtrasladosbodegasprod`.`traslado`,`bdtrasladosbodegasprod`.`producto`,`bdtrasladosbodegasprod`.`cantidad`,`bdtrasladosbodegas`.`anulada`,`bdtrasladosbodegas`.`destino` having ((`bdtrasladosbodegas`.`anulada` = 0) and (`bdtrasladosbodegas`.`destino` = \'123-55\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdclick1`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick1`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad2`,`bdclick1`.`bdtrasladosbodegas`.`anulada` AS `anulada` from (`bdclick1`.`bdtrasladosbodegas` left join `bdclick1`.`bdtrasladosbodegasprod` on((`bdclick1`.`bdtrasladosbodegas`.`Id` = `bdclick1`.`bdtrasladosbodegasprod`.`traslado`))) group by `bdclick1`.`bdtrasladosbodegasprod`.`traslado`,`bdclick1`.`bdtrasladosbodegasprod`.`producto`,`bdclick1`.`bdtrasladosbodegasprod`.`cantidad`,`bdclick1`.`bdtrasladosbodegas`.`anulada`,`bdclick1`.`bdtrasladosbodegas`.`destino` having ((`bdclick1`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick1`.`bdtrasladosbodegas`.`destino` = \'123-55\')))
mariadb-version=100135
