TYPE=VIEW
query=select `bdclick6`.`bdcosteoprod`.`documento` AS `documento`,`bdclick6`.`bdcosteoprod`.`producto` AS `producto`,`bdclick6`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick6`.`bdcosteoprod`.`total` AS `total`,`bdclick6`.`bdcosteo`.`bodega` AS `bodega` from (`bdclick6`.`bdcosteoprod` join `bdclick6`.`bdcosteo` on((`bdclick6`.`bdcosteo`.`Id` = `bdclick6`.`bdcosteoprod`.`documento`))) where (`bdclick6`.`bdcosteo`.`anulada` = \'0\')
md5=99bf637ec7078b2f4261014a39a4097c
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:32
create-version=2
source=select `bdcosteoprod`.`documento` AS `documento`,`bdcosteoprod`.`producto` AS `producto`,`bdcosteoprod`.`cantidad` AS `cantidad`,`bdcosteoprod`.`total` AS `total`,`bdcosteo`.`bodega` AS `bodega` from (`bdcosteoprod` join `bdcosteo` on((`bdcosteo`.`Id` = `bdcosteoprod`.`documento`))) where (`bdcosteo`.`anulada` = \'0\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdcosteoprod`.`documento` AS `documento`,`bdclick6`.`bdcosteoprod`.`producto` AS `producto`,`bdclick6`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick6`.`bdcosteoprod`.`total` AS `total`,`bdclick6`.`bdcosteo`.`bodega` AS `bodega` from (`bdclick6`.`bdcosteoprod` join `bdclick6`.`bdcosteo` on((`bdclick6`.`bdcosteo`.`Id` = `bdclick6`.`bdcosteoprod`.`documento`))) where (`bdclick6`.`bdcosteo`.`anulada` = \'0\')
mariadb-version=100135
