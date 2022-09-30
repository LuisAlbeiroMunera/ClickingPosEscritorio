TYPE=VIEW
query=select `bdclick`.`bdcosteoprod`.`documento` AS `documento`,`bdclick`.`bdcosteoprod`.`producto` AS `producto`,`bdclick`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick`.`bdcosteoprod`.`total` AS `total`,`bdclick`.`bdcosteo`.`bodega` AS `bodega` from (`bdclick`.`bdcosteoprod` join `bdclick`.`bdcosteo` on((`bdclick`.`bdcosteo`.`Id` = `bdclick`.`bdcosteoprod`.`documento`))) where (`bdclick`.`bdcosteo`.`anulada` = \'0\')
md5=3f1b67ff3e37717f615d8694266cb18e
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:21
create-version=2
source=select `bdcosteoprod`.`documento` AS `documento`,`bdcosteoprod`.`producto` AS `producto`,`bdcosteoprod`.`cantidad` AS `cantidad`,`bdcosteoprod`.`total` AS `total`,`bdcosteo`.`bodega` AS `bodega` from (`bdcosteoprod` join `bdcosteo` on((`bdcosteo`.`Id` = `bdcosteoprod`.`documento`))) where (`bdcosteo`.`anulada` = \'0\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdcosteoprod`.`documento` AS `documento`,`bdclick`.`bdcosteoprod`.`producto` AS `producto`,`bdclick`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick`.`bdcosteoprod`.`total` AS `total`,`bdclick`.`bdcosteo`.`bodega` AS `bodega` from (`bdclick`.`bdcosteoprod` join `bdclick`.`bdcosteo` on((`bdclick`.`bdcosteo`.`Id` = `bdclick`.`bdcosteoprod`.`documento`))) where (`bdclick`.`bdcosteo`.`anulada` = \'0\')
mariadb-version=100135
