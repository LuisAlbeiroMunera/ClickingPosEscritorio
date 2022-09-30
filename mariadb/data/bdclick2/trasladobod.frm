TYPE=VIEW
query=(select `bdclick2`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick2`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick2`.`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdclick2`.`bdtrasladosbodegasprod`.`estado` AS `estado` from (`bdclick2`.`bdtrasladosbodegas` left join `bdclick2`.`bdtrasladosbodegasprod` on((`bdclick2`.`bdtrasladosbodegas`.`Id` = `bdclick2`.`bdtrasladosbodegasprod`.`traslado`))) where ((`bdclick2`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick2`.`bdtrasladosbodegasprod`.`estado` = \'PENDIENTE\')))
md5=e72dcf896f09c05738857c3b6f1ec563
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:50
create-version=2
source=(select `bdtrasladosbodegasprod`.`producto` AS `producto`,`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdtrasladosbodegasprod`.`estado` AS `estado` from (`bdtrasladosbodegas` left join `bdtrasladosbodegasprod` on((`bdtrasladosbodegas`.`Id` = `bdtrasladosbodegasprod`.`traslado`))) where ((`bdtrasladosbodegas`.`anulada` = 0) and (`bdtrasladosbodegasprod`.`estado` = \'PENDIENTE\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick2`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick2`.`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdclick2`.`bdtrasladosbodegasprod`.`estado` AS `estado` from (`bdclick2`.`bdtrasladosbodegas` left join `bdclick2`.`bdtrasladosbodegasprod` on((`bdclick2`.`bdtrasladosbodegas`.`Id` = `bdclick2`.`bdtrasladosbodegasprod`.`traslado`))) where ((`bdclick2`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick2`.`bdtrasladosbodegasprod`.`estado` = \'PENDIENTE\')))
mariadb-version=100135
