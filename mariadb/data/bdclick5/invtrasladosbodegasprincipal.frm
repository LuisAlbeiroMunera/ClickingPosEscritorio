TYPE=VIEW
query=(select `bdclick5`.`bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdclick5`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick5`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick5`.`bdtrasladosbodegas`.`anulada` AS `anulada` from (`bdclick5`.`bdtrasladosbodegas` left join `bdclick5`.`bdtrasladosbodegasprod` on((`bdclick5`.`bdtrasladosbodegas`.`Id` = `bdclick5`.`bdtrasladosbodegasprod`.`traslado`))) group by `bdclick5`.`bdtrasladosbodegasprod`.`traslado`,`bdclick5`.`bdtrasladosbodegasprod`.`producto`,`bdclick5`.`bdtrasladosbodegasprod`.`cantidad`,`bdclick5`.`bdtrasladosbodegas`.`anulada`,`bdclick5`.`bdtrasladosbodegas`.`origen` having ((`bdclick5`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick5`.`bdtrasladosbodegas`.`origen` = \'123-55\')))
md5=3bad1285eed49e9e90489bb6f76e29bf
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:47
create-version=2
source=(select `bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdtrasladosbodegas`.`anulada` AS `anulada` from (`bdtrasladosbodegas` left join `bdtrasladosbodegasprod` on((`bdtrasladosbodegas`.`Id` = `bdtrasladosbodegasprod`.`traslado`))) group by `bdtrasladosbodegasprod`.`traslado`,`bdtrasladosbodegasprod`.`producto`,`bdtrasladosbodegasprod`.`cantidad`,`bdtrasladosbodegas`.`anulada`,`bdtrasladosbodegas`.`origen` having ((`bdtrasladosbodegas`.`anulada` = 0) and (`bdtrasladosbodegas`.`origen` = \'123-55\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdclick5`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick5`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick5`.`bdtrasladosbodegas`.`anulada` AS `anulada` from (`bdclick5`.`bdtrasladosbodegas` left join `bdclick5`.`bdtrasladosbodegasprod` on((`bdclick5`.`bdtrasladosbodegas`.`Id` = `bdclick5`.`bdtrasladosbodegasprod`.`traslado`))) group by `bdclick5`.`bdtrasladosbodegasprod`.`traslado`,`bdclick5`.`bdtrasladosbodegasprod`.`producto`,`bdclick5`.`bdtrasladosbodegasprod`.`cantidad`,`bdclick5`.`bdtrasladosbodegas`.`anulada`,`bdclick5`.`bdtrasladosbodegas`.`origen` having ((`bdclick5`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick5`.`bdtrasladosbodegas`.`origen` = \'123-55\')))
mariadb-version=100135
