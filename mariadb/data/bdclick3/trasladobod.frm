TYPE=VIEW
query=(select `bdclick3`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick3`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick3`.`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdclick3`.`bdtrasladosbodegasprod`.`estado` AS `estado` from (`bdclick3`.`bdtrasladosbodegas` left join `bdclick3`.`bdtrasladosbodegasprod` on((`bdclick3`.`bdtrasladosbodegas`.`Id` = `bdclick3`.`bdtrasladosbodegasprod`.`traslado`))) where ((`bdclick3`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick3`.`bdtrasladosbodegasprod`.`estado` = \'PENDIENTE\')))
md5=61a3de8dcaa66c6321ae79c96cce6b8b
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:56
create-version=2
source=(select `bdtrasladosbodegasprod`.`producto` AS `producto`,`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdtrasladosbodegasprod`.`estado` AS `estado` from (`bdtrasladosbodegas` left join `bdtrasladosbodegasprod` on((`bdtrasladosbodegas`.`Id` = `bdtrasladosbodegasprod`.`traslado`))) where ((`bdtrasladosbodegas`.`anulada` = 0) and (`bdtrasladosbodegasprod`.`estado` = \'PENDIENTE\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick3`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick3`.`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdclick3`.`bdtrasladosbodegasprod`.`estado` AS `estado` from (`bdclick3`.`bdtrasladosbodegas` left join `bdclick3`.`bdtrasladosbodegasprod` on((`bdclick3`.`bdtrasladosbodegas`.`Id` = `bdclick3`.`bdtrasladosbodegasprod`.`traslado`))) where ((`bdclick3`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick3`.`bdtrasladosbodegasprod`.`estado` = \'PENDIENTE\')))
mariadb-version=100135
