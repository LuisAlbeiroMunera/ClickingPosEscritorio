TYPE=VIEW
query=select `bdclick3`.`bdcosteoprod`.`documento` AS `documento`,`bdclick3`.`bdcosteoprod`.`producto` AS `producto`,`bdclick3`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick3`.`bdcosteoprod`.`total` AS `total`,`bdclick3`.`bdcosteo`.`bodega` AS `bodega` from (`bdclick3`.`bdcosteoprod` join `bdclick3`.`bdcosteo` on((`bdclick3`.`bdcosteo`.`Id` = `bdclick3`.`bdcosteoprod`.`documento`))) where (`bdclick3`.`bdcosteo`.`anulada` = \'0\')
md5=12b69e13f7f46ece27b7309d0dc0dd05
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:48
create-version=2
source=select `bdcosteoprod`.`documento` AS `documento`,`bdcosteoprod`.`producto` AS `producto`,`bdcosteoprod`.`cantidad` AS `cantidad`,`bdcosteoprod`.`total` AS `total`,`bdcosteo`.`bodega` AS `bodega` from (`bdcosteoprod` join `bdcosteo` on((`bdcosteo`.`Id` = `bdcosteoprod`.`documento`))) where (`bdcosteo`.`anulada` = \'0\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdcosteoprod`.`documento` AS `documento`,`bdclick3`.`bdcosteoprod`.`producto` AS `producto`,`bdclick3`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick3`.`bdcosteoprod`.`total` AS `total`,`bdclick3`.`bdcosteo`.`bodega` AS `bodega` from (`bdclick3`.`bdcosteoprod` join `bdclick3`.`bdcosteo` on((`bdclick3`.`bdcosteo`.`Id` = `bdclick3`.`bdcosteoprod`.`documento`))) where (`bdclick3`.`bdcosteo`.`anulada` = \'0\')
mariadb-version=100135
