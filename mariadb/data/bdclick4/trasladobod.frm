TYPE=VIEW
query=(select `bdclick4`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick4`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick4`.`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdclick4`.`bdtrasladosbodegasprod`.`estado` AS `estado` from (`bdclick4`.`bdtrasladosbodegas` left join `bdclick4`.`bdtrasladosbodegasprod` on((`bdclick4`.`bdtrasladosbodegas`.`Id` = `bdclick4`.`bdtrasladosbodegasprod`.`traslado`))) where ((`bdclick4`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick4`.`bdtrasladosbodegasprod`.`estado` = \'PENDIENTE\')))
md5=f3f03c0d8071d843bf67e2128cfed9af
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:33
create-version=2
source=(select `bdtrasladosbodegasprod`.`producto` AS `producto`,`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdtrasladosbodegasprod`.`estado` AS `estado` from (`bdtrasladosbodegas` left join `bdtrasladosbodegasprod` on((`bdtrasladosbodegas`.`Id` = `bdtrasladosbodegasprod`.`traslado`))) where ((`bdtrasladosbodegas`.`anulada` = 0) and (`bdtrasladosbodegasprod`.`estado` = \'PENDIENTE\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick4`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick4`.`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdclick4`.`bdtrasladosbodegasprod`.`estado` AS `estado` from (`bdclick4`.`bdtrasladosbodegas` left join `bdclick4`.`bdtrasladosbodegasprod` on((`bdclick4`.`bdtrasladosbodegas`.`Id` = `bdclick4`.`bdtrasladosbodegasprod`.`traslado`))) where ((`bdclick4`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick4`.`bdtrasladosbodegasprod`.`estado` = \'PENDIENTE\')))
mariadb-version=100135
