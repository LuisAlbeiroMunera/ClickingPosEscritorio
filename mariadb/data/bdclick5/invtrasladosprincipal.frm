TYPE=VIEW
query=(select `bdclick5`.`bdtrasladosprod`.`traslado` AS `traslado`,`bdclick5`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick5`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick5`.`bdtraslados`.`anulada` AS `anulada` from (`bdclick5`.`bdtraslados` left join `bdclick5`.`bdtrasladosprod` on((`bdclick5`.`bdtraslados`.`Id` = `bdclick5`.`bdtrasladosprod`.`traslado`))) group by `bdclick5`.`bdtrasladosprod`.`traslado`,`bdclick5`.`bdtrasladosprod`.`producto`,`bdclick5`.`bdtrasladosprod`.`cantidad`,`bdclick5`.`bdtraslados`.`anulada`,`bdclick5`.`bdtraslados`.`origen` having ((`bdclick5`.`bdtraslados`.`anulada` = 0) and (`bdclick5`.`bdtraslados`.`origen` = \'123-55\')))
md5=9433c513c3353ec9209166c9d4b029c0
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:47
create-version=2
source=(select `bdtrasladosprod`.`traslado` AS `traslado`,`bdtrasladosprod`.`producto` AS `producto`,`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdtraslados`.`anulada` AS `anulada` from (`bdtraslados` left join `bdtrasladosprod` on((`bdtraslados`.`Id` = `bdtrasladosprod`.`traslado`))) group by `bdtrasladosprod`.`traslado`,`bdtrasladosprod`.`producto`,`bdtrasladosprod`.`cantidad`,`bdtraslados`.`anulada`,`bdtraslados`.`origen` having ((`bdtraslados`.`anulada` = 0) and (`bdtraslados`.`origen` = \'123-55\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdtrasladosprod`.`traslado` AS `traslado`,`bdclick5`.`bdtrasladosprod`.`producto` AS `producto`,`bdclick5`.`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdclick5`.`bdtraslados`.`anulada` AS `anulada` from (`bdclick5`.`bdtraslados` left join `bdclick5`.`bdtrasladosprod` on((`bdclick5`.`bdtraslados`.`Id` = `bdclick5`.`bdtrasladosprod`.`traslado`))) group by `bdclick5`.`bdtrasladosprod`.`traslado`,`bdclick5`.`bdtrasladosprod`.`producto`,`bdclick5`.`bdtrasladosprod`.`cantidad`,`bdclick5`.`bdtraslados`.`anulada`,`bdclick5`.`bdtraslados`.`origen` having ((`bdclick5`.`bdtraslados`.`anulada` = 0) and (`bdclick5`.`bdtraslados`.`origen` = \'123-55\')))
mariadb-version=100135
