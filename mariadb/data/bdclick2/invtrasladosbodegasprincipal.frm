TYPE=VIEW
query=(select `bdclick2`.`bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdclick2`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick2`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick2`.`bdtrasladosbodegas`.`anulada` AS `anulada` from (`bdclick2`.`bdtrasladosbodegas` left join `bdclick2`.`bdtrasladosbodegasprod` on((`bdclick2`.`bdtrasladosbodegas`.`Id` = `bdclick2`.`bdtrasladosbodegasprod`.`traslado`))) group by `bdclick2`.`bdtrasladosbodegasprod`.`traslado`,`bdclick2`.`bdtrasladosbodegasprod`.`producto`,`bdclick2`.`bdtrasladosbodegasprod`.`cantidad`,`bdclick2`.`bdtrasladosbodegas`.`anulada`,`bdclick2`.`bdtrasladosbodegas`.`origen` having ((`bdclick2`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick2`.`bdtrasladosbodegas`.`origen` = \'123-55\')))
md5=55761e0522d0af86efa41dce412a79a7
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:45
create-version=2
source=(select `bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdtrasladosbodegas`.`anulada` AS `anulada` from (`bdtrasladosbodegas` left join `bdtrasladosbodegasprod` on((`bdtrasladosbodegas`.`Id` = `bdtrasladosbodegasprod`.`traslado`))) group by `bdtrasladosbodegasprod`.`traslado`,`bdtrasladosbodegasprod`.`producto`,`bdtrasladosbodegasprod`.`cantidad`,`bdtrasladosbodegas`.`anulada`,`bdtrasladosbodegas`.`origen` having ((`bdtrasladosbodegas`.`anulada` = 0) and (`bdtrasladosbodegas`.`origen` = \'123-55\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdclick2`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick2`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick2`.`bdtrasladosbodegas`.`anulada` AS `anulada` from (`bdclick2`.`bdtrasladosbodegas` left join `bdclick2`.`bdtrasladosbodegasprod` on((`bdclick2`.`bdtrasladosbodegas`.`Id` = `bdclick2`.`bdtrasladosbodegasprod`.`traslado`))) group by `bdclick2`.`bdtrasladosbodegasprod`.`traslado`,`bdclick2`.`bdtrasladosbodegasprod`.`producto`,`bdclick2`.`bdtrasladosbodegasprod`.`cantidad`,`bdclick2`.`bdtrasladosbodegas`.`anulada`,`bdclick2`.`bdtrasladosbodegas`.`origen` having ((`bdclick2`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick2`.`bdtrasladosbodegas`.`origen` = \'123-55\')))
mariadb-version=100135
