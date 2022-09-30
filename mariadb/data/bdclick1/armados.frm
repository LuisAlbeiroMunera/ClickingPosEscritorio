TYPE=VIEW
query=select `bdclick1`.`bdcosteoprod`.`documento` AS `documento`,`bdclick1`.`bdcosteoprod`.`producto` AS `producto`,`bdclick1`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick1`.`bdcosteoprod`.`total` AS `total`,`bdclick1`.`bdcosteo`.`bodega` AS `bodega` from (`bdclick1`.`bdcosteoprod` join `bdclick1`.`bdcosteo` on((`bdclick1`.`bdcosteo`.`Id` = `bdclick1`.`bdcosteoprod`.`documento`))) where (`bdclick1`.`bdcosteo`.`anulada` = \'0\')
md5=4987c594ec73fd547ba6db06a5a5019e
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:32
create-version=2
source=select `bdcosteoprod`.`documento` AS `documento`,`bdcosteoprod`.`producto` AS `producto`,`bdcosteoprod`.`cantidad` AS `cantidad`,`bdcosteoprod`.`total` AS `total`,`bdcosteo`.`bodega` AS `bodega` from (`bdcosteoprod` join `bdcosteo` on((`bdcosteo`.`Id` = `bdcosteoprod`.`documento`))) where (`bdcosteo`.`anulada` = \'0\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdcosteoprod`.`documento` AS `documento`,`bdclick1`.`bdcosteoprod`.`producto` AS `producto`,`bdclick1`.`bdcosteoprod`.`cantidad` AS `cantidad`,`bdclick1`.`bdcosteoprod`.`total` AS `total`,`bdclick1`.`bdcosteo`.`bodega` AS `bodega` from (`bdclick1`.`bdcosteoprod` join `bdclick1`.`bdcosteo` on((`bdclick1`.`bdcosteo`.`Id` = `bdclick1`.`bdcosteoprod`.`documento`))) where (`bdclick1`.`bdcosteo`.`anulada` = \'0\')
mariadb-version=100135
