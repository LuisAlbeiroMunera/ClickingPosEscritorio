TYPE=VIEW
query=(select `bdclick`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick`.`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdclick`.`bdtrasladosbodegasprod`.`estado` AS `estado` from (`bdclick`.`bdtrasladosbodegas` left join `bdclick`.`bdtrasladosbodegasprod` on((`bdclick`.`bdtrasladosbodegas`.`Id` = `bdclick`.`bdtrasladosbodegasprod`.`traslado`))) where ((`bdclick`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick`.`bdtrasladosbodegasprod`.`estado` = \'PENDIENTE\')))
md5=e5ba0c02b0c1d76adc68ed355ff3e34c
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:30
create-version=2
source=(select `bdtrasladosbodegasprod`.`producto` AS `producto`,`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdtrasladosbodegasprod`.`estado` AS `estado` from (`bdtrasladosbodegas` left join `bdtrasladosbodegasprod` on((`bdtrasladosbodegas`.`Id` = `bdtrasladosbodegasprod`.`traslado`))) where ((`bdtrasladosbodegas`.`anulada` = 0) and (`bdtrasladosbodegasprod`.`estado` = \'PENDIENTE\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick`.`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdclick`.`bdtrasladosbodegasprod`.`estado` AS `estado` from (`bdclick`.`bdtrasladosbodegas` left join `bdclick`.`bdtrasladosbodegasprod` on((`bdclick`.`bdtrasladosbodegas`.`Id` = `bdclick`.`bdtrasladosbodegasprod`.`traslado`))) where ((`bdclick`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick`.`bdtrasladosbodegasprod`.`estado` = \'PENDIENTE\')))
mariadb-version=100135
