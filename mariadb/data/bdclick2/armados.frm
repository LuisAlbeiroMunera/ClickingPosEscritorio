TYPE=VIEW
query=select `bdclick2`.`bdcosteoprod`.`documento` AS `documento`,`bdclick2`.`bdcosteoprod`.`producto` AS `producto`,`bdclick2`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick2`.`bdcosteoprod`.`total` AS `total`,`bdclick2`.`bdcosteo`.`bodega` AS `bodega` from (`bdclick2`.`bdcosteoprod` join `bdclick2`.`bdcosteo` on((`bdclick2`.`bdcosteo`.`Id` = `bdclick2`.`bdcosteoprod`.`documento`))) where (`bdclick2`.`bdcosteo`.`anulada` = \'0\')
md5=e9ef95f760a22b010c7799c1253de7d3
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:42
create-version=2
source=select `bdcosteoprod`.`documento` AS `documento`,`bdcosteoprod`.`producto` AS `producto`,`bdcosteoprod`.`cantidad` AS `cantidad`,`bdcosteoprod`.`total` AS `total`,`bdcosteo`.`bodega` AS `bodega` from (`bdcosteoprod` join `bdcosteo` on((`bdcosteo`.`Id` = `bdcosteoprod`.`documento`))) where (`bdcosteo`.`anulada` = \'0\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdcosteoprod`.`documento` AS `documento`,`bdclick2`.`bdcosteoprod`.`producto` AS `producto`,`bdclick2`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick2`.`bdcosteoprod`.`total` AS `total`,`bdclick2`.`bdcosteo`.`bodega` AS `bodega` from (`bdclick2`.`bdcosteoprod` join `bdclick2`.`bdcosteo` on((`bdclick2`.`bdcosteo`.`Id` = `bdclick2`.`bdcosteoprod`.`documento`))) where (`bdclick2`.`bdcosteo`.`anulada` = \'0\')
mariadb-version=100135
