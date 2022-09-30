TYPE=VIEW
query=(select `bdclick`.`bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdclick`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad2`,`bdclick`.`bdtrasladosbodegas`.`anulada` AS `anulada` from (`bdclick`.`bdtrasladosbodegas` left join `bdclick`.`bdtrasladosbodegasprod` on((`bdclick`.`bdtrasladosbodegas`.`Id` = `bdclick`.`bdtrasladosbodegasprod`.`traslado`))) group by `bdclick`.`bdtrasladosbodegasprod`.`traslado`,`bdclick`.`bdtrasladosbodegasprod`.`producto`,`bdclick`.`bdtrasladosbodegasprod`.`cantidad`,`bdclick`.`bdtrasladosbodegas`.`anulada`,`bdclick`.`bdtrasladosbodegas`.`destino` having ((`bdclick`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick`.`bdtrasladosbodegas`.`destino` = \'123-55\')))
md5=a644abf1d57c96a1cebab229d3fb1133
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:24
create-version=2
source=(select `bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdtrasladosbodegasprod`.`cantidad` AS `cantidad2`,`bdtrasladosbodegas`.`anulada` AS `anulada` from (`bdtrasladosbodegas` left join `bdtrasladosbodegasprod` on((`bdtrasladosbodegas`.`Id` = `bdtrasladosbodegasprod`.`traslado`))) group by `bdtrasladosbodegasprod`.`traslado`,`bdtrasladosbodegasprod`.`producto`,`bdtrasladosbodegasprod`.`cantidad`,`bdtrasladosbodegas`.`anulada`,`bdtrasladosbodegas`.`destino` having ((`bdtrasladosbodegas`.`anulada` = 0) and (`bdtrasladosbodegas`.`destino` = \'123-55\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdclick`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad2`,`bdclick`.`bdtrasladosbodegas`.`anulada` AS `anulada` from (`bdclick`.`bdtrasladosbodegas` left join `bdclick`.`bdtrasladosbodegasprod` on((`bdclick`.`bdtrasladosbodegas`.`Id` = `bdclick`.`bdtrasladosbodegasprod`.`traslado`))) group by `bdclick`.`bdtrasladosbodegasprod`.`traslado`,`bdclick`.`bdtrasladosbodegasprod`.`producto`,`bdclick`.`bdtrasladosbodegasprod`.`cantidad`,`bdclick`.`bdtrasladosbodegas`.`anulada`,`bdclick`.`bdtrasladosbodegas`.`destino` having ((`bdclick`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick`.`bdtrasladosbodegas`.`destino` = \'123-55\')))
mariadb-version=100135
