TYPE=VIEW
query=select `bdclick3`.`bdcosteo`.`Id` AS `Id`,`bdclick3`.`bdcosteo`.`fecha` AS `fecha`,`bdclick3`.`bdcosteo`.`total` AS `total`,`bdclick3`.`bdcosteo`.`usuario` AS `usuario`,`bdclick3`.`bdcosteo`.`unidades` AS `unidades`,`bdclick3`.`bdcosteo`.`tipo` AS `tipo`,`bdclick3`.`bdcosteo`.`producto` AS `producto`,`bdclick3`.`bdcosteo`.`anulada` AS `anulada`,`bdclick3`.`bdcosteo`.`bodega` AS `bodega` from `bdclick3`.`bdcosteo` where (`bdclick3`.`bdcosteo`.`anulada` = \'0\')
md5=44275551bfaaafc9fa7601cb5f807d92
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:50
create-version=2
source=select `bdcosteo`.`Id` AS `Id`,`bdcosteo`.`fecha` AS `fecha`,`bdcosteo`.`total` AS `total`,`bdcosteo`.`usuario` AS `usuario`,`bdcosteo`.`unidades` AS `unidades`,`bdcosteo`.`tipo` AS `tipo`,`bdcosteo`.`producto` AS `producto`,`bdcosteo`.`anulada` AS `anulada`,`bdcosteo`.`bodega` AS `bodega` from `bdcosteo` where (`bdcosteo`.`anulada` = \'0\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdcosteo`.`Id` AS `Id`,`bdclick3`.`bdcosteo`.`fecha` AS `fecha`,`bdclick3`.`bdcosteo`.`total` AS `total`,`bdclick3`.`bdcosteo`.`usuario` AS `usuario`,`bdclick3`.`bdcosteo`.`unidades` AS `unidades`,`bdclick3`.`bdcosteo`.`tipo` AS `tipo`,`bdclick3`.`bdcosteo`.`producto` AS `producto`,`bdclick3`.`bdcosteo`.`anulada` AS `anulada`,`bdclick3`.`bdcosteo`.`bodega` AS `bodega` from `bdclick3`.`bdcosteo` where (`bdclick3`.`bdcosteo`.`anulada` = \'0\')
mariadb-version=100135
