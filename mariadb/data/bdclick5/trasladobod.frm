TYPE=VIEW
query=(select `bdclick5`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick5`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick5`.`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdclick5`.`bdtrasladosbodegasprod`.`estado` AS `estado` from (`bdclick5`.`bdtrasladosbodegas` left join `bdclick5`.`bdtrasladosbodegasprod` on((`bdclick5`.`bdtrasladosbodegas`.`Id` = `bdclick5`.`bdtrasladosbodegasprod`.`traslado`))) where ((`bdclick5`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick5`.`bdtrasladosbodegasprod`.`estado` = \'PENDIENTE\')))
md5=1aaf61094e25ec6c3ae261d822553099
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:53
create-version=2
source=(select `bdtrasladosbodegasprod`.`producto` AS `producto`,`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdtrasladosbodegasprod`.`estado` AS `estado` from (`bdtrasladosbodegas` left join `bdtrasladosbodegasprod` on((`bdtrasladosbodegas`.`Id` = `bdtrasladosbodegasprod`.`traslado`))) where ((`bdtrasladosbodegas`.`anulada` = 0) and (`bdtrasladosbodegasprod`.`estado` = \'PENDIENTE\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick5`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick5`.`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdclick5`.`bdtrasladosbodegasprod`.`estado` AS `estado` from (`bdclick5`.`bdtrasladosbodegas` left join `bdclick5`.`bdtrasladosbodegasprod` on((`bdclick5`.`bdtrasladosbodegas`.`Id` = `bdclick5`.`bdtrasladosbodegasprod`.`traslado`))) where ((`bdclick5`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick5`.`bdtrasladosbodegasprod`.`estado` = \'PENDIENTE\')))
mariadb-version=100135
