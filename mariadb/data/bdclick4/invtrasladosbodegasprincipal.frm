TYPE=VIEW
query=(select `bdclick4`.`bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdclick4`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick4`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick4`.`bdtrasladosbodegas`.`anulada` AS `anulada` from (`bdclick4`.`bdtrasladosbodegas` left join `bdclick4`.`bdtrasladosbodegasprod` on((`bdclick4`.`bdtrasladosbodegas`.`Id` = `bdclick4`.`bdtrasladosbodegasprod`.`traslado`))) group by `bdclick4`.`bdtrasladosbodegasprod`.`traslado`,`bdclick4`.`bdtrasladosbodegasprod`.`producto`,`bdclick4`.`bdtrasladosbodegasprod`.`cantidad`,`bdclick4`.`bdtrasladosbodegas`.`anulada`,`bdclick4`.`bdtrasladosbodegas`.`origen` having ((`bdclick4`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick4`.`bdtrasladosbodegas`.`origen` = \'123-55\')))
md5=c5ec4963922e951e4ed4ce8982ba3fdf
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:28
create-version=2
source=(select `bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdtrasladosbodegas`.`anulada` AS `anulada` from (`bdtrasladosbodegas` left join `bdtrasladosbodegasprod` on((`bdtrasladosbodegas`.`Id` = `bdtrasladosbodegasprod`.`traslado`))) group by `bdtrasladosbodegasprod`.`traslado`,`bdtrasladosbodegasprod`.`producto`,`bdtrasladosbodegasprod`.`cantidad`,`bdtrasladosbodegas`.`anulada`,`bdtrasladosbodegas`.`origen` having ((`bdtrasladosbodegas`.`anulada` = 0) and (`bdtrasladosbodegas`.`origen` = \'123-55\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdclick4`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick4`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick4`.`bdtrasladosbodegas`.`anulada` AS `anulada` from (`bdclick4`.`bdtrasladosbodegas` left join `bdclick4`.`bdtrasladosbodegasprod` on((`bdclick4`.`bdtrasladosbodegas`.`Id` = `bdclick4`.`bdtrasladosbodegasprod`.`traslado`))) group by `bdclick4`.`bdtrasladosbodegasprod`.`traslado`,`bdclick4`.`bdtrasladosbodegasprod`.`producto`,`bdclick4`.`bdtrasladosbodegasprod`.`cantidad`,`bdclick4`.`bdtrasladosbodegas`.`anulada`,`bdclick4`.`bdtrasladosbodegas`.`origen` having ((`bdclick4`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick4`.`bdtrasladosbodegas`.`origen` = \'123-55\')))
mariadb-version=100135
