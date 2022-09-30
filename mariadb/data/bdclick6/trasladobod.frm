TYPE=VIEW
query=(select `bdclick6`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick6`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick6`.`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdclick6`.`bdtrasladosbodegasprod`.`estado` AS `estado` from (`bdclick6`.`bdtrasladosbodegas` left join `bdclick6`.`bdtrasladosbodegasprod` on((`bdclick6`.`bdtrasladosbodegas`.`Id` = `bdclick6`.`bdtrasladosbodegasprod`.`traslado`))) where ((`bdclick6`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick6`.`bdtrasladosbodegasprod`.`estado` = \'PENDIENTE\')))
md5=e013b87aea8aa6f16f2ebc7111236500
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:42
create-version=2
source=(select `bdtrasladosbodegasprod`.`producto` AS `producto`,`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdtrasladosbodegasprod`.`estado` AS `estado` from (`bdtrasladosbodegas` left join `bdtrasladosbodegasprod` on((`bdtrasladosbodegas`.`Id` = `bdtrasladosbodegasprod`.`traslado`))) where ((`bdtrasladosbodegas`.`anulada` = 0) and (`bdtrasladosbodegasprod`.`estado` = \'PENDIENTE\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick6`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick6`.`bdtrasladosbodegas`.`anulada` AS `anulada`,`bdclick6`.`bdtrasladosbodegasprod`.`estado` AS `estado` from (`bdclick6`.`bdtrasladosbodegas` left join `bdclick6`.`bdtrasladosbodegasprod` on((`bdclick6`.`bdtrasladosbodegas`.`Id` = `bdclick6`.`bdtrasladosbodegasprod`.`traslado`))) where ((`bdclick6`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick6`.`bdtrasladosbodegasprod`.`estado` = \'PENDIENTE\')))
mariadb-version=100135
