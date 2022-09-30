TYPE=VIEW
query=select `bdclick4`.`bdcosteoprod`.`documento` AS `documento`,`bdclick4`.`bdcosteoprod`.`producto` AS `producto`,`bdclick4`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick4`.`bdcosteoprod`.`total` AS `total`,`bdclick4`.`bdcosteo`.`bodega` AS `bodega` from (`bdclick4`.`bdcosteoprod` join `bdclick4`.`bdcosteo` on((`bdclick4`.`bdcosteo`.`Id` = `bdclick4`.`bdcosteoprod`.`documento`))) where (`bdclick4`.`bdcosteo`.`anulada` = \'0\')
md5=792a71b89d8f796c2293ed547173eb3b
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:25
create-version=2
source=select `bdcosteoprod`.`documento` AS `documento`,`bdcosteoprod`.`producto` AS `producto`,`bdcosteoprod`.`cantidad` AS `cantidad`,`bdcosteoprod`.`total` AS `total`,`bdcosteo`.`bodega` AS `bodega` from (`bdcosteoprod` join `bdcosteo` on((`bdcosteo`.`Id` = `bdcosteoprod`.`documento`))) where (`bdcosteo`.`anulada` = \'0\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdcosteoprod`.`documento` AS `documento`,`bdclick4`.`bdcosteoprod`.`producto` AS `producto`,`bdclick4`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick4`.`bdcosteoprod`.`total` AS `total`,`bdclick4`.`bdcosteo`.`bodega` AS `bodega` from (`bdclick4`.`bdcosteoprod` join `bdclick4`.`bdcosteo` on((`bdclick4`.`bdcosteo`.`Id` = `bdclick4`.`bdcosteoprod`.`documento`))) where (`bdclick4`.`bdcosteo`.`anulada` = \'0\')
mariadb-version=100135
