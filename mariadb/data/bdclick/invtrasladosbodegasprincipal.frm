TYPE=VIEW
query=(select `bdclick`.`bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdclick`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick`.`bdtrasladosbodegas`.`anulada` AS `anulada` from (`bdclick`.`bdtrasladosbodegas` left join `bdclick`.`bdtrasladosbodegasprod` on((`bdclick`.`bdtrasladosbodegas`.`Id` = `bdclick`.`bdtrasladosbodegasprod`.`traslado`))) group by `bdclick`.`bdtrasladosbodegasprod`.`traslado`,`bdclick`.`bdtrasladosbodegasprod`.`producto`,`bdclick`.`bdtrasladosbodegasprod`.`cantidad`,`bdclick`.`bdtrasladosbodegas`.`anulada`,`bdclick`.`bdtrasladosbodegas`.`origen` having ((`bdclick`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick`.`bdtrasladosbodegas`.`origen` = \'123-55\')))
md5=cf06702c7dc7e6f448334fce94818287
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:24
create-version=2
source=(select `bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdtrasladosbodegas`.`anulada` AS `anulada` from (`bdtrasladosbodegas` left join `bdtrasladosbodegasprod` on((`bdtrasladosbodegas`.`Id` = `bdtrasladosbodegasprod`.`traslado`))) group by `bdtrasladosbodegasprod`.`traslado`,`bdtrasladosbodegasprod`.`producto`,`bdtrasladosbodegasprod`.`cantidad`,`bdtrasladosbodegas`.`anulada`,`bdtrasladosbodegas`.`origen` having ((`bdtrasladosbodegas`.`anulada` = 0) and (`bdtrasladosbodegas`.`origen` = \'123-55\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdtrasladosbodegasprod`.`traslado` AS `traslado`,`bdclick`.`bdtrasladosbodegasprod`.`producto` AS `producto`,`bdclick`.`bdtrasladosbodegasprod`.`cantidad` AS `cantidad`,`bdclick`.`bdtrasladosbodegas`.`anulada` AS `anulada` from (`bdclick`.`bdtrasladosbodegas` left join `bdclick`.`bdtrasladosbodegasprod` on((`bdclick`.`bdtrasladosbodegas`.`Id` = `bdclick`.`bdtrasladosbodegasprod`.`traslado`))) group by `bdclick`.`bdtrasladosbodegasprod`.`traslado`,`bdclick`.`bdtrasladosbodegasprod`.`producto`,`bdclick`.`bdtrasladosbodegasprod`.`cantidad`,`bdclick`.`bdtrasladosbodegas`.`anulada`,`bdclick`.`bdtrasladosbodegas`.`origen` having ((`bdclick`.`bdtrasladosbodegas`.`anulada` = 0) and (`bdclick`.`bdtrasladosbodegas`.`origen` = \'123-55\')))
mariadb-version=100135
