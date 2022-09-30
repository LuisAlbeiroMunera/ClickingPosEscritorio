TYPE=VIEW
query=(select `bdclick3`.`bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdclick3`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick3`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick3`.`bdtrasladosbodegas`.`anulada` AS `anulada` from (`bdclick3`.`bdtrasladosbodegas` left join `bdclick3`.`bdtrasladosbodegasprod` on((`bdclick3`.`bdtrasladosbodegas`.`Id` = `bdclick3`.`bdtrasladosbodegasprod`.`traslado`))) group by `bdclick3`.`bdtrasladosbodegasprod`.`traslado`,`bdclick3`.`bdtrasladosbodegasprod`.`producto`,`bdclick3`.`bdtrasladosbodegasprod`.`cantidad`,`bdclick3`.`bdtrasladosbodegas`.`anulada`,`bdclick3`.`bdtrasladosbodegas`.`origen` having ((`bdclick3`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick3`.`bdtrasladosbodegas`.`origen` = \'123-55\')))
md5=91ff8718d103695d229ce27ef1704466
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:51
create-version=2
source=(select `bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdtrasladosbodegas`.`anulada` AS `anulada` from (`bdtrasladosbodegas` left join `bdtrasladosbodegasprod` on((`bdtrasladosbodegas`.`Id` = `bdtrasladosbodegasprod`.`traslado`))) group by `bdtrasladosbodegasprod`.`traslado`,`bdtrasladosbodegasprod`.`producto`,`bdtrasladosbodegasprod`.`cantidad`,`bdtrasladosbodegas`.`anulada`,`bdtrasladosbodegas`.`origen` having ((`bdtrasladosbodegas`.`anulada` = 0) and (`bdtrasladosbodegas`.`origen` = \'123-55\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdclick3`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick3`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick3`.`bdtrasladosbodegas`.`anulada` AS `anulada` from (`bdclick3`.`bdtrasladosbodegas` left join `bdclick3`.`bdtrasladosbodegasprod` on((`bdclick3`.`bdtrasladosbodegas`.`Id` = `bdclick3`.`bdtrasladosbodegasprod`.`traslado`))) group by `bdclick3`.`bdtrasladosbodegasprod`.`traslado`,`bdclick3`.`bdtrasladosbodegasprod`.`producto`,`bdclick3`.`bdtrasladosbodegasprod`.`cantidad`,`bdclick3`.`bdtrasladosbodegas`.`anulada`,`bdclick3`.`bdtrasladosbodegas`.`origen` having ((`bdclick3`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick3`.`bdtrasladosbodegas`.`origen` = \'123-55\')))
mariadb-version=100135
