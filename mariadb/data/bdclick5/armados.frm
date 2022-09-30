TYPE=VIEW
query=select `bdclick5`.`bdcosteoprod`.`documento` AS `documento`,`bdclick5`.`bdcosteoprod`.`producto` AS `producto`,`bdclick5`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick5`.`bdcosteoprod`.`total` AS `total`,`bdclick5`.`bdcosteo`.`bodega` AS `bodega` from (`bdclick5`.`bdcosteoprod` join `bdclick5`.`bdcosteo` on((`bdclick5`.`bdcosteo`.`Id` = `bdclick5`.`bdcosteoprod`.`documento`))) where (`bdclick5`.`bdcosteo`.`anulada` = \'0\')
md5=e88ccf87dd2f22f837fcccd90e63ba44
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:44
create-version=2
source=select `bdcosteoprod`.`documento` AS `documento`,`bdcosteoprod`.`producto` AS `producto`,`bdcosteoprod`.`cantidad` AS `cantidad`,`bdcosteoprod`.`total` AS `total`,`bdcosteo`.`bodega` AS `bodega` from (`bdcosteoprod` join `bdcosteo` on((`bdcosteo`.`Id` = `bdcosteoprod`.`documento`))) where (`bdcosteo`.`anulada` = \'0\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdcosteoprod`.`documento` AS `documento`,`bdclick5`.`bdcosteoprod`.`producto` AS `producto`,`bdclick5`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick5`.`bdcosteoprod`.`total` AS `total`,`bdclick5`.`bdcosteo`.`bodega` AS `bodega` from (`bdclick5`.`bdcosteoprod` join `bdclick5`.`bdcosteo` on((`bdclick5`.`bdcosteo`.`Id` = `bdclick5`.`bdcosteoprod`.`documento`))) where (`bdclick5`.`bdcosteo`.`anulada` = \'0\')
mariadb-version=100135
