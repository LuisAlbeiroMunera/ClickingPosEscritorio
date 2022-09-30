TYPE=VIEW
query=(select `bdclick1`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick1`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick1`.`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdclick1`.`bdtrasladosbodegasprod`.`estado` AS `estado` from (`bdclick1`.`bdtrasladosbodegas` left join `bdclick1`.`bdtrasladosbodegasprod` on((`bdclick1`.`bdtrasladosbodegas`.`Id` = `bdclick1`.`bdtrasladosbodegasprod`.`traslado`))) where ((`bdclick1`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick1`.`bdtrasladosbodegasprod`.`estado` = \'PENDIENTE\')))
md5=f6f8ba94ec2be560dea84fe75a519369
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:40
create-version=2
source=(select `bdtrasladosbodegasprod`.`producto` AS `producto`,`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdtrasladosbodegasprod`.`estado` AS `estado` from (`bdtrasladosbodegas` left join `bdtrasladosbodegasprod` on((`bdtrasladosbodegas`.`Id` = `bdtrasladosbodegasprod`.`traslado`))) where ((`bdtrasladosbodegas`.`anulada` = 0) and (`bdtrasladosbodegasprod`.`estado` = \'PENDIENTE\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick1`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick1`.`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdclick1`.`bdtrasladosbodegasprod`.`estado` AS `estado` from (`bdclick1`.`bdtrasladosbodegas` left join `bdclick1`.`bdtrasladosbodegasprod` on((`bdclick1`.`bdtrasladosbodegas`.`Id` = `bdclick1`.`bdtrasladosbodegasprod`.`traslado`))) where ((`bdclick1`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick1`.`bdtrasladosbodegasprod`.`estado` = \'PENDIENTE\')))
mariadb-version=100135
