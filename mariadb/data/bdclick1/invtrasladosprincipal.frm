TYPE=VIEW
query=(select `bdclick1`.`bdtrasladosprod`.`traslado` AS `traslado`,`bdclick1`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick1`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick1`.`bdtraslados`.`anulada` AS `anulada` from (`bdclick1`.`bdtraslados` left join `bdclick1`.`bdtrasladosprod` on((`bdclick1`.`bdtraslados`.`Id` = `bdclick1`.`bdtrasladosprod`.`traslado`))) group by `bdclick1`.`bdtrasladosprod`.`traslado`,`bdclick1`.`bdtrasladosprod`.`producto`,`bdclick1`.`bdtrasladosprod`.`cantidad`,`bdclick1`.`bdtraslados`.`anulada`,`bdclick1`.`bdtraslados`.`origen` having ((`bdclick1`.`bdtraslados`.`anulada` = 0) and (`bdclick1`.`bdtraslados`.`origen` = \'123-55\')))
md5=55cf81f3d1408d8f717f077688cff201
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:35
create-version=2
source=(select `bdtrasladosprod`.`traslado` AS `traslado`,`bdtrasladosprod`.`producto` AS `producto`,`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdtraslados`.`anulada` AS `anulada` from (`bdtraslados` left join `bdtrasladosprod` on((`bdtraslados`.`Id` = `bdtrasladosprod`.`traslado`))) group by `bdtrasladosprod`.`traslado`,`bdtrasladosprod`.`producto`,`bdtrasladosprod`.`cantidad`,`bdtraslados`.`anulada`,`bdtraslados`.`origen` having ((`bdtraslados`.`anulada` = 0) and (`bdtraslados`.`origen` = \'123-55\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`bdtrasladosprod`.`traslado` AS `traslado`,`bdclick1`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick1`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick1`.`bdtraslados`.`anulada` AS `anulada` from (`bdclick1`.`bdtraslados` left join `bdclick1`.`bdtrasladosprod` on((`bdclick1`.`bdtraslados`.`Id` = `bdclick1`.`bdtrasladosprod`.`traslado`))) group by `bdclick1`.`bdtrasladosprod`.`traslado`,`bdclick1`.`bdtrasladosprod`.`producto`,`bdclick1`.`bdtrasladosprod`.`cantidad`,`bdclick1`.`bdtraslados`.`anulada`,`bdclick1`.`bdtraslados`.`origen` having ((`bdclick1`.`bdtraslados`.`anulada` = 0) and (`bdclick1`.`bdtraslados`.`origen` = \'123-55\')))
mariadb-version=100135
